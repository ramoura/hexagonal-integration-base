package github.com.ramoura.quote.infra;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
public class Root{
    @JsonProperty("@odata.context")
    public String data;
    public ArrayList<Value> value = new ArrayList<>();

    @Override
    public String toString() {
        return "Root{" +
            "data='" + data + '\'' +
            ", value=" + value +
            '}';
    }
}


