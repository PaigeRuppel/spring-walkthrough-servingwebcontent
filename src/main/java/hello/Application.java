package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/**
 * annotation that wraps up a lot of stuff.. at the core of sprinboot and its
 * philosophy when you add in starter and devtools, springboot does the work of
 * creating a web server/building a web app allows us to stand up an embedded
 * server - software that you just launch will run its own process - embedded
 * server runs within our software - this annotation tells it to configure all
 * of this, looks at all of the resources in our other classes
 */
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
