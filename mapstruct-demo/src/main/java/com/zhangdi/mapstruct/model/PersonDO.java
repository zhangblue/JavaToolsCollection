package com.zhangdi.mapstruct.model;

import java.util.Date;
import lombok.Data;

/**
 * @author di.zhang
 * @date 2020/9/3
 * @time 09:59
 **/

public class PersonDO {

  private Integer id = 0;
  private String name = null;
  private int age = 0;
  private Date birthday = null;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public Date getBirthday() {
    return birthday;
  }

  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }
}
