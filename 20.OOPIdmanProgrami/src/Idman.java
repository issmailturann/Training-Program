
public final class Idman {
    
    private int burpee, sinav, mekik, squat;
    
    public Idman(int burpee, int sinav, int mekik, int squat) {
        setBurpee(burpee);
        setSinav(sinav);
        setMekik(mekik);
        setSquat(squat);
    }
    
    public void setBurpee(int burpee) {
        this.burpee = burpee < 0 ? 0 : burpee;
    }
    public void setSinav(int sinav) {
        this.sinav = sinav < 0 ? 0 : sinav;
    }
    public void setMekik(int mekik) {
        this.mekik = mekik < 0 ? 0 : mekik;
    }
    public void setSquat(int squat) {
        this.squat = squat < 0 ? 0 : squat;
    }
    
    public int getBurpee() {
        return burpee;
    }
    public int getSinav() {
        return sinav;
    }
    public int getMekik() {
        return mekik;
    }
    public int getSquat() {
        return squat;
    }
    
    public void burpeeYap(int sayi) {
        
        if(burpee == 0) {
            System.out.println("Tebrikler, Yapman Gereken Tüm Burpee Hareketini Yaptın. Başka Bir Idmana Bakabilirsin!");
            return;
        }
        
        if(burpee - sayi >= 0) {
            burpee -= sayi;
            
            System.out.println(sayi + " Adet Burpee Hareketin Tamamlandı. Kalan: " + burpee);
        }
        else {
            int fazlaHareket = Math.abs(burpee - sayi);
            burpee = 0;
            
            System.out.println("Tebrikler! Tüm Burpee Hareketlerini Tamamladın."
                    + "\nAncak Fazladan " + fazlaHareket + " adet Burpee Hareketi Yaptın. Biraz Dinlen!");
        }
        
    }
    
    public void sinavYap(int sayi) {
        
        if(sinav == 0) {
            System.out.println("Tebrikler, Yapman Gereken Tüm Sinav Hareketini Yaptın. Başka Bir Idmana Bakabilirsin!");
            return;
        }
        
        if(sinav - sayi >= 0) {
            sinav -= sayi;
            
            System.out.println(sayi + " Adet Sinav Hareketin Tamamlandı. Kalan: " + sinav);
        }
        else {
            int fazlaHareket = Math.abs(sinav - sayi);
            sinav = 0;
            
            System.out.println("Tebrikler! Tüm Sinav Hareketlerini Tamamladın."
                    + "\nAncak Fazladan " + fazlaHareket + " adet Sinav Hareketi Yaptın. Biraz Dinlen!");
        }
        
    }
    
    public void mekikYap(int sayi) {
        
        if(mekik == 0) {
            System.out.println("Tebrikler, Yapman Gereken Tüm Mekik Hareketini Yaptın. Başka Bir Idmana Bakabilirsin!");
            return;
        }
        
        if(mekik - sayi >= 0) {
            mekik -= sayi;
            
            System.out.println(sayi + " Adet Mekik Hareketin Tamamlandı. Kalan: " + mekik);
        }
        else {
            int fazlaHareket = Math.abs(mekik - sayi);
            mekik = 0;
            
            System.out.println("Tebrikler! Tüm Mekik Hareketlerini Tamamladın."
                    + "\nAncak Fazladan " + fazlaHareket + " adet Mekik Hareketi Yaptın. Biraz Dinlen!");
        }
        
    }
    
    public void squatYap(int sayi) {
        
        if(squat == 0) {
            System.out.println("Tebrikler, Yapman Gereken Tüm Squat Hareketini Yaptın. Başka Bir Idmana Bakabilirsin!");
            return;
        }
        
        if(squat - sayi >= 0) {
            squat -= sayi;
            
            System.out.println(sayi + " Adet Squat Hareketin Tamamlandı. Kalan: " + squat);
        }
        else {
            int fazlaHareket = Math.abs(squat - sayi);
            squat = 0;
            
            System.out.println("Tebrikler! Tüm Squat Hareketlerini Tamamladın."
                    + "\nAncak Fazladan " + fazlaHareket + " adet Squat Hareketi Yaptın. Biraz Dinlen!");
        }
        
    }
    
    public void hareketEt(String hareket, int adet) {
        
        if(hareket.equals("Burpee")) {
            burpeeYap(adet);
        }
        else if(hareket.equals("Sinav")) {
            sinavYap(adet);
        }
        else if(hareket.equals("Mekik")) {
            mekikYap(adet);
        }
        else if(hareket.equals("Squat")) {
            squatYap(adet);
        }
        else {
            System.out.println("Yanlis Veri Girisi Tespit Edilmistir!");
        }
        
    }
    
    public boolean idmanBittimi() {
        
        return (burpee == 0) && (sinav == 0) && (mekik == 0) && (squat == 0);
        
    }

    @Override
    public String toString() {
        return "\n*** Hareket Bilgilerim *** \nBurpee: " + burpee + "\nSinav: " + sinav + "\nMekik: " + mekik + "\nSquat: " + squat + "\nAdet Hareketiniz Bulunmaktadir.";
    }
    
}
