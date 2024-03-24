package br.com.github.crashcourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrashCourseApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(CrashCourseApplication.class, args);
		// i dot not create a intance for my first class.
		// MyFirstClass myFirstClass = context.getBean(MyFirstClass.class);
		// System.out.println(myFirstClass.sayHello());

		// another to instance without declare a bean is just declare @Component notation in the file
		SecondClass MySecondClass = context.getBean(SecondClass.class);
		System.out.println(MySecondClass.sayHello());

		// With configuration we can create a bean directly, with method to get bean name and method type.
		MyFirstClass thirdClass = context.getBean("myBeanName", MyFirstClass.class);
		System.out.println(thirdClass.sayHello());

		MyFirstService myFirstService = context.getBean(MyFirstService.class);
		System.out.println(myFirstService.tellStory());
	}

	@Bean // i just created a bean to transform this class in tranformer.
	public MyFirstClass myFirstClass() {
		return new MyFirstClass("First Bean");
	}
	// i dont need tranform this with @Bean notation cause already have @Component inside the file.
	public SecondClass mySecondClass() {
		return new SecondClass();
	}

}
