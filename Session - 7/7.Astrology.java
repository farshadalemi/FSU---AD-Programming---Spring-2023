/***********************************************************
 * File: Astorology.java
 * Instructor: Nguyen Thai
 * Date: 29/03/2023
 * Student: Farshad Alemi
 * Description:
 * 
 ***********************************************************/

import java.util.Scanner;

class Astrology {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

        int month;
        System.out.print("Enter your birth month (1-12): ");
        month = input.nextInt();

        int day;
        System.out.print("Enter your birth day (1-31): ");
        day = input.nextInt();


        // Check for valid inputs.
        if ((month >= 1) && (month <= 12)){
            if ((day >= 1) && (day <= 31)){
                // System.out.println("Inputs are valied");
                if((month == 12 && day >= 22 && day <= 31) || (month ==  1 && day >= 1 && day <= 19)){
                    System.out.println("You are a Capricorn!");
                    System.out.println("Capricorns are skilled at navigating both the material and emotional realms.");
                }
                else if ((month ==  1 && day >= 20 && day <= 31) || (month ==  2 && day >= 1 && day <= 17)){
                    System.out.println("You are a Aquarius");
                    System.out.println("Aquarius is dedicated to making the world a better place.");
                }
                else if ((month ==  2 && day >= 18 && day <= 29) || (month ==  3 && day >= 1 && day <= 19)){
                    System.out.println("You are a Pisces");
                    System.out.println("Pisces is the most intuitive, sensitive, and empathetic sign of the entire zodiac — and that`s because it`s the last of the last.");
                }
                else if ((month ==  3 && day >= 20 && day <= 31) || (month ==  4 && day >= 1 && day <= 19)){
                    System.out.println("You are a Aries");
                    System.out.println("Aries loves to be number one");
                }
                else if ((month ==  4 && day >= 20 && day <= 30) || (month ==  5 && day >= 1 && day <= 20)){
                    System.out.println("You are a Taurus");
                    System.out.println("Taureans enjoy relaxing in serene, bucolic environments surrounded by soft sounds, soothing aromas, and succulent flavors.");
                }
                else if ((month ==  5 && day >= 21 && day <= 31) || (month ==  6 && day >= 1 && day <= 20)){
                    System.out.println("You are a Gemini");
                    System.out.println("Gemini is driven by its insatiable curiosity.");
                }
                else if ((month ==  6 && day >= 21 && day <= 30) || (month ==  7 && day >= 1 && day <= 22)){
                    System.out.println("You are a Cancer");
                    System.out.println("Cancers are highly intuitive and their psychic abilities manifest in tangible spaces.");
                }
                else if ((month ==  7 && day >= 23 && day <= 31) || (month ==  8 && day >= 1 && day <= 22)){
                    System.out.println("You are a Leo");
                    System.out.println("Leos are passionate, loyal, and infamously dramatic");
                }
                else if ((month ==  8 && day >= 23 && day <= 31) || (month ==  9 && day >= 1 && day <= 22)){
                    System.out.println("You are a Virgo");
                    System.out.println("Virgos are logical, practical, and systematic in their approach to life.");
                }
                else if ((month ==  9 && day >= 23 && day <= 30) || (month == 10 && day >= 1 && day <= 22)){
                    System.out.println("You are a Libra");
                    System.out.println("Libra is obsessed with symmetry and strives to create equilibrium in all areas of life — especially when it comes to matters of the heart.");
                }
                else if ((month == 10 && day >= 23 && day <= 31) || (month == 11 && day >= 1 && day <= 21)){
                    System.out.println("You are a Scorpio");
                    System.out.println("Scorpio derives its extraordinary courage from its psychic abilities, which is what makes this sign one of the most complicated, dynamic signs of the zodiac.");
                }
                else if ((month == 11 && day >= 22 && day <= 30) || (month == 12 && day >= 1 && day <= 21)){
                    System.out.println("You are a Sagittarius");
                    System.out.println("Sagittarius launches its many pursuits like blazing arrows, chasing after geographical, intellectual, and spiritual adventures.");
                }
                else
                    System.out.println("Input doesn't match specifications. Try again.");
            }
            else{
                System.out.println("Input doesn't match specifications. Try again.");
            }
        }
        else
        {
            System.out.println("Input doesn't match specifications. Try again.");
        }
        
		input.close();
	}

}
