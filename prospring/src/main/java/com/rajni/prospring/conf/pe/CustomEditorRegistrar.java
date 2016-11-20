package com.rajni.prospring.conf.pe;

import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.InputStreamEditor;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;

public class CustomEditorRegistrar implements PropertyEditorRegistrar{

	public void registerCustomEditors(PropertyEditorRegistry registry) {
		// TODO Auto-generated method stub
		registry.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"),true));
		registry.registerCustomEditor(String.class, new StringTrimmerEditor(true));
		registry.registerCustomEditor(InputStream.class, new InputStreamEditor());
		registry.registerCustomEditor(Name.class, new NamePropertyEditor());
	}

}
