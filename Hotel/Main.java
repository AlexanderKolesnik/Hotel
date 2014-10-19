package Hotel;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Александр on 08.10.2014.
 */
public class Main
{
    private static List<String> group1 = new LinkedList<String>();
    private static List<String> group2 = new LinkedList<String>();
    private static List<String> group3 = new LinkedList<String>();

    private static List<String> group4 = new LinkedList<String>();
    private static List<String> group5 = new LinkedList<String>();
    private static List<String> group6 = new LinkedList<String>();

    public static void main(String[] args)throws InterruptedException
    {

        Hotel hotel = new Hotel();
        //
        group1.add("Phil1");
        group1.add("Ronny1");
        group1.add("Jay1");
        group1.add("Kai1");
        group1.add("Arny1");
        new AccommodationApplication(group1, 10000, hotel, "LUX").add();
        Thread.sleep(1000);
        //group1.clear();
        group2.add("Phil2");
        group2.add("Ronny2");
        group2.add("Jay2");
        group2.add("Kai2");
        group2.add("Arny2");
        new AccommodationApplication(group2, 10000, hotel, "LUX").add();
        //group2.clear();
        Thread.sleep(1000);
        group3.add("Phil3");
        group3.add("Ronny3");
        group3.add("Jay3");
        group3.add("Kai3");
        group3.add("Arny3");
        new AccommodationApplication(group3, 10000, hotel, "LUX").add();
        //group3.clear();
        //
        Thread.sleep(1000);
        group4.add("Standard_Phil1");
        group4.add("Standard_Ronny1");
        group4.add("Standard_Jay1");
        group4.add("Standard_Kai1");
        group4.add("Standard_Arny1");
        new AccommodationApplication(group4, 10000, hotel, "Standard").add();
        Thread.sleep(1000);
        group5.add("Standard_Phil2");
        group5.add("Standard_Ronny2");
        group5.add("Standard_Jay2");
        group5.add("Standard_Kai2");
        group5.add("Standard_Arny2");
        new AccommodationApplication(group5, 10000, hotel, "Standard").add();
        Thread.sleep(1000);
        group6.add("Standard_Phil3");
        group6.add("Standard_Ronny3");
        group6.add("Standard_Jay3");
        group6.add("Standard_Kai3");
        group6.add("Standard_Arny3");
        new AccommodationApplication(group6, 10000, hotel, "Standard").add();
    }
}
