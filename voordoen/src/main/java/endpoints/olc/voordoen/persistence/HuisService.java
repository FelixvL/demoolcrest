package endpoints.olc.voordoen.persistence;

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

}
