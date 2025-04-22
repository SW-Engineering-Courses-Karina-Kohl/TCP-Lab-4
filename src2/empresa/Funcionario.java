package empresa;

public class Funcionario implements AutoCloseable {
    private String nome;
    private String cargo;
    private Endereco endereco;
    private boolean ativo = true;

    public Funcionario(String nome, String cargo, Endereco endereco) {
        this.nome = nome;
        this.cargo = cargo;
        this.endereco = endereco;
    }

    public void trabalhar() {
        if (ativo) {
            System.out.println(nome + " está trabalhando como " + cargo);
        } else {
            System.out.println(nome + " está inativo e não pode trabalhar.");
        }
    }

    public boolean isAtivo() {
        return ativo;
    }

    @Override
    public void close() {
        ativo = false;
        System.out.println(nome + " foi desligado.");
    }

    @Override
    public String toString() {
        return nome + " (" + cargo + ") - " + endereco + (ativo ? "" : " [INATIVO]");
    }

    
    public String getNome() {
        return nome;
    }
    public String getCargo() {
        return cargo;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
