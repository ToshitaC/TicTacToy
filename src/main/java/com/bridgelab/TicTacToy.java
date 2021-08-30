package com.bridgelab;

public class TicTacToy {
 static char[] board =new char[10];
 public static void TicTacToyInitialization(){;
         for( int i=1;i<board.length;i++){
        board[i]=' ';
    }
}
    public static void main(String[] args) {
        TicTacToyInitialization();
    }
}


