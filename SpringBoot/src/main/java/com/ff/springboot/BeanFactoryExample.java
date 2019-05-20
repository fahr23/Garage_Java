package com.ff.springboot;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class BeanFactoryExample {


    //create bean according to xmlbeanfactory but this time deprecated
    BeanFactory factor= new XmlBeanFactory(new FileSystemResource("beanExample.xml"));

    //
    ApplicationContext context= new ClassPathXmlApplicationContext("beanExample.xml");
    (Topic)context.getBean("deneme");

}
