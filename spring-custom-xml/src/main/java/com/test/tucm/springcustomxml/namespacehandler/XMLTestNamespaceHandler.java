package com.test.tucm.springcustomxml.namespacehandler;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

import com.test.tucm.springcustomxml.beandefinitionparser.XMLTestBeanDefinitionParser;
import com.test.tucm.springcustomxml.domain.Student;

public class XMLTestNamespaceHandler extends NamespaceHandlerSupport {
	@Override
	public void init() {
		registerBeanDefinitionParser("student", new XMLTestBeanDefinitionParser(Student.class));
	}
}
