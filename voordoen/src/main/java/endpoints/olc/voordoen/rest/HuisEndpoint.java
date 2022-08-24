package endpoints.olc.voordoen.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import endpoints.olc.voordoen.domein.Huis;
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
	@GetMapping("methode4")
	public String methode4() {
		System.out.println("methode4");
		return "hoi";
	}
	@GetMapping("methode5")
	public Huis methode5() {
		System.out.println("methode5");
		return new Huis();
	}
	@GetMapping("methode6")
	public Huis methode6() {
		System.out.println("methode6");
		return hs.methode3();
	}
	@GetMapping("methode7")
	public Iterable<Huis> methode7() {
		System.out.println("methode7");
		return hs.methode4();
	}
	@PostMapping("methode8")
	public void methode8(@RequestBody Huis huis) {
		System.out.println("methode7" + huis.getEigenaar());
		hs.opslaan(huis);
		
	}
}
