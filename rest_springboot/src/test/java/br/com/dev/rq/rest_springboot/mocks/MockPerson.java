package br.com.dev.rq.rest_springboot.mocks;

import br.com.dev.rq.rest_springboot.data.model.Person;
import br.com.dev.rq.rest_springboot.data.vo.PersonVO;

import java.util.ArrayList;
import java.util.List;

public class MockPerson {

    public Person mockEntity() {
        return mockEntity(0);
    }

    public PersonVO mockVO() {
        return mockVO(0);
    }

    public List<Person> mockEntityList() {
        List<Person> persons = new ArrayList<Person>();

        for (int i = 0; i < 14; i++) {
            persons.add(mockEntity(i));
        }

        return persons;
    }

    public List<PersonVO> mockVOList() {
        List<PersonVO> persons = new ArrayList<>();

        for (int i = 0; i < 14; i++) {
            persons.add(mockVO(i));
        }

        return persons;
    }

    private Person mockEntity(Integer number) {
        return Person.builder()
                .id(number.longValue())
                .firstName("First Name Test" + number)
                .lastName("Last Name Test" + number)
                .address("Addres Test" + number)
                .gender(((number % 2)==0) ? "Male" : "Female")
                .build();
    }

    private PersonVO mockVO(Integer number) {
        return PersonVO.builder()
                .personId(number.longValue())
                .firstName("First Name Test" + number)
                .lastName("Last Name Test" + number)
                .address("Addres Test" + number)
                .gender(((number % 2)==0) ? "Male" : "Female")
                .build();
    }

}
