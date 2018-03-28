package guru.springframework.joke.controllers;

import guru.springframework.joke.services.ChuckNorrisService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChuckNorrisController {

    private final ChuckNorrisService chuckNorrisService;

    public ChuckNorrisController(ChuckNorrisService chuckNorrisService) {
        this.chuckNorrisService = chuckNorrisService;
    }

    @RequestMapping("/")
    public String getJoke(Model model) {
        model.addAttribute("joke", chuckNorrisService.getRandomQuote());

        return "chucknorris";
    }
}
