package com.apress.prospring5.ch3;

public class Dependency {

  private String name;

  public Dependency(String name) {
    this.name = name;
  }

  @Override
  public String toString() { return "Dependency{" + this.name + "}"; }
}
