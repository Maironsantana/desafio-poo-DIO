import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso("Curso Java", "Curso Back-End de Java", 8);
        Curso curso2 = new Curso("Curso JS", "Curso Front-End de JS", 4);
//        Conteudo conteudo = new Curso();
        Mentoria mentoria1 = new Mentoria("Mentoria de Java", "Live focada em ajudar iniciantes na linguagem Java", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "-- Bootcamp voltado para Full-Stack Java Developer --");

        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);

        System.out.println(bootcamp);

        System.out.println("Conteudos Inscritos João" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos João" + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos João" + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calculcarTotalXp());

        System.out.println("-----------------");

        System.out.println("Conteudos Inscritos Maria" + devMaria.getConteudosInscritos());
        devMaria.progredir();
        devMaria.progredir();
        devMaria.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Maria" + devMaria.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Maria" + devMaria.getConteudosConcluidos());
        System.out.println("XP: " + devMaria.calculcarTotalXp());

    }
}
