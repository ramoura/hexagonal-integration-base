package github.com.ramoura.quote;


import github.com.ramoura.quote.application.QuoteGateway;
import github.com.ramoura.quote.infra.Root;
import github.com.ramoura.quote.infra.Value;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.client.RestTemplate;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
public class APITest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private RestTemplate restTemplate;

    @Test
    void shouldReturnDefaultMessage() throws Exception {
        Root r = new Root();
        r.value.add(new Value(3.33d,3.33d, "01/01/2000"));
        Mockito.when(restTemplate.getForObject(any(String.class), any(Class.class))).thenReturn(r);
        this.mockMvc.perform(get("/quote/USD-BRL"))
            .andDo(print())
            .andExpect(status().isOk())
            .andExpect(content().json("{'value': 3.33}"));
    }
}
