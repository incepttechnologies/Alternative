/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.incept.cdialternative;

import javax.enterprise.inject.Specializes;

/**
 *
 * @author bhalepr
 */
@Specializes
public class ImplementerD extends ImplementerC{

  @Override
  public String showImplementer() {
    return this.getClass().getName();
  }
  
}
