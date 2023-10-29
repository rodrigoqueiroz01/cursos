package br.com.dev.rq.rest_springboot.data.mapper;

import br.com.dev.rq.rest_springboot.data.vo.PersonVO;
import br.com.dev.rq.rest_springboot.data.model.Person;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Objects.isNull;

@Component
public class PersonMapper {

    public static Person toPerson(PersonVO personVO) {
        var mapper = new ModelMapper();
        return mapper.map(personVO, Person.class);
    }

    public static PersonVO toPersonVO(Person person) {
        var mapper = new ModelMapper();
        return mapper.map(person, PersonVO.class);
    }

    public static List<PersonVO> toPersonVOList(List<Person> personList) {
        if (isNull(personList) || personList.isEmpty()) return new ArrayList<>();
        return personList.stream().map(PersonMapper::toPersonVO).collect(Collectors.toList());
    }

}
