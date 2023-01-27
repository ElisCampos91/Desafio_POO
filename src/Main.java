import dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JUnit");
        curso2.setDescricao("Descrição curso JUnit");
        curso2.setCargaHoraria(6);

        Conteudo conteudo = new Curso();


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("BootCamp Java");
        bootCamp.setDescricao("Descrição BootCamp Java");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        Dev devElis = new Dev();
        devElis.setNome("Elis");
        devElis.inscreverBootCamp(bootCamp);
        System.out.println("Conteudos Inscritos Elis: " + devElis.getConteudosInscritos());
        devElis.progredir();
        devElis.progredir();
        System.out.println("-");
        System.out.println("Conteudos Faltantes Elis: " + devElis.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Elis: " + devElis.getConteudosConcluidos());
        System.out.println("XP: " + devElis.calcularTotalXP());

        System.out.println("-------------------------");


        Dev devPaulo = new Dev();
        devPaulo.setNome("Paulo");
        devPaulo.inscreverBootCamp(bootCamp);
        System.out.println("Conteudos Inscritos Paulo: " + devPaulo.getConteudosInscritos());
        devPaulo.progredir();
        devPaulo.progredir();
        devPaulo.progredir();
        System.out.println("-");
        System.out.println("Conteudos Faltantes Paulo: " + devPaulo.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Paulo: " + devPaulo.getConteudosConcluidos());
        System.out.println("XP: " + devPaulo.calcularTotalXP());








    }
}
