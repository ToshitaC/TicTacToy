package com.bridgelab;

import java.util.Scanner;

public class TicTacToy {
    static char[] board = new char[10];

    public static void ticTakToeInitialization() {
        for (int i = 1; i < board.length; i++) {
            board[i] = ' ';
        }
    }

    static void playerChose() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("User choose 0 or X");
        char playerChoose = scanner.next().charAt(0);
        if (playerChoose == 'X' || playerChoose == 'X') {
            System.out.println("User Chosen X");
            System.out.println("Computer Choice O");
        } else {
            System.out.println("User Chosen O");
            System.out.println("computer Choice X ");
        }


    }

    public static void main(String[] args) {
        System.out.println("!!Welcome to TicTakToe Game!!");
        ticTakToeInitialization();
        playerChose();
    }
}