/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project4;

/**
 *
 * @author Bill Scarbrough
 */
public class LocationNode {
    
    private String description;
    private LocationNode north;
    private LocationNode south;
    private LocationNode east;
    private LocationNode west;
    
    public LocationNode(String newDescription){
        this.description = newDescription;
    }

    public String getDescription(){
        return description;
    }
    
    public LocationNode getNorth(){
        return north;
    }
    
    public LocationNode getSouth(){
        return south;
    }
    
    public LocationNode getEast(){
        return east;
    }
    
    public LocationNode getWest(){
        return west;
    }
    
    public void setNorth(LocationNode newNorth){
        north = newNorth;
    }
    
    public void setSouth(LocationNode newSouth){
        south = newSouth;
    }
    
    public void setEast(LocationNode newEast){
        east = newEast;
    }
    
    public void setWest(LocationNode newWest){
        west = newWest;
    }
}
