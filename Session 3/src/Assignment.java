import java.util.Scanner;

/*
Assignment : 
Place the n-queens on the chessboard by taking input from the user 
e.g : User says row-> 1 and col-> 1 as input replace -> it with a queen
a total of 4 queens in the chessboard no queen can be placed in the same row again or same column again 
Hint : use a do, while loop and make sure not to take more than 4 queens positions
 
 */


public class Assignment {

	public static void main(String[] args) {
		char blacksquare = '\u25A1';
		char whitesquare = '\u25A0';
		char queen = '\u265B';
		Scanner scan = new Scanner(System.in);
		int row,col;
		for(int i=0 ; i<8 ; i++)
		{
			for(int j=0 ; j<8 ; j++)
			{
				if(i%2==0)
				{
					char square = (j+1)%2==0 ? blacksquare : whitesquare;
					System.out.print(square+" ");
				}
				else
				{
					char square = j%2==0 ? blacksquare : whitesquare;
					System.out.print(square+" ");
				}
			}
			System.out.println();
		}
		
		
		scan.close();
	}

}
