package application;

import java.io.File;
import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a file path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        System.out.println("File name: " + path.getName());

        System.out.println("File parent: " + path.getParent());

        System.out.println("File path: " + path.getPath());
    }
}
