import java.time.LocalDate;

import javax.swing.text.AbstractDocument.Content;

import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
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

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

    }
}
