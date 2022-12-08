package projPilot;

import java.util.Vector;

public class Pilot
{
    private String name; // Pilot's name
    private String address; // Pilot's demographic
    private String rank; // Pilot's rank (e.g. Captain, Co-Pilot)

    private int licenceNum; // Person's pilot ID number
    private String phone; // Pilots phone number
    private String dateOfBirth; // Pilots date of birth

    private Plane plane; // The plane of every pilot (starts with an empty class waiting to be assigned)

    // Static vector to keep the current amount of pilots
    private static Vector<Pilot> pilots = new Vector<Pilot>();


    // Constructor
    public Pilot(String name, String address, String rank, int licenceNum, String phone, String dateOfBirth)
    {
        setName(name);
        setAddress(address);
        setRank(rank);
        setLicenceNum(licenceNum);
        setPhone(phone);
        setDateOfBirth(dateOfBirth);
        pilots.add(this);

        // Place holder
        plane = new Plane(null, null, 0, 0, 0);
    }


    /*
     * addPlane
     *       Adds/Assigns a plane to the pilot by passing
     *       the object with its contents to the Plane class.
     */
    public void addPlane(Plane plane)
    {
        this.plane = plane;
    }


    /*
     * showAllPilots
     *       Stores all the information, including the plane,
     *       in a String and returns it.
     *
     *  Returns: String variable
     */
    public static String showAllPilots()
    {
        String allPilots = "\nPilot Information\n===================================================\n";

        // Store every pilot's information in the String
        for(int i = 0; i < pilots.size(); i++)
            allPilots += pilots.get(i).tellAboutSelf();

        return allPilots;
    }


    /*
    * tellAboutSelf
    *       Stores a pilot's information in a String
    *       and returns it.
    *
    *   Returns: String variable
    */
    public String tellAboutSelf()
    {
        String pilotInfo = "";

        // Values are stored in an organized way for easy readability
        pilotInfo += "\tName: \t\t\t\t" + getName() + "\n\tRank: \t\t\t\t" + getRank() + "\n\tLicence Number: \t"
                  + getLicenceNum() + "\n\tDate of birth: \t\t" + getDateOfBirth() + "\n\tPhone #: \t\t\t"
                  + getPhone() + "\n\tAddress: \t\t\t" + getAddress() + "\n\n";

        if(plane.getPlaneNumber() == 0) // Pilot does not have a plane assigned yet
            pilotInfo += "\tNote: Pilot does not have a plane assigned.\n";
        else
            // Pilot does have a plane assigned
            pilotInfo += plane.planeInformation();

        // Lines to seperate every pilot's information to prevent confusion when read by the user
        pilotInfo += "\n===================================================\n" + "===================================================\n";

        return pilotInfo;
    }


    // SETTERS
    public void setName(String name)
    {
        this.name = name;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }
    public void setRank(String rank)
    {
        this.rank = rank;
    }
    public void setLicenceNum(int licenceNum)
    {
        this.licenceNum = licenceNum;
    }
    public void setPhone(String phone)
    {
        this.phone = phone;
    }
    public void setDateOfBirth(String dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }


    // GETTERS
    public String getName()
    {
        return name;
    }
    public String getAddress()
    {
        return address;
    }
    public String getRank()
    {
        return rank;
    }
    public int getLicenceNum()
    {
        return licenceNum;
    }
    public String getPhone()
    {
        return phone;
    }
    public String getDateOfBirth()
    {
        return dateOfBirth;
    }
}
