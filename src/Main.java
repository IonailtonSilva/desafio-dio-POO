import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;

public class Main {

public static void main(String[] args){ 

    Curso curso1 = new Curso();

    curso1.setTitulo("Curso Java");
    curso1.setDescricao("Descricao Curso Java");
    curso1.setCargaHoraria(8);

    Curso curso2 = new Curso();

    curso2.setTitulo("Curso JavaScript");
    curso2.setDescricao("Descricao Curso JavaScript");
    curso2.setCargaHoraria(4);

    Mentoria mentoria = new Mentoria();

    mentoria.setTitulo("Mentoria de Java");
    mentoria.setDescricao("Descricao Mentoria Java");
    mentoria.setData(LocalDate.now());


    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Bootcamp Java Developer");
    bootcamp.setDescricao("Descricao Bootcamp Java Developer");
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentoria);

    Dev devIonailton = new Dev();

    devIonailton.setNome("Ionailton");
    devIonailton.inscreverBootcamp(bootcamp);
    System.out.println("Conteudos inscritos Ionailton" + devIonailton.getConteudosInscritos());
    devIonailton.progredir();
    System.out.println("------------");
    System.out.println("Conteudos inscritos Ionailton" + devIonailton.getConteudosInscritos());
    System.out.println("Conteudos Conluidos Ionailton" + devIonailton.getConteudosConcluidos());
    System.out.println("XP: "+ devIonailton.calcularTotalXp());

    System.out.println("------------");
    

    Dev devBeth = new Dev();

    devBeth.setNome("Elizabeth");
    devBeth.inscreverBootcamp(bootcamp);
    System.out.println("Conteudos inscritos Elizabeth" + devBeth.getConteudosInscritos());
    devBeth.progredir();
    devBeth.progredir();
    devBeth.progredir();
    System.out.println("------------");
    System.out.println("Conteudos inscritos Elizabeth" + devBeth.getConteudosInscritos());
    System.out.println("Conteudos Concluidos Elizabeth" + devBeth.getConteudosConcluidos());
    System.out.println("XP: "+ devBeth.calcularTotalXp());

    System.out.println("------------");



}
}
