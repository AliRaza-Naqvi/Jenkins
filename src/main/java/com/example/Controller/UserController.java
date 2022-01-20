package com.example.Controller;

import com.example.Exception.ResourceNotFoundException;
import com.example.Model.UserModel;
import com.example.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class UserController
{
    @Autowired
    private UserRepo repository;
    String result = "User";


    @GetMapping("/User")
    public List<UserModel> getAll()
    {
        return repository.findAll();
    }

    @GetMapping("/User/{id}")
    public ResponseEntity<UserModel> getById(@PathVariable(value = "id") Long id)
            throws ResourceNotFoundException
    {
        UserModel model = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(result +" not found for this id :: " + id));
        return ResponseEntity.ok().body(model);
    }
}