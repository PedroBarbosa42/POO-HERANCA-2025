package app;

import java.time.LocalDate;

public class PessoaFisica {

    private String nome;
    private String endereco;
    private LocalDate dataCriacao;
    private LocalDate dataNascimento;
    private String cpf;

    public PessoaFisica(String nome, String endereco, LocalDate dataCriacao, LocalDate dataNascimento, String cpf) {
        this.setNome(nome);
        this.setEndereco(endereco);
        this.dataCriacao = dataCriacao;
        this.setDataNascimento(dataNascimento);
        this.setCpf(cpf);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome; 
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setdataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
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

    public String exibirInformacoes() {
        return "Nome:" + nome + "endereço:" + endereco + "data de Criacao:" + dataCriacao + "data de Nascimento:" + dataNascimento + "CPF:" + cpf;
    } 

}


