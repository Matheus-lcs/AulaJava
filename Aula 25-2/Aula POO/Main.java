public class Main {

    public static void main(String[] args) {
        double mediaAprovacao = 6.0;


        Aluno aluno1 = new Aluno("João Pedro", 1010, 7.5, 8.0);
        Aluno aluno2 = new Aluno("Polyana", 2020, 6.0, 5.5);
        Aluno aluno3 = new Aluno("Leonardo", 3030, 4.0, 3.5);


        aluno1.exibirResultado(mediaAprovacao);
        aluno2.exibirResultado(mediaAprovacao);
        aluno3.exibirResultado(mediaAprovacao);

    }
}