/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter2;

/**
 *
 * @author modip
 */
public class ShadowApp {

    static int x; //remains in memory while program is running

    public static void main(String[] args) {
        x = 5;
        System.out.println("x = " + x);
        int x;
        x = 10;
        System.out.println("x = " + x);
        System.out.println("ShadowApp.x = "
                + ShadowApp.x);
    }
}
