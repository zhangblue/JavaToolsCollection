package com.zhangdi.mapstruct.model;

import com.zhangdi.mapstruct.enums.Gender;
import lombok.Data;

/**
 * @author di.zhang
 * @date 2020/9/10
 * @time 13:59
 **/
@Data
public class StudentDO {

  private String stName;
  private int stAge;
  private Gender stGender;

}
