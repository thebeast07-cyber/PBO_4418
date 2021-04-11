/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nailun Najah
 */
public class UjiKendaraan {
     public static void main(String[] args) {
        Bicycle sepeda = new Bicycle();
        MotorVehicle motor = new MotorVehicle(3, "H 123 ADS");
        
        sepeda.ringBell();
        
        System.out.println("Plat Sepeda Motor : "+motor.getLicencePlate());
        System.out.println("Mesin : "+motor.getSizeofEngine());
    }
}