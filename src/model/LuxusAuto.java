/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author gerge
 */
public class LuxusAuto extends Kategoria {

    private double szinVesztes;

    public LuxusAuto(String Nev) {
        super(Nev);
        szinVesztes = 100;
    }

    public void setSzinVesztes(double szinVesztes) {
        this.szinVesztes = szinVesztes;
    }

    public double getSzinVesztes() {
        return szinVesztes;
    }
    @Override
    public void AlapMosas() {
        szinVesztes *= .95;
    }

    @Override
    public void SilverMosas() {
        szinVesztes *= .97;
    }

    @Override
    public void GoldMosas() {
        szinVesztes *= .985;
    }
    
}
