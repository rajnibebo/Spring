package com.rajni.prospring.conf.pe;

import java.beans.PropertyEditorSupport;

public class NamePropertyEditor extends PropertyEditorSupport {
	
	public void setAsText(String text) throws IllegalArgumentException {
		String[] strArr = text.split("\\s");
		Name result = new Name(strArr[0], strArr[1]);
		setValue(result);
	}
}
