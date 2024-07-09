package github.com.ramoura.quote.infra;

public class Value{

    public Value() {
    }
    public Value(double cotacaoCompra, double cotacaoVenda, String dataHoraCotacao) {
        this.cotacaoCompra = cotacaoCompra;
        this.cotacaoVenda = cotacaoVenda;
        this.dataHoraCotacao = dataHoraCotacao;
    }

    public double cotacaoCompra;
        public double cotacaoVenda;
        public String dataHoraCotacao;



        @Override
        public String toString() {
            return "Value{" +
                "cotacaoCompra=" + cotacaoCompra +
                ", cotacaoVenda=" + cotacaoVenda +
                ", dataHoraCotacao='" + dataHoraCotacao + '\'' +
                '}';
        }
    }
