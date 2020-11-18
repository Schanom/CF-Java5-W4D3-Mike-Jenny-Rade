package Jenny;

import java.io.*;
import java.util.ArrayList;

public class A5 {
    String name;
    double price;
    int quantity;
    String description;

    public A5(String name, double price, int quantity, String description) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.description = description;


    }

    @Override
    public String toString() {
        return "A5{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", description='" + description + '\'' +
                '}';
    }

    public static void printReport(File filePath, ArrayList<A5> supermarket) throws IOException {
        try (FileWriter fileWriter = new FileWriter(filePath)) {
            for (A5 a5 : supermarket) {
                fileWriter.write(a5.name + " | " + a5.price + " | " + a5.quantity + " | " + a5.description + '\n');
            }
        }
        System.out.println("Info added to the Report");
    }

    public static void main(String[] args) {
        try {
            ArrayList<A5> supermarket = new ArrayList<>();
            supermarket.add(new A5("Coca-Cola", 1, 6, "Taste the feeling"));
            supermarket.add(new A5("Oreo", 1.5, 2, "Cookies"));
            supermarket.add(new A5("Ben & Jerry", 5, 1, "Ice Ice baby"));
            supermarket.add(new A5("Joya Haferflocken Drink", 1.99, 1, "Vegan"));
            supermarket.add(new A5("Starbucks capsule", 3.49, 2, "It's always coffee time. "));

            printReport(new File("Report.txt"), supermarket);
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
