package n3Command;



public class Vehicle {

    private String type;

    public Vehicle(String type)
    {
        this.type = type;
    }

    public void accelerates()
    {
        System.out.println("The " + type + " accelerates");

    }

    public void starts()
    {
        System.out.println("The " + type + " starts");

    }

    public void stops()
    {
        System.out.println("The " + type + " stops");
    }
}
