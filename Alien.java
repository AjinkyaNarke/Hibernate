package Beans;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity()

public class Alien {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int aid;
	private Aliean_Name aliname;
	private String color;
	private Date Bday;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public Aliean_Name getAliname() {
		return aliname;
	}
	public void setAliname(Aliean_Name aliname) {
		this.aliname = aliname;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Date getBday() {
		return Bday;
	}
	public void setBday(Date bday) {
		Bday = bday;
	}
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aliname=" + aliname + ", color=" + color + ", Bday=" + Bday + "]";
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
}
