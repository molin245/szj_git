package thinkinginspringboot.firstappbygui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class FirstAppByGuiApplication {

	@RequestMapping("/")
	public String index() {
		return "Hello, I'm back!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(FirstAppByGuiApplication.class, args);
	}

}
