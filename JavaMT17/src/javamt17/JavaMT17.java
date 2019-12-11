
package javamt17;

import java.util.Scanner;

public class JavaMT17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Koliko telefona zelite da unesete: ");
        int broj = input.nextInt();
        input.nextLine();
       
        if(broj <1){
            System.out.println("Niste uneli ispravan broj!!!");
            return;
        }
        
        MobilniTelefon[] niz = new MobilniTelefon[broj];
        
        for(int i = 0; i<broj; i++){
            System.out.println("Unesite ime proizvodjaca: ");
            String proizvodjac = input.nextLine();
         
            System.out.println("Unesite naziv modela: ");
            String model = input.nextLine();
          
            System.out.println("Unesite godinu proizvodnje: ");
            int godinaProizvodnje = input.nextInt();
            
            if(godinaProizvodnje< 1995 || godinaProizvodnje > 2019){
                System.out.println("Nije ispravna godina proizvodnje!!!");
                return;
            }
            System.out.println("Unesite kolicinu RAM memorije: ");
            int kolicinaRAM = input.nextInt();
            if(kolicinaRAM < 1024){
            System.out.println("Ne razmatramo te telefone!!!");
            return;
        }
            System.out.println("Unesite kolicinu Disk prostora: ");
            int kolicinaDisk = input.nextInt();
            if(kolicinaDisk < 2048){
            System.out.println("Ne razmatramo te telefone!!!");
            return;
        }
            System.out.println("Unesite sirinu tekrana: ");
            double sirina = input.nextDouble();
            if(sirina< 2.0){
                System.out.println("Ne razmatramo te telefone!!!");
            return;
            }
            System.out.println("Unesite visinu ekrana: ");
            double visina = input.nextDouble();
            input.nextLine();
            if(visina < 2.0){
                System.out.println("Ne razmatramo te telefone!!!");
                return;
            }
             niz[i] = new MobilniTelefon(
                proizvodjac,
                model,
                godinaProizvodnje,
                kolicinaRAM,
                kolicinaDisk,
                new EkranTelefona(sirina, visina)
             );
        }
       sortiraj(niz);
       MobilniTelefon najbolji = niz[0];
       
        System.out.println("Telefon koji ima najbolju ocenu je: ");
        System.out.println(najbolji);
    }
    
    public static void sortiraj(MobilniTelefon[]niz){
        for(int j = 0; j <niz.length -1; j++){
            for(int i = 0; i< niz.length -1; i++){
                if(niz[i].ocenaPodobnosti()< niz[i+1].ocenaPodobnosti()){
                    MobilniTelefon.zameniMesto(niz[i], niz[i+1]);
                }
            }
        }
    
    }
    
    
}
