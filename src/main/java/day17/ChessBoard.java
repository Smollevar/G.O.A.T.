package day17;

public class ChessBoard {
    private ChessPiece[][] chessArray;

    public ChessBoard(ChessPiece chessArray[][]) {
        this.chessArray = chessArray;
    }

    public void print() {
        for (int i = 0; i < chessArray.length; i++) {
            for (int j = 0; j < chessArray[i].length; j++) {
                System.out.print(chessArray[i][j].getColorPiece());
            }
            System.out.println();
        }
    }
}
