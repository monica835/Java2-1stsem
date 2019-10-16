package medicineapp;

import java.util.Scanner;

public class Medicapp {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Medicine med = new Medicine();
        Pharmacy phar = new Pharmacy();
        Customer cm = new Customer();
        Users user = new Users();
        
        phar.addInfo(phar);

        while (true) {
            System.out.println("1. Login\n2. Register");
            System.out.print("Enter choice: ");
            int choice = input.nextInt();
            if (choice == 1) {
                user = user.login(user, phar);
                if (user == phar.getAdmin()) {
                    System.out.println("Logged in as pharmacist!");
                    while (true) {
                        System.out.println("1. View Medicines\n2. Add Medicine\n3. Remove Medicine\n4. View All Orders\n5. Logout");
                        System.out.print("Enter choice: ");
                        int option = input.nextInt();
                        if (option == 1) {
                            phar.getAdmin().viewMedicines(phar);
                        } else if (option == 2) {
                            phar.getAdmin().addMedicine(med, phar);
                        } else if (option == 3) {
                            phar.getAdmin().removeMedicine(med, phar);
                        } else if (option == 4) {
                            phar.getAdmin().viewAllOrders(user, phar);
                        } else if (option == 5) {
                            phar.getAdmin().logout(user);
                        } else {
                            System.out.println("Invalid choice!");
                        }
                    }
                } else {
                    System.out.println("You are now logged in as " + user.getClass().getSimpleName() + "!");
                    while (true) {
                        System.out.println("1. View Medicines\n2. View Orders\n3. Purchase\n4. Pay Purchases\n5. Logout");
                        System.out.print("Enter choice: ");
                        int option = input.nextInt();
                        if (option == 1) {
                            user.viewMedicines(phar);
                        } else if (option == 2) {
                            user.viewOrders(user, phar);
                        } else if (option == 3) {
                            user.orderMedicine(phar, user);
                        } else if (option == 4) {
                            if (user.getAge() <= 59 && user.getAge() >= 18) {
                                Adult adult = new Adult(user.getId(), user.getUserName(), user.getPassWord(), user.getAge());
                                adult.payOrder(cm, phar);
                                user = new Users(adult.getId(), adult.getUserName(), adult.getPassWord(), adult.getAge());
                            } else {
                                SeniorCitizen sc = new SeniorCitizen(user.getId(), user.getUserName(), user.getPassWord(), user.getAge());
                                sc.payWithDiscount(phar, sc);
                                user = new Users(sc.getId(), sc.getUserName(), sc.getPassWord(), sc.getAge());
                            }
                        } else if (option == 5) {
                            user.logout(user);
                            break;

                        } else {
                            System.out.println("Invalid choice!");
                        }

                    }

                }
            } else if (choice == 2) {
                phar.getUserList().add(user.register(user, phar));
            } else {
                System.out.println("Invalid choice!");
            }

        }

    }

}
