package com.model;

public class VoterReg {
private int id; 
private String name,address;
private long adharno;
private String birthDate;
private int age;
private boolean voting;

public VoterReg(int id, String name, String address, long adharno, String birthDate,int age) {
   
	this.id = id;
	this.name = name;
	this.address = address;
	this.adharno = adharno;
	this.age=age;
	this.birthDate = birthDate;
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
public void isVoting(boolean voting) {
	this.voting=voting;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public long getAdharno() {
	return adharno;
}
public void setAdharno(long adharno) {
	this.adharno = adharno;
}
public String getBirthDate() {
	return birthDate;
}
public void setBirthDate(String birthDate) {
	this.birthDate = birthDate;
}
public boolean getVoting() {
	return voting;
}
@Override
public String toString() {
	return "VoterReg [id=" + id + ", name=" + name + ", address=" + address + ", adharno=" + adharno + ", birthDate="
			+ birthDate + ",age="+age+"]";
}



}