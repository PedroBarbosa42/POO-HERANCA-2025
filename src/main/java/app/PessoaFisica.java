package app;

import java.time.LocalDate;

public class PessoaFisica extends Pessoa {

    private LocalDate dataNascimento;
    private String cpf;

    public PessoaFisica(String nome, String endereco, LocalDate dataCriacao, LocalDate dataNascimento, String cpf) {
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setdataCriacao(dataCriacao);
        this.setDataNascimento(dataNascimento);
        this.setCpf(cpf);
    }

    public LocalDate getdataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf (String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String exibirInformacoes() {
        return "--- Informações da Pessoa Física ---\n" +
                "Nome: " + this.getNome() + "\n" +
                "Data de Nascimento: " + this.getDataNascimento().format(formatador) + "\n" +
                "Endereço: " + this.getEndereco() + "\n" +
                "CPF: " + this.getCpf() + "\n" +
                "------------------------------------";
    }
}

