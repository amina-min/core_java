
package trainTicket.company;
import java.util.Scanner;

public class TrainProject{

    static float[] dollars = {100, 50, 20, 10, 5, 1, .25f, .10f, .05f};
    static int[][] ticket_left = new int[3][4];
    static String[] cities = {"New_Jersey", "New_York"};

    static boolean isValidDollars(float dollar) {
        for (float item : dollars) {
            if (item == dollar) {
                return true;
            }
        }
        return false;
    }

    static void printTicketsAvailability() {
        for (int i = 1; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                if (ticket_left[i][j] == 0) {
                    System.out.println(cities[i - 1] + " ticket class " + (char)('A' + j) + " are SOLD OUT.");
                }
            }
        }
    }

    static String ticketTypeAvailable(int city) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i <= 2; i++) {
            if (ticket_left[city][i] > 0) {
                String ticket = String.valueOf(1+i) + ":" + (char)('A' + i);
                if (!builder.isEmpty()) {
                    builder.append(", ");
                }
                builder.append(ticket);
            }
        }

        return builder.toString();
    }

    static boolean isValidCity(int city) {
        if (!(city == 1 || city == 2)) {
            return false;
        }
        return (ticket_left[city][0] + ticket_left[city][1] + ticket_left[city][2]) > 0;
    }

    static boolean isValidTicketClass(int city, char ticket_class) {
        if (!(ticket_class == 'A' || ticket_class == 'B' || ticket_class == 'C')) {
            return false;
        }
        return ticket_left[city][ticket_class - 'A'] > 0;
    }

    static String cityAvailable() {
        StringBuilder builder = new StringBuilder();
        for(int city = 1 ; city  <= 2; city++ ) {
            int total_city_ticket = (ticket_left[city][0] + ticket_left[city][1] + ticket_left[city][2]);
            if(total_city_ticket > 0) {
                if(!builder.isEmpty()) {
                    builder.append(", ");
                } else {
                }
                builder.append("" + city + ". " + cities[city-1]);
            }
        }
        return  builder.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int city;
        char ticket_class;
        float[][] costs = new float[3][4];
        costs[1][0] = 15.00f;
        costs[1][1] = 17.75f;
        costs[1][2] = 20.90f;

        costs[2][0] = 17.50f;
        costs[2][1] = 19.75f;
        costs[2][2] = 22.50f;

        int available_each_type = 1;

        for (int i = 1; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                ticket_left[i][j] = available_each_type;
            }
        }

        int total_ticket = available_each_type * 6;

        while (total_ticket > 0) {

            printTicketsAvailability();

            do {
                System.out.print("Which state you buy ticket to:(" + cityAvailable() +"):");
                city = scan.nextInt();
                System.out.println();
            } while (!isValidCity(city));

            do {
                System.out.print("Which ticket class you want to buy(" + ticketTypeAvailable(city) + "):");
                ticket_class = scan.next().charAt(0);
                System.out.println();
            } while (!(isValidTicketClass(city, ticket_class)));

            float cost = costs[city][ticket_class - 'A'];

            System.out.printf("The price of %s ticket class %c is: %.2f\n"  , cities[city-1], ticket_class, cost );
            System.out.print("Please put money in the machine: $");
            float total_money = 0;

            while (total_money < cost) {
                float money = scan.nextFloat();
                if (isValidDollars(money)) {
                    total_money += money;
                } else {
                    System.out.print("Rejected, ");
                }

                if(total_money < cost) {
                    System.out.printf("You have $%.2f, put more: $",total_money);
                }
            }

            System.out.println("\n\nThank you.\nPlease Take your ticket.");

            if (total_money > cost) {
                System.out.printf("Your change is $%.2f, please take them\n",(total_money - cost));
            }
            System.out.println();
            total_ticket--;
            ticket_left[city][ticket_class - 'A']--;
        }

        System.out.println("Machine closed: SOLD OUT");
        scan.close();
    }
}

