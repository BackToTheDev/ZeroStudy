package week4.day4.javaChange.java8;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class OptionalTest {
    @Test
    void create() {
        Optional<String> optional = Optional.ofNullable("hello");
        assertThat(optional.isPresent()).isTrue();

        System.out.println(optional.isPresent());
        System.out.println(optional.get());

        Optional<String> optional2 = Optional.of("hello");
        assertThat(optional2.isPresent()).isTrue();

        System.out.println(optional2.isPresent());
        System.out.println(optional2.get());

        Optional<String> optional3 = Optional.of(null);
        assertThat(optional3.isPresent()).isFalse();

        System.out.println(optional3.isPresent());


        Optional<String> optional4 = Optional.empty();
        assertThat(optional4.isPresent()).isFalse();

        System.out.println(optional4.isPresent());
    }
    void  orElse() {

    }

}