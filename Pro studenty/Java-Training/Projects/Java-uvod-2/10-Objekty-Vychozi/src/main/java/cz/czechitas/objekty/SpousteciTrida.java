package cz.czechitas.objekty;

import cz.czechitas.objekty.dates.SimpleDate;
import cz.czechitas.objekty.dates.SimpleTime;
import net.sevecek.console.TextTerminal;
import java.awt.*;

public class SpousteciTrida {

    public static void main(String[] args) {
        System.out.println("Ahoj, zdravim vas!");

        var console = new TextTerminal();
        console.println("Ahoj, opet vas zdravim!");

        var jmeno = "Kamil";
        var mujVek = 36;
        var mojeVyska = 1.80;

        console.println("Ahoj, zdravi vas ");
        console.println(jmeno);
        console.println("Muj vek je ");
        console.println(mujVek);
        console.println("Moje vyska je ");
        console.println(mojeVyska);
    }

}
