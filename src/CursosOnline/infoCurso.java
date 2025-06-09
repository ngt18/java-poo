package CursosOnline;

import java.util.ArrayList;

public class infoCurso {
    public static void main(String[] args) {
        ArrayList<ConteudoCurso> listaCurso = new ArrayList<>();
        listaCurso.add(new VideoAula("Java Básico", 21, "www.aprendajavascript.com.br"));
        listaCurso.add(new ArtigoTexto("Python", 15, 20));
        listaCurso.add(new Quiz("Quiz de Lógica", 10, 5));

        for (ConteudoCurso curso : listaCurso) {
            System.out.println("Título: " + curso.getTitulo());
            System.out.println("Duração: " + curso.getDuracao() + " minutos");
            System.out.println("Tipo de Conteúdo: " + curso.getTipoConteudo());
            System.out.println("---------------------------------");
        }
    }
}
