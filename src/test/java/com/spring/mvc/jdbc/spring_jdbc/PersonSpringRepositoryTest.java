package com.spring.mvc.jdbc.spring_jdbc;

import com.spring.mvc.jdbc.Person;
import com.spring.mvc.spring_jdbc.PersonSpringRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PersonSpringRepositoryTest {
  @Autowired
  PersonSpringRepository repository;

  @Test
  void savePersonTest() {
    //given
    Person p = new Person();
    p.setPersonName("김스프");
    p.setPersonAge(25);
    //when
    repository.savePerson(p);
  }
  @Test
  void removePersonTest() {
    // given
    long id = 4L;
    // when
    repository.removePerson(id);
  }

  @Test
  void modifyPersonTest() {
    // given
    Person p = new Person();
    p.setId(1L);
    p.setPersonName("만지호");
    p.setPersonAge(10000);
    // when
    boolean flag = repository.modify(p);
    // then
    assertTrue(flag);
  }

  @Test
  void findAllTest(){
    List<Person> people =repository.findAll();
//    for ()
  }
}