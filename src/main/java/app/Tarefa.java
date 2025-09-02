package app;
 
public class Tarefa extends Atividade {
    private boolean  isConcluido;

    public boolean getIsConcluido() {
        return isConcluido;
    }
    public void setIsConcluido(boolean isConcluido) {
        this.isConcluido = isConcluido;
}
    public Tarefa(long id, String descricao, boolean isConcluido) {
        this.setId(id);
        this.setDescricao(descricao);
        this.setIsConcluido(isConcluido);
    }
}
 
 
