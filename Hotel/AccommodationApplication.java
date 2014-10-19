package Hotel;

import java.util.List;

/**
 * Created by Александр on 08.10.2014.
 */
public class AccommodationApplication extends Thread
{
    private List<String> surname;
    private long time;
    private Hotel hotel;
    private String typeOfRoom;

    public AccommodationApplication(List<String> surname, long time, Hotel hotel, String typeOfRoom)
    {
        this.surname = surname;
        this.time = time;
        this.hotel = hotel;
        this.typeOfRoom = typeOfRoom;
    }

    @Override
    public void run()
    {
        try
        {
            Thread.sleep(time);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        hotel.remove(surname, typeOfRoom, time);

    }

    public void add(){
        hotel.add(surname, time, hotel, typeOfRoom);
    }

    public List<String> getSurname()
    {
        return surname;
    }

}
