package org.acme.commandmode;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class HelloCommandoTest {

    @Inject
    HelloCommando commando;

    @Test
    void normal() {
        System.out.println(commando.foo(0));
        System.out.println(commando.foo(0));
    }

    @Test
    void blocking() {
        try {
            System.out.println(commando.foo(1));
        } catch (IllegalArgumentException e) {
            System.out.println("1");
        }
        try {
            System.out.println(commando.foo(1));
        } catch (IllegalArgumentException e) {
            System.out.println("1");
        }
    }

}
