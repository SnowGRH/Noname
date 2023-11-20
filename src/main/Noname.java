/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import model.Moso;
import model.SimaAuto;

/**
 *
 * @author szlanka.peter
 */
public class Noname {
    Moso m;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Noname().main();
    }

    private void main() {
        m = new Moso();
       m.beker(new SimaAuto("ford"));
    }

}
