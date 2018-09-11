package com.kukukikits.example;

import com.kukukikits.model.Company;
import com.kukukikits.model.Employee;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.PropertyValue;

/**
 * ????????????BeanWrapper??????????
 * ?????DataBinder ? BeanFactory???????
 */
public class BeanWrapperTest {
	public static void main(String[] args) {
		BeanWrapper company = new BeanWrapperImpl(new Company());
		//1.????
		company.setPropertyValue("name", "Some Company Inc.");

		//2.????
		PropertyValue value = new PropertyValue("name", "Some Company Inc.");
		company.setPropertyValue(value);

		// ok, let's create the director and tie it to the company:
		BeanWrapper jim = new BeanWrapperImpl(new Employee());
		jim.setPropertyValue("name", "Jim Stravinsky");
		company.setPropertyValue("managingDirector", jim.getWrappedInstance());

		// retrieving the salary of the managingDirector through the company
		Float salary = (Float) company.getPropertyValue("managingDirector.salary");

		System.out.println(company.getWrappedInstance());


	}
}
