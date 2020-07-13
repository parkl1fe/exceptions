package code.academy;

import java.util.Scanner;

public class Input {


    public int returnInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER AN INTEGER");
        try {
            return Integer.parseInt(scanner.next());
        } catch (NumberFormatException e) {
            System.out.println("Entered number is not integer type");
            System.out.println("Please enter valid integer");
            return returnInput();
        }
    }

}
