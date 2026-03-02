import java.util.*;

public class Inicio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String opcao;

        do {
            System.out.println("\n-=== MENU ===-");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Buscar por matrícula");
            System.out.println("3 - Listar todos");
            System.out.println("4 - Remover por matrícula");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextLine();

            switch (opcao) {

                case "1":
                    System.out.print("Matrícula: ");
                    String matricula = sc.nextLine();

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Idade: ");
                    int idade = Integer.parseInt(sc.nextLine());

                    System.out.println(
                        CadastroDeAlunos.cadastrarAluno(matricula, nome, idade)
                    );
                    break;

                case "2":
                    System.out.print("Digite a matrícula: ");
                    CadastroDeAlunos.buscarMatricula(sc.nextLine());
                    break;

                case "3":
                    CadastroDeAlunos.listarAlunos();
                    break;

                case "4":
                    System.out.print("Digite a matrícula para remover: ");
                    CadastroDeAlunos.removerAluno(sc.nextLine());
                    break;

                case "5":
                    System.out.println("Programa encerrado!");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (!opcao.equals("5"));

        sc.close();
    }
}

/* ===== CLASSE DO SISTEMA DE ALUNOS ===== */
class CadastroDeAlunos {

    static ArrayList<Map<String, Object>> alunos = new ArrayList<>();
    static Map<String, Integer> matriculadoAluno = new HashMap<>();

    // CADASTRAR
    public static String cadastrarAluno(String matricula, String nome, int idade) {

        if (matricula == null || matricula.trim().isEmpty()) {
            return "Matrícula inválida";
        }

        if (matriculadoAluno.containsKey(matricula)) {
            return "Matrícula já cadastrada";
        }

        if (idade < 0) {
            return "Idade inválida";
        }

        Map<String, Object> aluno = new HashMap<>();
        aluno.put("nome", nome);
        aluno.put("idade", idade);
        aluno.put("matricula", matricula);

        alunos.add(aluno);
        matriculadoAluno.put(matricula, alunos.size() - 1);

        return "Cadastro realizado com sucesso!";
    }

    // BUSCAR
    public static void buscarMatricula(String matricula) {

        if (matriculadoAluno.containsKey(matricula)) {

            int indice = matriculadoAluno.get(matricula);
            Map<String, Object> aluno = alunos.get(indice);

            System.out.println("Aluno encontrado:");
            System.out.println("Nome: " + aluno.get("nome"));
            System.out.println("Idade: " + aluno.get("idade"));
            System.out.println("Matrícula: " + aluno.get("matricula"));

        } else {
            System.out.println("Aluno não encontrado");
        }
    }

    // LISTAR
    public static void listarAlunos() {

        System.out.println("==== LISTA DE ALUNOS ====");

        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }

        for (Map<String, Object> aluno : alunos) {
            System.out.println("-------------------");
            System.out.println("Matrícula: " + aluno.get("matricula"));
            System.out.println("Nome: " + aluno.get("nome"));
            System.out.println("Idade: " + aluno.get("idade"));
        }
    }

    // REMOVER
    public static void removerAluno(String matricula) {

        if (!matriculadoAluno.containsKey(matricula)) {
            System.out.println("Matrícula não encontrada");
            return;
        }

        int indice = matriculadoAluno.get(matricula);

        alunos.remove(indice);
        matriculadoAluno.remove(matricula);

        // reajustar índices
        for (Map.Entry<String, Integer> entry : matriculadoAluno.entrySet()) {
            if (entry.getValue() > indice) {
                entry.setValue(entry.getValue() - 1);
            }
        }

        System.out.println("Aluno removido com sucesso!");
    }
}
