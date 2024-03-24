package br.com.github.crashcourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    @Bean("myBeanName")
    public MyFirstClass thirdClass() {
        return new MyFirstClass("First Bean");
    }

}
