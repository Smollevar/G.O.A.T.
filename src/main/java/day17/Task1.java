package day17;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        List<ChessPiece> pieces = new ArrayList<>();
        pieces.add(ChessPiece.PAWN_WHITE);
        pieces.add(ChessPiece.PAWN_WHITE);
        pieces.add(ChessPiece.PAWN_WHITE);
        pieces.add(ChessPiece.PAWN_WHITE);
        pieces.add(ChessPiece.ROOK_BLACK);
        pieces.add(ChessPiece.ROOK_BLACK);
        pieces.add(ChessPiece.ROOK_BLACK);
        pieces.add(ChessPiece.ROOK_BLACK);
        for (ChessPiece piece : pieces)
            System.out.print(piece.getPiece()+" ");
    }
}