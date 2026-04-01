import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Transacao {

    private String tipo;
    private double valor;
    private LocalDate data;
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter
              .ofPattern("dd/MM/uuu")
              .withResolverStyle(STRICT);
    
    public Transacao(String tipo, double valor, String data) {
        this.tipo = tipo;
        this.valor = valor;
        this.data = LocalDate.parse(data, FORMATTER);

        //GETTERS
        public String getTipo() {
            return this.tipo;
        }

        public double getValor() {
            return this.valor;
        }

        public String getData() {
            return this.data.format(FORMATADOR);
        }

    }

    @Override
    public String toString() {
        return String.format("%-22s: R$ %.2f %s", this.tipo, this.valor, this.data.format(FORMATADOR));
    }
}