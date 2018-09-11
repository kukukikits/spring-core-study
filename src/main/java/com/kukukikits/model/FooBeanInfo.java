package com.kukukikits.model;

import org.springframework.beans.propertyeditors.CustomNumberEditor;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.PropertyEditor;
import java.beans.SimpleBeanInfo;

/**
 * ?????BeanInfo JavaBeans??????????????????????PropertyEditor???
 *
 */
public class FooBeanInfo extends SimpleBeanInfo {
	@Override
	public PropertyDescriptor[] getPropertyDescriptors() {
		try{
			final PropertyEditor numberPE = new CustomNumberEditor(Integer.class, true);
			PropertyDescriptor ageDes = new PropertyDescriptor("age", Foo.class){
				@Override
				public PropertyEditor createPropertyEditor(Object bean) {
					return numberPE;
				}
			};
			return new PropertyDescriptor[] {ageDes};
		}catch (IntrospectionException e) {
			e.printStackTrace();
		}
		return null;
	}
}
