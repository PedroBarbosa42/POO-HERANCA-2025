package app;

public class PessoaJuridica {
    
    private String nome;
    private String endereco;
    private LocalDate dataCriacao;
    private String nomeFantasia;
    private String cnpj;


    public PessoaJuridica(String nome, String endereco, LocalDate dataCriacao, String nomeFantasia, String cnpj) {
        this.setNome(nome);
        this.setEndereco(endereco);
        this.dataCriacao = dataCriacao;
        this.setnomeFantasia(nomeFantasia);
        this.setcnpj(cnpj); 
    
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

    public String nomeFantasia() {
        return nomeFantasia;
    }

    public void setnomeFantasia(String nomeFantasia) {
       