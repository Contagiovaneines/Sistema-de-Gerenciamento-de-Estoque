package com.desafiokaspper;

import java.util.ArrayList;
import java.util.Scanner;

// Classe Produto que define as propriedades do produto
class Product {
    String name;
    double price;
    int quantity;

    // Construtor para inicializar um produto
    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Método para exibir as informações do produto
    @Override
    public String toString() {
        return name + " - R$ " + price + " (Qtd: " + quantity + ")";
    }
}

// Classe Estoque que gerencia os produtos
class Stock {
    ArrayList<Product> products = new ArrayList<>();

    // Método para adicionar um novo produto ao estoque
    void addProduct(Product product) {
        for (Product p : products) {
            if (p.name.equalsIgnoreCase(product.name)) {
                p.quantity += product.quantity;
                System.out.println("Produto atualizado!");
                return;
            }
        }
        products.add(product);
        System.out.println("Produto adicionado!");
    }

    // Método para remover um produto do estoque
    void removeProduct(String name) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).name.equalsIgnoreCase(name)) {
                products.remove(i);
                System.out.println("Produto removido!");
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    // Método para atualizar a quantidade de um produto no estoque
    void updateProductQuantity(String name, int newQuantity) {
        for (Product p : products) {
            if (p.name.equalsIgnoreCase(name)) {
                p.quantity = newQuantity;
                System.out.println("Quantidade do produto atualizada!");
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    // Método para exibir todos os produtos no estoque
    void displayStock() {
        if (products.isEmpty()) {
            System.out.println("Estoque vazio.");
        } else {
            System.out.println("Produtos no estoque:");
            for (Product p : products) {
                System.out.println(p);
            }
        }
    }

    // Método para calcular o valor total do estoque
    double calculateTotalValue() {
        double totalValue = 0;
        for (Product p : products) {
            totalValue += p.price * p.quantity;
        }
        return totalValue;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stock stock = new Stock();

        // Adiciona produtos iniciais (pelo menos 3 produtos)
        stock.addProduct(new Product("Produto 1", 10.0, 5));
        stock.addProduct(new Product("Produto 2", 20.0, 3));
        stock.addProduct(new Product("Produto 3", 15.0, 10));

        // Opções do menu
        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Remover Produto");
            System.out.println("3. Exibir Estoque");
            System.out.println("4. Atualizar Quantidade de Produto");
            System.out.println("5. Calcular Valor Total do Estoque");
            System.out.println("6. Sair");
            System.out.print("Opção: ");
            int option = scanner.nextInt();
            scanner.nextLine();  // Consumir o caractere de nova linha

            if (option == 1) {
                // Adicionar Produto
                System.out.print("Digite o nome do produto: ");
                String name = scanner.nextLine();
                System.out.print("Digite o preço do produto: ");
                double price = scanner.nextDouble();
                System.out.print("Digite a quantidade: ");
                int quantity = scanner.nextInt();
                Product product = new Product(name, price, quantity);
                stock.addProduct(product);
            } else if (option == 2) {
                // Remover Produto
                System.out.print("Digite o nome do produto para remover: ");
                String nameToRemove = scanner.nextLine();
                stock.removeProduct(nameToRemove);
            } else if (option == 3) {
                // Exibir Estoque
                stock.displayStock();
            } else if (option == 4) {
                // Atualizar Quantidade de Produto
                System.out.print("Digite o nome do produto para atualizar a quantidade: ");
                String nameToUpdate = scanner.nextLine();
                System.out.print("Digite a nova quantidade: ");
                int newQuantity = scanner.nextInt();
                stock.updateProductQuantity(nameToUpdate, newQuantity);
            } else if (option == 5) {
                // Calcular Valor Total do Estoque
                double totalValue = stock.calculateTotalValue();
                System.out.println("Valor total do estoque: R$ " + totalValue);
            } else if (option == 6) {
                // Sair
                System.out.println("Saindo...");
                scanner.close();
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }
}
