package demo;
public class Emp {
private int id;
private String name,password,email,country,UPDATE_AT, CREATE_AT;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUPDATE_AT() {
	return UPDATE_AT;
}
public void setUPDATE_AT(String UPDATE_AT) {
	this.UPDATE_AT = UPDATE_AT;
}
public String getCREATE_AT() {
	return CREATE_AT;
}
public void setCREATE_AT(String CREATE_AT) {
	this.CREATE_AT = CREATE_AT;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}

}
