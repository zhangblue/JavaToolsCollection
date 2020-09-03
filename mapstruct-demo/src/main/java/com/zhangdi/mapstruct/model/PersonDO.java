package com.zhangdi.mapstruct.model;

import com.zhangdi.mapstruct.enums.Gender;
import java.util.Date;
import lombok.Data;

/**
 * @author di.zhang
 * @date 2020/9/3
 * @time 09:59
 **/
@Data
public class PersonDO {

  private Integer id = 0;
  private String name = null;
  private int age = 0;
  private Date birthday = null;
  private String gender;
  private Date today;


}
