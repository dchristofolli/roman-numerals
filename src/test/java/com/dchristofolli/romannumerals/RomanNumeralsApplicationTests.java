package com.dchristofolli.romannumerals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RomanNumeralsApplicationTests {

    @Test
    void shouldReturnI() {
        Assertions.assertEquals("I", new RomanNumberConverter().converter(1));
    }

    @Test
    void shouldReturnII() {
        Assertions.assertEquals("II", new RomanNumberConverter().converter(2));
    }

    @Test
    void shouldReturnIII() {
        Assertions.assertEquals("III", new RomanNumberConverter().converter(3));
    }

    @Test
    void shouldReturnIV() {
        Assertions.assertEquals("IV", new RomanNumberConverter().converter(4));
    }

    @Test
    void shouldReturnV() {
        Assertions.assertEquals("V", new RomanNumberConverter().converter(5));
    }

    @Test
    void shouldReturnVI() {
        Assertions.assertEquals("VI", new RomanNumberConverter().converter(6));
    }

    @Test
    void shouldReturnVII() {
        Assertions.assertEquals("VII", new RomanNumberConverter().converter(7));
    }

    @Test
    void shouldReturnVIII() {
        Assertions.assertEquals("VIII", new RomanNumberConverter().converter(8));
    }

    @Test
    void shouldReturnIX() {
        Assertions.assertEquals("IX", new RomanNumberConverter().converter(9));
    }

    @Test
    void shouldReturnX() {
        Assertions.assertEquals("X", new RomanNumberConverter().converter(10));
    }

    @Test
    void shouldReturnXXVIII() {
        Assertions.assertEquals("XXVIII", new RomanNumberConverter().converter(28));
    }

    @Test
    void shouldReturnXXXIV() {
        Assertions.assertEquals("XXXIV", new RomanNumberConverter().converter(34));
    }
}
