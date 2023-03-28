import java.util.Scanner;

public class cdu {
    public static void main(String[] args) {
        double km;
        double hm;
        double dam;
        double m;
        double dm;
        double cm;
        double mm;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um valor em metros: ");
        m = teclado.nextDouble();

        km = (m / 1000);
        hm = (m / 100);
        dam = (m / 10);
        dm = (m * 10);
        cm = (m * 100);
        mm = (m * 1000);

        System.out.println("O valor " + m + "m equivale a:");
        System.out.println("- " + km + "km");
        System.out.println("- " + hm + "hm");
        System.out.println("- " + dam + "dam");
        System.out.println("- " + dm + "dm");
        System.out.println("- " + cm + "cm");
        System.out.print("- " + mm + "mm");

    }
}