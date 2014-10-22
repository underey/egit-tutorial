package edu.bionic.sverkunov.com.DAODB3.classes;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Dish {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String weight;
	private double price;
	private String description;
	private boolean is_kitchen_made;
	private boolean isactivated;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="menusection_id")
	private Menusection menusection;
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isIs_kitchen_made() {
		return is_kitchen_made;
	}
	public void setIs_kitchen_made(boolean is_kitchen_made) {
		this.is_kitchen_made = is_kitchen_made;
	}
	public Menusection getMenusection() {
		return menusection;
	}
	public void setMenusection(Menusection menusection) {
		this.menusection = menusection;
	}
	
	
	public boolean isIsactivated() {
		return isactivated;
	}
	public void setIsactivated(boolean isactivated) {
		this.isactivated = isactivated;
	}
	@Override
	public String toString() {
		return  "" + name + "\n id: " + id + "\n weight: " + weight
				+ "\n price: " + price + "\n description: " + description
				+ "\n menusection: " + menusection;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((menusection == null) ? 0 : menusection.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dish other = (Dish) obj;
		if (menusection == null) {
			if (other.menusection != null)
				return false;
		} else if (!menusection.equals(other.menusection))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
