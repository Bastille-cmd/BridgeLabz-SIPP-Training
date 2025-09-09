import java.io.PrintStream;
import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence=sc.nextLine();
        String[] words=sentence.split(" ");
        StringBuilder newSentence=new StringBuilder();
        for(String word:words){
            StringBuilder sb = new StringBuilder(word).reverse();
            newSentence.append(sb.toString()).append(" ");
        }
        System.out.println(newSentence.toString().strip());
    }
}
