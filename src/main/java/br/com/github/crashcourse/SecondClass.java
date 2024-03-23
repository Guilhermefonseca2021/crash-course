package br.com.github.crashcourse;

import org.springframework.stereotype.Component;

@Component // another to instance without declare a bean is just declare @Component notation in the file
public class SecondClass {
    public String sayHello() {
        return "Hello from the SecondClass";
    }
}
