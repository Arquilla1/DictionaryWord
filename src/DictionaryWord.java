/*Pseudocode
Prompt user for input on number of words to be sorted
Save words user input
print  words in original order
print words in ascending order
print words in descending order
 */



import java.util.Arrays;
import java.util.Scanner;


    public class DictionaryWord
    {
        public static <BubbleSort> void main(String[] args)
        {

                {
                    int count;
                    Scanner scan = new Scanner(System.in);

                    //User will be asked to enter the count of words
                    System.out.print("Enter number of words : ");
                    count = scan.nextInt();


                    String str[] = new String[count];
                    Scanner scan2 = new Scanner(System.in);

                    //User is prompted to enter words
                    System.out.println("Enter the words one by one and press enter:");
                    for(int i = 0; i < count; i++)
                    {
                        str[i] = scan2.nextLine();
                    }
                    scan.close();
                    scan2.close();

                    //Sorting the words in ascending order
                    for (int i = 0; i < count; i++)
                    {
                        for (int j = i + 1; j < count; j++)
                        {
                            if (str[i].compareTo(str[j]) > 1)
                              {
                                String temp = str[i];
                                str[i] = str[j];
                                str[j] = temp;



                                System.out.print("Words in ascending order " + Arrays.toString(str));



                                if (str[j].compareTo(str[i]) > 0)
                                    str[j] = str[i];
                                     str[i] = temp;

                                      
                                                           }
                        }
                    }

                    //Displaying the words after sorting


                    System.out.println("\n" +  "Words in descending order " + Arrays.toString(str));

                     System.out.print ("Original words" );
                }}}
