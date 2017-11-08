// PANTHERID:  [6067726]
// CLASS: COP 2210 – [Fall 2017]
// ASSIGNMENT # 3
// DATE: 11/04/2017
//
// I hereby swear and affirm that this work is solely my own, and not the work 
// or the derivative of the work of someone else.
//********************************************************************************

package haunted;

import static haunted.Control.firstStop;
import static haunted.Control.secondStop;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author rmitt008
 */
public class HauntedHouse {
    public static void start()
    {
        firstStop = JOptionPane.showInputDialog("You can now either explore the Living Room, Dining Room or go to the 2nd floor thorugh the stairs. Enter your choice:","Living Room/ Dining Room/ Stairs");
          if(firstStop.equalsIgnoreCase("Living Room"))
          {
              HauntedHouse.living();
          }else if(firstStop.equalsIgnoreCase("Dining Room"))
                 {
                    HauntedHouse.dining(); 
                 }else if(firstStop.equalsIgnoreCase("Stairs"))
                        {
                            HauntedHouse.stairs();
                        }
    }
    public static void living()
    {
        ImageIcon living = new ImageIcon("living.jpg");
              JOptionPane.showMessageDialog(null,Control.name+", You are in the Living Room","Map",JOptionPane.INFORMATION_MESSAGE, living);
              secondStop = JOptionPane.showInputDialog("You can either explore the Chest or explore the Bathroom","Chest/Bathroom");
              if(secondStop.equalsIgnoreCase("Chest"))        
              {
                   JOptionPane.showMessageDialog(null,"Ghost escapes and scares you to death","The End",JOptionPane.INFORMATION_MESSAGE, living);
              }else if(secondStop.equalsIgnoreCase("Bathroom"))
                     {
                         bathroom1();
                     }else
                        JOptionPane.showMessageDialog(null,"You didn't enter a valid choice","The End",JOptionPane.INFORMATION_MESSAGE, living);
    }
    public static void bathroom1()
    {
        ImageIcon bathroom = new ImageIcon("bathroom.jpg");
                         JOptionPane.showMessageDialog(null,Control.name+", You are in the Bathroom","Map",JOptionPane.INFORMATION_MESSAGE, bathroom);
                         String bathroomStop = JOptionPane.showInputDialog("You can now either look into the Mirror or explore the Shower. Enter your choice:","Mirror/Shower");
                         if(bathroomStop.equalsIgnoreCase("Mirror"))
                         {
                             JOptionPane.showMessageDialog(null,"You see a bloody face looking back at you","The End",JOptionPane.INFORMATION_MESSAGE, bathroom);
                         }else if(bathroomStop.equalsIgnoreCase("Shower"))
                                 {
                                     JOptionPane.showMessageDialog(null,"Room suddenly steams up and you feel fingers touching the back of your neck","The End",JOptionPane.INFORMATION_MESSAGE, bathroom);
                                 }else
                                    JOptionPane.showMessageDialog(null,"You didn't enter a valid choice","The End",JOptionPane.INFORMATION_MESSAGE, bathroom);
    
                         
    }
    public static void dining()
    {
        ImageIcon dining = new ImageIcon("dining.jpg");
              JOptionPane.showMessageDialog(null,Control.name+", You are in the Dining Room","Map",JOptionPane.INFORMATION_MESSAGE, dining);
              secondStop = JOptionPane.showInputDialog("You can either explore the Candelabra or explore the Kitchen","Candelabra/Kitchen");
              if(secondStop.equalsIgnoreCase("Candelabra"))        
              {
                   JOptionPane.showMessageDialog(null,"Camdelabra lights up by itself and you see a death shadow","The End",JOptionPane.INFORMATION_MESSAGE, dining);
              }else if(secondStop.equalsIgnoreCase("Kitchen"))
                     {
                         kitchen();
                     }else
                        JOptionPane.showMessageDialog(null,"You didn't enter a valid choice","The End",JOptionPane.INFORMATION_MESSAGE, dining);
    }
    public static void kitchen()
    {
        
                         ImageIcon kitchen = new ImageIcon("kitchen.jpg");
                         JOptionPane.showMessageDialog(null,Control.name+", You are in the Kitchen","Map",JOptionPane.INFORMATION_MESSAGE, kitchen);
                         String kitchenStop = JOptionPane.showInputDialog("You can now either expore the Refrigeratot or the Cabinet or the Pantry. Enter your choice:","Regrigerator/Cabinet/Pantry");
                         if(kitchenStop.equalsIgnoreCase("Refrigerator"))
                         {
                             JOptionPane.showMessageDialog(null,"You open it and find some delicious soul food","The End",JOptionPane.INFORMATION_MESSAGE, kitchen);
                         }else if(kitchenStop.equalsIgnoreCase("Cabinet"))
                                 {
                                     JOptionPane.showMessageDialog(null,"The dishes and glasses start flying at you as soon as you open the door. \nYou get hit in the head and feel yourself start moving towards a light","The End",JOptionPane.INFORMATION_MESSAGE, kitchen);
                                 }else if(kitchenStop.equalsIgnoreCase("Pantry"))
                                        {
                                           
                                            
                                        }else 
                                            JOptionPane.showMessageDialog(null,"You didn't enter a valid choice","The End",JOptionPane.INFORMATION_MESSAGE, kitchen);
    }
    public static void pantry()
    {
         ImageIcon pantry = new ImageIcon("pantry.jpg");
                                            JOptionPane.showMessageDialog(null,Control.name+", You are in the Pantry","Map",JOptionPane.INFORMATION_MESSAGE, pantry);
                                            String pantryStop = JOptionPane.showInputDialog("You can either explore the Dusty Recipe Box or the Broom","Dusty Recipe Box/Broom");
                                            if(pantryStop.equalsIgnoreCase("Dusty Recipe Box"))
                                            {
                                                JOptionPane.showMessageDialog(null,"You open it up and a recipe for chocolate devils food cake appears our of no where","The End",JOptionPane.INFORMATION_MESSAGE, pantry);
                                            }else if(pantryStop.equalsIgnoreCase("Broom"))
                                                    {
                                                        JOptionPane.showMessageDialog(null,"Broom flies up in the air as soon as you touch it","The End",JOptionPane.INFORMATION_MESSAGE, pantry);
                                                     }else
                                                        JOptionPane.showMessageDialog(null,"You didn't enter a valid choice","The End",JOptionPane.INFORMATION_MESSAGE, pantry);
    }
    public static void stairs()
    {
        ImageIcon scndfloor = new ImageIcon("scndfloor.jpg");
        JOptionPane.showMessageDialog(null,Control.name+", You are on the 2nd Floor","Map",JOptionPane.INFORMATION_MESSAGE, scndfloor);
              secondStop = JOptionPane.showInputDialog("You can either explore the Master Bedroom or Bedroom 1 or Bedroom 2","Master Bedroom/Bedroom 1/Bedroom 2");
              if(secondStop.equalsIgnoreCase("Master Bedroom"))        
              {
                   masterBedroom();
              }else if(secondStop.equalsIgnoreCase("Bedroom 1"))
                     {
                         bedroom1();
                     }else if(secondStop.equalsIgnoreCase("Bedroom 2"))
                     {
                         bedroom2();
                     }
               
    }
    public static void masterBedroom()
    {
        ImageIcon masterBed = new ImageIcon("masterbed.jpg");
                         JOptionPane.showMessageDialog(null,Control.name+", You are in the Master Bedroom","Map",JOptionPane.INFORMATION_MESSAGE, masterBed);
                         String masterBedStop = JOptionPane.showInputDialog("You can now either look into the Jewelry Box or explore the Master Bathroom. Enter your choice:","Jewelry Box/Master Bathroom");
                         if(masterBedStop.equalsIgnoreCase("Jewelry Box"))
                         {
                             JOptionPane.showMessageDialog(null,"You find the cursed Hope Diamond and feel your doom","The End",JOptionPane.INFORMATION_MESSAGE, masterBed);
                         }else if(masterBedStop.equalsIgnoreCase("Master Bathroom"))
                                 {
                                    masterBath();
                                 }else
                                    JOptionPane.showMessageDialog(null,"You didn't enter a valid choice","The End",JOptionPane.INFORMATION_MESSAGE, masterBed);
    }
    public static void masterBath()
    {
        ImageIcon masterBath = new ImageIcon("masterbath.jpg");
                         JOptionPane.showMessageDialog(null,Control.name+", You are in the Master bathroom","Map",JOptionPane.INFORMATION_MESSAGE, masterBath);
                         String bathroomStop = JOptionPane.showInputDialog("You can now either look into the Intricate Oil Lamp or explore the Shower. Enter your choice:","Intricate Oil Lamp/Shower");
                         if(bathroomStop.equalsIgnoreCase("Intricate Oil Lamp"))
                         {
                             JOptionPane.showMessageDialog(null,"Rub the lamp and a genie pops out who says he’ll grant you 3 wishes","The End",JOptionPane.INFORMATION_MESSAGE, masterBath);
                         }else if(bathroomStop.equalsIgnoreCase("Shower"))
                                 {
                                     JOptionPane.showMessageDialog(null,"Suddenly hear singing in the shower, but no one is there","The End",JOptionPane.INFORMATION_MESSAGE, masterBath);
                                 }else
                                    JOptionPane.showMessageDialog(null,"You didn't enter a valid choice","The End",JOptionPane.INFORMATION_MESSAGE, masterBath);
    }
     public static void bedroom1()
    {
        ImageIcon bedroom1 = new ImageIcon("bedroom1.jpg");
                         JOptionPane.showMessageDialog(null,Control.name+", You are in Bedroom 1","Map",JOptionPane.INFORMATION_MESSAGE, bedroom1);
                         String bedRoomStop = JOptionPane.showInputDialog("You can now either explore the Roxking Chair or look ourside the window or explore the Bathroom. Enter your choice:","Rocking Chair/Window/Bathroom");
                         if(bedRoomStop.equalsIgnoreCase("Rocking Chair"))
                         {
                             JOptionPane.showMessageDialog(null,"Chair starts rocking by itself with no one in it","The End",JOptionPane.INFORMATION_MESSAGE, bedroom1);
                         }else if(bedRoomStop.equalsIgnoreCase("Window"))
                                 {
                                     JOptionPane.showMessageDialog(null,"See a child outside on a swing who suddenly disappears","The End",JOptionPane.INFORMATION_MESSAGE, bedroom1);
                                 }else if(bedRoomStop.equalsIgnoreCase("Bathroom"))
                                        {
                                            bathroom2("Bedroom 2");
                                        }else
                                            JOptionPane.showMessageDialog(null,"You didn't enter a valid choice","The End",JOptionPane.INFORMATION_MESSAGE, bedroom1);
    }
     public static void bedroom2()
    {
        ImageIcon bedroom2 = new ImageIcon("bedroom2.jpg");
                         JOptionPane.showMessageDialog(null,Control.name+", You are in Bedroom 2","Map",JOptionPane.INFORMATION_MESSAGE, bedroom2);
                         String bedRoomStop = JOptionPane.showInputDialog("You can now either explore the Doll House or the Dresser or explore the Bathroom. Enter your choice:","Doll House/Dresser/Bathroom");
                         if(bedRoomStop.equalsIgnoreCase("Doll House"))
                         {
                             JOptionPane.showMessageDialog(null,"The dolls start dancing on their own","The End",JOptionPane.INFORMATION_MESSAGE, bedroom2);
                         }else if(bedRoomStop.equalsIgnoreCase("Dresser"))
                                 {
                                     JOptionPane.showMessageDialog(null,"A ghost flies out of the dresser as soon as you open it and goes right though your body","The End",JOptionPane.INFORMATION_MESSAGE, bedroom2);
                                 }else if(bedRoomStop.equalsIgnoreCase("Bathroom"))
                                        {
                                            bathroom2("Bedroom 1");
                                        }
                                    JOptionPane.showMessageDialog(null,"You didn't enter a valid choice","The End",JOptionPane.INFORMATION_MESSAGE, bedroom2);
    }
     
     public static void bathroom2(String bedroom)
     {
          ImageIcon bathroom = new ImageIcon("bathroom2.jpg");
                         JOptionPane.showMessageDialog(null,Control.name+", You are in the bathroom","Map",JOptionPane.INFORMATION_MESSAGE, bathroom);
                         String bathroomStop = JOptionPane.showInputDialog("You can now either look into the Mirror or explore the Shower or go to "+bedroom+". Enter your choice:","Mirror/Shower/"+bedroom);
                         if(bathroomStop.equalsIgnoreCase("Mirror"))
                         {
                             JOptionPane.showMessageDialog(null,"You see a bloody face looking back at you","The End",JOptionPane.INFORMATION_MESSAGE, bathroom);
                         }else if(bathroomStop.equalsIgnoreCase("Shower"))
                                 {
                                     JOptionPane.showMessageDialog(null,"Room suddenly steams up and you feel fingers touching the back of your neck","The End",JOptionPane.INFORMATION_MESSAGE, bathroom);
                                 }else if(bedroom.equals("Bedroom 1")&&bathroomStop.equals(bedroom))
                                         {
                                             bedroom1();
                                         }else if(bedroom.equals("Bedroom 2")&&bathroomStop.equals(bedroom))
                                                {
                                                    bedroom2();
                                                }else
                                                    JOptionPane.showMessageDialog(null,"You didn't enter a valid choice","The End",JOptionPane.INFORMATION_MESSAGE, bathroom);
     }
    
    
}
    
