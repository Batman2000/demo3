package com.example.demo3;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private final ActionRepo Some;

    public Controller(ActionRepo some) {
        Some = some;
    }
    @RequestMapping("/getbyName/{userName}")
    @ResponseBody
    Person Data(@PathVariable String userName)
    {
        return Some.returnData(userName);
    }
}
