package com.soap.pojo;

import java.io.Serializable;

/*
 * Pradeep.kathare 
 * Implementation of client and server using soap webservice by jax-ws
 * soap-web-service can be built in 5 techinique axis2, axiom,jaxrs,and others
 * 
 * Below example from the following :
 * https://www.journaldev.com/9123/jax-ws-tutorial#wsdl
 * 
 */
public class Person implements Serializable{

	private static final long serialVersionUID = -5577579081118070434L;
	
	private String name;
	private int age;
	private int id;

	public Person(String name ,int age,int id){
		
		this.name = name;
		this.age = age;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString(){
		return id+"::"+name+"::"+age;
	}

}