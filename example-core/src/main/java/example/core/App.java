package example.core;

import example.PersonDataStore;

import java.util.ServiceLoader;

public final class App {
    public static void main( String[] args ) {
        if ( args.length != 1 ) {
            throw new IllegalArgumentException( "Please provide one argument exactly: " +
                    "the ID of the person you want to find" );
        }
        var personId = args[ 0 ];
        var personDataStore = loadPersonDataStore();
        personDataStore.getPerson( personId ).ifPresentOrElse(
                ( person ) -> System.out.printf( "Found Person with ID=%s: %s\n", personId, person ),
                () -> System.err.printf( "Person does not exist with ID=%s\n", personId ) );
    }

    private static PersonDataStore loadPersonDataStore() {
        var stores = ServiceLoader.load( PersonDataStore.class );
        for ( var store : stores ) {
            return store;
        }
        throw new IllegalStateException( "No " + PersonDataStore.class.getName() + " service available" );
    }
}
