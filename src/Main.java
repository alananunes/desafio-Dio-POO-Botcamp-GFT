import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(60);


        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descricção Curso JS");
        curso2.setCargaHoraria(20);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição Mentoria");
        mentoria1.setData(LocalDate.now());

       // Polimorfismo => Conteudo é uma classa abstrata não pode ser instancianda
        // mas posso instanciar Curso apartir de conteudo ===> Conteudo conteudo = new Curso();

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Alana Nunes");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Alana"  + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("*************");
        System.out.println("Conteúdos Inscritos de Alana"  + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de Alana" + dev1.getConteudosConcluidos());
        System.out.println("XP:" + dev1.calcularTotalXp());

        System.out.println("");
        System.out.println("################################################################");
        Dev dev2 = new Dev();
        dev2.setNome("João");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de João"  + dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("*************");
        System.out.println("Conteúdos Inscritos de João"  + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos de João" + dev2.getConteudosConcluidos());
        System.out.println("XP:" + dev2.calcularTotalXp());


/*
        System.out.println("########BOOTCAMP#############");
        System.out.println(curso1);
        System.out.println("#####################");
        System.out.println(curso2);
        System.out.println("#####################");
        System.out.println(mentoria1);

 */
    }

}
