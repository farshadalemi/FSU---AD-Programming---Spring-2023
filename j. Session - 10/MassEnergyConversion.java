/***********************************************************
 * File: MassEnergyConversion.java
 * Instructor: Nguyen Thai
 * Date: 27/04/2023
 * Student: Farshad Alemi
 * Description:
 * Develop a program that uses the E = mc2 formula to calculate mass and energy equivalence in both directions.
a)	Use a class scope constant for the value of c (299792458 m/s).
b)	Write a method called energyFromMass() to calculate the energy for a given value of mass.
c)	Write a method called massFromEnergy() to calculate the mass for a given value of energy.
d)	Write a main() method to test the above methods and print the results to the console using the following values as inputs:
1.	m = 1 Kilogram.
2.	E = 1,000,000,000 Joules.
 ***********************************************************/
 public class MassEnergyConversion {

    static final double C_VALUE = 299792458;

    public static void main(String[] args) {
        int m = 1;
        int E = 1000000000;
<<<<<<< HEAD
        System.out.println(" >> Calculation of energy from given value of mass: " + MassEnergyConversion.energyFromMass(m) + " Joules");
        System.out.println(" >> Calculation of mass from given value of energy: " + MassEnergyConversion.massFromEnergy(E) + " Kilogram");
=======
        System.out.println("Calculation of energy from given value of mass: " + MassEnergyConversion.energyFromMass(m) + " Joules");
        System.out.println("Calculation of mass from given value of energy: " + MassEnergyConversion.massFromEnergy(E) + " Kilogram");
>>>>>>> 6ff39bcf358b273c11fd7cfa87b1c96d3fcf765c
    }

    public static int energyFromMass(int mass_input){
        return mass_input * ((int)Math.pow(C_VALUE, 2));
    }

    public static int massFromEnergy(int energy_input){
        return (int)(Math.pow(C_VALUE, 2) / energy_input);
    }

}