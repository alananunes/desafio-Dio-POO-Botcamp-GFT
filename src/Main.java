import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

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

        System.out.println("########BOOTCAMP#############");
        System.out.println(curso1);
        System.out.println("#####################");
        System.out.println(curso2);
        System.out.println("#####################");
        System.out.println(mentoria1);
    }

}
