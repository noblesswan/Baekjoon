import java.util.Scanner;

class ChessCount
{
	final int KING= 1;
	final int QUEEN = 1;
	final int LOOK = 2;
	final int BISHOP = 2;
	final int KNIGHT = 2;
	final int PAWN = 8;

	void Count(int king, int queen, int look, int bishop, int knight, int pawn)
	{
		int kingNum = KING - king ;
		int queenNum = QUEEN - queen ;
		int lookNum = LOOK - look;
		int bishopNum = BISHOP - bishop;
		int knightNum = KNIGHT - knight;
		int pawnNum = PAWN - pawn;
		
		System.out.println(kingNum + " " + queenNum+ " " +lookNum+ " " +bishopNum+ " " +knightNum+ " " +pawnNum);

	}
}

public class Main {
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		ChessCount chessCount = new ChessCount();
		
		int king = scanner.nextInt();
		int queen = scanner.nextInt();		
		int look = scanner.nextInt();
		int bishop = scanner.nextInt();
		int knight = scanner.nextInt();
		int pawn = scanner.nextInt();
		
		chessCount.Count(king, queen, look, bishop, knight, pawn);
	}
}
