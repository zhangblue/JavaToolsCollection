package com.zhangdi.mapstruct.converter;

import com.zhangdi.mapstruct.model.PersonDO;
import com.zhangdi.mapstruct.model.PersonDTO;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-09-03T14:47:36+0800",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_241 (Oracle Corporation)"
)
public class PersonConverterImpl implements PersonConverter {

    @Override
    public PersonDTO do2dto(PersonDO person) {
        if ( person == null ) {
            return null;
        }

        PersonDTO personDTO = new PersonDTO();

        personDTO.setUserName( person.getName() );
        personDTO.setAge( person.getAge() );
        personDTO.setBirthday( person.getBirthday() );

        return personDTO;
    }
}
