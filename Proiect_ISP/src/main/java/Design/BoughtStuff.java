package Design;

import java.util.ArrayList;

import Components.BaseComponent;

public class BoughtStuff {

    private static final ArrayList<BaseComponent> boughtStuff = new ArrayList<>();

    public static void addComponent(BaseComponent ComponentToBeAdded) {

        boughtStuff.add(ComponentToBeAdded);

    }

    public static void viewBoughtStuff() {
        for (BaseComponent obj : boughtStuff) {
            System.out.println(obj.toString());
        }
    }

    public static int getTotalCost() {
        int totalCost = 0;
        for (BaseComponent obj : boughtStuff) {
            switch (obj.toString()) {
                case "RADEON 6900XT":
                    totalCost += 11000;
                    break;

                case "CorsairVengenance":
                    totalCost += 600;
                    break;

                case "I9 10700K":
                    totalCost += 1600;
                    break;

                case "HyperXFury":
                    totalCost += 500;
                    break;

                case "Ryzen 5 3600":
                    totalCost += 1100;
                    break;

                case "RTX 3090":
                    totalCost += 14000;
                    break;

            }
        }

        System.out.println("Total price: " + totalCost + "RON");

        return totalCost;
    }
}
