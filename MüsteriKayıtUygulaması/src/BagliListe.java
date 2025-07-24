
import java.util.Scanner;


public class BagliListe {
    MusteriNode head=null;
    MusteriNode tail=null;
    
  Scanner scan=new Scanner(System.in);  
    int id;
    String ad;
    String soyad;
    String tel;
    String adres;
    String urun;
  
      
    void ekle(){
        System.out.println("musterinin bilgilerini giriniz ");
        System.out.println("numarasi:   ");id=scan.nextInt();
        System.out.println("ad:   ");ad=scan.nextLine();
        System.out.println("soyad:   ");soyad=scan.nextLine();
        System.out.println("tel:   ");tel=scan.nextLine();
        System.out.println("adres:   ");adres=scan.nextLine();
        System.out.println("urun:   ");urun=scan.nextLine();
        
        MusteriNode eleman=new MusteriNode(id,ad,soyad,tel,adres,urun);
        
        if(head==null){
            head=eleman;
            tail=eleman;
            System.out.println("LISTE OLUSTU,ilk musteri eklendi");
        }
        else{
            eleman.next=head;
            head.prev=eleman;
            System.out.println(id + " ,numaralı müsteri eklendi ");
        }
    
}
    void sil(){
        boolean sonuc=false;
        
        if(head==null){
            System.out.println("LİSTE BOS");
        }
        else{
          System.out.println("silinecek musterinin numarasi giriniz ");
        System.out.println("numarasi:   ");id=scan.nextInt();
         
        if(head.next==null && head.id==id){
            head=null;
            tail=null;
            System.out.println(id + " nolu musteri silindi ");
            sonuc=true;
            
        }
        else if(head.next!=null && head.id==id){
            head.next=head;
            head.prev=null;
            System.out.println(id + " numarali musteri silindi ");
            sonuc=true;
        }
        else if(tail.id==id){
            tail.prev=tail;
            tail.next=null;
            System.out.println(id + " numarali musteri silindi");
            sonuc=true;
        }
        else{
            MusteriNode temp=head;
            
            while(temp!=null){
                if(temp.id==id){
                    temp.next.prev=temp.prev;
                    temp.prev.next=temp.next;
                    sonuc=true;
                    break;
                    
                }
                temp=temp.next;
            }
        }
        
        if(!sonuc){
            System.out.println(id + " numarali musteri yok");
        }
        }
    
}
    
    void guncelle(){
        boolean sonuc=false;
        
        if(head==null){
            System.out.println("LİSTE BOS");
        }
        else{
          System.out.println("guncellenecek musterinin numarasi giriniz ");
        System.out.println("numarasi:   ");id=scan.nextInt();
         
      
            MusteriNode temp=head;
            
            while(temp!=null){
                if(temp.id==id){
                    System.out.println(id + "numaralı musterinin bilgileri: ");
                    System.out.println("ad:   "+temp.ad);
                     System.out.println("soyad:   "+temp.soyad);
                    System.out.println("adres:   "+temp.adres);
                    System.out.println("tel:   "+temp.tel);
                     System.out.println("urun:   "+temp.urun);

                     System.out.println("urun bilgisini guncelleyiniz:  ");
                    temp.urun=scan.next();
                    System.out.println("urun bilgisi guncellendi");

                    sonuc=true;
                    break;
                    
                }
                temp=temp.next;
            }
        }
        
        if(!sonuc){
            System.out.println(id + " numarali musteri yok");
        }
        }
    void MusteriAra(){
        boolean sonuc=false;
        
        if(head==null){
            System.out.println("LİSTE BOS");
        }
        else{
          System.out.println("aranacak musterinin numarasi giriniz ");
        System.out.println("numarasi:   ");id=scan.nextInt();
         
      
            MusteriNode temp=head;
            
            while(temp!=null){
                if(temp.id==id){
                    System.out.println(id + "numarali musterinin bilgileri: ");
                    System.out.println("ad:   "+temp.ad);
                     System.out.println("soyad:   "+temp.soyad);
                    System.out.println("adres:   "+temp.adres);
                    System.out.println("tel:   "+temp.tel);
                     System.out.println("urun:   "+temp.urun);

                    sonuc=true;
                    break;
                    
                }
                temp=temp.next;
            }
        }
        
        if(!sonuc){
            System.out.println(id + " numarali musteri yok");
        }
        }
    void yazdir(){
        
        if(head==null){
            System.out.println("LİSTE BOS");
        }
        else{
         
            MusteriNode temp=head;
            
            while(temp!=null){
                    System.out.println(id + "numarali musterinin bilgileri: ");
                    System.out.println("ad:   "+temp.ad);
                     System.out.println("soyad:   "+temp.soyad);
                    System.out.println("adres:   "+temp.adres);
                    System.out.println("tel:   "+temp.tel);
                     System.out.println("urun:   "+temp.urun);

                    
                temp=temp.next;
            }
        }
        
       
        
        }
    
}
    
    
    
    
    
    
    
    

