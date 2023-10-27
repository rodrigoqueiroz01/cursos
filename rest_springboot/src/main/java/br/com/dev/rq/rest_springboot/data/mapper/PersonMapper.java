package br.com.dev.rq.rest_springboot.data.mapper;

import br.com.dev.rq.rest_springboot.data.dto.PersonDTO;
import br.com.dev.rq.rest_springboot.data.model.Person;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Objects.isNull;

@Component
public class PersonMapper {

    public static Person toPerson(PersonDTO personDTO) {
        var mapper = new ModelMapper();
        return mapper.map(personDTO, Person.class);
    }

    public static PersonDTO toPersonDto(Person person) {
        var mapper = new ModelMapper();
        return mapper.map(person, PersonDTO.class);
    }

    public static List<PersonDTO> toPersonDTOList (List<Person> personList) {
        if (isNull(personList) || personList.isEmpty()) return new ArrayList<>();
        return personList.stream().map(PersonMapper::toPersonDto).collect(Collectors.toList());
    }

}
