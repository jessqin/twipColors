package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Option 1: Convert from RGB triplet to hexadecimal\nOption 2: Convert from hexadecimal to RGB triplet\nPlease pick an option");
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();

        while (true)
        {

            if (in.equalsIgnoreCase("option 1")
                    || in.equalsIgnoreCase("option one")
                    || in.equalsIgnoreCase("RGB to hex")
                    || in.equalsIgnoreCase("RGB triplet to hexadecimal"))
            {
                System.out.println("please enter an RGB triplet and seperate each color value with a comma");
                Scanner sc2 = new Scanner(System.in);
                String color = sc2.nextLine();

                Convert.RGBtoHex(color);
                break;

            }
            else if (in.equalsIgnoreCase("option 2")
                    || in.equalsIgnoreCase("option two")
                    || in.equalsIgnoreCase("hex to RGB")
                    || in.equalsIgnoreCase("hexadecimal to RGB triplet"))

            {

                System.out.println("Please enter a hexadecimal");
                Scanner sc2 = new Scanner(System.in);
                String color = sc2.nextLine();

                Convert.hexToRGB(color);
                break;


            }
            else
            {
                System.out.println("Please enter a valid option");
            }
        }



    }
}
