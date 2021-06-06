package part01_flux;

import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.ArrayList;

public class Part01Flux {

    // TODO Return an empty Flux
    public Flux<String> empty() {
        return Flux.empty();
    }

    // TODO Return a Flux that contains 2 values "foo" and "bar" without using an array or a collection
    public Flux<String> fooBarFluxFromValues() {
        return Flux.just("foo", "bar");
    }

    // TODO Create a Flux from a List that contains 2 values "foo" and "bar"
    Flux<String> fooBarFluxFromList() {
        ArrayList<String> l = new ArrayList<>();
        l.add("foo");
        l.add("bar");
        return Flux.fromIterable(l);
    }

    // TODO Create a Flux that emits an IllegalStateException
    Flux<String> errorFlux() {
        return Flux.error(new IllegalStateException());
    }

//========================================================================================

    // TODO Create a Flux that emits increasing values from 0 to 9 each 100ms
    Flux<Long> counter() {
        return Flux.interval(Duration.ofMillis(100)).take(10L);
    }

    public static void main(String[] args) {

    }
}
