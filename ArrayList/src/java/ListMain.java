package java;

public class ListMain implements Comparable<ListMain> {
private String name;
private String city;
private Integer empID;


public ListMain() {
	super();
	// TODO Auto-generated constructor stub
}

public ListMain(String name, String city, Integer empID) {
	super();
	this.name = name;
	this.city = city;
	this.empID = empID;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public Integer getEmpID() {
	return empID;
}
public void setEmpID(Integer empID) {
	this.empID = empID;
}

@Override
public int compareTo(ListMain listmain) {
	// TODO Auto-generated method stub
	return this.getName().compareTo(listmain.getName());
}


}
