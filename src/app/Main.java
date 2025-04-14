package app;
import empresa.*;

public class Main {
    public static void main(String[] args) {
        // Criando endereços (associação simples)
        Endereco end1 = new Endereco("Rua A, 123", "São Paulo", "01000-000");
        Endereco end2 = new Endereco("Av. B, 456", "Rio de Janeiro", "20000-000");
        Endereco end3 = new Endereco("Rua C, 789", "Belo Horizonte", "30000-000");

        // Criando funcionários
        Funcionario func1 = new Funcionario("João Silva", "Desenvolvedor", end1);
        Funcionario func2 = new Funcionario("Maria Souza", "Gerente", end2);
        Funcionario func3 = new Funcionario("Carlos Oliveira", "Analista", end3);

        // Criando departamento (composição)
        Departamento deptTI = new Departamento("TI");
        deptTI.adicionarFuncionario(func1);
        deptTI.adicionarFuncionario(func2);
        deptTI.listarFuncionarios();

        // Criando projeto (agregação)
        Projeto projetoX = new Projeto("Sistema ERP", 50000.0);
        projetoX.adicionarMembro(func1);
        projetoX.adicionarMembro(func3);
        projetoX.listarEquipe();

        // Demonstração da composição vs agregação
        System.out.println("\nAntes de destruir o departamento:");
        System.out.println("- Funcionário 1: " + func1);
        
        // "Destruindo" o departamento (na prática, apenas deixando de referenciá-lo)
        deptTI = null;
        
        System.out.println("\nDepois de 'destruir' o departamento:");
        // Na composição real, os funcionários seriam destruídos também
        // Mas em Java precisamos simular isso manualmente
        System.out.println("- Funcionário 1 ainda existe: " + func1);
        
        // O projeto (agregação) mantém seus membros mesmo sem o departamento
        projetoX.listarEquipe();

       //Criando departamento (composição)
       Departamento deptTI2 = new Departamento("TI2");
       deptTI2.adicionarFuncionario(func1);
       deptTI2.adicionarFuncionario(func2);
       deptTI2.listarFuncionarios();
       
        // Testando demissão
        deptTI2.demitirFuncionario(func2);
        deptTI2.listarFuncionarios();
        
        // Testando fechamento do departamento
        deptTI2.fecharDepartamento();
        deptTI2.listarFuncionarios(); // Lista vazia
        
        //Forçando o garbage collector para demonstrar o finalize()
        deptTI = null;
        System.gc();
        System.out.println("E agora? " + func1);
    }
}
