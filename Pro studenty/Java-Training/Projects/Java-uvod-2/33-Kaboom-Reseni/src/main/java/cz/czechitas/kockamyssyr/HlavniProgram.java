package cz.czechitas.kockamyssyr;

import java.util.*;
import cz.czechitas.kockamyssyr.api.*;
import net.sevecek.util.*;

public class HlavniProgram {

    public void main(String[] args) {
        var gameManager = new GameManager();
        var mysX = ((gameManager.getWidth() / 2) / 50) * 50;
        var mysY = ((gameManager.getHeight() - 49) / 50) * 50;
        var gonzales = new Mouse(mysX, mysY);
        var ovladacMysi = new KeyboardBrain(KeyCode.SPACE, KeyCode.LEFT, KeyCode.SPACE, KeyCode.RIGHT);
        gonzales.setBrain(ovladacMysi);

        var randomGenerator = new Random();

        var velikostX = gameManager.getWidth() / 50;
        var syrX = randomGenerator.nextInt(velikostX) * 50;
        var syr = new Cheese(syrX, 0);
        var pocetSyru = 0;
        while (syr != null) {
            Cheese pristiSyr = null;
            if (pocetSyru<4) {
                int pristiSyrX = randomGenerator.nextInt(velikostX) * 50;
                pristiSyr = new Cheese(pristiSyrX, 0);
            }
            syr.turnRight();
            while (syr.getY() < gameManager.getHeight() - 60 && syr.isAlive()) {
                syr.moveForward();
            }
            if (syr.isAlive()) {
                break;
            }
            syr = pristiSyr;
            pocetSyru++;
        }

        if (syr != null) {
            gonzales.setBrain(null);
            var kocka = new Cat(gonzales.getX()-200, mysY);
            kocka.moveForward(400);
        }
    }

}
