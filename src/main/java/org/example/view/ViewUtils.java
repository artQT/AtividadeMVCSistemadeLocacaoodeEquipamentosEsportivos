package org.example.view;

import java.io.IOException;
import java.util.Scanner;

public class ViewUtils {

    public static String lerLinha(Scanner scanner){
        return scanner.nextLine();
    }

    public static int lerInt(Scanner scanner){
        int out = scanner.nextInt();
        scanner.nextLine();
        return out;
    }

}
