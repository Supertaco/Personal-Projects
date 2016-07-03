// This program reverses the letters of an input string

package reversestring;
import java.util.*;

public class ReverseString 
{

    public static void main(String[] args) 
    {
        Scanner sentence = new Scanner(System.in);
        
        System.out.println("Enter a string: ");
        String in = sentence.nextLine();
        
        reverseString(in);
    }
    
    public static void reverseString(String inputs)
    {
        int x = inputs.length();
        char[] empty = new char[x];
        char[] inputChar = inputs.toCharArray();
        
        for (int i = 0; i < inputs.length(); i++)
        {
            empty[i] = inputChar[x-i-1];
        }
        
        String outputs = new String(empty);
        System.out.println(outputs);
    }
}
