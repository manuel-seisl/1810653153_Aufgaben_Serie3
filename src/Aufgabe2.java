public class Aufgabe2
{

    public static void main(String[] args)
    {

        for(int i = 0; i < 5; i++){
            printName("Manuel Seisl");
            printAge(26 + i);
        }

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
