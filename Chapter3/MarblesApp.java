/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter3;

/**
 *
 * @author modip
 */
import java.util.Scanner;

public class MarblesApp {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // declarations →9
        int numberOfMarbles;
        int numberOfChildren;
        int marblesPerChild;
        int marblesLeftOver;
        // get the input data →15
        System.out.println("Welcome to the marble divvy-upper.");
        System.out.print("Number of marbles: ");
        numberOfMarbles = sc.nextInt();
        System.out.print("Number of children: ");
        numberOfChildren = sc.nextInt();
        // calculate the results
        marblesPerChild = numberOfMarbles / numberOfChildren;
        marblesLeftOver = numberOfMarbles % numberOfChildren;
        // print the results →26
        System.out.println("Give each child "
                + marblesPerChild + " marbles.");
        System.out.println("You will have "
                + marblesLeftOver + " marbles left over.");
    }
}
