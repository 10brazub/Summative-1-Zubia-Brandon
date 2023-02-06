package com.company.summativeproject.Controller;


import com.company.summativeproject.Model.Answer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class AnswerController {

    private static int idCounter = 0;



    @RequestMapping(value = "/magic", method = RequestMethod.POST)
    public Answer getAnswer(@RequestBody String question) {

        return new Answer(idCounter++, question);

    }
}
