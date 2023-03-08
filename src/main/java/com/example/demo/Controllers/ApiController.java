package com.example.demo.Controllers;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Models.Movies;
import com.example.demo.Repositories.MovieRepo;
import com.example.demo.Services.ApiService;
@RestController
@CrossOrigin
public class ApiController {
	@Autowired
	  MovieRepo repo;
	@Autowired
	   ApiService service;
	 @GetMapping("/getvalues")
	   List<Movies> getList(){
		 return repo.findAll();
	 }
	 @PostMapping("/post")
	  public Movies create(@RequestBody Movies t) {
		 return repo.save(t);
	 }
	 @GetMapping("/getvalues/{id}")
	 public Optional<Movies> getbyid(@PathVariable int id){
		
		return service.gettaskdetail(id);
	 }
	 @PutMapping("/update")
	 public String update(@RequestBody Movies t) {
		 return service.updateDetails(t);
	 }
	 @DeleteMapping("/delete/{id}")
	 public String delete(@PathVariable int id) {
		 return service.deleteDetails(id);
	 }
}

