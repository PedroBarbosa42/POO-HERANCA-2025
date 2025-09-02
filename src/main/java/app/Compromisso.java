package app;

public class Compromisso extends Atividade {
    private String dataInicial;
    private String dataFinal;

    public String getDataInicial() {
        return dataInicial;
    }

    public setDataInicial(String dataInicial) {
        this.dataInicial = dataInicial;
    }

    public String getDataFinal() {
        return dataFinal;
    }
    public setDataFinal(String dataFinal) {
        this.dataFinal = dataFinal;    
    }

    public Compromisso(long id, String descricao, String dataInicial) {
        this.setId(id);
        this.setdataInicial(dataInicial);
        this.setdataFinal(dataFinal);
        this.setDescricao(descricao);

    }

}