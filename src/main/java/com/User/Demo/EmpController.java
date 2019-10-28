package com.User.Demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;





@RestController
@RequestMapping(path="/emp")
	public class EmpController {
	@Autowired
	private UserRepo repo1;
	@Autowired
	private StateRepo repo2;
	@Autowired 
	private UserService us;
	@Autowired 
	private StateService s;

	@RequestMapping(value="/allusers",method=RequestMethod.GET)

	public @ResponseBody List<Useremp> getDetails(){
		System.out.println(repo1.findAll());
		
		return (List<Useremp>) repo1.findAll();
	}
	  
	
	   
	@RequestMapping(value="/allstate",method=RequestMethod.GET)

	public @ResponseBody List<State> getLoca(){
		System.out.println(repo2.findAll());
		
		return (List<State>) repo2.findAll();
	}
	  
	   @RequestMapping(value = "/state/{id}")
	   public Optional<State> getStateId(@PathVariable("id") String id) {
	   	return repo2.findById(id);
	   }
 
	   @RequestMapping(value = "/state/{name}",method=RequestMethod.GET)
	   public List<State> getStateName(@PathVariable("name") String name) {
	   	return s.getStateName(name);
	   }
 
	   @RequestMapping(value = "/user/{name}",method=RequestMethod.GET)
	     public @ResponseBody List<Useremp> getNames(@PathVariable("name")String name){
	    	 return us.getUserName(name);
	     }
	    
   
     
   
     
}

