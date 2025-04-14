package empresa;

import java.util.ArrayList;
import java.util.List;

public class Projeto {
    private String nome;
    private double orcamento;
    private List<Funcionario> equipe; // Agregação - os funcionários existem independentemente do projeto

    public Projeto(String nome, double orcamento) {
        this.nome = nome;
        this.orcamento = orcamento;
        this.equipe = new ArrayList<>();
    }

    public void adicionarMembro(Funcionario funcionario) {
        equipe.add(funcionario);
    }

    public void removerMembro(Funcionario funcionario) {
        equipe.remove(funcionario);
    }

    public void listarEquipe() {
        System.out.println("Equipe do projeto " + nome + ":");
        for (Funcionario f : equipe) {
            System.out.println(" - " + f.getNome() + " (" + f.getCargo() + ")");
        }
    }

    @Override
    public String toString() {
        return "Projeto: " + nome + " (Orçamento: R$" + orcamento + ")";
    }
}
