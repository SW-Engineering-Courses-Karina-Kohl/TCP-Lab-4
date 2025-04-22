package app;
import empresa.*;

public class Main {
    public static void main(String[] args) {
        Endereco end1 = new Endereco("Rua A, 123", "São Paulo", "01000-000");
        Endereco end2 = new Endereco("Av. B, 456", "Rio de Janeiro", "20000-000");
        Endereco end3 = new Endereco("Rua C, 789", "Belo Horizonte", "30000-000");

        Departamento deptTI = new Departamento("TI");

        Funcionario func1 = deptTI.contratarFuncionario("João Silva", "Desenvolvedor", end1);
        Funcionario func2 = deptTI.contratarFuncionario("Maria Souza", "Gerente", end2);

        Projeto projetoX = new Projeto("Sistema ERP", 50000.0);
        projetoX.adicionarMembro(func1);
        projetoX.adicionarMembro(func2);

        deptTI.listarFuncionarios();
        projetoX.listarEquipe();

        System.out.println("\nDesligando o departamento...");
        deptTI.close();

        System.out.println("\nApós fechamento do departamento:");
        projetoX.listarEquipe();  // Vai mostrar membros inativos
    }
}
