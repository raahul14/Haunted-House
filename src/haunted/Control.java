/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package haunted;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author rmitt008
 */
public class Control {
    public static String name;
    public static  String firstStop;
    public static String secondStop;
    
    
    
    
    public static void main(String[] args) {
          name =  JOptionPane.showInputDialog(null,"What's your name?","The Haunted House",JOptionPane.INFORMATION_MESSAGE);
          ImageIcon front = new ImageIcon("front.jpg") {};
          JOptionPane.showMessageDialog(null, "Welcome to the Haunted House, "+name +"!\nYou have entered through the front door","Map",JOptionPane.INFORMATION_MESSAGE,front);
          HauntedHouse.start();
          
    }
}
