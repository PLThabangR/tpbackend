package com.rest.webservice.restfullwebservice.todo;

import java.util.Date;
import java.util.Objects;

public class Todos {
    private long id;
    private String username;
    private String description;
    private Date targetDate;
    private boolean isDone;

    public Todos(long id, String username, String description, Date targetDate, boolean isDone) {
        this.id = id;
        this.username = username;
        this.description = description;
        this.targetDate = targetDate;
        this.isDone = isDone;
    }

    //A default constructor will allow us to create objects
    public Todos(){

    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(Date targetDate) {
        this.targetDate = targetDate;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Todos)) return false;
        Todos todos = (Todos) o;
        return getId() == todos.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
