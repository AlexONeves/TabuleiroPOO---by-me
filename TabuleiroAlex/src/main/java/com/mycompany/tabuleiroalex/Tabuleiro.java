/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tabuleiroalex;

public class Tabuleiro {

    private Peças[][] Tabuleiro;

    public Tabuleiro() {
        Tabuleiro = new Peças[8][8];
        reset();
    }

    public void reset() {

        int valor = 1;
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if (valor <= 9) {
                    Tabuleiro[row][col] = new Peças(valor, row, col);
                    valor++;
                } else {
                    Tabuleiro[row][col] = new Peças(0, row, col);
                }
            }
        }
    }

    public void show() {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                System.out.print(Tabuleiro[row][col].getValue() + " ");
            }
            System.out.println();
        }
    }

    public boolean movePiece(int row1, int col1, int row2, int col2) {
        if (Tabuleiro[row1][col1].moveTo(row2, col2, Tabuleiro)) {
            return true;
        } else {
            System.out.println("Movimento Invalido");
            return false;
        }
    }

}
