package br.com.dev.rq.rest_springboot.data.mapper;

import br.com.dev.rq.rest_springboot.data.model.Person;
import br.com.dev.rq.rest_springboot.data.vo.PersonVO;
import org.springframework.stereotype.Service;

@Service
public class PersonMapper {

    public PersonVO convertEntityToVo(Person person) {
        return PersonVO.builder()
                .id(person.getId())
                .firstName(person.getFirstName())
                .lastName(person.getLastName())
                .address(person.getAddress())
                .gender(person.getGender())
                .build();
    }

    public Person convertVoToEntity(PersonVO vo) {
        return Person.builder()
                .id(vo.getId())
                .firstName(vo.getFirstName())
                .lastName(vo.getLastName())
                .address(vo.getAddress())
                .gender(vo.getGender())
                .build();
    }

}
