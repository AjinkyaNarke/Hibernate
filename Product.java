package beans;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Ptab")
public class Product {

	
	@Id
	@Column(name="Pid")
	private int proid;
	
	@Column(name="Pname")
	private String ProdName;
	
	@Column(name="Pcost")
	private double ProdCost;
	
	@OneToMany
	@JoinColumn(name="modfk")
	private Set<Module> mod=new HashSet<>();
	public int getProid() {
		return proid;
	}
	public void setProid(int proid) {
		this.proid = proid;
	}
	public String getProdName() {
		return ProdName;
	}
	public void setProdName(String prodName) {
		ProdName = prodName;
	}
	public double getProdCost() {
		return ProdCost;
	}
	public void setProdCost(double prodCost) {
		ProdCost = prodCost;
	}
	public Set<Module> getMod() {
		return mod;
	}
	public void setMod(Set<Module> mod) {
		this.mod = mod;
	}
	@Override
	public String toString() {
		return "Product [proid=" + proid + ", ProdName=" + ProdName + ", ProdCost=" + ProdCost + ", mod=" + mod + "]";
	}
	
}
