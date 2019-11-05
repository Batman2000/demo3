package com.example.demo3;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class Controller {
    private final ActionRepo Some;

    public Controller(ActionRepo some) {
        Some = some;
    }
    @RequestMapping
    @ResponseBody
    List <Person> Data()
    {
        return Some.returnData();
    }
}
