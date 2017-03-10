package hello.world;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello_world {
	@GetMapping("/")
	public String hello(){
		return "Hello World!!!";
	}

}
