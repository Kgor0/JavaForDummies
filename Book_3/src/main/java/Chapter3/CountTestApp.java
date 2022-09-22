/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter3;

/**
 *
 * @author modip
 */
public class CountTestApp
{
 public static void main(String[] args)
 {
 printCount();
 for (int i = 0; i < 10; i++)
 {
 CountTest c1 = new CountTest(); 
 printCount();
 }
 }
 private static void printCount()
 {
 System.out.println("There are now " 
 + CountTest.getInstanceCount()
 + " instances of the CountTest class.");
 }
}
class CountTest 
{
 private static int instanceCount = 0; 
 public CountTest() 
 {
 instanceCount++;
 }
 public static int getInstanceCount() 
 {
 return instanceCount;
 }
}
