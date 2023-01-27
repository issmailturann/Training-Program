
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        Idman object = new Idman(10, 10, 10, 10);
        
        int secim, adet;
        String hareketAd;
        
        System.out.println("*** Ozdeniz Fitnees ***");
        System.out.println("**** Hosgeldiniz ****\n");
        
        while(!(object.idmanBittimi())) {
            
            System.out.println("1. Hareket Bilgilerini Ogren \n2. Burpee Hareketini Yap \n3. Şınav Çek "
                    + "\n4. Mekik Çek \n5. Squat Hareketini Yap \n6. Çıkış");
            System.out.print("Lutfen Bir Secim Yapiniz: ");
            secim = input.nextInt();
            
            switch(secim) {
                
                case 1: {
                    System.out.println(object);
                    System.out.println();
                    break;
                }
                case 2: {
                    hareketAd = "Burpee";
                    System.out.print("\nKac Adet Burpee Hareketi Yapmak İstersiniz?: ");
                    adet = input.nextInt();
                    
                    object.hareketEt(hareketAd, adet);
                    System.out.println();
                    
                    break;
                }
                case 3: {
                    hareketAd = "Sinav";
                    System.out.print("\nKac Adet Sinav Hareketi Yapmak İstersiniz?: ");
                    adet = input.nextInt();
                    
                    object.hareketEt(hareketAd, adet);
                    System.out.println();
                    
                    break;
                }
                case 4: {
                    hareketAd = "Mekik";
                    System.out.print("\nKac Adet Mekik Hareketi Yapmak İstersiniz?: ");
                    adet = input.nextInt();
                    
                    object.hareketEt(hareketAd, adet);
                    System.out.println();
                    
                    break;
                }
                case 5: {
                    hareketAd = "Squat";
                    System.out.print("\nKac Adet Squat Hareketi Yapmak İstersiniz?: ");
                    adet = input.nextInt();
                    
                    object.hareketEt(hareketAd, adet);
                    System.out.println();
                    
                    break;
                }
                case 6: {
                    System.out.println("\nHareketlerinizi Bitirmeden Cikis Yapmak Istediniz!!!");
                    System.out.println("\n*** Cikis Yapiliyor! ***\n");
                    System.exit(0);
                }
                default: {
                    System.out.println("Yanlis Veri Girisinde Bulundunuz!\n");
                }
                
            }
            
        }
        
        System.out.println("Yapmaniz Gereken Tum Hareketleri Gerceklestirdiniz!");
        System.out.println("Sagliniz Icin Sistemden Cikis Yapiliyor!");
        System.out.println("\n*** Cikis Yapiliyor! ***\n");
        
    }
    
}
