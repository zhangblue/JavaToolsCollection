package com.zhangdi.mapstruct.func;

import java.util.Date;

public class ConvertFunction {

  public static Boolean convertDate(Date date) {
    System.out.println("===================================");
    if (date.getTime() > 100L) {
      return true;
    } else {
      return false;
    }
  }

}
