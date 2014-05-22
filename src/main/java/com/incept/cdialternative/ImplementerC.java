/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.incept.cdialternative;

import javax.enterprise.inject.Alternative;

/**
 *
 * @author bhalepr
 */
@Alternative
public class ImplementerC implements ImplementerIntf{

  @Override
  public String showImplementer() {
    return this.getClass().getName();
  }
  
}
