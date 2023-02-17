import java.util.Scanner;

public class Scanners {

    public static void main(String[] args) {

        // 1. Create a Scanner object. Name your scanner object scanner.
        Scanner scanner = new Scanner(System.in);
        // 2. Print a message to the console “Please enter your first name:”
        System.out.println("Please enter your first name:");
        // 3. Declare and initialize a variable of type String called firstName to a value that the user will input.
        String firstName = scanner.nextLine();
        // 4. Print a message to the console “Please enter your last name:”
        System.out.println("Please enter your last name:");
        // 5. Declare and initialize a variable of type String called lastName to a value that the user will input.
        String lastName = scanner.nextLine();
        // 6. Print a message to the console “Please enter your age:”
        System.out.println("Please enter your age:");
        // 7. Declare and initialize a variable of type int called age to a value that the user will input.
        int age = scanner.nextInt();
        // 8. Print a message to the console “Please enter your favourite song:”
        scanner.nextLine();
        System.out.println("Please enter your favorite song:");
        // 9. Declare and initialize a variable of type String called favSong to a value that the user will input.
        String favSong = scanner.nextLine();
        // 10. Declare and initialize a variable of type String called info to a sentence that uses the four variables that you created.
        // The format of this sentence will be as follows:
        //“Hi, my name is [firstName] [lastName]. I am [age] years old and my favourite song is [favSong].”
       String info = "Hi, my name is " + firstName + " " + lastName + ". I am " + age + " years old and my favorite song is " + favSong + ".";
        // 11. Print the contents of the variable info to the console.
       System.out.println(info);
        // 12. Close the scanner object.
       scanner.close();

    }
}
