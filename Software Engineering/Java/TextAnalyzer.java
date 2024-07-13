import java.util.Scanner;

public class TextAnalyzer {
    
   //write your logic here
   private String text;
   TextAnalyzer (String text) {
       this.text = text;
    }

    public int countOccurrences(String word) {
        int count = 0;
    //write your code here
        int index = 0;
        while( (index=text.toLowerCase().indexOf(word.toLowerCase(), index)) != -1){
            count++;
            index += word.length();
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter the text: ");
        String text = scanner.nextLine();

        // System.out.print("Enter the word to count: ");
        String word = scanner.next();

        TextAnalyzer analyzer = new TextAnalyzer(text);
        int result = analyzer.countOccurrences(word);
        System.out.println(result);

        scanner.close();
    }

}