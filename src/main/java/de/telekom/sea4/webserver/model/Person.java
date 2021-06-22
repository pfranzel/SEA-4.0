package de.telekom.sea4.webserver.model;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="persons_sea4")
public class Person {
	
	@Id
	@Column(name="ID")
	private Long id;       // defaul (-1)
	
	@Column(name="ANREDE")
	private String anrede;
	
	@Column(name="VORNAME")
	private String vorname;
	
	@Column(name="NACHNAME")
	private String nachname;
	
	@Column(name="GEBURTSDATUM")
	private LocalDate birthDate;
	
	@Column(name="STANDORT")
	private String standort;
	
	@Column(name="EMAIL")
	private String email;
	
	public Person() {
	}
	
	public Person(int id, String anrede, String vorname, String nachname, LocalDate birthDate, String standort, String email) {
		this.id = (long) id;
		this.anrede = anrede;
		this.vorname = vorname;
		this.nachname = nachname;
		this.birthDate = birthDate;
		this.standort = standort;
		this.email = email;
	}
	
	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getStandort() {
		return standort;
	}

	public void setStandort(String standort) {
		this.standort = standort;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAnrede() {
		return anrede;
	}
	
	public void setAnrede(String anrede) {
		this.anrede = anrede;
	}
	
	public String getVorname() {
		return vorname;
	}
	
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	
	public String getNachname() {
		return nachname;
	}
	
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
}