package com.zhangdi.mapstruct;

import com.zhangdi.mapstruct.converter.PersonConverter;
import com.zhangdi.mapstruct.converter.StudentConverter;
import com.zhangdi.mapstruct.enums.Gender;
import com.zhangdi.mapstruct.model.PersonDO;
import com.zhangdi.mapstruct.model.PersonDTO;
import com.zhangdi.mapstruct.model.StudentDO;
import com.zhangdi.mapstruct.model.StudentModel;
import java.util.Date;
import org.junit.Test;

/**
 * @author di.zhang
 * @date 2020/9/3
 * @time 11:09
 **/
public class MapStructTest {

  @Test
  public void mapStructTest1() {
    PersonDO personDO = new PersonDO();
    personDO.setName("Hollis");
    personDO.setAge(26);
    personDO.setId(1);
    personDO.setBirthday(new Date());
    personDO.setGender(Gender.FEMALE.name());
    personDO.setToday(new Date());
    PersonDTO personDTO = PersonConverter.INSTANCE.do2dto(personDO);
    System.out.println(personDTO);
  }

  @Test
  public void mapStructTest2() {
    StudentDO studentDO = new StudentDO();
    studentDO.setStName("张三");
    studentDO.setStAge(10);
    studentDO.setStGender(Gender.FEMALE);

    StudentModel studentModel = StudentConverter.INSTANCE.do2dto(studentDO);

    System.out.println(studentModel);
  }

}
