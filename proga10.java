package com.company;
import java.util.Scanner;
public class JOJO10 {
    public static void main(String[] args)  {
        Scanner inputdata = new Scanner(System.in);
        String starttime = inputdata.nextLine();
        int starttimeh = Integer.parseInt(starttime.substring(0, starttime.indexOf(":"))) * 3600;
        int starttimemin = Integer.parseInt(starttime.substring(starttime.indexOf(":")+1)) * 60;
        String endtime = inputdata.nextLine();
        int endtimeh = Integer.parseInt(endtime.substring(0, endtime.indexOf(":"))) * 3600;
        int endtimemin = Integer.parseInt(endtime.substring(endtime.indexOf(":")+1)) * 60;
        System.out.println(endtimeh + endtimemin - starttimeh - starttimemin);
    }
}
