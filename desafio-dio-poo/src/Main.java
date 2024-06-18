import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso1.setTitulo("curso Javascript");
        curso1.setDescricao("descrição curso javascript");
        curso1.setCargaHoraria(5);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria Java");
        mentoria1.setDescricao("descrição mentoria java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devPeppa = new Dev();
        devPeppa.setNome("Peppa");
        devPeppa.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Peppa: " +devPeppa.getConteudosIncritos());

        Dev devOtelo = new Dev();
        devOtelo.setNome("Otelo");
        devOtelo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Otelo: " +devOtelo.getConteudosIncritos());

    }
}