package com.example.demo3;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActionRepo {
    private final Repo RPers;

    public ActionRepo(Repo rPers) {
        RPers = rPers;
    }


    List<Person> returnData()
    {
        return RPers.findAll();
    }

}
