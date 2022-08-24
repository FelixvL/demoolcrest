package endpoints.olc.voordoen.domein;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Huis {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	String eigenaar;
	int huisnummer;
	int prijs;
	LocalDate bouwjaar;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEigenaar() {
		return eigenaar;
	}
	public void setEigenaar(String eigenaar) {
		this.eigenaar = eigenaar;
	}
	public int getHuisnummer() {
		return huisnummer;
	}
	public void setHuisnummer(int huisnummer) {
		this.huisnummer = huisnummer;
	}
	public int getPrijs() {
		return prijs;
	}
	public void setPrijs(int prijs) {
		this.prijs = prijs;
	}
	public LocalDate getBouwjaar() {
		return bouwjaar;
	}
	public void setBouwjaar(LocalDate bouwjaar) {
		this.bouwjaar = bouwjaar;
	}
	
	

}
