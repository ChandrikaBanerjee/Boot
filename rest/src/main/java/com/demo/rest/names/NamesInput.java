package com.demo.rest.names;

public class NamesInput {

private int id;
private String user;
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "NamesInput [id=" + id + ", user=" + user + "]";
}
/**
 * @return the id
 */
public int getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(int id) {
	this.id = id;
}
/**
 * @return the user
 */
public String getUser() {
	return user;
}
/**
 * @param user the user to set
 */
public void setUser(String user) {
	this.user = user;
}
public NamesInput() {

}
public NamesInput(int id, String user) {
	super();
	this.id = id;
	this.user = user;
}

}
