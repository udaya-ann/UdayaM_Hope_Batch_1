import java.util.*;

class Apartment {
    Apartment(int bedrooms) {
        if (bedrooms == 1) {
            System.out.println("Scenario 1:");
            System.out.println("Bedrooms: 1");
            System.out.println("Kitchen: 1");
            System.out.println("Public Restroom: 1");
            System.out.println("Living Room: 1");
            System.out.println("Playground: Common");
        } 
        else if (bedrooms == 2) {
            System.out.println("Scenario 2:");
            System.out.println("Bedrooms: 2");
            System.out.println("Attached Restrooms: 2");
            System.out.println("Living Room: 1");
            System.out.println("Kitchen: 1");
            System.out.println("Dining Hall: 1");
            System.out.println("Playground: Public");
        } 
        else if (bedrooms == 4) {
            System.out.println("Scenario 3:");
            System.out.println("Bedrooms: 4");
            System.out.println("Restrooms: 4");
            System.out.println("Halls: 2");
            System.out.println("Kitchen: 1");
            System.out.println("Dining Hall: 1");
            System.out.println("Playground: 1");
        } 
        else {
            System.out.println("Invalid bedroom count");
        }
        System.out.println();
    }
}

public class ApartmentCategory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        Apartment a = new Apartment(b);
    }
}