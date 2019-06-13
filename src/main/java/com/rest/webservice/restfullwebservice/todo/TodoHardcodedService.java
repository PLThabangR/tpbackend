package com.rest.webservice.restfullwebservice.todo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TodoHardcodedService {

    //Declaring the list which has a todo object
    private static List<Todos> todos = new ArrayList();
    //declare a counter which will give each user a unique ID
    private static int idCounter=0;

    //A static block initialize the list as soon as the class is loaded
    static {

        todos.add(new Todos(++idCounter,"thabang","I would like to learn to dance",new Date(),false));
        todos.add(new Todos(++idCounter,"thabang","I would like to learn to micro service 2",new Date(),false));
        todos.add(new Todos(++idCounter,"thabang","I would like to learn how to speak french",new Date(),false));
    }

    public List<Todos> findAll(){
        return todos;
    }


    public Todos save(Todos todo){
        //If the Id is not there add a new todo and increment it
        if(todo.getId()==-1){

            //Add a new Id
            todos.add(todo);
        }else{
            //delete a todo by id
            deleteById(todo.getId());
            todos.add(todo);
        }
        //return a single todo
    return todo;
    }

    //Adding a delete operation
    public Todos deleteById(long id){
        Todos todo = findById(id);

        if(todo==null)return null;

        if(todos.remove(todo)){
            return todo;
        }
        return null;
    }

    //We are finding each todo by Id
    public Todos findById(long id) {
        for(Todos todo:todos){

            if(todo.getId() ==id){
                return todo;
            }
        }
        return  null;
    }

}
