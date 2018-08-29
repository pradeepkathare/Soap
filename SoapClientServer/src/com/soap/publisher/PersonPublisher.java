package com.soap.publisher;

import javax.xml.ws.Endpoint;

import com.soap.Service.PersonServiceImpl;

public class PersonPublisher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String address = "http://localhost:8080/ws/person";
		//String implementor = "";
		Endpoint.publish(address, new PersonServiceImpl());
	}

}
