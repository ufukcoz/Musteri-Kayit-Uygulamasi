
import java.util.Scanner;


public class Uygulama {


    public static void main(String[] args) {
        BagliListe liste=new BagliListe();
        Scanner scan=new Scanner(System.in);
        int seçim=-1;
        while(seçim!=0){
            System.out.println("1-ekle");
            System.out.println("2-sil");
            System.out.println("3-ara");
            System.out.println("4-guncelle");
            System.out.println("5-yazdir");
            System.out.println("seciminiz : ");
            seçim=scan.nextInt();
            
            switch (seçim){
                case 1:liste.ekle();break;
                case 2:liste.sil();break;
                case 3:liste.MusteriAra();break;
                case 4:liste.guncelle();break;
                case 5:liste.yazdir();break;
                case 6:System.out.println("cikis yaptınız");;break;
                default:System.out.println("hatalı secim 0-5 arasi bir numara secin lutfen");
                
            }
            
        }
    }
    
}
