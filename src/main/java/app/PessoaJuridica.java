package app;

import java.time.LocalDate;


public class PessoaJuridica extends Pessoa {
    
    private String nome;
    private String endereco;
    private LocalDate dataCriacao;
    private String nomeFantasia;
    private String cnpj;


    public PessoaJuridica(String nome, String endereco, LocalDate dataCriacao, String nomeFantasia, String cnpj) {
    
        this.setnomeFantasia(nomeFantasia);
        this.setCnpj(cnpj);
    }

    public String nomeFantasia() {
        return nomeFantasia;
    }

    public void setnomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String cnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    @override
    public String exibirInformacoes() {
        return " Nome:" + nome + " endereço:" + endereco + " data de Criacao:" + dataCriacao + " nomeFantasia:" + nomeFantasia + " CNPJ:" + cnpj;
    } 
}