public class Vehicle
{

    int doors;
    int ps;
    String color;

    public void getDoors()
    {
        System.out.println("Das Fahrzeug besitzt " + doors + " Türen");
    }

    public String defineColor(String color)
    {
        this.color = color;
        return color;
    }

}
