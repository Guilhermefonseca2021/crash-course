package br.com.github.crashcourse;

import org.springframework.stereotype.Service;

@Service
public class MyFirstService {
    // private MyFirstClass myFirstClass;
    public String tellStory() {
        return "the dependency is saving: ";
    } 
}
