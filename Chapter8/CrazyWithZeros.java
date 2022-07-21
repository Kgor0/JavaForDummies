/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter8;

/**
 *
 * @author modip
 */
public class CrazyWithZeros
{
 public static void main(String[] args)
 {
 try
 {
 int answer = divideTheseNumbers(5, 0); 
 }
 catch (Exception e) 
 {
 System.out.println("Tried twice, "
 + "still didn't work!");
 }
 }
 public static int divideTheseNumbers(int a, int b) 
 throws Exception
 {
 int c;
 try
 {
 c = a / b; 
 System.out.println("It worked!"); 
 }
 catch (Exception e)
 {
 System.out.println("Didn't work the first time.");
 c = a / b; 
 System.out.println("It worked the second time!");
 }
 finally
 {
 System.out.println("Better clean up my mess."); 
 }
 System.out.println("It worked after all."); 
 return c; 
 }
}
