package com.company;

/**
 * Created by Jessica Qin on 1/26/2017.
 */
public class Convert
{
    public static void RGBtoHex(String c)
    {
        String color = c;
        int num = 10;
        char l = 65;
        String [] colorRGB = color.replaceAll("\\s", "").split(",");

        int red = Integer.parseInt(colorRGB[0]);
        int green = Integer.parseInt(colorRGB[1]);
        int blue = Integer.parseInt(colorRGB[2]);

        String hexRed1 = Integer.toString((int)red/16);
        String hexRed2 = Integer.toString(red%16);
        String hexBlue1 = Integer.toString((int)blue/16);
        String hexBlue2 = Integer.toString(blue%16);
        String hexGreen1 = Integer.toString((int)green/16);
        String hexGreen2 = Integer.toString(green%16);

        for (int i = 0; i < 15; i++)
        {

            if (hexRed1.equals(Integer.toString(num)))
            {
                hexRed1 = Character.toString(l);
            }
            if (hexRed2.equalsIgnoreCase(Integer.toString(num)))
            {
                hexRed2 = Character.toString(l);
            }
            if (hexGreen1.equalsIgnoreCase(Integer.toString(num)))
            {
                hexGreen1 = Character.toString(l);
            }
            if (hexGreen2.equalsIgnoreCase(Integer.toString(num)))
            {
                hexGreen2 = Character.toString(l);
            }
            if (hexBlue1.equalsIgnoreCase(Integer.toString(num)))
            {
                hexBlue1 = Character.toString(l);
            }
            if (hexBlue2.equalsIgnoreCase(Integer.toString(num)))
            {
                hexBlue2 = Character.toString(l);
            }
            num++;
            l++;
        }

        String RGBtoHex = (hexRed1 + hexRed2 + hexGreen1 + hexGreen2 + hexBlue1 + hexBlue2);
        System.out.println("The hexadecimal is " +  RGBtoHex);
    }

    public static void hexToRGB(String h)
    {
        String color = h.toUpperCase();

        int num = 10;
        char l = 65;

        String red1 = (color.substring(0,1));
        String  red2 = (color.substring(1,2));
        String green1 = (color.substring(2,3));
        String green2 = (color.substring(3,4));
        String  blue1 = (color.substring(4,5));
        String  blue2 = (color.substring(5,6));

        for (int i = 0; i < 15; i++)
        {

            if (red1.equals(Character.toString(l)))
            {
                red1 = Integer.toString(num);
            }
            if (red2.equals(Character.toString(l)))
            {
                red2 = Integer.toString(num);
            }
            if (green1.equals(Character.toString(l)))
            {
                green1 = Integer.toString(num);
            }
            if (green2.equals(Character.toString(l)))
            {
                green2 = Integer.toString(num);
            }
            if (blue1.equals(Character.toString(l)))
            {
                blue1 = Integer.toString(num);
            }
            if (blue2.equals(Character.toString(l)))
            {
                blue2 = Integer.toString(num);
            }
            num++;
            l++;
        }

        int hexred1 = Integer.parseInt(red1);
        int hexred2 = Integer.parseInt(red2);
        int hexgreen1 = Integer.parseInt(green1);
        int hexgreen2 = Integer.parseInt(green2);
        int hexblue1 = Integer.parseInt(blue1);
        int hexblue2 = Integer.parseInt(blue2);

        int red = (hexred1 * 16) + hexred2;
        int green = (hexgreen1 * 16) + hexgreen2;
        int blue = (hexblue1 * 16) + hexblue2;

        System.out.println("The RGB triple is " + red + " " + green + " " + blue);

    }
}
