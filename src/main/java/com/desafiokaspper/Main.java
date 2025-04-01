package com.desafiokaspper;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

// Classe Produto que define as propriedades do produto
class Product {
    private static int contador = 1; // Contador global e estático
    int id;
    String name;
    double price;
    int quantity;

    // Construtor para inicializar um produto
    Product(String name, double price, int quantity) {
        this.id = contador++; // Gera um ID único sequencial
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public int getId() {
        return id;
    }


    // add amount
    public void updateQuantity(int amount) {
        this.quantity += amount; // Atualiza a quantidade (soma ou subtrai)

        // Garante que a quantidade nunca fique negativa
        if (this.quantity < 0) {
            this.quantity = 0;
        }
    }
    // Método para exibir as informações do produto
    @Override
    public String toString() {
        return "ID: " + id +", Nome: " +  name + " - R$ " + price + " (Qtd: " + quantity + ")";
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
    void removeProduct(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.remove(i);
                System.out.println("Produto removido!");
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    // Método para atualizar a quantidade de um produto no estoque
    void updateProductQuantity(int id, int newQuantity) {
        for (Product p : products) {
            if (p.getId() == id) {
                p.updateQuantity(newQuantity);
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
                System.out.print("Digite o ID do produto para remover: ");
                int idToRemove = scanner.nextInt();
                stock.removeProduct(idToRemove);
            } else if (option == 3) {
                // Exibir Estoque
                stock.displayStock();
            }  else if (option == 4) {
                // Atualizar Quantidade de Produto
                System.out.print("Digite o ID do produto para atualizar a quantidade: ");
                int idToUpdate = scanner.nextInt();

                System.out.print("Digite o valor a adicionar ou remover (use número negativo para remover): ");
                int amount = scanner.nextInt();

                boolean found = false;
                for (Product p : stock.products) {
                    if (p.getId() == idToUpdate) {
                        p.updateQuantity(amount); // Agora este método existe!
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Produto não encontrado!");
                }



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
