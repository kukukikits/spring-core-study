package com.kukukikits.validation;

import com.kukukikits.model.Customer;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class CustomerValidator implements Validator {

	private Validator personValidator;
	@Override
	public boolean supports(Class<?> clazz) {
		return Customer.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "address",
				"address.empty", "??????");
		Customer customer = (Customer) target;
		if (customer.getAddress().indexOf("??") == -1){
			errors.rejectValue("address", "unknowAddress",
					"??????????");
		}
		try{
			ValidationUtils.invokeValidator(this.personValidator, this, errors);
		} catch (Exception e){
			e.printStackTrace();
		}

	}
}
