package Hotel;

import java.util.LinkedList;
import java.util.List;

public class Hotel implements RoomsAndPeople
{
    private int luxTreeRoomCount;
    private int standardTwoRoomCount;
    private int economyOneRoomCount;

    private int luxTwoRoomCount;
    private int standardOneRoomCount;
    private int economyThreeRoomCount;

    private int luxOneRoomCount;
    private int standardThreeRoomCount;
    private int economyTwoRoomCount;

    private List<AccommodationApplication> waitLux = new LinkedList<AccommodationApplication>();
    private List<AccommodationApplication> waitStandard = new LinkedList<AccommodationApplication>();
    private List<AccommodationApplication> waitEconomy = new LinkedList<AccommodationApplication>();

    private int numberOfPeople;
    private List<String> listOfPeople = new LinkedList<String>();

    public synchronized boolean add(List<String> surname, long time, Hotel hotel, String typeOfRoom){
        if (numberOfPeople + surname.size() > MAX_NUMBER_OF_PEOPLE){
            SortOnWait(surname, time, hotel, typeOfRoom);
            for(String x: surname){
                System.out.println(x);
            }
            System.out.println("wait");
            System.out.println("--------------------");
            return false;
        }
        if (addLux(surname, time, hotel, typeOfRoom)) return true;
        if (addStandard(surname, time, hotel, typeOfRoom)) return true;
        if (addEconomy(surname, time, hotel, typeOfRoom)) return true;

        SortOnWait(surname, time, hotel, typeOfRoom);
            for(String x: surname){
                System.out.println(x);
            }
            System.out.println("wait");
            System.out.println("--------------------");
            return false;


    }

    public boolean addEconomy(List<String> surname, long time, Hotel hotel, String typeOfRoom)
    {
        if ((typeOfRoom.equals(ECONOMY)) && (surname.size() <= PLACES_ECONOMY) && (economyOneRoomCount < ECONOMY_ONE_ROOM)){
            economyOneRoomCount++;
            numberOfPeople += surname.size();
            for(String x: surname){
                listOfPeople.add(x);
                System.out.println(x);
            }
            System.out.println("Time " + time);
            System.out.println("Availability " + (MAX_NUMBER_OF_PEOPLE - numberOfPeople));
            System.out.println("settled");
            System.out.println("----------------------");
            new AccommodationApplication(surname, time, hotel, typeOfRoom).start();
            return true;
        }else if ((typeOfRoom.equals(ECONOMY)) && (surname.size() > PLACES_ECONOMY) && (surname.size() <= PLACES_STANDARD) && (economyTwoRoomCount < ECONOMY_TWO_ROOM)){
            economyTwoRoomCount++;
            numberOfPeople += surname.size();
            for(String x: surname){
                listOfPeople.add(x);
                System.out.println(x);
            }
            System.out.println("Time " + time);
            System.out.println("Availability " + (MAX_NUMBER_OF_PEOPLE - numberOfPeople));
            System.out.println("settled");
            System.out.println("----------------------");
            new AccommodationApplication(surname, time, hotel, typeOfRoom).start();
            return true;
        }
        else if ((typeOfRoom.equals(ECONOMY)) && (surname.size() > PLACES_STANDARD) && (surname.size() <= PLACES_MAX) && (economyThreeRoomCount < ECONOMY_THREE_ROOM)){
            economyThreeRoomCount++;
            numberOfPeople += surname.size();
            for(String x: surname){
                listOfPeople.add(x);
                System.out.println(x);
            }
            System.out.println("Time " + time);
            System.out.println("Availability " + (MAX_NUMBER_OF_PEOPLE - numberOfPeople));
            System.out.println("settled");
            System.out.println("----------------------");
            new AccommodationApplication(surname, time, hotel, typeOfRoom).start();
            return true;
        }
        return false;
    }

    public boolean addStandard(List<String> surname, long time, Hotel hotel, String typeOfRoom)
    {
        if ((typeOfRoom.equals(STANDARD)) && (surname.size() <= PLACES_ECONOMY) && (standardOneRoomCount < STANDARD_ONE_ROOM)){
            standardOneRoomCount++;
            numberOfPeople += surname.size();
            for(String x: surname){
                listOfPeople.add(x);
                System.out.println(x);
            }
            System.out.println("Time " + time);
            System.out.println("Availability " + (MAX_NUMBER_OF_PEOPLE - numberOfPeople));
            System.out.println("settled");
            System.out.println("----------------------");
            new AccommodationApplication(surname, time, hotel, typeOfRoom).start();
            return true;
        }else if ((typeOfRoom.equals(STANDARD)) && (surname.size() > PLACES_ECONOMY) && (surname.size() <= PLACES_STANDARD) && (standardTwoRoomCount < STANDARD_TWO_ROOM)){
            standardTwoRoomCount++;
            numberOfPeople += surname.size();
            for(String x: surname){
                listOfPeople.add(x);
                System.out.println(x);
            }
            System.out.println("Time " + time);
            System.out.println("Availability " + (MAX_NUMBER_OF_PEOPLE - numberOfPeople));
            System.out.println("settled");
            System.out.println("----------------------");
            new AccommodationApplication(surname, time, hotel, typeOfRoom).start();
            return true;
        }
        else if ((typeOfRoom.equals(STANDARD)) && (surname.size() > PLACES_STANDARD) && (surname.size() <= PLACES_MAX) && (standardThreeRoomCount < STANDARD_THREE_ROOM)){
            standardThreeRoomCount++;
            numberOfPeople += surname.size();
            for(String x: surname){
                listOfPeople.add(x);
                System.out.println(x);
            }
            System.out.println("Time " + time);
            System.out.println("Availability " + (MAX_NUMBER_OF_PEOPLE - numberOfPeople));
            System.out.println("settled");
            System.out.println("----------------------");
            new AccommodationApplication(surname, time, hotel, typeOfRoom).start();
            return true;
        }
        return false;
    }

    public boolean addLux(List<String> surname, long time, Hotel hotel, String typeOfRoom)
    {
        if((typeOfRoom.equals(LUX)) && (surname.size() <= PLACES_ECONOMY) && (luxOneRoomCount < LUX_ONE_ROOM)){
            luxOneRoomCount++;
            numberOfPeople += surname.size();
            for(String x: surname){
                listOfPeople.add(x);
                System.out.println(x);
            }
            System.out.println("Time " + time);
            System.out.println("Availability " + (MAX_NUMBER_OF_PEOPLE - numberOfPeople));
            System.out.println("settled");
            System.out.println("----------------------");
            new AccommodationApplication(surname, time, hotel, typeOfRoom).start();
            return true;
        }else if ((typeOfRoom.equals(LUX)) &&  (surname.size() > PLACES_ECONOMY) && (surname.size() <= PLACES_STANDARD) && (luxTwoRoomCount < LUX_TWO_ROOM)){
            luxTwoRoomCount++;
            numberOfPeople += surname.size();
            for(String x: surname){
                listOfPeople.add(x);
                System.out.println(x);
            }
            System.out.println("Time " + time);
            System.out.println("Availability " + (MAX_NUMBER_OF_PEOPLE - numberOfPeople));
            System.out.println("settled");
            System.out.println("----------------------");
            new AccommodationApplication(surname, time, hotel, typeOfRoom).start();
            return true;
        }else if ((typeOfRoom.equals(LUX)) && (surname.size() > PLACES_STANDARD) && (surname.size() <= PLACES_MAX) && (luxTreeRoomCount < LUX_TREE_ROOM)){
            luxTreeRoomCount++;
            numberOfPeople += surname.size();
            for(String x: surname){
                listOfPeople.add(x);
                System.out.println(x);
            }
            System.out.println("Time " + time);
            System.out.println("Availability " + (MAX_NUMBER_OF_PEOPLE - numberOfPeople));
            System.out.println("settled");
            System.out.println("-------------------");
            new AccommodationApplication(surname, time, hotel, typeOfRoom).start();
            return true;
        }
        return false;
    }

    public void SortOnWait(List<String> surname, long time, Hotel hotel, String typeOfRoom)
    {
        if (typeOfRoom.equals(LUX)){
            waitLux.add(new AccommodationApplication(surname, time, hotel, typeOfRoom));
        }else if (typeOfRoom.equals(STANDARD)){
            waitStandard.add(new AccommodationApplication(surname, time, hotel, typeOfRoom));
        }else if (typeOfRoom.equals(ECONOMY)){
            waitEconomy.add(new AccommodationApplication(surname, time, hotel, typeOfRoom));
        }
    }

    public synchronized void remove(List<String> surname, String typeOfRoom, long time){
        numberOfPeople -= surname.size();
        for(String s: surname){
            listOfPeople.remove(s);
            System.out.println(s);
        }
        System.out.println("Time " + time);
        System.out.println("Availability " + (MAX_NUMBER_OF_PEOPLE - numberOfPeople));
        System.out.println("evicted");
        System.out.println("----------------------");

        if (startLux(surname, typeOfRoom)) return;

        if (startStandard(surname, typeOfRoom)) return;

        startEconomy(surname, typeOfRoom);
    }

    public void startEconomy(List<String> surname, String typeOfRoom)
    {
        if (typeOfRoom.equals(ECONOMY))
        {
            for (AccommodationApplication x : waitEconomy)
            {
                if (surname.size() >= x.getSurname().size()){
                    if (surname.size() <= 2){
                        economyOneRoomCount--;
                    }else if((surname.size() <= 4) && (surname.size() > 2)){
                        economyTwoRoomCount--;
                    }else if ((surname.size() <= 6) && (surname.size() > 4)){
                        economyThreeRoomCount--;
                    }
                    waitEconomy.remove(x);
                    x.add();
                    return;
                }
            }
        }
    }

    public boolean startStandard(List<String> surname, String typeOfRoom)
    {
        if (typeOfRoom.equals(STANDARD))
        {
            for (AccommodationApplication x : waitStandard)
            {
                if (surname.size() >= x.getSurname().size()){
                    if (surname.size() <= 2){
                        standardOneRoomCount--;
                    }else if((surname.size() <= 4) && (surname.size() > 2)){
                        standardTwoRoomCount--;
                    }else if ((surname.size() <= 6) && (surname.size() > 4)){
                        standardThreeRoomCount--;
                    }
                    waitStandard.remove(x);
                    x.add();
                    return true;
                }
            }
        }
        return false;
    }

    public boolean startLux(List<String> surname, String typeOfRoom)
    {
        if (typeOfRoom.equals(LUX))
        {
            for (AccommodationApplication x : waitLux)
            {
                if (surname.size() >= x.getSurname().size()){
                    if (surname.size() <= 2){
                        luxOneRoomCount--;
                    }else if((surname.size() <= 4) && (surname.size() > 2)){
                        luxTwoRoomCount--;
                    }else if ((surname.size() <= 6) && (surname.size() > 4)){
                        luxTreeRoomCount--;
                    }
                    waitLux.remove(x);
                    x.add();
                    return true;
                }
            }
        }
        return false;
    }

    public String search(List<String> surname){

        if (listOfPeople.contains(surname)){
            return surname + " is present";
        }
            return surname + " is not present";

    }


}

