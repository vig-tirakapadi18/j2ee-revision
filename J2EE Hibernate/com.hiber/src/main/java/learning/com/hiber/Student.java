package learning.com.hiber;

import javax.persistence.*;

@Entity
@Table(name="stud")
public class Student {
	@Id
	int id;
	String name;
	int yop;
	
	@OneToOne
	Bike bike;

	public Student() {
		super();
	}

	public Student(int id, String name, int yop, Bike bike) {
		super();
		this.id = id;
		this.name = name;
		this.yop = yop;
		this.bike = bike;
	}

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

	public int getYop() {
		return yop;
	}

	public void setYop(int yop) {
		this.yop = yop;
	}

	public Bike getBike() {
		return bike;
	}

	public void setBike(Bike bike) {
		this.bike = bike;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", yop=" + yop + ", bike=" + bike + "]";
	}
}
