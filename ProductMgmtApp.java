
import edu.miu.cs.cs489appsd.lab1a.productmgmtapp.model.Product;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Comparator;

public class ProductMgmtApp {
    public static void main(String[] args) {

        Product[] products = new Product[3];
        products[0] = new Product(3128874119L, "Banana", LocalDate.of(2023, 1, 24), 124, 0.55);
        products[1] = new Product(2927458265L, "Apple", LocalDate.of(2022, 12, 9), 18, 1.09);
        products[2] = new Product(9189927460L, "Carrot", LocalDate.of(2023, 3, 31), 89, 2.99);

        Arrays.sort(products, Comparator.comparing(Product::getName));

        printProducts(products, "JSON");

        printProducts(products, "XML");

        printProducts(products, "CSV");
    }

    public static void printProducts(Product[] products, String format) {
        System.out.println(format + "-formatted list of all Products:");
        for (Product product : products) {
            switch (format) {
                case "JSON":
                    System.out.println("{ \"productId\": " + product.getProductId() +
                            ", \"name\": \"" + product.getName() +
                            "\", \"dateSupplied\": \"" + product.getDateSupplied() +
                            "\", \"quantityInStock\": " + product.getQuantityInStock() +
                            ", \"unitPrice\": \"" + product.getFormattedUnitPrice() + "\" }");
                    break;
                case "XML":
                    System.out.println("<Product>" +
                            "<productId>" + product.getProductId() + "</productId>" +
                            "<name>" + product.getName() + "</name>" +
                            "<dateSupplied>" + product.getDateSupplied() + "</dateSupplied>" +
                            "<quantityInStock>" + product.getQuantityInStock() + "</quantityInStock>" +
                            "<unitPrice>" + product.getFormattedUnitPrice() + "</unitPrice>" +
                            "</Product>");
                    break;
                case "CSV":
                    System.out.println(product.getProductId() + "," +
                            product.getName() + "," +
                            product.getDateSupplied() + "," +
                            product.getQuantityInStock() + "," +
                            product.getFormattedUnitPrice());
                    break;
                default:
                    System.out.println("Invalid format");
            }
        }
        System.out.println();
    }
}