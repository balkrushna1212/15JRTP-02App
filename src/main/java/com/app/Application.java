package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		context.refresh();
		context.close();
	}
        public void doProcess(){
         int i=100;
         System.out.println(i+"var added");
         //HIS 200
         //LOGIC goes here ;
}

}
