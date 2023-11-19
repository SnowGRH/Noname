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
    private boolean allapot;
    public Kategoria(String Nev) {
        this.Neve = Nev;
        allapot = false;
    }

    public String getTulNeve() {
        return Neve;
    }

    public boolean isAllapot() {
        return allapot;
    }

    public void setTulNeve(String Neve) {
        this.Neve = Neve;
    }

    public void setAllapot(boolean allapot) {
        this.allapot = allapot;
    }

    @Override
    public String toString() {
        return "Kategoria{" + "tulNeve=" + Neve + ", allapot=" + allapot + '}';
    }

    
    
    public abstract void AlapMosas();

    public abstract void SilverMosas();

    public abstract void GoldMosas();
}
