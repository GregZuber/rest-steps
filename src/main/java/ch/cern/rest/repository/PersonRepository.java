package ch.cern.rest.repository;

import ch.cern.rest.domain.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {
}
