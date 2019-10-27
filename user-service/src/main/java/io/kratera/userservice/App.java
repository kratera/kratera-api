package io.kratera.userservice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import io.kratera.userservice.app.config.KrateraUserConfig;
import spark.Spark;

public class App {
	public static void main(String[] args) {
		Spark.port(0);
		
		ApplicationContext context = new AnnotationConfigApplicationContext(KrateraUserConfig.class);
		
		Runtime.getRuntime().addShutdownHook(new Thread(() -> {
			((ConfigurableApplicationContext) context).close();
		}));
	}
}
