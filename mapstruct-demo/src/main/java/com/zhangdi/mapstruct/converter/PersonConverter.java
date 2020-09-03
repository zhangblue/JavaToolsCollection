package com.zhangdi.mapstruct.converter;

import com.zhangdi.mapstruct.model.PersonDO;
import com.zhangdi.mapstruct.model.PersonDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * @author di.zhang
 * @date 2020/9/3
 * @time 10:06
 **/
@Mapper
public interface PersonConverter {

  PersonConverter INSTANCE = Mappers.getMapper(PersonConverter.class);

  @Mappings(value = {
      @Mapping(source = "name", target = "userName"),
      @Mapping(source = "gender", target = "gender"),
      @Mapping(target = "flag", expression = "java(com.zhangdi.mapstruct.func.ConvertFunction.convertDate(person.getToday()))")
  })
  PersonDTO do2dto(PersonDO person);
}
