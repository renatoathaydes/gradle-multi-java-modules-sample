package example.memory;

import example.Person;
import example.PersonDataStore;

import java.util.Map;
import java.util.Optional;

public final class InMemoryPersonDataStore implements PersonDataStore {
    private final Map<String, Person> personById = Map.of( "joe", new Person( "Joe Doe" ) );

    @Override
    public Optional<Person> getPerson( String id ) {
        return Optional.ofNullable( personById.get( id ) );
    }
}
