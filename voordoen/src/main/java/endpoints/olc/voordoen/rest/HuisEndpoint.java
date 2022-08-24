package endpoints.olc.voordoen.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HuisEndpoint {

	@GetMapping("/methode1")
	public void methode1() {
		System.out.println("het endpoint is aangeroepen");
	}
}
