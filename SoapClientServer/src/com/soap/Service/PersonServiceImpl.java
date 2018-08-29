package com.soap.Service;

import java.util.HashMap;

import javax.jws.WebService;

import com.soap.pojo.Person;
@WebService(endpointInterface = "com.soap.Service.PersonService")
public class PersonServiceImpl implements PersonService {

	HashMap<Object, Object> hm = new HashMap<Object, Object>();
	
	@Override
	public boolean addPerson(Person p) {
		
		hm.put(p.getId(), p);
		
		return true;
	}

	@Override
	public boolean deletePerson(int id) {
		// TODO Auto-generated method stub
		hm.remove(id);
		return true;
	}

	@Override
	public Person getPerson(int id) {
		// TODO Auto-generated method stub
		Person p = (Person)hm.get(id);
		return p;
	}

	
}
