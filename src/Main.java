import javax.swing.*;

public class Main
{

    public static void main(String[] args)
    {

        String eingabe = JOptionPane.showInputDialog("Bitte eingeben:");

        switch(eingabe)
        {
            case "20":

                int a = Integer.parseInt(eingabe);
                int ergebnis = a * 26;

                JOptionPane.showMessageDialog(null, "Das Ergebnis beträgt: " + ergebnis);

                break;

            case "Peter Pan":

                JOptionPane.showMessageDialog(null, "Bangarang");

                break;

            default:

                System.err.println("Keine Eingabe!");

        }

    }

}
