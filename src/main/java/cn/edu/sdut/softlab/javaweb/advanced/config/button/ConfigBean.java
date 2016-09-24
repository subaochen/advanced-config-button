/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.sdut.softlab.javaweb.advanced.config.button;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author subaochen
 */
@Named(value = "configBean")
@RequestScoped
public class ConfigBean {
  
  private Boolean value1 = false;
  private Boolean value2 = false;
  private String advancedValue1;
  private String advancedValue2;

  /**
   * Creates a new instance of ConfigBean
   */
  public ConfigBean() {
  }

  public Boolean getValue1() {
    return value1;
  }

  public void setValue1(Boolean value1) {
    this.value1 = value1;
  }

  public Boolean getValue2() {
    return value2;
  }

  public void setValue2(Boolean value2) {
    this.value2 = value2;
  }

  public String getAdvancedValue1() {
    return advancedValue1;
  }

  public void setAdvancedValue1(String advancedValue1) {
    this.advancedValue1 = advancedValue1;
  }

  public String getAdvancedValue2() {
    return advancedValue2;
  }

  public void setAdvancedValue2(String advancedValue2) {
    this.advancedValue2 = advancedValue2;
  }
  
  
  
}
