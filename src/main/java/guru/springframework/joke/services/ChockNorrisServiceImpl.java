package guru.springframework.joke.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChockNorrisServiceImpl implements ChuckNorrisService {


    @Override
    public String getRandomQuote() {
        return new ChuckNorrisQuotes().getRandomQuote();
    }
}
