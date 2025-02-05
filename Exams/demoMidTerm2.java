import java.util.Scanner;

class demoMidTerm2 {
    public static void main(String[] args) {
        clear();

        firstQuestion();
        secondQuestion();
        thirdQuestion();
        fourthQuestion();
    }

    static void clear() {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    }

    static void firstQuestion() {
        System.out.println("Question 1:\n" +
            "I have 23 apples. " +
            "And I want to share these apples between my 4 friends.\n" +
            "How many apples will each of my friends get?\n" +
            "How many apples will remain undistributed?"
        );

        int apples = 23;
        int friends = 4;
        int eachWillGet = apples / friends;
        int leftUndistributed = apples % friends;

        System.out.printf("\nSolution:\n" +
            "There are 23 apples and 4 friends, " +
            "so each will get: " +
            "%d / %d = %d\n",
            apples, friends, eachWillGet
        );

        System.out.printf("And there will be: " +
            "%d %% %d = %d undistributed apples.\n",
            apples, friends, leftUndistributed
        );

        System.out.printf("\nAnswer:\n" +
            "Each friend will get %d apples " +
            "and there will be %d undistributed apples.\n\n",
            eachWillGet, leftUndistributed
        );
    }

    static void secondQuestion() {
        System.out.println("Question 2:\n" +
            "bool a = true;\n" +
            "bool b = false;\n" +
            "a && b = ?"
        );

        Boolean a = true;
        Boolean b = false;
        Boolean answer = a && b;

        System.out.printf("\nSolution:\n" +
            "Since a is %b, but b is %b\n" +
            "the logical operator of multiplication\n" +
            "will give us %b.\n",
            a, b, answer
        );

        System.out.printf("\nAnswer:\n" +
            "a && b = %b\n\n",
            answer
        );
    }

    static int thirdQuestion() {
        System.out.println("Question 3:\n" +
            "Which of the two numbers a and b is greater?"
        );
        Scanner input = new Scanner(System.in);

        System.out.print("\nInput the first number: ");
        int a = input.nextInt();

        System.out.print("\nInput the second number: ");
        int b = input.nextInt();

        System.out.println("\nSolution:");
        input.close();

        int answer = 0;
        int otherOne = 0;

        if (a > b) {
            answer = a;
            otherOne = b;
        }
        else if (a < b) {
            answer = b;
            otherOne = a;
        }
        else {
            System.out.printf("Since %d and %d are equal, " +
                "there is no answer.",
                a, b
            );
            return -1;
        }

        System.out.printf("Since %d is greater than %d, " +
            "the answer is %d.\n\n",
            answer, otherOne, answer
        );
        return 0;
    }

    static void fourthQuestion() {
        System.out.println("Question 4:\n" +
            "Display only positive numbers between -3 and 16."
        );

        System.out.print("\nSolution:\n" + 
            "We will use for loop.\n"
        );

        System.out.print("\nAnswer:\n");

        for (int i = -3; i < 17; i++) {
            if (i > 0) {
                System.out.print(i + " ");
            }
        }
    }
}
