package com.User.Demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
   @Autowired
   private UserRepo urepo;
   /*public List getNameByStateId(String id)
   {
	   return urepo.getNameById(id);
   }*/
   public List<Useremp> getUserName(String name) {
	    List<Useremp> emp  = new ArrayList<>();
		   
	    urepo.findByName(name)
	    .forEach(emp::add);
		   
	    return emp;
	}

   public List<Useremp> getStateName(String id) {
	    List<Useremp> emp  = new ArrayList<>();
		   
	    urepo.findByStateId(id)
	    .forEach(emp::add);
		   
	    return emp;
	}
   
}
