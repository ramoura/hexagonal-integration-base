package github.com.ramoura.quote.application;


import org.springframework.stereotype.Component;

@Component
public class GetQuote {

    private final QuoteGateway quoteGateway;

    public GetQuote(QuoteGateway quoteGateway) {
        this.quoteGateway = quoteGateway;
    }

    public Output execute(String code){
        var output = quoteGateway.getQuote(code);
        return new Output(output);
    }


    public record Output(Double value){}
}
