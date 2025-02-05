import java.util.Scanner;

class ApplicantQuestionnaire {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fullName = getFullName(input);

        if (checkFullName(fullName)) {
            greetingApplicant(fullName);

            if (checkAnswer(getSchoolEducationSertificate(input))) {
                int score = getRepublicanTestScore(input);

                if (checkAnswer(score)) {
                    int level = getEnglishProficiencyLevel(input);

                    if (checkAnswer(level)) { //
                        if (level != 2) {
                            youAreRecommended(fullName);
                            int specialty = getSpecialty(input, fullName);

                            if (checkAnswer(specialty)) {
                                int discount = receiveDiscount(score);
                                admissionLetter(fullName, specialtyName(specialty), specialtyPrice(specialty), discount);
                            }
                        }

                        else {
                            preparatoryYearLetter(fullName);
                        }
                    }
                }
            }
        }

        input.close();
    }
    
    static void clear() {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    }
    
    static void wrongInputFormat() {
        System.out.println("Sorry, looks like you typed in information in a wrong format!");
    }

    static void youAreNotRecommended() {
        System.out.println("We are really sorry to tell you that\nyou're not recommended for admission to\nthe Ala-Too International University.");
    }
    
    static void youAreRecommended(String fullName) {
        System.out.printf("%s, you're recommended for admission\nto the Ala-Too International University.\n", fullName);
    }

    static void greetingApplicant(String fullName) {
        clear();
        System.out.printf("Hello, %s! Now let's check if you meet the requirements.\n", fullName);
    }

    static String getFullName(Scanner input) {
        clear();
        System.out.print("Hello! This is applicant's questionnaire\nfor the Ala-Too International University.\nTo start, please write your full name: ");
        return input.nextLine();
    }

    static Boolean checkFullName(String fullName) {
        if (fullName.matches(".*\\d.*")) {
            wrongInputFormat();
            return false;
        }
        return true;
    }

    static int getSchoolEducationSertificate(Scanner input) {
        System.out.println("Do you have a school education certificate?\n1 Yes\n0 No");
        switch (input.nextInt()) {
            case 1:
                return 1;
            case 0:
                return 0;
            default:
                return -1;
        }
    }

    static int getRepublicanTestScore(Scanner input) {
        System.out.println("What score did you get on ORT?");
        int score = input.nextInt();

        if (110 <= score && score <= 245) {
            return score;
        }
        if (0 < score && score < 110) {
            return 0;
        }

        return -1;
    }

    static int receiveDiscount(int score) {
        if (140 <= score && score <= 155) {
            return 5;
        }
        if (156 <= score && score <= 174) {
            return 10;
        }
        if (175 <= score && score <= 199) {
            return 25;
        }
        if (200 <= score && score <= 209) {
            return 50;
        }
        if (210 <= score && score <= 218) {
            return 75;
        }
        if (219 <= score) {
            return 100;
        }
        return 0;
    }

    static int getEnglishProficiencyLevel(Scanner input) {
        System.out.println("What's your English proficiency level?\n1 A1\n2 A2\n3 B1\n4 B2\n5 C1\n6 C2");
        int level = input.nextInt();

        if (3 <= level && level <= 6) {
            return 1;
        }
        if (0 < level && level < 3) {
            clear();
            return offerPreparatoryYear(input);
        }

        return -1;
    }

    static int offerPreparatoryYear(Scanner input) {
        System.out.println("Looks like you don't have the required English proficiency level.\nWould you like to take a preparatory year?\n1 Yes\n0 No");
        switch(input.nextInt()) {
            case 1:
                return 2;
            case 0:
                return 0;
            default:
                return -1;
        }
    }

    static int getSpecialty(Scanner input, String fullName) {
        System.out.printf("%s, now please choose your preferred\nspecialty from the following list:\n1 Computer Engineering (2500$)\n2 Artificial Intelligence (2200$)\n3 Psychology (1900$)\n4 Journalism (1700$)\n5 International Relations (2200$)\n6 Law (1800$)\n7 Management (2200$)\n8 Medicine (3300$)\n", fullName);
        int specialty = input.nextInt();

        if (!(1 <= specialty && specialty <=8)) {
            return -1;
        }

        return specialty;
    }

    static Boolean checkAnswer(int answer) {
        clear();
        
        if (answer == -1) {
            wrongInputFormat();
            return false;
        }
        if (answer == 0) {
            youAreNotRecommended();
            return false;
        }

        return true;
    }

    static String specialtyName(int specialty) {
        if (specialty == 1) {
            return "Computer Engineering";
        }
        if (specialty == 2) {
            return "Artificial Intelligence";
        }
        if (specialty == 3) {
            return "Psychology";
        }
        if (specialty == 4) {
            return "Journalism";
        }
        if (specialty == 5) {
            return "International Relations";
        }
        if (specialty == 6) {
            return "Law";
        }
        if (specialty == 7) {
            return "Management";
        }
        return "Medicine";
    }

    static int specialtyPrice(int specialty) {
        if (specialty == 2 || specialty == 5 || specialty == 7) {
            return 2200;
        }
        if (specialty == 1) {
            return 2500;
        }
        if (specialty == 3) {
            return 1900;
        }
        if (specialty == 4) {
            return 1700;
        }
        if (specialty == 6) {
            return 1800;
        }
        return 3300;
    }

    static void admissionLetter(String fullName, String specialtyName, int specialtyPrice, int discount) {
        if (discount > 0) {
            System.out.printf("Dear %s, we congratulate you!\nYou have been admitted to the %s program\nat the Ala-Too International University.\nThe cost of your tuition with a %d%% discount will be %.1f per year.", fullName, specialtyName, discount, specialtyPrice - specialtyPrice * (discount) / 100.0);
        }
        else {
            System.out.printf("Dear %s, we congratulate you!\nYou have been admitted to the %s program\nat the Ala-Too International University.\nThe cost of your tuition will be %d per year.", fullName, specialtyName, specialtyPrice);
        }
    }

    static void preparatoryYearLetter(String fullName) {
        System.out.printf("Dear %s, we congratulate you!\nYou have been admitted to the Preparatory Year\nat the Ala-Too International Univesity.", fullName);
    }
}
