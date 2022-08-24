package endpoints.olc.voordoen.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HuisService {
	@Autowired
	HuisRepository hr;
	
	
	public void methode1(){
		System.out.println("ik ben in methode 1");
	}

}
