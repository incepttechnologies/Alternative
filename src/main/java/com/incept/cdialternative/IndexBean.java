package com.incept.cdialternative;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class IndexBean implements Serializable {
    
    @Inject
    ImplementerIntf obj;
    
    String info;
    
    public IndexBean() {}

  public ImplementerIntf getObj() {
    return obj;
  }

  public void setObj(ImplementerIntf obj) {
    this.obj = obj;
  }

  public String getInfo() {
    return obj.showImplementer();
  }

  public void setInfo(String info) {
    this.info = info;
  }


}

