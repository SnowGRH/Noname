package AutoMoso;

public abstract class Auto {
    
    private String marka;
    private boolean tiszta;
    
    public Auto(String marka){
        this.marka = marka;
        tiszta = false;
    }

    public String getMarka() {
        return marka;
    }

    public boolean isTiszta() {
        return tiszta;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setTiszta(boolean tiszta) {
        this.tiszta = tiszta;
    }
    
    
    
    
}
