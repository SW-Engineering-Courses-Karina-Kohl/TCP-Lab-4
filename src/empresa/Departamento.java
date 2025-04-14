package empresa;
import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nome;
    private List<Funcionario> funcionarios; // Composição - quando o departamento é destruído, os funcionários também são

    public Departamento(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }


    // Método para remover e "destruir" funcionário
    public void demitirFuncionario(Funcionario funcionario) {
        if (funcionarios.remove(funcionario)) {
            // Em um sistema real, aqui seriam feitas operações de limpeza
            System.out.println(funcionario.getNome() + " foi demitido do departamento " + nome);
        }
    }

    // Método para demitir todos os funcionários (destruição em massa)
    public void fecharDepartamento() {
        System.out.println("Fechando departamento " + nome + " e demitindo todos os funcionários...");
        for (Funcionario f : new ArrayList<>(funcionarios)) {
            demitirFuncionario(f);
        }
        funcionarios.clear();
    }

    public void listarFuncionarios() {
        System.out.println("Funcionários do departamento " + nome + ":");
        for (Funcionario f : funcionarios) {
            System.out.println(" - " + f);
        }
    }

    @Override
    public void finalize() throws Throwable {
        try {
            // fecharDepartamento(); // Limpeza final
            super.finalize();
        } finally {
            super.finalize();
        }
    }

    @Override
    public String toString() {
        return "Departamento: " + nome + " (" + funcionarios.size() + " funcionários)";
    }
}