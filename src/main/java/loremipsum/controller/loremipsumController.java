package loremipsum.controller;

import loremipsum.model.Loremipsum;
import loremipsum.model.LoremipsumGenerator;
import loremipsum.model.LoremipsumJacobsAdapter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class loremipsumController {


    @GetMapping("/")
    public String home(){
        return "lorem";
    }



    private Loremipsum loremipsum;
    // @RequestParam automatycznie zmienia dane z formularza na zmieną Javy, która musi się tak samo nazywać jak ta w formularzu

    @GetMapping
    public String getResult(@RequestParam Integer number, @RequestParam String option, ModelMap map){
        loremipsum = new LoremipsumJacobsAdapter();
        switch (option) {
            case "sentences":
                map.put("result",loremipsum.generateSentences(number));
                break;
            case "words":
                map.put("result",loremipsum.generateWords(number));
                break;
            case "paragraphs":
                map.put("result",loremipsum.generateParagraphs(number));
                break;
        }
        return "/result";
    }

}
