package core.immtuableClassObjectRevise;
final class BachelorCollege
{
    private  int id;
    private  String name;
    private Location location;

// defensive copy   - Now it's 100% immutable
    BachelorCollege(int id , String name, Location location)
    {
        this.id = id;
        this.name = name;
//        this.location = location;
        this.location = new Location(location.pin, location.address);
    }

    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }

    // Defensive Copy
    public Location getLocation()
    {
//        return location;
        return new Location(this.location.pin, this.location.address);
    }

}

class Location
{
    int pin;
    String address;

    Location(int pin, String address)
    {
        this.pin = pin;
        this.address = address;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
public class CompleteImmutable {
    public static void main(String[] args) {
        Location loc = new Location(14422, "Guwahati");
        BachelorCollege bc = new BachelorCollege(101, "IIT G", loc);


        bc.getLocation().address = "Kanpur";
        // as here getLocation pointing to the same location object in heap, so making any changes to that will definitely affect the main class reference value, so we need to give a fresh copy each time
        // this is now affecting the original bachelor's class value which making it partial immutable and Location as mutable

        // we can only make the main class as immutable my making the constructor and getter to return the defensive copy or deep copy
        System.out.println(bc.getLocation().getAddress());

        // NOW IF WE DO FURTHER CHANGE TO THE LOCATION CLASS REFERENCE, IT WON'T AFFECT THE ORIGINAL CLASS
        bc.getLocation().address = "Kanpur";
        // still the main address is for Guwahati, not kanpur
        System.out.println("Original main college address is still at \"" + bc.getLocation().address+ "\""); // Guwahati not Kanpur(X)

    }


    // NOTE:
    //  this immutable object concept will be helpful when multiple threads try to access and modify the same object (race condition)
       // will learn that later .....
}
