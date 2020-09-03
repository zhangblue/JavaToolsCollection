package com.zhangdi.mapstruct.enums;

/**
 * @author di.zhang
 * @date 2020/9/3
 * @time 10:02
 **/
public enum Gender {

  MALE("男"), FEMALE("女");

  private String value;

  Gender(String value) {
    this.value = value;
  }
}
