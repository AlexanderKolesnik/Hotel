package Hotel;

/**
 * Created by Александр on 12.10.2014.
 */
public interface RoomsAndPeople
{
    public static final int MAX_NUMBER_OF_PEOPLE = (3 * 2 * 1 + 2 * 2 * 2 + 1 * 2 * 3) * 3;//комнаты.кровать(одна 2х месная).номер

    public static final int LUX_TREE_ROOM = 1;
    public static final int STANDARD_TWO_ROOM = 2;
    public static final int ECONOMY_ONE_ROOM = 3;

    public static final int LUX_TWO_ROOM = 1;
    public static final int STANDARD_ONE_ROOM = 2;
    public static final int ECONOMY_THREE_ROOM = 3;

    public static final int LUX_ONE_ROOM = 1;
    public static final int STANDARD_THREE_ROOM = 2;
    public static final int ECONOMY_TWO_ROOM = 3;

    public static final String LUX = "LUX";
    public static final String STANDARD = "Standard";
    public static final String ECONOMY = "Economy";

    public static final int PLACES_MAX = 6;
    public static final int PLACES_STANDARD = 4;
    public static final int PLACES_ECONOMY = 2;


}
