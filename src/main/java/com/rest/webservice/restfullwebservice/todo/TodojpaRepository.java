package com.rest.webservice.restfullwebservice.todo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodojpaRepository extends JpaRepository<Todos,Long> {


    List<Todos> findByUsername(String username);
}
