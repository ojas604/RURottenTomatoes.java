/*************************************************************************
 *  Compilation:  javac RURottenTomatoes.java
 *  Execution:    java RURottenTomatoes
 *
 *  @author: Name: Ojas Jain, email: oj34@scarletmail.rutgers.edu, NETid: oj34
 *
 * RURottenTomatoes creates a 2 dimensional array of movie ratings 
 * from the command line arguments and displays the index of the movie 
 * that has the highest sum of ratings.
 *
 *  java RURottenTomatoes 3 2 5 2 3 3 4 1
 *  0
 *************************************************************************/

public class RURottenTomatoes {

    public static void main(String[] args) {

		int i, j, k = 2, row, column, sumOfColumn = 0, storedSum = 0, index = 0;
		row = Integer.parseInt(args[0]);
		column = Integer.parseInt(args[1]);
		int [] [] arr = new int [row] [column] ;
		for (i = 0; i < row; i++) {
			for (j = 0; j < column; j++) {
				arr [i] [j] = Integer.parseInt(args[k]);
				k++;
			}
			
		}
		
		for (i = 0; i < column; i++) {
			for (j = 0; j < row; j++) {

				sumOfColumn += arr[j][i];

			}
				if (sumOfColumn > storedSum) {
					storedSum = sumOfColumn;
					index = i;
				}
				
				sumOfColumn = 0;

		}
			System.out.println(index);
	}
}