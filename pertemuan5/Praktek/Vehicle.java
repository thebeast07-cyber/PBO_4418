/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nailun Najah
 */
public class Vehicle {
     double speed = 0;
    String color = "orange";
    
    public Vehicle(){
        
    }
    
    public void goStraight(){
        System.out.println("Maju..");
    }
    
    public void turnLeft(){
        System.out.println("Belok Kiri");
    }
    
    public void turnRight(){
        System.out.println("Belok Kanan");
    }
}