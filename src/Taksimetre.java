import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kilometre giriniz: ");
        double km = input.nextDouble();
        double kmucreti= 2.20 , acilis=10, min=20, a;
        double total= km*kmucreti+acilis;
        a = (total<=20)? 20: total;
        System.out.println("Ücret: "+a);


    }
}
