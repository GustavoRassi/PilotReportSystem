package projPilot;

import java.util.Vector;

public class Plane
{
    private String brand; // Brand of the plane (e.g. Airbus, Boeing)
    private String travelClass; // e.g. first, business or economy class

    private int passCapacity; // Capacity of the plane
    private int numOfEngines; // # of engines
    private int planeNumber; // Plane ID

    private Pilot pilot;


    // Constructor
    public Plane(String brand, String travelClass, int passCapacity, int numOfEngines, int planeNumber)
    {
        setBrand(brand);
        setTravelClass(travelClass);
        setPassCapacity(passCapacity);
        setNumOfEngines(numOfEngines);
        setPlaneNumber(planeNumber);
    }


    /*
     * planeInformation
     *       Stores the information of the plane
     *       in a String and returns it.
     *
     *  Returns: String variable
     */
    public String planeInformation()
    {
        String planeInfo = "\tPlane Information\n\t--------------------";

        planeInfo += "\n\tBrand: \t\t\t\t" + getBrand() + "\n\tTravel Class: \t\t" + getTravelClass()
                  + "\n\tPassenger Capacity: " + getPassCapacity() + "\n\tNumber of Engines: \t" + getNumOfEngines()
                  + "\n\tPlane Number: \t\t" + getPlaneNumber();

        return planeInfo;
    }


    /*
     * assignPilot
     *       The plane will be assigned a pilot by passing
     *       its contents to the class Pilot.
     *
     *       getPilot() returns an object, so it's used
     *       to call addPlane() to add the plane with its
     *       contents.
     */
    public void assignPilot(Pilot pilot)
    {
        this.pilot = pilot;
        getPilot().addPlane(this);
    }


    // SETTERS
    public void setBrand(String brand)
    {
        this.brand = brand;
    }
    public void setTravelClass(String travelClass)
    {
        this.travelClass = travelClass;
    }
    public void setPassCapacity(int passCapacity)
    {
        this.passCapacity = passCapacity;
    }
    public void setNumOfEngines(int numOfEngines)
    {
        this.numOfEngines = numOfEngines;
    }
    public void setPlaneNumber(int planeNumber)
    {
        this.planeNumber = planeNumber;
    }


    // GETTERS
    public Pilot getPilot()
    {
        return pilot;
    }
    public String getBrand()
    {
        return brand;
    }
    public String getTravelClass()
    {
        return travelClass;
    }
    public int getPassCapacity()
    {
        return passCapacity;
    }
    public int getNumOfEngines()
    {
        return numOfEngines;
    }
    public int getPlaneNumber()
    {
        return planeNumber;
    }
}
