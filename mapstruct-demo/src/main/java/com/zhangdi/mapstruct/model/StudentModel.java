package com.zhangdi.mapstruct.model;

import com.zhangdi.mapstruct.enums.Gender;
import lombok.Data;

/**
 * @author di.zhang
 * @date 2020/9/10
 * @time 13:47
 **/

@Data
public class StudentModel extends BaseModel {

  private Gender gender;

  @Override
  public String getName() {
    return super.getName();
  }

  @Override
  public int getAge() {
    return super.getAge();
  }

  @Override
  public void setName(String name) {
    super.setName(name);
  }

  @Override
  public void setAge(int age) {
    super.setAge(age);
  }
}
