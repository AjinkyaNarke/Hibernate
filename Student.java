package beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Stable")
public class Student {

	@Id
	@GeneratedValue
	private int pid;

	private String pname;

	@Override
	public String toString() {
		return "Student [pid=" + pid + ", pname=" + pname + "]";
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}
	
}
