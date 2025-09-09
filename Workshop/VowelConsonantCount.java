import java.util.Scanner;

public class VowelConsonantCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next().strip();
        int vowel=0,consonant=0;
        for(char c:input.toCharArray()){
            if(c=='A' || c=='a' || c=='E' || c=='e' || c=='I' || c=='i' || c=='O' || c=='o' || c=='U' || c=='u'){
                ++vowel;
            }
            else{
                consonant++;
            }
        }
        System.out.println("Vowels : "+vowel);
        System.out.println("Consonants : "+consonant);
    }
}
