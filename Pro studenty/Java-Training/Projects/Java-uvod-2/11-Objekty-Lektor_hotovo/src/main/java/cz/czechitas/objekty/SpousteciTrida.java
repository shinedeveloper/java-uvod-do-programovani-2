package cz.czechitas.objekty;

import cz.czechitas.objekty.dates.SimpleDate;
import cz.czechitas.objekty.dates.SimpleTime;
import net.sevecek.console.TextTerminal;
import java.awt.*;

public class SpousteciTrida {

    public static void main(String[] args) {
        var console = new TextTerminal();

        /*
        var jmeno = "Kamil";
        var mujVek = 36;
        var mojeVyska = 1.80;

        // System.out.println("Ahoj, zdravi vas ");
        console.println("Ahoj, zdravi vas ");
        console.println( jmeno );
        console.println("Muj vek je ");
        console.println( mujVek );
        console.println("Moje vyska je ");
        console.println(mojeVyska);
        */

        /*
        var barvaKamilovaTricka = new Color(57, 186, 251);
        console.print("Moje tricko ma tuto ");
        console.setTextColor(barvaKamilovaTricka);
        console.println("barvu");
        console.setTextColor(null);

        var modraSlozkaKamilovaTricka = barvaKamilovaTricka.getBlue();
        console.println(modraSlozkaKamilovaTricka);

        var rozmeryMehoPocitace = new Dimension(385, 270);
        console.println(rozmeryMehoPocitace);
        console.println(rozmeryMehoPocitace.getWidth());
        console.println(rozmeryMehoPocitace.getHeight());
        */

        //---------------------------------------------------------------------

        /*
        var dnesek = new SimpleDate();
        console.print("Dnes je ");
        console.print(dnesek.getDay() + ". ");
        console.print(dnesek.getMonth() + ". ");
        console.println(dnesek.getYear() + "");
        */

        /*
        var aktualniCas = new SimpleTime();
        console.print("Prave je ");
        console.print(aktualniCas.getHour() + ":");
        console.print(aktualniCas.getMinute() + ":");
        console.println(aktualniCas.getSecond());
        */

        /*
        var zacatekWorkshopu = new SimpleTime(9, 30);
        var dobaStudia = aktualniCas.between(zacatekWorkshopu);
        console.println(dobaStudia);
        console.println(dobaStudia.getHours());
        console.println(dobaStudia.getMinutes());
        */

        console.print("Zadejte den narozeni: ");
        var denNarozeni = console.readInt();
        console.print("Zadejte mesic narozeni: ");
        var mesicNarozeni = console.readInt();
        console.print("Zadejte rok narozeni: ");
        var rokNarozeni = console.readInt();
        var datumNarozeni = new SimpleDate(rokNarozeni, mesicNarozeni, denNarozeni);
        console.println("Den v tydnu, kdy jste se narodili: " + datumNarozeni.getDayOfWeek());

        var dnesek = new SimpleDate();
        var vek = dnesek.between(datumNarozeni);
        console.println("Mate " + vek.getYears() + " let, " + vek.getMonths() + " mesicu a " + vek.getDays() + " dni.");

        var vekVeDnech = dnesek.betweenTotalDays(datumNarozeni);
        console.println("Coz znamena, ze mate celkove " + vekVeDnech + " dni.");
    }

}
