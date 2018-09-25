package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="lantab")
public class Language {

	@Id
	private int Lid;
	private String LName;
	public int getLid() {
		return Lid;
	}
	public void setLid(int lid) {
		Lid = lid;
	}
	public String getLName() {
		return LName;
	}
	public void setLName(String lName) {
		LName = lName;
	}
	@Override
	public String toString() {
		return "Language [Lid=" + Lid + ", LName=" + LName + "]";
	}

}
