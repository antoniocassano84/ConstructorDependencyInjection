package com.apress.prospring5.ch3;

import org.springframework.context.support.GenericXmlApplicationContext;

public class ConInjDemo {

  public static void main(String[] args) {
    GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
    ctx.load("app-context-xml.xml");
    ctx.refresh();

    ConstructorInjection ci = ctx.getBean("consInj", ConstructorInjection.class);
    System.out.println(ci);
  }
}
