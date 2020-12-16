package sport.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="footballer")
@Entity
public class Footballer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="tezina")
	private int tezina;
	
	@Column(name="godina")
	private int godina;
	
	
	
	public Footballer() {
		
	}



	public Footballer(int id, String firstName, String lastName, int tezina, int godina) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.tezina = tezina;
		this.godina = godina;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public int getTezina() {
		return tezina;
	}



	public void setTezina(int tezina) {
		this.tezina = tezina;
	}



	public int getGodina() {
		return godina;
	}



	public void setGodina(int godina) {
		this.godina = godina;
	}



	@Override
	public String toString() {
		return "Footballer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", tezina=" + tezina
				+ ", godina=" + godina + "]";
	}
	
	
	
	

}
