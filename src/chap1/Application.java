package chap1;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Name name = new Name(scanner.nextLine(),scanner.nextLine());
        
        String updateChildName = scanner.nextLine();
        String updateChildNameFinalParm = scanner.nextLine();
        
        name.updateChildName(updateChildName);
        System.out.println(name.getChildName());

        name.updateChildNameFinalParm(updateChildNameFinalParm);
        System.out.println(name.getChildName());

        scanner.close();
    }
}
