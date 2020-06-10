package com.apress.prospring5.ch3;

public class ConstructorInjection {

  private Dependency dependency;

  public ConstructorInjection(Dependency dependency) {
    System.out.println("-> Injecting Dependency in ConstructorInjection()");
    this.dependency = dependency;
  }

  @Override
  public String toString() {
    return "ConstructorInjection{" +
            "dependency=" + dependency +
            '}';
  }
}
