package com.rajni.prospring.conf.pe;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.rajni.prospring.util.SpringUtil;

public class PropertyEditorTest {
	private static final String LOC_APTH = "com/rajni/prospring/conf/pe/builtin.xml";
	
	public static void main(String[] args) {
		testBuiltinPropertyEditor();
		testCustomNameEditor();
		SpringUtil.closeContext();
	}
	
	static void testBuiltinPropertyEditor() {
		GenericXmlApplicationContext ctx = SpringUtil.getContext(LOC_APTH);
		PropertyEditorBean bean = (PropertyEditorBean) ctx.getBean("builtinSample");
		System.out.println(bean.getTrimString());
		System.out.println(bean.getDate());
		System.out.println(bean.getInputStream().toString()); // put file: in front of path in xml
	}
	
	static void testCustomNameEditor() {
		GenericXmlApplicationContext ctx = SpringUtil.getContext(LOC_APTH);
		
		NameEditorTest test = (NameEditorTest) ctx.getBean("nameBean");
		System.out.println(test.getName());
	}
}
