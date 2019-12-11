
package javamt17;

public class EkranTelefona {
    private double sirina, visina;

    public EkranTelefona() {
    }

    public EkranTelefona(double sirina, double visina) {
        this.sirina = sirina;
        this.visina = visina;
    }

    public double getSirina() {
        return sirina;
    }

    public void setSirina(double sirina) {
        this.sirina = sirina;
    }

    public double getVisina() {
        return visina;
    }

    public void setVisina(double visina) {
        this.visina = visina;
    }
    public double getDijagonala(){
        return Math.sqrt(Math.pow(sirina,2.0) + Math.pow(visina,2.0));
        
    }
    
    public static void zameniMesta(EkranTelefona a, EkranTelefona b){
        double temp = a.sirina;
        a.sirina = b.sirina;
        b.sirina = temp;
        
       temp = a.visina;
       a.visina = b.visina;
       b.visina = temp;
    
    }
}
