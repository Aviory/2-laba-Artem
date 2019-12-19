import java.util.Scanner;

public class MyConsole {

    public String inputString(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.println(msg);
        return in.next();
    }

    public int inputSInt(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.println(msg);
        return in.nextInt();
    }

    public void output(String msg) {
        System.out.println(msg);
    }
}
