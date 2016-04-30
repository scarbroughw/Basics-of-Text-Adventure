/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project4;

import java.util.Scanner;

/**
 *
 * @author Bill Scarbrough
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    private LocationNode currentRoom;
    private LocationNode nextRoom;
    
    public static void main(String[] args) {

        Driver d;
        d = new Driver();
        

    }
    
    public Driver(){
        createRooms();
        Input();
    }
    
    private void createRooms(){
        LocationNode frontFoyer = new LocationNode("Front Foyer");
        LocationNode livingRoom = new LocationNode("Living Room");
        LocationNode diningRoom = new LocationNode("Dining Room");
        LocationNode bedroom = new LocationNode("Bedroom");
        LocationNode office = new LocationNode("Office");
        LocationNode bathroom = new LocationNode("Bathroom");
        LocationNode kitchen = new LocationNode("Kitchen");
        
        
        frontFoyer.setEast(livingRoom);
        frontFoyer.setNorth(bedroom);
        frontFoyer.setSouth(null);
        
        livingRoom.setWest(frontFoyer);
        livingRoom.setNorth(diningRoom);
        
        diningRoom.setSouth(livingRoom);
        diningRoom.setEast(office);
        diningRoom.setWest(bedroom);
        diningRoom.setNorth(kitchen);
        
        bedroom.setSouth(frontFoyer);
        bedroom.setEast(diningRoom);
        bedroom.setNorth(bathroom);
        
        bathroom.setSouth(bedroom);
        bathroom.setEast(kitchen);
        
        office.setWest(diningRoom);
        
        kitchen.setSouth(diningRoom);
        kitchen.setWest(bathroom);
        
        currentRoom = frontFoyer;
        
    }
    
    public void Input(){
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        System.out.println("You begin in the "+ currentRoom.getDescription());
        System.out.println("\nFor help, type in 'help' at any point.");
        System.out.println("\nYour next options are ");
        if(currentRoom.getEast()!=null)
            System.out.println("east");

        if(currentRoom.getWest()!=null)
            System.out.println("west");

        if(currentRoom.getSouth()!=null)
            System.out.println("south");
        if(currentRoom.getNorth()!=null)
            System.out.println("north");
        while(quit==false){
            System.out.println("\nPlease enter a direction");
            
                
            
            String text = sc.nextLine();
            if(null != text) switch (text) {
                case "help":
                    Help();
                    break;
                case "north":
                    if(currentRoom.getNorth()!=null){
                    currentRoom = currentRoom.getNorth();
                    System.out.println("\nYou are now in the "+ currentRoom.getDescription());
                    System.out.println("Your next options are ");
                    if(currentRoom.getEast()!=null)
                        System.out.println("east");
                    
                    if(currentRoom.getWest()!=null)
                        System.out.println("west");
                    
                    if(currentRoom.getSouth()!=null)
                        System.out.println("south");
                    
                    if(currentRoom.getNorth()!=null)
                        System.out.println("north");
                    break;
            }
            else
                System.out.println("There is a wall.\n");
            break;
                    
                case "west":
                    if(currentRoom.getWest()!=null){
                        currentRoom = currentRoom.getWest();
                        System.out.println("\nYou are now in the "+ currentRoom.getDescription());
                        System.out.println("Your next options are ");
                        if(currentRoom.getEast()!=null)
                            System.out.println("east");

                        if(currentRoom.getWest()!=null)
                            System.out.println("west");

                        if(currentRoom.getSouth()!=null)
                            System.out.println("south");
                        if(currentRoom.getNorth()!=null)
                            System.out.println("north");
                        break;
                    }
                    else
                        System.out.println("There is a wall.");
                    break;
                    
                case "east":
                if(currentRoom.getEast()!=null){
                    currentRoom = currentRoom.getEast();
                    System.out.println("\nYou are now in the "+ currentRoom.getDescription());
                                            System.out.println("Your next options are ");
                        if(currentRoom.getEast()!=null)
                            System.out.println("east");

                        if(currentRoom.getWest()!=null)
                            System.out.println("west");

                        if(currentRoom.getSouth()!=null)
                            System.out.println("south");
                        if(currentRoom.getNorth()!=null)
                            System.out.println("north");
                        break;
                }
                    else
                        System.out.println("There is a wall.");
                    break;
                    
                case "south":
                if(currentRoom.getSouth()!=null){
                    currentRoom = currentRoom.getSouth();
                    System.out.println("\nYou are now in the "+ currentRoom.getDescription());
                                            System.out.println("Your next options are ");
                        if(currentRoom.getEast()!=null)
                            System.out.println("east");

                        if(currentRoom.getWest()!=null)
                            System.out.println("west");

                        if(currentRoom.getSouth()!=null)
                            System.out.println("south");
                        if(currentRoom.getNorth()!=null)
                            System.out.println("north");
                        break;
                }
                else{
                    System.out.println("\nThere is a wall.\n");
                    break;
                }    
                case "exit":
                    quit = true;
                    System.out.println("\nGoodbye");
                    break;
                    
                
                default:
                    System.out.println("\nThat is not a known command.\n");
                    break;
            }
            
        }
        
    }
    public void Help(){
        System.out.println("\n*****\nAll possible directions entered must be entered as whole words, such as 'north','south','east',and 'west'.\nYou may exit the game at any time by typing 'exit'\n***** \n");
    }
    
}
