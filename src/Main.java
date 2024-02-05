import models.Customer;
import models.Item;
import models.Itemorder;
import models.Orders;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name ");
        String name = sc.nextLine();
        System.out.println("Enter customer ID");
        String id = sc.nextLine();

        Item i1 = new Item("Mo:Mo", 120);
        Item i2 = new Item("Burger", 110);
        Item i3 = new Item("Coke", 50);

        Item g = null;

        System.out.println("-----Select Items-----\n1) Mo:Mo ----- 120\n2) Burger --- 110\n3) Coke ----- 50");
        System.out.println("Enter the no of Items to order :");
        int n_items = sc.nextInt();
        int quanti = 0;
        System.out.println("Enter the numbers of items");
        for (int i = 1; i <= n_items; i++) {
            int selected_items = sc.nextInt();
            switch (selected_items) {
                case (1):
                    g = i1;
                    System.out.println("Enter quantity");
                    quanti = sc.nextInt();
                    break;
                case (2):
                    g = i2;
                    System.out.println("Enter quantity");
                    quanti = sc.nextInt();
                    break;
                case (3):
                    g = i3;
                    System.out.println("Enter quantity");
                    quanti = sc.nextInt();
                    break;
            }

        }

        Itemorder io1 = new Itemorder(g, quanti);

        List<Itemorder> ilist1 = new ArrayList<>();
        ilist1.add(io1);


        Orders o1 = new Orders(id, ilist1);

        List<Orders> customer1_orders = new ArrayList<>();
        customer1_orders.add(o1);

        Customer c1 = new Customer(name, 330, customer1_orders);


        System.out.println("Select the number to perform the tasks as mentioned: " + "\n 1) Get all the orders \n 2) Get orders this week");
        int operate =sc.nextInt();
        if (operate==1){
            c1.getall();
        }

    }
}