package empresa;

public class Endereco {
    private String rua;
    private String cidade;
    private String cep;

    public Endereco(String rua, String cidade, String cep) {
        this.rua = rua;
        this.cidade = cidade;
        this.cep = cep;
    }

    @Override
    public String toString() {
        return rua + ", " + cidade + " - CEP: " + cep;
    }
}