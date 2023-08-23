package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.UserDetails;
import com.example.demo.Repository.UserRepo;

@Service
public class UserService {
	@Autowired
	UserRepo ur;
	public UserDetails saveinfo(UserDetails ud) {
		return ur.save(ud);
	}
	public List<UserDetails> showinfo(){
		return ur.findAll();
	}
	public UserDetails changeinfo(UserDetails ud) {
		return ur.saveAndFlush(ud);
	}
	public void deleteinfo(UserDetails ud) {
		ur.delete(ud);
	}
	public Optional<UserDetails> getbyphoneno(long phoneno){
		return ur.findById(phoneno);
	}
		
	

}
