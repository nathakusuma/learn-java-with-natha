import java.util.Scanner;

// Aji dan DomainBros
public class LiveCode1TiBSoal2 {

    public static void main(String[] args) {
        // INPUT
        Scanner scanner = new Scanner(System.in);
        String oldEmail = scanner.next();
        String username = scanner.next();
        String newDomain = scanner.next();
        double price = scanner.nextDouble();

        // PROCESS
        String tld = oldEmail.substring(oldEmail.length()-4);
        String newEmail = username+"@"+newDomain+tld;
        String newDomainWithTld = newDomain + tld;
        double priceTax = switch (tld) {
            case "id" -> 75;
            case ".com" -> 50;
            case "25" -> 25;
            default -> 0;
        };
        double newPrice = price + price * priceTax/100;

        // OUTPUT
        System.out.println("Nama email baru: "+newEmail);
        System.out.println("Nama domain untuk Aji: "+newDomainWithTld);
        System.out.printf("Total harga pembelian: %.2f$", newPrice);
    }

}
