package empresa;

import java.util.ArrayList;
import java.util.List;

public class Departamento implements AutoCloseable {
    private String nome;
    private List<Funcionario> funcionarios;

    public Departamento(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    public Funcionario contratarFuncionario(String nome, String cargo, Endereco endereco) {
        Funcionario f = new Funcionario(nome, cargo, endereco);
        funcionarios.add(f);
        return f;
    }

    public void listarFuncionarios() {
        System.out.println("Funcionários do departamento " + nome + ":");
        for (Funcionario f : funcionarios) {
            System.out.println(" - " + f);
        }
    }

    @Override
    public void close() {
        for (int i = 0; i < funcionarios.size(); i++) {
            Funcionario f = funcionarios.get(i);
            f.close();
            funcionarios.set(i, null); // Remove referência
        }
        funcionarios.clear();
        System.out.println("Departamento " + nome + " foi fechado.");
    }

    @Override
    public String toString() {
        return "Departamento: " + nome + " (" + funcionarios.size() + " funcionários)";
    }
}
