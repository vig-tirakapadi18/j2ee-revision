package learning.com.hiber;

import javax.persistence.*;

@Entity
public class Bike {
	@Id
	int bikeNum;
	String model;
	int price;

	@OneToOne
	Student stud;

	public Bike() {
		super();
	}

	public Bike(int bikeNum, String model, int price, Student stud) {
		super();
		this.bikeNum = bikeNum;
		this.model = model;
		this.price = price;
		this.stud = stud;
	}

	public int getBikeNum() {
		return bikeNum;
	}

	public void setBikeNum(int bikeNum) {
		this.bikeNum = bikeNum;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Student getStud() {
		return stud;
	}

	public void setStud(Student stud) {
		this.stud = stud;
	}

	@Override
	public String toString() {
		return "Bike [bikeNum=" + bikeNum + ", model=" + model + ", price=" + price + ", stud=" + stud + "]";
	}
}
