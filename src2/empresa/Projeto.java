package empresa;

import java.util.ArrayList;
import java.util.List;

public class Projeto {
    private String nome;
    private double orcamento;
    private List<Funcionario> equipe;

    public Projeto(String nome, double orcamento) {
        this.nome = nome;
        this.orcamento = orcamento;
        this.equipe = new ArrayList<>();
    }

    public void adicionarMembro(Funcionario funcionario) {
        equipe.add(funcionario);
    }

    public void listarEquipe() {
        System.out.println("Equipe do projeto " + nome + ":");
        for (Funcionario f : equipe) {
            System.out.println(" - " + f.getNome() + " (" + (f.isAtivo() ? f.getCargo() : "INATIVO") + ")");
        }
    }
}
