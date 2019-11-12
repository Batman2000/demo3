package com.example.demo3;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
interface Repo extends CrudRepository <Person, Long> {
    public Person findPersonByName(String name);

}
