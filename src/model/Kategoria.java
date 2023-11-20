/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author gerge
 */
public abstract class Kategoria {

    private String Neve;
    private double szinVesztes;

    public Kategoria(String Nev) {
        this.Neve = Nev;
        

    }

    public void setSzinVesztes(double szinVesztes) {
        this.szinVesztes = szinVesztes;
    }

    public String getNeve() {
        return Neve;
    }

    public double getSzinVesztes() {
        return szinVesztes;
    }
    
    public String getTulNeve() {
        return Neve;
    }


    @Override
    public String toString() {
        return "Kategoria{" + "Neve=" + Neve + '}';
    }
}
