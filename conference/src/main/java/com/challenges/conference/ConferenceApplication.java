package com.challenges.conference;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

import java.net.URL;
import java.net.URLClassLoader;

@SpringBootApplication
public class ConferenceApplication extends SpringBootServletInitializer implements CommandLineRunner  {

	public static void main(String[] args) {
		SpringApplication.run(ConferenceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Get the system classloader
		ClassLoader classLoader = ClassLoader.getSystemClassLoader();

		// Check if it's an instance of URLClassLoader
		if (classLoader instanceof URLClassLoader) {
			URL[] urls = ((URLClassLoader) classLoader).getURLs();
			for (URL url : urls) {
				System.out.println(url.getFile());
			}
		} else {
			System.out.println("ClassLoader is not an instance of URLClassLoader.");
		}
	}
}
