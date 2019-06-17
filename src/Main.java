import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {



    public static void main(String[] args) {

        int option;
        Sub s1 = new Sub("Summer", 11, 300);
        Sub s2 = new Sub("Summer", 11, 300);
        Sub s3 = new Sub("Summer", 11, 300);
        Sub s4 = new Sub("Summer", 11, 300);

        Scanner input = new Scanner(System.in);
        Client c1 = new Client("Alex", 21, 72334, s1);
        Client c2 = new Client("Sasho", 33, 32394,s2);
        Client c3 = new Client("Marin", 45, 22375,s3);
        Client c4 = new Client("Lexy", 61, 92387,s4);
        //AGGREGATION CONTINUE
        List<Client> clients = new ArrayList<>();
        clients.add(c1);
        clients.add(c2);
        clients.add(c3);
        clients.add(c4);
        //SUBSCRIPTION


        Gym first = new Gym("McFit", "Poznan", 13, 0, "Maverick", clients);



        System.out.println("MENU OPTIONS: ");
        System.out.println("1 - ADD A NEW CLIENT");
        System.out.println("2 - SHOW ALL CLIENTS INFORMATION");
        System.out.println("3 - GET INFORMATION ABOUT CLIENT BY HIS NAME");
        System.out.println("4 - GET TOTAL AMOUNT OF INCOME VIA SUBSCRIPTIONS");
        System.out.println("0 - END THE PROGRAM AND GET TOTAL AMOUNT OF CLIENTS");

        for (;;) {
            System.out.print("What to do?: ");
            option = Integer.parseInt(input.nextLine());
            //ADDING NEW CLIENT
            if (option == 1) {
                String name;
                int age;
                int number;
                System.out.println("Enter client name: ");
                name = input.nextLine();
                System.out.println("Enter client age: ");
                age = Integer.parseInt(input.nextLine());
                System.out.println("Enter client number: ");
                number = Integer.parseInt(input.nextLine());
                String nameSub;
                int duration;
                int monthPay;
                System.out.println("Enter client`s name of  a subscription: ");
                nameSub = input.nextLine();
                System.out.println("Enter client`s duration of a subscription: ");
                duration = Integer.parseInt(input.nextLine());
                System.out.println("Enter client`s month payment of a subscription: ");
                monthPay = Integer.parseInt(input.nextLine());
                Sub s5 = new Sub(nameSub, duration, monthPay);
                Client cl = new Client(name, age, number, s5);
                clients.add(cl);
            }//END PROGRAM AND SHOW NUMBER OF CLIENTS
             else if (option == 0) {
                System.out.println(first.clientsNum());
                break;
            }//CLIENTS INFO
             else if(option == 2) {
                System.out.println("LIST OF ALL CLIENTS: ");
                for(int i = 0; i < clients.size(); i++) {
                    System.out.println(clients.get(i));
                }
            }//INFO ABOUT PICKED CLIENT
             else if(option == 3) {
                for (int i = 0; i < clients.size(); i++) {
                        System.out.println(clients.get(i).getName());
                    }
                System.out.println("ENTER THE NAME OF A CLIENT: ");
                String name;
                name = input.nextLine();
                for (int i = 0; i < clients.size(); i++) {
                    if (clients.get(i).getName().equals(name)) {
                        System.out.println(clients.get(i));
                    }
                }
            }else if(option == 4 ) {
                int[] totalClientPayments = new int[first.clientsNum()];
                for(int i = 0; i < clients.size(); i++) {
                    int totalForClient = 0;
                    int months=clients.get(i).getSubscription().duration;
                    int price=clients.get(i).getSubscription().monthPay;
                    totalForClient =Sub.totalPay(months, price);

                }

                System.out.println("ENTER EVERY CLIENT TOTAL PAYMENT: ");
                for (int j =0; j<first.clientsNum();j++) {
                    int totalClientPayment;
                    totalClientPayment = Integer.parseInt(input.nextLine());
                    totalClientPayments[j] =  totalClientPayment;
                }
                for (int i =0; i<totalClientPayments.length; i++) {
                    System.out.println(totalClientPayments[i]);
                }
                System.out.println("TOTAL OF ALL CLIENTS PAYMENTS: ");
                System.out.println(Sub.subsIncome(totalClientPayments));
//                System.out.println(total);
            }


        }

//        for(int i = 0; i < clients.size(); i++) {
//        for(int i = 0; i < clients.size(); i++) {
//
//            System.out.println(clients.get(i).getSubscription().monthPay);
//        }
//        }


    }

}
