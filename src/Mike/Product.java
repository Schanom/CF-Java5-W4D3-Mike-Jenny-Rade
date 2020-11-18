package Mike;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Product {
    public String name;
    public double price;
    public int quantity;
    public String description;

    public Product(String name, double price, int quantity, String description) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", description='" + description + '\'' +
                '}';
    }

    public static void printReport(ArrayList<Product> products){
        try {
            File file = new File("reportMike.txt"); // Create file
            if (file.createNewFile()) { // Use createNewFile() method
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println(file.getName() + " already exists");
            }
        } catch (Exception e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
        try {
            FileWriter fileWrite = new FileWriter("reportMike.txt");
                for(int i = 0;i < products.size(); i++){
                    fileWrite.write(products.get(i).name + " | " + products.get(i).price + " | " + products.get(i).quantity + " | " + products.get(i).description + "\n");
                }
            fileWrite.close();
            System.out.println("Successfully wrote to file ");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Product voeslauer = new Product("Voeslauer", 0.99, 100, "It's sparkling water.");
        Product nutella = new Product("Nutella", 3.99, 20, "Chocolate, half sugar, half palm oil, fully delicious.");
        Product ramen = new Product("Ramen noodles", 0.99, 10, "Noodles, cheap and delicious.");

        ArrayList<Product> products = new ArrayList<>();
        products.add(nutella);
        products.add(voeslauer);
        products.add(ramen);



        printReport(products);

        DeleteFile deleteFile = new DeleteFile();
        //deleteFile.deleteFile("reportMike.txt");

    }

}
