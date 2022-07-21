/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter2;

/**
 *
 * @author modip
 */
import java.util.Scanner;

public class ScannerApp {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        int x = sc.nextInt();
        System.out.println("You entered " + x + ".");
    }
}
