
import java.util.Scanner;
public class AnagramGenerator {


    static Scanner sc = new Scanner(System.in);
    String letters;
    String wordSoFar;


    static int size = 0;
    static char[] wordArray = new char[50];



    public static void getCombination(String letters, String wordSoFar)
    {

        // BASE CASE:
        if (letters.length() == 0) //if you've run out of letters
        {
            System.out.println(wordSoFar);
            return;
        }


        for (int i = 0; i < letters.length(); i++) {

            String newWord = wordSoFar + letters.charAt(i);

            String lettersLeft = letters.substring(0, i) + letters.substring(i + 1, letters.length());


            getCombination(lettersLeft, newWord);


        }

        //wordSoFar += letters.substring(index, index+1); //adds the first letter (or index) to the current "wordSoFar"
        //getCombination(letters.substring(index+1), wordSoFar); //call same function, but now with letter starting one position after the current

    }



    public static void main (String[]args)
    {
        //System.out.println("Enter a word to anagram: ");   //prompt to
        String word = sc.nextLine();                       // get a word from the user and name it "word"
        size = word.length();                              // set size of this new word to "size"



         for (int i =0; i<size;i++)                 //takes each letter in string in an array 
         {
            wordArray[i] = word.charAt(i);
         }

        getCombination(word, "");               // call the "recursive function" with the new word, a blank new "wordSoFar".

    }


}



/*  this rotates the whole thing once letters left = 1


    public static void rotate(String letters, String wordSoFar)
    {
    int k;
    int position = size - wordSoFar.length();
    String temp = letters.substring(position);

   // for(k=position+1; k<size; k++)

     */