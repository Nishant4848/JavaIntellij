package Question1;

import java.util.Scanner;

public class Work extends ListName {

    static Float fp(Float item_price, String item_type, int item_quantity) {

        float final_price = 0;

        if (item_type.equalsIgnoreCase("Manufactured")) {

            final_price = (float) (item_price + ((item_price * item_quantity * 20.5) /
                    100));
        } else if (item_type.equalsIgnoreCase("raw")) {
            final_price = (float) (item_price + ((item_price * item_quantity * 15.5) /
                    100));
        } else {
            return (float) 0;
        }

        return final_price;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter item name : ");
        n.add(sc.next());

        System.out.print("enter item price : ");
        try{
            p.add(sc.nextFloat());
        }
        catch(Exception e) {
            System.out.println("Wrong Input");
            System.out.println(e);
        }

        System.out.print("enter item quantity : ");
        try{
            q.add(sc.nextInt());
        }
        catch(Exception e) {
            System.out.println("Invalid Input");
            System.out.println(e);
        }

        System.out.print("enter item type : ");
        t.add(sc.next());
        System.out.println();
        System.out.print("Do you want to enter details of any other item (y/n): ");
        String a = sc.next();

        while (a.equals("y")) {

            System.out.println();
            System.out.println();
            System.out.print("enter item name : ");
            n.add(sc.next());

            System.out.print("enter item price : ");
            p.add(sc.nextFloat());

            System.out.print("enter item quantity : ");
            q.add(sc.nextInt());

            System.out.print("enter item type : ");
            t.add(sc.next());
            System.out.println();
            System.out.println();
            System.out.print("Do you want to enter details of any other item (y/n): ");
            a = sc.next();
        }

        System.out.println();

        for (int i = 0; i < n.size(); i++) {

            System.out.println("product name : " + n.get(i));
            System.out.println("product quantity : " + q.get(i));
            System.out.println("product price : " + p.get(i));

            if (t.get(i).equalsIgnoreCase("raw")) {
                System.out.println("product tax : " + "15.5 %");
                System.out.println("Final Price : " + fp(p.get(i), "raw", q.get(i)));
                System.out.println();
            } else {
                System.out.println("product tax : " + "20.5 %");
                System.out.println("Final Price : " + fp(p.get(i), "Manufactured", q.get(i)));
                System.out.println();
            }
        }
        System.out.println();
        sc.close();
    }
}
