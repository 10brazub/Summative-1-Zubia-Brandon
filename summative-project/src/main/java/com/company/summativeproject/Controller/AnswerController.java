package com.company.summativeproject.Controller;

import com.company.summativeproject.Model.Answer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class AnswerController {

    private List<String> answers;

    private static int idCounter = 0;

    public AnswerController() {

        String answer1 = "It is certain.";
        String answer2 = "Without a doubt.";
        String answer3 = "Yes, definitely.";
        String answer4 = "You may rely on it.";
        String answer5 = "As I see it, no.";
        String answer6 = "Most likely.";
        String answer7 = "Outlook bad.";
        String answer8 = "No.";
        String answer9 = "Signs point to probably not.";
        String answer10 = "Reply hazy, try again.";

        answers = Arrays.asList(answer1, answer2, answer3, answer4, answer5, answer6, answer7, answer8, answer9, answer10);
    }

    @RequestMapping(value = "/magic", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Answer getAnswer(@RequestBody(required = false) String question) {

        int randomIndex = new Random().nextInt(answers.size());
        String randomAnswer = answers.get(randomIndex);

        // if user doesn't provide a question
        if (question == null || question.equals("")) {
            return new Answer(idCounter++, "", randomAnswer);
        }

        return new Answer(idCounter++, question, randomAnswer);
    }
}
