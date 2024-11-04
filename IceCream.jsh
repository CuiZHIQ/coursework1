import java.util.Scanner;

Scanner sc = new Scanner(System.in);
int vanilla = 55; 
int chocolate = 37; 
int strawberry = 80; 
System.out.println("Would you like (v)anilla, (c)hocolate or (s)trawberry?");
String flavour = sc.nextLine();
if (!flavour.equals("v") && !flavour.equals("c") && !flavour.equals("s")) {
    System.out.println("We don't have that flavour.");
    return;
}
System.out.println("How many scoops would you like?");
int scoops = sc.nextInt();
if (scoops < 1) {
    System.out.println("We don't sell just a cone.");
    return;
} else if (scoops > 3) {
    System.out.println("That's too many scoops to fit in a cone.");
    return;
}
int price = 100; 
switch (flavour) {
    case "v": price += vanilla * scoops; break;
    case "c": price += chocolate * scoops; break;
    case "s": price += strawberry * scoops; break;
}
System.out.printf("That will be %.2f please.\n", price/100.0);