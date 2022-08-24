package endpoints.olc.voordoen.persistence;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import endpoints.olc.voordoen.domein.Huis;


@Component
public interface HuisRepository extends CrudRepository<Huis, Long>{ 
	
}
