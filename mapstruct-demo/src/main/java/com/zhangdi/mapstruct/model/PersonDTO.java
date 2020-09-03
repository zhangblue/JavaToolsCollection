package com.zhangdi.mapstruct.model;

import java.util.Date;
import lombok.Data;
import lombok.ToString;

/**
 * @author di.zhang
 * @date 2020/9/3
 * @time 10:00
 **/
@ToString
public class PersonDTO {

  private String userName = null;
  private Integer age = 0;
  private Date birthday = null;

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public Date getBirthday() {
    return birthday;
  }

  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }
}
