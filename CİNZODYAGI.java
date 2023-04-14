import java.util.Scanner;
public class CİNZODYAGI {
    public static void main(String [] args){
        Scanner inp=new Scanner(System.in);
        int dyili,kalan;
        System.out.println("Çin Zodyağı Hesaplayıcı");
        System.out.print("Doğum yılınızı giriniz: ");
        dyili= inp.nextInt();
        kalan=dyili%12;
        switch (kalan){
            case 0:System.out.println(" Çin Zodyağınız: MAYMUN");
            break;
            case 1:System.out.println(" Çin Zodyağınız: HOROZ");
            break;
            case 2:System.out.println(" Çin Zodyağınız: KÖPEK");
            break;
            case 3:System.out.println(" Çin Zodyağınız: DOMUZ");
                break;
            case 4:System.out.println(" Çin Zodyağınız: FARE");
                break;
            case 5:System.out.println(" Çin Zodyağınız: ÖKÜZ");
                break;
            case 6:System.out.println(" Çin Zodyağınız: KAPLAN");
                break;
            case 7:System.out.println(" Çin Zodyağınız: TAVŞAN");
                break;
            case 8:System.out.println(" Çin Zodyağınız: EJDERHA");
                break;
            case 9:System.out.println(" Çin Zodyağınız: YILAN");
                break;
            case 10:System.out.println(" Çin Zodyağınız: AT");
                break;
            case 11:System.out.println(" Çin Zodyağınız: KOYUN");
                break;
        }

    }
}
