import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Regular expressions
        String regex = "[Java][7-9]";

        /*System.out.println("j7".matches(regex));
        System.out.println("Java8".matches(regex));
        System.out.println("J9".matches(regex));
        System.out.println("v8".matches(regex));*/

        /*String regex2 = "abc?";
        String regex3 = "abc{0,1}";

        System.out.println("abc".matches(regex2));
        System.out.println("abc".matches(regex3));*/

        // квантификатор +
        /*String regexPlus = "ca+b";

        System.out.println("cab".matches(regexPlus));
        System.out.println("caaaaab".matches(regexPlus));
        System.out.println("cb".matches(regexPlus));*/

        // квантификатор *
        /*String regexMul = "ca*b";
        System.out.println("cab".matches(regexMul));
        System.out.println("caaaaab".matches(regexMul));
        System.out.println("cb".matches(regexMul));*/

        // определяем число повторений
        /*String regexRep = "[Java]{4}";

        System.out.println("Java".matches(regexRep));
        System.out.println("avaJ".matches(regexRep));
        System.out.println("aJva".matches(regexRep));

        String regexRep2 = "1{2,3}";

        System.out.println("11".matches(regexRep2));
        System.out.println("111".matches(regexRep2));
        System.out.println("1".matches(regexRep2));*/

        /*String regexRep3 = "ab{4,}";

        System.out.println("abb".matches(regexRep3));
        System.out.println("abbbb".matches(regexRep3));
        System.out.println("abbbbbbbbb".matches(regexRep3));*/

        // сокращения в регулярных выражениях
        /*
        \d - любое число [0-9]
        \s - пробелы [\t\n\x0B\f\r];
        \w - буквенно-числовые символы [a-zA-Z_0-9]
        \b - граница. \ba

         */

        // \b
        /*String regexBoundary = "\\ba";
        String regexBoundary2 = "a\b";
        String regexBoundary3 = "\ba\b";
        String check = "!alone";
        String check2 = "";


        System.out.println(check.matches(regexBoundary));
*/

        /*
        \D не цифра == [^0-9]
        \S не пробел == [^ \t\n\x0B\f\r];
        \W не буквенно-цифровой символ [^a-zA-Z_0-9]
        \B не граница слова
         */

        String regexShort = "\\s\\w\\d\\s";
        System.out.println(" a0 ".matches(regexShort));
        System.out.println(" 33 ".matches(regexShort));
        System.out.println("\t33\t".matches(regexShort));
        System.out.println("33".matches(regexShort));
        System.out.println(" -1 ".matches(regexShort));

        String regexB = "\\bcat";
        System.out.println("cat".matches(regexB));
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int counter = Integer.parseInt(input);
        if (counter % 2 == 0) {
            int answer = 42/0;
        }











    }
}