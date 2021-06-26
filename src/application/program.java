package application;

import entities.product;
import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        product product = new product();
        System.out.println("Enter product data:");
        System.out.print("Name: ");
        product.name = sc.nextLine();//produto.nome e uma espece de endereco onde na classe produto variavel nome esta que nao e qui
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");

        product.quantity = sc.nextInt();
        System.out.println("Product data: " + product);//="Product data: " + product.toString():forma abreviada

        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();// quantity de fora que ira se fundir com a quantity da classe product
        product.addProducts(quantity);//mandou como parametro para a this.qunatity
        System.out.println("Updated data: " + product);

        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println("Updated data: " + product);

        sc.close();
    }
}
