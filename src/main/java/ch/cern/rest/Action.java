package ch.cern.rest;

public enum Action {
  GET,
  CREATE;

  @Override
  public String toString() {
    return name();
  }
}
