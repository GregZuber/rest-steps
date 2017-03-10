package ch.cern.rest.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Person {
  @Id
  @GeneratedValue
  private Long id;
  private String firstName;

  public Person() {
  }

  public Person(Long id, String firstName) {
    this.id = id;
    this.firstName = firstName;
  }

  public Long getId() {
    return id;
  }

  public String getFirstName() {
    return firstName;
  }
}
