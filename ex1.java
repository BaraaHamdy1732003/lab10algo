import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ex1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter text: ");
        String input= sc.nextLine();

        String patternString= "abcd2023111111102023";

        Pattern pattern=Pattern.compile(patternString);

        Matcher matcher= pattern.matcher(input);

        if (matcher.matches()){
            String result= input.replaceAll("2023","happy new year !");
            System.out.println("Result :" +result);
        }else {
            System.out.println("The input does not match the pattern.");
        }
    }
}