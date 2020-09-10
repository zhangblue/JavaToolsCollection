package com.zhangdi.mapstruct.converter;

import com.zhangdi.mapstruct.model.StudentDO;
import com.zhangdi.mapstruct.model.StudentModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * @author di.zhang
 * @date 2020/9/10
 * @time 14:01
 **/
@Mapper
public interface StudentConverter {

  StudentConverter INSTANCE = Mappers.getMapper(StudentConverter.class);

  @Mappings(value = {
      @Mapping(source = "stName", target = "name"),
      @Mapping(source = "stAge", target = "age"),
      @Mapping(source = "stGender", target = "gender")
  })
  StudentModel do2dto(StudentDO studentDO);
}
