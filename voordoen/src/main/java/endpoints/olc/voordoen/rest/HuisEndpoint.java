package endpoints.olc.voordoen.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import endpoints.olc.voordoen.persistence.HuisService;

@RestController
public class HuisEndpoint {
	@Autowired
	HuisService hs;

	@GetMapping("/methode1")
	public void methode1() {
		System.out.println("het endpoint is aangeroepen");
		hs.methode1();
	}
	@GetMapping("/methode2/{eigenaar}")
	public void methode2(@PathVariable("eigenaar") String owner) {
		System.out.println("het endpoint is aangeroepen"+owner);
		hs.methode2(owner);
	}
	@GetMapping("/methode3/{eigenaar}/{huisnummer}")
	public void methode3(@PathVariable("eigenaar") String owner, @PathVariable("huisnummer") int hn) {
		System.out.println("het endpoint is aangeroepen"+owner);
		hs.methode2(owner);
	}
}
