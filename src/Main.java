import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("#################################\tMENU\t###########################################");
        System.out.println("##################\tCADASTRAR CURSOS\t#####################");

        Curso curso1 = new Curso();

        System.out.println("Informe o nome do curso");
        String nomeCurso = scan.next();
        curso1.setTitulo(nomeCurso);

        System.out.println("Informe a Descricao do curso");
        String descricaoCurso = scan.next();
        curso1.setDescricao(descricaoCurso);

        System.out.println("Informe a carga horária do curso");
        int cargaHorariaCurso = scan.nextInt();
        curso1.setCargaHoraria(cargaHorariaCurso);

        System.out.println("");

/**
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descricção Curso JS");
        curso2.setCargaHoraria(20);
 */
        System.out.println("##################\tCADASTRAR MENTORIAS\t#####################");

        Mentoria mentoria1 = new Mentoria();

        System.out.println("Informe o titulo da mentoria");
        String tituloMentoria = scan.next();
        mentoria1.setTitulo(tituloMentoria);

        System.out.println("Informe a descricao da mentoria");
        String descricaoMentoria = scan.next();
        mentoria1.setDescricao(descricaoMentoria);
        System.out.print("Data: ");
        mentoria1.setData(LocalDate.now());

        System.out.println("");

       // Polimorfismo => Conteudo é uma classa abstrata não pode ser instancianda
        // mas posso instanciar Curso apartir de conteudo ===> Conteudo conteudo = new Curso();
        System.out.println("##################\tCADASTRAR BOOTCAMP\t#####################");
        Bootcamp bootcamp = new Bootcamp();

        System.out.println("Informe o nome do Bootcamp");
        String nomeBootcamp = scan.next();
        bootcamp.setNome(nomeBootcamp);

        System.out.println("Informe a descricao do bootcamp");
        String descricaoBootcamp = scan.next();
        bootcamp.setDescricao(descricaoBootcamp);

        bootcamp.getConteudos().add(curso1);
       // bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        System.out.println("##################\tCADASTRAR DEV\t#####################");
        Dev dev1 = new Dev();

        System.out.println("Informe o nome do dev");
        String nomeDev = scan.next();
        dev1.setNome(nomeDev);

        System.out.println("");
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
