/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter2;

/**
 *
 * @author modip
 */
public class Actor {

    private String lastName;
    private String firstName;
    private boolean goodActor;

    public Actor(String last, String first) {
        lastName = last;
        firstName = first;
    }

    public Actor(String last, String first, boolean good) {
        this(last, first);
        goodActor = good;
    }
}
