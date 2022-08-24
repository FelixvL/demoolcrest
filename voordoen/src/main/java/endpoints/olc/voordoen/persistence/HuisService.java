package endpoints.olc.voordoen.persistence;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import endpoints.olc.voordoen.domein.Huis;

@Service
public class HuisService {
	@Autowired
	HuisRepository hr;
	
	
	public void methode1(){
		System.out.println("ik ben in methode 1");
		Huis huis1 = new Huis();
		huis1.setEigenaar("Frits");
		hr.save(huis1);
	}


	public void methode2(String owner) {
		Huis huis1 = new Huis();
		huis1.setEigenaar(owner);
		hr.save(huis1);		
	}
	public Huis methode3() {
		long id = 3;
		Optional<Huis> huis = hr.findById(id);
		Huis huisEcht = huis.get();
		return huisEcht;
	}
	public Iterable<Huis> methode4() {
		return hr.findAll();
	}


	public void opslaan(Huis huis) {
		hr.save(huis);
		
	}

}
