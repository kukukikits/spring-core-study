package com.kukukikits.validation;

import com.kukukikits.model.Person;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class PersonValidator implements Validator {
	@Override
	public boolean supports(Class<?> aClass) {
		return Person.class.isAssignableFrom(aClass);
	}

	@Override
	public void validate(Object o, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors,"name", "name.empty"
				,"??????");
		Person p = (Person) o;
		if (p.getAge() < 0){
			errors.rejectValue("age", "negativeVlue"
					, "??????");
		}else if (p.getAge() > 110){
			errors.rejectValue("age", "too.darn.old",
					"?????");
		}
	}
}
