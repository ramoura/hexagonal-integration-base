package github.com.ramoura.quote.infra.http;

import github.com.ramoura.quote.application.GetQuote;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quote")
public class QuoteController {

    private final GetQuote getQuote;

    public QuoteController(GetQuote getQuote) {
        this.getQuote = getQuote;
    }

    @GetMapping("/{code}")
    public GetQuote.Output getQuote(@PathVariable String code){
        return getQuote.execute(code);
    }

}
