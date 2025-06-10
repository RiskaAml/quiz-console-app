import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5];
    String[] selection = new String[5];
    
    //bikin soal dan opsi
    public QuestionService() {
        questions[0] = new Question(1, "Mongmong's number: ", "opt1: 2", "opt2: 6", "opt3: 4", "opt4: 8", "4");
        questions[1] = new Question(2, "Ruby's number: ", "opt1: 2", "opt2: 6", "opt3: 4", "opt4: 8", "8");
        questions[2] = new Question(3, "Maruko's number: ", "opt1: 2", "opt2: 6", "opt3: 4", "opt4: 8", "2");
        questions[3] = new Question(4, "Tamae's number: ", "opt1: 2", "opt2: 6", "opt3: 4", "opt4: 8", "6");
        questions[4] = new Question(5, "Nobita's number: ", "opt1: 1", "opt2: 2", "opt3: 4", "opt4: 8", "1");

    }
    
    //mengisi jawaban dan menampilkan semua jawaban diakhir
    public void playQuiz() {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        for (Question q : questions) {
            System.out.println("Question no. : " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            System.out.print("Your answer (only the number, e.g., 2): ");
            selection[i] = sc.nextLine();
            i++;

        }

        for (String s : selection) {
            System.out.println(s);
        }
        sc.close();

    }

    public void printScore() {
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            Question que = questions[i];
            String answer = que.getAnswer().split(":").length > 1 ? que.getAnswer().split(":")[1].trim() : que.getAnswer().trim();
            String userAnswer = selection[i].trim();
            if (answer.equals(userAnswer)) {
                score++;
            }
        }
        System.out.println("Your score is : " + score);
    }
}
