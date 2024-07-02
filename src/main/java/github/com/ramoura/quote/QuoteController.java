package github.com.ramoura.quote;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quote")
public class QuoteController {

    @GetMapping("/{code}")
    public Response getQuote(@PathVariable String code){
        return new Response(3.33);
    }

    public record Response(Double value){}
}
