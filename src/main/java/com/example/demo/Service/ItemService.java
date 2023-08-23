package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.ItemDetails;
import com.example.demo.Repository.ItemRepo;

@Service
public class ItemService {
	@Autowired
	ItemRepo ir;
	public ItemDetails saveinfo(ItemDetails it) {
		return ir.save(it);
	}
	public List<ItemDetails> showinfo(){
		return ir.findAll();
	}
	public ItemDetails changeinfo(ItemDetails it) {
		return ir.saveAndFlush(it);
	}
	public void deleteinfo(ItemDetails it) {
		ir.delete(it);
	}
	public Optional<ItemDetails> getbyid(int id){
		return ir.findById(id);
	}

}
