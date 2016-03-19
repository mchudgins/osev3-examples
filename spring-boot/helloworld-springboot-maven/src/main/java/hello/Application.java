package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	@RequestMapping("/")
	public String home() {
		return "Hello Docker World. This is a new version just for you!  And the webhook works.";
	}

	@RequestMapping("/admin")
	public String admin() {
		return "this is the admin page";
	}


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
