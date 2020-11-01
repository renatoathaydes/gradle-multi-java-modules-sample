package example;

import java.util.Optional;

public interface PersonDataStore {
    Optional<Person> getPerson( String id );
}
