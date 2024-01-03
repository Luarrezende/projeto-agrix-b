package com.betrybe.agrix.solution;

import com.betrybe.agrix.ebytr.staff.entity.Person;
import com.betrybe.agrix.ebytr.staff.security.Role;
import com.betrybe.agrix.ebytr.staff.service.PersonService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
@DisplayName("PersonServiceTest")
public class PersonServiceTest {
  @Autowired
  private PersonService personService;

  @Test
  public void testGetPersonById() {
    Person person = new Person();
    person.setUsername("Luar");
    person.setPassword("<PASSWORD>");
    person.setRole(Role.USER);

    Long createId = personService.create(person).getId();
    person = personService.getPersonById(createId);

    assertEquals(person.getUsername(), "Luar");
    assertEquals(person.getPassword(), "<PASSWORD>");
    assertEquals(person.getRole(), Role.USER);
    assertEquals(person.getId(), createId);
  }

  @Test
  public void testPersonByIdNotFound() {
    Person person = new Person();
    person.setUsername("Luar");
    person.setPassword("<PASSWORD>");
    person.setRole(Role.USER);

    Long createId = personService.create(person).getId();
    person = personService.getPersonById(createId + 1);

    assertEquals(person, null);
  }

  @Test
  public void testGetPersonByUsername() {
    Person person = new Person();
    person.setUsername("Luar");
    person.setPassword("<PASSWORD>");
    person.setRole(Role.USER);

    Long createId = personService.create(person).getId();
    person = personService.getPersonByUsername(person.getUsername());

    assertEquals(person.getUsername(), "Luar");
    assertEquals(person.getPassword(), "<PASSWORD>");
    assertEquals(person.getRole(), Role.USER);
    assertEquals(person.getId(), createId);
  }

  @Test
  public void testPersonByUsernameNotFound() {
    Person person = new Person();
    person.setUsername("Luar");
    person.setPassword("<PASSWORD>");
    person.setRole(Role.USER);

    personService.create(person).getId();
    person = personService.getPersonByUsername(person.getUsername() + "1");

    assertNull(person);

  }

  @Test
  public void testCreate() {
    Person person = new Person();
    person.setUsername("Luar");
    person.setPassword("<PASSWORD>");
    person.setRole(Role.USER);

    Long createId = personService.create(person).getId();
    person = personService.getPersonById(createId);

    assertEquals(person.getUsername(), "Luar");
    assertEquals(person.getPassword(), "<PASSWORD>");
    assertEquals(person.getRole(), Role.USER);
    assertEquals(person.getId(), createId);
  }
  
}
