package app;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        // Tarefa[] tarefas = new Tarefa[5];
        // Compromisso[] compromissos = new Compromisso[5];

        // tarefas[0] = new Tarefa(0, "Teste", false);
        // tarefas[4] = new Tarefa(4, "Novo Teste", false);

        // compromissos[2] = new Compromisso(0, "Compromisso", "Hoje", "Amanhã");

        // System.out.println(tarefas[0].getDescricao());

    PessoaFisica pf = new PessoaFisica("Pedro" , "Rua sem nome",LocalDate.now(), LocalDate.of(2006,Month.NOVEMBER, 01),"1234567895");
    
    System.out.println(pf.exibirInformacoes());
    
    PessoaJuridica pj = new PessoaJuridica("Daniel" , "Rua com nome", LocalDate.of(2006,Month.NOVEMBER, 01), "Nome Fantasia", "1234567895");
    
    System.out.println(pj.exibirInformacoes());

    Pessoa p1 = pf;

    System.out.println(p1.exibirInformacoes());
    
    p1 = pj;

    System.out.println(p1.exibirInformacoes());

     }
}