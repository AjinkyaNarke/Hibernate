package beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Modtab")
public class Module {
	
	
	
	@Id
	@Column(name="mid")
	private int Modid;
	
	@Column(name="Mname")
	private String ModName;
	
	@Column(name="Mtype")
	private String modType;

	
	public int getModid() {
		return Modid;
	}
	public void setModid(int modid) {
		Modid = modid;
	}
	public String getModName() {
		return ModName;
	}
	public void setModName(String modName) {
		ModName = modName;
	}
	public String getModType() {
		return modType;
	}
	public void setModType(String modType) {
		this.modType = modType;
	}
	@Override
	public String toString() {
		return "Module [Modid=" + Modid + ", ModName=" + ModName + ", modType=" + modType + "]";
	}
	

}
