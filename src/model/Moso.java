package model;

public class Moso {

    private Kategoria[] kategoria;
    private int db = 0;

    public Moso() {
    }

    
    public Moso(Kategoria[] kategoria) {
        this.kategoria = kategoria;
    }

    public void beker(Kategoria neve) {
        if (kategoria.length >= 5) {
            kategoria[db++] = neve;
        }
    }

    public void Alapmosas() {
        double szinVesztes;
        for (Kategoria kategoria1 : kategoria) {
            szinVesztes = kategoria1.getSzinVesztes();
            kategoria1.setSzinVesztes(szinVesztes * 0.95);
        }
    }

    public void Silvermosas() {
        double szinVesztes;
        for (Kategoria kategoria1 : kategoria) {
            szinVesztes = kategoria1.getSzinVesztes();
            kategoria1.setSzinVesztes(szinVesztes * 0.97);
        }

    }

    public void Goldmosas() {
        double szinVesztes;
        for (Kategoria kategoria1 : kategoria) {
            szinVesztes = kategoria1.getSzinVesztes();
            kategoria1.setSzinVesztes(szinVesztes * 0.985);
        }
    }
}
