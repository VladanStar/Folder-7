
package javamt17;


public class MobilniTelefon {
    private String proizvodjac, model;
    private int godinaProizvodnje, kolicinaRAM, kolicinaDisk;
    private EkranTelefona ekran;

    public MobilniTelefon() {
    }

    public MobilniTelefon(String proizvodjac, String model, int godinaProizvodnje, int kolicinaRAM, int kolicinaDisk, EkranTelefona ekran) {
        this.proizvodjac = proizvodjac;
        this.model = model;
        this.godinaProizvodnje = godinaProizvodnje;
        this.kolicinaRAM = kolicinaRAM;
        this.kolicinaDisk = kolicinaDisk;
        this.ekran = ekran;
    }

    public String getProizvodjac() {
        return proizvodjac;
    }

    public void setProizvodjac(String proizvodjac) {
        this.proizvodjac = proizvodjac;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getGodinaProizvodnje() {
        return godinaProizvodnje;
    }

    public void setGodinaProizvodnje(int godinaProizvodnje) {
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public int getKolicinaRAM() {
        return kolicinaRAM;
    }

    public void setKolicinaRAM(int kolicinaRAM) {
        this.kolicinaRAM = kolicinaRAM;
    }

    public int getKolicinaDisk() {
        return kolicinaDisk;
    }

    public void setKolicinaDisk(int kolicinaDisk) {
        this.kolicinaDisk = kolicinaDisk;
    }

    public EkranTelefona getEkran() {
        return ekran;
    }

    public void setEkran(EkranTelefona ekran) {
        this.ekran = ekran;
    }
    
    public double ocenaPodobnosti(){
    if(ekran.getDijagonala() <5.0){
        return ekran.getDijagonala() * kolicinaRAM /(2020 - godinaProizvodnje);
    
    }
    else {
        return ekran.getDijagonala() * kolicinaDisk/(2020 - godinaProizvodnje);
    }
    }
    
    public static void zameniMesto(MobilniTelefon a, MobilniTelefon b){
        EkranTelefona.zameniMesta(a.ekran, b.ekran);
        
        String tempS = a.proizvodjac;
        a.proizvodjac = b.proizvodjac;
        b.proizvodjac = tempS;
        
       tempS  = a.model;
        a.model = b.model;
        b.model = tempS;
        
        int tempI = a.godinaProizvodnje;
        a.godinaProizvodnje = b.godinaProizvodnje;
        b.godinaProizvodnje = tempI;
        
        tempI = a.kolicinaDisk;
        a.kolicinaDisk = b.kolicinaDisk;
        b.kolicinaDisk = tempI;
        
        tempI = a.kolicinaRAM;
        a.kolicinaRAM = b.kolicinaRAM;
        b.kolicinaRAM = tempI;
        
    }
    @Override
     public String toString() {
         String zaPrikaz = "";
         
         zaPrikaz += String.format
        ("%-24s%-17s%-20s%-19s\n", 
                "proizvodjac: ",
                proizvodjac,
                "model: ",
                model
                
        );
         zaPrikaz += String.format(
                 "%-24s%13d    %-20s%16.2f PP\n", 
                 "Godina proizvodnje",
                 godinaProizvodnje,
                 "Ocena podobnosti: ",
                ocenaPodobnosti()
                 );
         zaPrikaz += String.format(
                 "%-24s%5.2f x %5.2f in %-20s16.2f in\n ",
                 "sirina i visina ekrana",
                 ekran.getSirina(),
                 ekran.getVisina(),
                 "Dijagonala ekrana je: ",
                 ekran.getDijagonala()
                 );
         
         zaPrikaz += String.format(
                 "%-24s%13.2f MB%-20s%16.2f MB",
                 "%Kolicina RAM memorije",
                 kolicinaRAM/(1024.0 * 1024.0),
                 "Kolicina Skladista",
                 kolicinaDisk/(1024.0*1024.0)
                );
         
        return zaPrikaz;
     }
    
    /*@Override
    public String toString() {
        return "MobilniTelefon{" + "proizvodjac=" 
                + proizvodjac + ", model=" 
                + model + ", godinaProizvodnje=" 
                + godinaProizvodnje + ", kolicinaRAM="
                + kolicinaRAM + ", kolicinaDisk=" 
                + kolicinaDisk + ", ekran=" 
                + ekran + '}';
    }*/
   
}
