import example.PersonDataStore;
import example.memory.InMemoryPersonDataStore;

module example.memory {
    requires transitive example.api;
    provides PersonDataStore with InMemoryPersonDataStore;
}