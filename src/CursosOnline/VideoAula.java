package CursosOnline;

public class VideoAula extends ConteudoCurso {
    private String urlVideo;

    public VideoAula(String titulo, int duracaoMinutos, String urlVideo) {
        super(titulo, duracaoMinutos);
        this.urlVideo = urlVideo;
    }

    public String getUrlVideo() {
        return urlVideo;
    }

    public void setUrlVideo(String urlVideo) {
        this.urlVideo = urlVideo;
    }

    @Override
    public String visualizar() {
        return "Reproduzindo video: " + getUrlVideo();
    }

    @Override
    public String obterTipo() {
        return "Video";
    }

    @Override
    public String exibirDetalhes() {
        return "A URL do video é: " + getUrlVideo();
    }
}
