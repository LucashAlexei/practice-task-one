import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NullPointerException {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter each line: ");

        RemoveNumbers obj = new RemoveNumbers(input.nextLine());
        System.out.print("String without numbers: "+obj.removeNumbers());

    }
}