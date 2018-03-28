package guru.springframework.joke.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChockNorrisServiceImpl implements ChuckNorrisService {

    private ChuckNorrisQuotes quotes;

    public ChockNorrisServiceImpl() {
        quotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getRandomQuote() {
        return quotes.getRandomQuote();
    }
}
