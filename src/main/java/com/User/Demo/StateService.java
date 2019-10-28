package com.User.Demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class StateService {
@Autowired 
private StateRepo repo;
	
	
	public List<State> getStateName(String name) {
	    List<State> s  = new ArrayList<>();
		   
	   repo.findByStatename(name)
	    .forEach(s::add);
		   
	    return s;
	}

}
