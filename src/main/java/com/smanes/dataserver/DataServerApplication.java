package com.smanes.dataserver;

import com.smanes.dataserver.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DataServerApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DataServerApplication.class, args);
		MyController controller  = (MyController) context.getBean(("myController"));
		String myGreeting = controller.sayHello();
		System.out.println(myGreeting);
	}

}
