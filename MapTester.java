

import java.util.Map;
import java.util.Scanner;

public class MapTester {

    static boolean running = true;

    public static void main(String[] args) {

        MapClass<Integer, Integer> list = new MapClass();

        while (running == true) {
            Scanner bobi = new Scanner(System.in);
            System.out.println(" 1: Add \n 2: Contains Key \n 3: Contains Value \n 4: Clear \n 5: Size \n 6: Remove \n 7: Is Empty \n 8: Print \n 9: Exit \n");
            int selections = bobi.nextInt();

            //------------------------------------------------------------

            if (selections == 1) {
                Scanner bobia = new Scanner(System.in);
                System.out.println(" Enter Key");
                int a = bobia.nextInt();
                System.out.println(" Enter Value");
                int b = bobia.nextInt();
                list.put(a, b);
            }

            if (selections == 2) {
                Scanner bobic = new Scanner(System.in);
                System.out.println("Enter The Key");
                int a = bobic.nextInt();

                System.out.print(list.containsKey(a));
            }

            if (selections == 3) {
                Scanner bobic = new Scanner(System.in);
                System.out.println("Enter The Value");
                int a = bobic.nextInt();

                System.out.print(list.containsValue(a));
            }

            if (selections == 4) {
                list.clear();
            }

            if (selections == 5) {
                System.out.println(list.size());
            }

            if (selections == 6) {
                Scanner bobic = new Scanner(System.in);
                System.out.println("Enter The Key");
                int a = bobic.nextInt();

                System.out.print(list.remove(a));
            }

            if (selections == 7) {
                System.out.print(list.isEmpty());
            }

            if (selections == 8) {
                if (list.isEmpty()) {
                    System.out.println("Queue is Empty\n");
                } else {
                    System.out.println(list.print());
                }
            }

            if (selections == 9) {
                System.out.println("Program Ended/Exited");
                running = false;
            }
        }


    }

}


