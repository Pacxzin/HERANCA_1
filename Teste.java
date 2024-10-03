public class PessoaFisica {
    private String nome;
    private String cpf;
    private String endereco;
    private String email;

    public PessoaFisica(String nome, String cpf, String endereco, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pessoa Fisica: " + nome + " - CPF: " + cpf + " - Endereço: " + endereco + " - Email: " + email;
    }
}

public class PessoaJuridica {
    private String nome;
    private String cnpj;
    private String endereco;
    private String email;

    public PessoaJuridica(String nome, String cnpj, String endereco, String email) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pessoa Juridica: " + nome + " - CNPJ: " + cnpj + " - Endereço: " + endereco + " - Email: " + email;
    }
}

public class Funcionario {
    private String nome;
    private String cpf;
    private String endereco;
    private double salario;

    public Funcionario(String nome, String cpf, String endereco, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario: " + nome + " - CPF: " + cpf + " - Endereço: " + endereco + " - Salário: " + salario;
    }
}

public class Main {
    public static void main(String[] args) {

        // Exibindo os objetos
        System.out.println("Pessoas Físicas:");
        for (PessoaFisica pf : pessoasFisicas) {
            System.out.println(pf);
        }

        System.out.println("\nPessoas Jurídicas:");
        for (PessoaJuridica pj : pessoasJuridicas) {
            System.out.println(pj);
        }

        System.out.println("\nFuncionários:");
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }
    }
}
