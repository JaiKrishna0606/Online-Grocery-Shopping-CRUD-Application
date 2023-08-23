package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.UserDetails;
import com.example.demo.Service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService us;
	@PostMapping("adddetails")
	public UserDetails add(@RequestBody UserDetails ud) {
		return us.saveinfo(ud);
	}
	@GetMapping("showuserdetails")
	public List<UserDetails> showinfo(){
		return us.showinfo();
	}
	@PutMapping("updatedetails")
	public UserDetails modify(@RequestBody UserDetails ud) {
		return us.changeinfo(ud);
	}
	@DeleteMapping("deletedetails")
	public String del(@RequestBody UserDetails ud) {
		us.deleteinfo(ud);
		return "Your Detail has been Deleted Successfully"; 
	}
	@GetMapping("get/{phoneno}")
	public Optional<UserDetails> showphoneno(@PathVariable long phoneno){
		return us.getbyphoneno(phoneno);
	}

}
