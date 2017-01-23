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
                System.out.println("please enter an RGB triplet");
                Scanner sc2 = new Scanner(System.in);
                String colorRGB = sc2.next();

                colorRGB.replaceAll("\\s", "");

                String [] color = new String[3];
                color [0] = colorRGB.substring(0,3);
                color [1] = colorRGB.substring(3,5);
                color [2] = colorRGB.substring(5);

                

            }
            else if (in.equalsIgnoreCase("option 2")
                    || in.equalsIgnoreCase("option two")
                    || in.equalsIgnoreCase("hex to RGB")
                    || in.equalsIgnoreCase("hexadecimal to RGB triplet"))
            {

            }
            else
            {
                System.out.println("Please enter a valid option");
                break;
            }
        }



    }
}
