package com.kukukikits.model;

import java.awt.*;
import java.beans.PropertyChangeListener;
import java.beans.PropertyEditor;

/**
 * ??PropertyEditor???????????????????????????Editor?
 * ???????JavaBeans?????????PropertyEditor?????????????
 *
 * ?Foo??FooEditor?:
 * com
 *   kukukikits
 *    model
 *      Foo
 *      FooEditor // the PropertyEditor for the Foo class
 */
public class FooEditor implements PropertyEditor{
	@Override
	public void setValue(Object value) {

	}

	@Override
	public Object getValue() {
		return null;
	}

	@Override
	public boolean isPaintable() {
		return false;
	}

	@Override
	public void paintValue(Graphics gfx, Rectangle box) {

	}

	@Override
	public String getJavaInitializationString() {
		return null;
	}

	@Override
	public String getAsText() {
		return null;
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {

	}

	@Override
	public String[] getTags() {
		return new String[0];
	}

	@Override
	public Component getCustomEditor() {
		return null;
	}

	@Override
	public boolean supportsCustomEditor() {
		return false;
	}

	@Override
	public void addPropertyChangeListener(PropertyChangeListener listener) {

	}

	@Override
	public void removePropertyChangeListener(PropertyChangeListener listener) {

	}
}
