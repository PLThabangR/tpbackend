package com.rest.webservice.restfullwebservice.todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins="http://localhost:4201")
@RestController
public class TodoResource {

    @Autowired
    private  TodoHardcodedService todoService;

    @GetMapping("/users/{username}/todos")
    public List<Todos> getAllTodos(@PathVariable String username){
        return todoService.findAll();

    }

    @GetMapping("/users/{username}/todos/{id}")
    public Todos getTodos(@PathVariable String username,@PathVariable long id){
        return todoService.findById(id);

    }

    @DeleteMapping("/users/{username}/todos/{id}")
    public ResponseEntity<Void>deleteTodo(@PathVariable String username,@PathVariable long id){

        Todos todo =todoService.deleteById(id);

        if(todo != null){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/users/{username}/todos/{id}")
    //For the udate request we will send the content of the updated todo
    public ResponseEntity<Todos>updateTodo(@PathVariable String username,@PathVariable long id,@RequestBody Todos todo){

    Todos updatetodo =todoService.save(todo);
    return new ResponseEntity<Todos>(todo, HttpStatus.OK);
    }






}
