package com.rest.webservice.restfullwebservice.todo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@CrossOrigin(origins= "http://localhost:4205" )
//@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class TodojpaResource {

    @Autowired
    private  TodoHardcodedService todoService;

    @Autowired
    private  TodojpaRepository todojpaRepository;


    @GetMapping("/jpa/users/{username}/todos")
    public List<Todos> getAllTodos(@PathVariable String username){
       return todojpaRepository.findByUsername(username);
      //  return todoService.findAll();


    }

    @GetMapping("/jpa/users/{username}/todos/{id}")
    public Todos getTodos(@PathVariable String username,@PathVariable long id){
        return todojpaRepository.findById(id).get();
       // return todoService.findById(id);

    }

    @DeleteMapping("/jpa/users/{username}/todos/{id}")
    public ResponseEntity<Void>deleteTodo(@PathVariable String username,@PathVariable long id){

       // Todos todo =todoService.deleteById(id);
         todojpaRepository.deleteById(id);

       // if(todo != null){
            return ResponseEntity.noContent().build(); //if the delete is success it will return no content back
      //  }
       // return ResponseEntity.notFound().build();
    }

    //This method will map for updating current user
    @PutMapping("/jpa/users/{username}/todos/{id}")
    //For the udate request we will send the content of the updated todo
    public ResponseEntity<Todos>updateTodo(@PathVariable String username,@PathVariable long id,@RequestBody Todos todo){

    Todos updatetodo =todojpaRepository.save(todo);  //I am
    return new ResponseEntity<Todos>(todo, HttpStatus.OK);
    }


    @PostMapping("/jpa/users/{username}/todos")
    public ResponseEntity<Void>createTodo(@PathVariable String username,@RequestBody Todos todo){

        Todos createdTodo = todojpaRepository.save(todo);//This is the created resources
        //Location
        //Get current resource url using IDt
        //"/users/{username}/todos/{id}"

        //This is our help component


   URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
           .buildAndExpand(createdTodo.getId()).toUri();//WE are assigning the created path to a local variable

        return ResponseEntity.created(location).build();//The uri location is created
    }






}
