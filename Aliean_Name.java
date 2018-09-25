package Beans;

import javax.persistence.Embeddable;

@Embeddable
public class Aliean_Name {

	
	private String fname;
	private String mlame;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMlame() {
		return mlame;
	}
	public void setMlame(String mlame) {
		this.mlame = mlame;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	private String lname;
	@Override
	public String toString() {
		return "Aliean_Name [fname=" + fname + ", mlame=" + mlame + ", lname=" + lname + "]";
	}

	
	
	
}
