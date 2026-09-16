class Principal {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "Maria";
        aluno.idade = 20;
        aluno.curso = "Banco de Dados";

        Professor professor = new Professor();
        professor.id = 1;
        professor.nome = "João";
        professor.disciplina = "Banco de Dados";

        System.out.println("Aluno: " + aluno.nome + " | Idade: " + aluno.idade + " | Curso: " + aluno.curso);
        System.out.println("Professor: " + professor.nome + " | Disciplina: " + professor.disciplina);
    }
}

class Aluno {
    String nome;
    int idade;
    String curso;
}

class Professor {
    int id;
    String nome;
    String disciplina;
}