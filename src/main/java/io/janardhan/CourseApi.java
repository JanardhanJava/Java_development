package io.janardhan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.diagnostics.FailureAnalyzer;

@SpringBootApplication
public class CourseApi {

	public static void main(String[] args) {
		 SpringApplication.run(CourseApi.class, args);
		 
		//Banner off
		/*
		 * SpringApplication app = new SpringApplication(CourseApi.class);
		 * app.setBannerMode(Banner.Mode.OFF); app.run(args);
		 */
	}

}
