/***********************************************************
* Project: Pilot Registration System
 * Description: Program designed to register a
 *              pilot's information, including
 *              assigning a plane, for displaying
 *              or printing purposes.
*
* Developed by: Gustavo Rassi, Computer Science student
*
* Coursework: Object-Oriented Programming with Java
***********************************************************/

package projPilot;

public class tester
{
    public static void main(String[] args)
    {
        // Pilot instantiation
        Pilot pilot = new Pilot("Gustavo Rassi", "Puerto Rico", "Captain", 563425, "7872184328", "03/31/2000");
        Pilot pilot1 = new Pilot("Juan Melendez", "Florida", "Co-Pilot", 348676, "3154573965", "08/20/2000");
        Pilot pilot2 = new Pilot("John Smith", "Maryland, US", "Captain", 422378, "4106783451", "10/21/1999");

        // Plane instantiation
        Plane plane = new Plane("Airbus", "Business", 200, 4, 3702);
        Plane plane1 = new Plane("Boeing", "First", 170, 2, 3851);
        Plane plane2 = new Plane("Airbus", "Economy", 230, 4, 4053);

        // 2 of the 3 pilots are given a plane
        pilot.addPlane(plane);
        pilot1.addPlane(plane1);

        // Show all the information given
        System.out.print(Pilot.showAllPilots());
    }
}
