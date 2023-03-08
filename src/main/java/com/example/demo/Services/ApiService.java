package com.example.demo.Services;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Models.Movies;
import com.example.demo.Repositories.MovieRepo;
@Service
public class ApiService {

	@Autowired
	MovieRepo repository;
		public Optional<Movies> gettaskdetail(int id){
			return repository.findById(id);
		}

		public String updateDetails(Movies t) {
			repository.save(t);
			return "updated";
		}

		public String deleteDetails(int id) {
			repository.deleteById(id);
			return "Id deleted";
		}
		
}
