package com.bridgelab;

import java.util.Scanner;

public class TicTacToe {
    static char[] board = new char[10];

    public static void TicTakToeInitialization() {
        for (int i = 1; i < board.length; i++)
            board[i] = ' ';
    }

    private static void showBoard() {


        System.out.println(board[1] + " | " + board[2] + " | " + board[3]);
        System.out.println("-----------");
        System.out.println(board[4] + " | " + board[5] + " | " + board[6]);
        System.out.println("-----------");
        System.out.println(board[7] + " | " + board[8] + " | " + board[9]);
    }

    public static void main(String[] args) {
        System.out.println("!!Welcome to TicTakToe Game!!");
        TicTakToeInitialization();
        showBoard();
    }
}