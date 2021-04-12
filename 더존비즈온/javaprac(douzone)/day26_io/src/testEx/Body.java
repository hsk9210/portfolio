package testEx;

import java.io.Serializable;

public class Body implements Serializable {
	int no;
	float weight;
	float height;
	boolean gender;
	
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public Body(int no,float weight, float height,boolean gender) {
		this.no =no;
		this.weight =weight;
		this.height=height;
		this.gender=gender;
	}
}
