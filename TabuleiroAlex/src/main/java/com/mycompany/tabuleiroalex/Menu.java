/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tabuleiroalex;

import java.util.Scanner;

public class Menu {

    private Tabuleiro table;

    public Menu() {

        table = null;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        do {
            System.out.print("Escolha uma das opções: \n"
                    + "1 - Criar Tabuleiros\n"
                    + "2 - Ver estado do Tabuleiro\n"
                    + "3 - Mover Peças\n"
                    + "4 - Exit\n");

            System.out.println("Opção: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Creating a new table...");
                    table = new Tabuleiro();
                    break;
                case 2:
                    if (table == null) {
                        System.out.println("No table has been created yet.");
                    } else {
                        System.out.println("Table:");
                        table.show();
                    }
                    break;
                case 3:
                    if (table == null) {
                        System.out.println("No table has been created yet.");
                    } else {
                        System.out.println("Swapping positions...");
                        System.out.print("Enter the first position (row col): ");
                        int row1 = scanner.nextInt();
                        int col1 = scanner.nextInt();
                        System.out.print("Enter the second position (row col): ");
                        int row2 = scanner.nextInt();
                        int col2 = scanner.nextInt();
                        table.movePiece(row1, col1, row2, col2);
                    }
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Wrong");
                    break;
            }
        } while (option != 4);

    }

}
