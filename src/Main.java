/*import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
        public static void main(String[] args) {
            List <String> a1=new ArrayList<String>();
            a1.add("Kakarla");
            a1.add("Reddy");
            a1.add("Subbarayudu");
            a1.add("Piramma");
            a1.add("Reddaiah");
            ListIterator<String> itr= a1.listIterator();
            System.out.println("Print forward");
            while (itr.hasPrevious()){
                System.out.println(itr.next());
            }
  System.out.println("Print reverse");
            while (itr.hasPrevious()) {
                System.out.println(itr.previous());
            }
        }
    }
 */

// Main class to test the GymMembership and PremiumMembership classes
public class Main {
    public static void main(String[] args) {
        // Create an instance of GymMembership
        GymMembership basicMember = new GymMembership("Njeri Inka", "Monthly", 6);

        // Create an instance of PremiumMembership
        PremiumMembership premiumMember = new PremiumMembership("Willy Diantha", "Annual", 12, true, true);

        // Display details of the basic membership
        System.out.println("Basic Membership Details:");
        basicMember.displayDetails();

        // Display details of the premium membership
        System.out.println("\nPremium Membership Details:");
        premiumMember.displayDetails();
}
}