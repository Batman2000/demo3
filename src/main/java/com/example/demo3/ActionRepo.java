package com.example.demo3;

import org.springframework.stereotype.Service;

@Service
public class ActionRepo {
    private final Repo RPers;

    public ActionRepo(Repo rPers) {
        RPers = rPers;
    }


    Person returnData(String val)
    {
        return RPers.findPersonByName(val);
    }

}
