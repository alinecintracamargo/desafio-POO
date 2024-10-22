import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("mentoria java");
        mentoria.setData(LocalDate.now());


       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAline = new Dev();
        devAline.setNome("Aline");
        devAline.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Aline" + devAline.getConteudosInscritos());

        devAline.progredir();
        devAline.progredir();
        System.out.println("--");
        System.out.println("Conteúdos Inscritos Aline" + devAline.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Aline" + devAline.getConteudosConcluidos());
        System.out.println("XP:" + devAline.calcularTotalXP());

        System.out.println("-----------");

        Dev devGeovana = new Dev();
        devGeovana.setNome("Geovana");
        devGeovana.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Geovana" + devGeovana.getConteudosInscritos());

        devGeovana.progredir();
        devGeovana.progredir();
        devGeovana.progredir();
        System.out.println("--");
        System.out.println("Conteúdos Inscritos Geovana" + devGeovana.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Geovana" + devGeovana.getConteudosConcluidos());
        System.out.println("XP:" + devGeovana.calcularTotalXP());


    }
}