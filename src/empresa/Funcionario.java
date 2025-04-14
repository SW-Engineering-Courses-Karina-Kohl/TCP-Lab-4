package empresa;

public class Funcionario {
    private String nome;
    private String cargo;
    private Endereco endereco; // Associação simples

    public Funcionario(String nome, String cargo, Endereco endereco) {
        this.nome = nome;
        this.cargo = cargo;
        this.endereco = endereco;
    }

    public void trabalhar() {
        System.out.println(nome + " está trabalhando como " + cargo);
    }

    public String getNome() {
        return this.nome;
    }

    public String getCargo() {
        return this.cargo;
    }

    @Override
    public String toString() {
        return nome + " (" + cargo + ") - " + endereco;
    }
}
