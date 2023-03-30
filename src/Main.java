import java.time.LocalDate;

import javax.swing.text.AbstractDocument.Content;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        
        Curso curso1 = new Curso();  // NEW instanciando um objeto

        curso1.setTitulo("Curso JAVA");
        curso1.setDescricao("Descrição curso JAVA");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso Delphi");
        curso2.setDescricao("Descrição curso Delphi");
        curso2.setCargaHoraria(10);      

        Conteudo conteudo = new Curso();

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("JAVA");
        mentoria.setDescricao("Descrição da Mentoria");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp JAVA Developer");
        bootcamp.setDescricao("Descrição bootcamp Java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev devDiego = new Dev();
        devDiego.setNome("Diego");
        devDiego.inscreverBootcamp(bootcamp);
        devDiego.progredir();
        devDiego.progredir();
        devDiego.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Diego" + devDiego.getConteudoInscritos());
        System.out.println("Conteúdos Concluidos Diego" + devDiego.getConteudoConcluidos());
        System.out.println("Experiencia" + devDiego.calcularTotalXp());

        System.out.println("----------------------------------------------");

        Dev devMariane = new Dev();
        devMariane.setNome("Mariane");
        devMariane.inscreverBootcamp(bootcamp);
        devMariane.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos" + devMariane.getConteudoInscritos());
        System.out.println("Conteúdos Concluidos" + devDiego.getConteudoConcluidos());
        System.out.println("Experiencia" + devMariane.calcularTotalXp());

      /*  System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/ 

    }
}
