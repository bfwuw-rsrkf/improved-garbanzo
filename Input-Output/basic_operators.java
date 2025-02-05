class basic_operators {
    public static void main(String[] args) {
        int x = 5;
        int y = 7;
        int i = 57;
        int sum = x + y + i;
        System.out.println(sum);

        int n0 = 9;
        double n1 = 2;
        double ans = n0 / n1; // to get a decimal at least one operand must be double d/t
        System.out.println(ans);

        int num0 = 2;
        int num1 = 3;
        double exp = Math.pow(num0, num1); // exponent must be a double and there is no operator for that
        System.out.println(exp);

        int numb0 = 7;
        int numb1 = 2;
        double result = numb0 / (double)numb1; // typecasting
        System.out.println(result);
    }
}
