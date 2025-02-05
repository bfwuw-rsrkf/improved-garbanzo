import java.util.Scanner;

class GradeStatistics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = getNumberOfGrades(input);

        if (number != -1) {
            String statistics = gatherStatistics(input, number);
            if (statistics != "ERR") {
                System.out.println(statistics);
            }
        }

        input.close();
    }

    static void clear() {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    }
    
    static void wrongInputFormat() {
        clear();
        System.out.println("Sorry, looks like you typed in information in a wrong format!");
    }

    static int getNumberOfGrades(Scanner input) {
        clear();
        System.out.print("Please, enter the the number of grades: ");
        int number = input.nextInt();
        clear();

        if (number < 1) {
            wrongInputFormat();
            return -1;
        }
        
        return number;
    }

    static String evaluateGradeItem(int numberOfGrade, int totalNumber) {
        if (numberOfGrade == 1) {
            return String.format(": %d grade (%.1f%%)\n", numberOfGrade, numberOfGrade / (double) totalNumber * 100);
        }
        return String.format(": %d grades (%.1f%%)\n", numberOfGrade, numberOfGrade / (double) totalNumber * 100);
    }

    static String gatherStatistics(Scanner input, int numberOfGrades) {
        int gradeA = 0;
        int gradeB = 0;
        int gradeC = 0;
        int gradeD = 0;
        int gradeF = 0;
        System.out.print("Please, enter the grades: ");

        for(int i = 0; i < numberOfGrades; i++) {
            int grade = input.nextInt();
            clear();

            if (grade < 0 || 100 < grade) {
                wrongInputFormat();
                return "ERR";
            }

            if (90 <= grade) {
                gradeA++;
            }
            if (75 <= grade && grade <= 89) {
                gradeB++;
            }
            if (60 <= grade && grade <= 74) {
                gradeC++;
            }
            if (50 <= grade && grade <= 59) {
                gradeD++;
            }
            if (grade <= 49) {
                gradeF++;
            }
        }

        clear();
        int totalNumber = gradeA + gradeB + gradeC + gradeD + gradeF;
        String gradeItemA = "A" + evaluateGradeItem(gradeA, totalNumber);
        String gradeItemB = "B" + evaluateGradeItem(gradeB, totalNumber);
        String gradeItemC = "C" + evaluateGradeItem(gradeC, totalNumber);
        String gradeItemD = "D" + evaluateGradeItem(gradeD, totalNumber);
        String gradeItemF = "F" + evaluateGradeItem(gradeF, totalNumber);

        return gradeItemA + gradeItemB + gradeItemC + gradeItemD +gradeItemF;
    }
}
