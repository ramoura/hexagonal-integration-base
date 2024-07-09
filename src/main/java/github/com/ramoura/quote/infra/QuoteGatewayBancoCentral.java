package github.com.ramoura.quote.infra;

import github.com.ramoura.quote.application.QuoteGateway;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class QuoteGatewayBancoCentral implements QuoteGateway {


    private final RestTemplate restTemplate;

    public QuoteGatewayBancoCentral(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Double getQuote(String code) {

        Root r = restTemplate.getForObject(
            "https://olinda.bcb.gov.br/olinda/servico/PTAX/versao/v1/odata/CotacaoDolarDia(dataCotacao=@dataCotacao)?@dataCotacao='07-03-2024'&$top=1&$format=json",
            Root.class);
         System.out.println(r);
        double cotacaoVenda = r.value.getFirst().cotacaoVenda;
        return Double.valueOf(cotacaoVenda);
    }
}
