package com.company.summativeproject.Controller;

import com.company.summativeproject.Model.Definition;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class DefinitionController {
    private List<Definition> definitions;
    private static int idCounter = 0;

    public DefinitionController(){

        Definition word1 = new Definition(idCounter++, "Belligerent", "exhibiting aggression or hostility towards others");
        Definition word2 = new Definition(idCounter++, "Ameliorate", "make something better or improve it");
        Definition word3 = new Definition(idCounter++, "Ephemeral", "lasting for a very short time, transitory");
        Definition word4 = new Definition(idCounter++, "Serendipity", "the occurrence of happy events by chance");
        Definition word5 = new Definition(idCounter++, "Ambivalent", "having mixed feelings or contradictory ideas about something or someone");
        Definition word6 = new Definition(idCounter++, "Conundrum", "a difficult problem with no easy solution");
        Definition word7 = new Definition(idCounter++, "Euphoria", "a feeling of intense excitement or happiness");
        Definition word8 = new Definition(idCounter++, "Arduous", "requiring great effort or being hard to do");
        Definition word9 = new Definition(idCounter++, "Propensity", "a natural tendency or inclination towards a particular characteristic or behavior");
        Definition word10 = new Definition(idCounter++, "Enigma", "a person or thing that is mysterious or difficult to understand");

        definitions = Arrays.asList(word1, word2, word3, word4, word5, word6, word7, word8, word9, word10);

    }
    @RequestMapping(value = "/word", method = RequestMethod.GET)
    public Definition getRandomWord(){
        int randomIndex = new Random().nextInt(definitions.size());
        return definitions.get(randomIndex);
    }
}
