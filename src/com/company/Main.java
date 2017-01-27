package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Please pick an option\nOption 1: Convert from RGB triplet to hexadecimal\nOption 2: Convert from hexadecimal to RGB triplet");
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();

        while (true)
        {

            if (in.equalsIgnoreCase("option 1")
                    || in.equalsIgnoreCase("option one")
                    || in.equalsIgnoreCase("RGB to hex")
                    || in.equalsIgnoreCase("RGB triplet to hexadecimal")
                    || in.equalsIgnoreCase("1"))
            {
                System.out.println("please enter an RGB triplet and seperate each color value with a comma");
                Scanner sc2 = new Scanner(System.in);
                String color = sc2.nextLine();

                try
                {
                    Convert.RGBtoHex(color);
                    break;
                }
                catch (ArrayIndexOutOfBoundsException e)
                {

                }
                catch (NumberFormatException e)
                {

                }


            }
            else if (in.equalsIgnoreCase("option 2")
                    || in.equalsIgnoreCase("option two")
                    || in.equalsIgnoreCase("hex to RGB")
                    || in.equalsIgnoreCase("hexadecimal to RGB triplet")
                    || in.equals("2"))

            {

                System.out.println("Please enter a hexadecimal color");
                Scanner sc2 = new Scanner(System.in);
                String color = sc2.nextLine();

                try
                {
                    Convert.hexToRGB(color);
                    break;
                }
                catch (StringIndexOutOfBoundsException e)
                {
                    System.out.println("This is not a hexadecimal");
                }



            }
            else
            {
                System.out.println("Please enter a valid option");
            }
        }



    }
}
