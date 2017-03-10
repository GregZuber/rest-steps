package ch.cern.rest.controller.level0;

import ch.cern.rest.Action;
import ch.cern.rest.repository.PersonRepository;
import ch.cern.rest.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {
  @Autowired
  private PersonRepository personRepository;

  @RequestMapping(path = "/person", method = RequestMethod.POST)
  public List<Person> personActions(@RequestBody(required = false) Person person) {

    if (person == null) {
      return (List<Person>) personRepository.findAll();
    } else {
      personRepository.save(person);
    }

    return null;
  }
}
