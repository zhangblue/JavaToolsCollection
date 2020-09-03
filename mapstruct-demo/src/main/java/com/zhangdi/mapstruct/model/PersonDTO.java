package com.zhangdi.mapstruct.model;

import com.zhangdi.mapstruct.enums.Gender;
import java.util.Date;
import lombok.Data;
import lombok.ToString;

/**
 * @author di.zhang
 * @date 2020/9/3
 * @time 10:00
 **/
@Data
public class PersonDTO {

  private String userName = null;
  private Integer age = 0;
  private Date birthday = null;
  private Gender gender;
  private Boolean flag;


}
