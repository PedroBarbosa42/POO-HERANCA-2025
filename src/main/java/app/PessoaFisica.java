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
    @override
    public String exibirInformacoes() {
        DateTimeForatter formatador = DateTimeForatter.ofParttern
        return " Nome:" + nome + " Endereço:" + endereco + " Data de Criacao:" + dataCriacao + " Data de Nascimento:" + dataNascimento + " CPF:" + cpf;
    } 

}


