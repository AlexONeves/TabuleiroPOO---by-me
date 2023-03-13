/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tabuleiroalex;

/**
 *
 * @author alexa
 */
public class Peças {

    private int value;
    private int row;
    private int col;

    public Peças(int value, int row, int col) {
        this.value = value;
        this.row = row;
        this.col = col;
    }

    public int getValue() {
        return value;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public boolean moveTo(int newRow, int newCol, Peças[][] Tabul) {

        if (newRow < 0 || newRow >= Tabul.length || newCol < 0 || newCol >= Tabul[0].length) {
            return false;
        }

        if (Tabul[newRow][newCol].getValue() != 0) {
            System.out.println("Movimento Invalido");
            return false;
        }

        Tabul[row][col] = new Peças(0, row, col);
        row = newRow;
        col = newCol;
        Tabul[row][col] = this;
        Tabul[row][col].value = value;

        this.row = newRow;
        this.col = newCol;

        return true;
    }

}
