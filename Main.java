import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter each line: ");

        try{
            String line = input.nextLine();
            RemoveNumbers obj = new RemoveNumbers(line);
            System.out.print("String without numbers: "+obj.removeNumbers());
        }
        catch(MyNullException e){
            System.out.println(e.toString());
        }
    }
}