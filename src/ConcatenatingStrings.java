import java.util.Scanner;
public class ConcatenatingStrings {
    public static void main(String[] args){

        String string1,string2;
        Scanner s = new Scanner(System.in);
        System.out.println("Type first bunch of random text: ");
        string1 = s.nextLine();
        System.out.println("Type second bunch of random texts: ");
        string2= s.nextLine();

        string1=string1.concat(string2);

        System.out.println("The texts are:"+ string1);
        System.out.println(string1.compareTo(string2));
        System.out.println(string1.equalsIgnoreCase(string2));
    }
}

