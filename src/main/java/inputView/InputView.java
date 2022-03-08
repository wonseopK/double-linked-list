package inputView;

import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);

    public int inputNumber(){
        return Integer.parseInt(scanner.nextLine());
    }
}
