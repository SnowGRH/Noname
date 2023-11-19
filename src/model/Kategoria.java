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
    private String tulNeve;
    private boolean allapot;
    public Kategoria(String tulNev) {
        this.tulNeve = tulNev;
        allapot = false;
    }

    public String getTulNeve() {
        return tulNeve;
    }

    public boolean isAllapot() {
        return allapot;
    }

    public void setTulNeve(String tulNeve) {
        this.tulNeve = tulNeve;
    }

    public void setAllapot(boolean allapot) {
        this.allapot = allapot;
    }

    @Override
    public String toString() {
        return "Kategoria{" + "tulNeve=" + tulNeve + ", allapot=" + allapot + '}';
    }

    
    
    public abstract void AlapMosas();

    public abstract void SilverMosas();

    public abstract void GoldMosas();
}
