package com.test.tucm.springcustomxml.handlers;

import com.test.tucm.springcustomxml.domain.Student;
import com.test.tucm.springcustomxml.parser.XMLTestParser;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class XMLTesthandler extends NamespaceHandlerSupport {
    @Override
    public void init() {
        registerBeanDefinitionParser("student", new XMLTestParser(Student.class));
    }
}
