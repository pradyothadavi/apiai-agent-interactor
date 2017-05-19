package com.github.pradyothadavi.model;

/**
 * Created by pradyot.ha on 19/05/17.
 */
public enum ResponseObjectType {
  
  TEXT(0),
  CARD(1),
  QUICK_REPLY(2),
  IMAGE(3),
  CUSTOM_PAYLOAD(4);
  
  ResponseObjectType(int type) {
    this.type = type;
  }
  
  int type;
  
  public int getType() {
    return this.type;
  }
}
