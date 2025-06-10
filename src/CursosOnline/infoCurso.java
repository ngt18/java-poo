package CursosOnline;
import java.util.ArrayList;
public class infoCurso {
    public static void main(String[] args) {
        ArrayList<ConteudoCurso> listaCurso = new ArrayList<>();
        listaCurso.add(new VideoAula("Java Básico", 21, "www.aprendajavascript.com.br"));
        listaCurso.add(new ArtigoTexto("Python", -5, 20));
        listaCurso.add(new Quiz("Quiz de Lógica ", 10, 5));

        for (ConteudoCurso curso : listaCurso) {
            if (curso.getDuracaoMinutos()< 0) {
                curso.setDuracaoMinutos(0);
            }
            if (curso.getDuracaoMinutos() ==0){
                System.out.println("Duração inválida, não é possível visualizar o conteúdo.");
                System.out.println("--------------------------------");
            }else {
                System.out.println(curso.obterTipo());
                System.out.println(curso.exibirDetalhes());
                System.out.println(curso.visualizar());

                System.out.println("--------------------------------");
            }
        }
    }
}
