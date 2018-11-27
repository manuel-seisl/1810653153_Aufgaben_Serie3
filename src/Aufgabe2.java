public class Aufgabe2
{

    public static void main(String[] args)
    {

        Person a = new Person();
        a.name = "Manuel Seisl";
        a.alter = 26;

        a.printPerson();

    }

    public static void printName(String name)
    {
        System.out.println(name);
    }

    public static void printAge(int age)
    {
        System.out.println(age);
    }

}
