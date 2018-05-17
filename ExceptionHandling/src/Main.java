import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            int result = divide();
            System.out.println(result);
        }
        catch (ArithmeticException  | NoSuchElementException e){
            System.out.println(e.toString());
            System.out.println(" Cannot divide a number by 0 or both numbers should be not null");
        }




    }
    private static int divide(){
        int x,y;
        x=getInt();
        y=getInt();
        System.out.println("x is "+x+" y is "+ y);

        return x/y;

    }
    private static int getInt() {
        Scanner s = new Scanner(System.in);
        while (true) {
            try {
                return s.nextInt();
            } catch (InputMismatchException e) {
                s.nextLine();
                System.out.println("Enter only digits between 0-9");

            }

        }
    }
}
