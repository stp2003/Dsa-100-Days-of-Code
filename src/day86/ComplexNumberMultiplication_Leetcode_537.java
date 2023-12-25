package day86;

public class ComplexNumberMultiplication_Leetcode_537 {

    //??
    public static String complexNumberMultiply(String num1, String num2) {

        StringBuilder stringBuilder = new StringBuilder();

        //** for number a+ib
        int a = Integer.parseInt(num1.substring(0, num1.indexOf('+')));
        int b = Integer.parseInt(num1.substring(num1.indexOf('+') + 1, num1.indexOf('i')));

        //** for number c+id
        int c = Integer.parseInt(num2.substring(0, num2.indexOf('+')));
        int d = Integer.parseInt(num2.substring(num2.indexOf('+') + 1, num2.indexOf('i')));

        stringBuilder.append((a * c) - (b * d));
        stringBuilder.append('+');
        stringBuilder.append((b * c) + (a * d));
        stringBuilder.append('i');

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(complexNumberMultiply("1+1i", "1+1i"));
    }
}
