// concentration game
import java.util.Scanner;
public class _2dArrays {
    public static int sz = 4;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String red = "\033[0;31mr\033[0m";
        String green = "\033[0;32mg\033[0m";
        String blue = "\033[0;34mb\033[0m";
        String yellow = "\033[0;33my\033[0m";
        String[][] board = {
            {red,green,yellow,yellow},
            {green,red,blue,green},
            {blue,green,yellow,blue},
            {red,blue,yellow,red}
        };
        for(String[] x : board) {
            shuffle(x);
        }
        shuffle(board);
        String[][] userboard = {
            {"-","-","-","-"},
            {"-","-","-","-"},
            {"-","-","-","-"},
            {"-","-","-","-"}
        };
        int[][] matched = new int[sz][sz];
        long time = System.currentTimeMillis();
        while(!allMatched(matched)) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            showBoard(userboard);
            printTime(time);
            System.out.print("row:");
            int row1 = input.nextInt();
            System.out.print("column:");
            int col1 = input.nextInt();
            input.nextLine(); // consume trailing newline?(idk what that means)
            while(matched[row1][col1]==1) {
                System.out.println("pick a different square");
                System.out.print("row:");
                row1 = input.nextInt();
                System.out.print("column:");
                col1 = input.nextInt();
                input.nextLine();
            }
            showBoard(userboard,board,new int[]{row1},new int[]{col1});
            System.out.print("second row:");
            int row2 = input.nextInt();
            System.out.print("second column:");
            int col2 = input.nextInt();
            input.nextLine();
            while((row1==row2 && col1==col2) || matched[row2][col2]==1) {
                System.out.println("pick a different square");
                System.out.print("second row:");
                row2 = input.nextInt();
                System.out.print("second column:");
                col2 = input.nextInt();
                input.nextLine();
            }
            showBoard(userboard,board,new int[]{row1,row2},new int[]{col1,col2});
            printTime(time);
            if(board[row1][col1]==board[row2][col2]) {
                System.out.println("you got it!");
                matched[row1][col1] = 1;
                matched[row2][col2] = 1;
                userboard[row1][col1] = board[row1][col1];
                userboard[row2][col2] = board[row1][col1];
            } else {
                System.out.println("not quite, try again");
            }
            System.out.println("enter to continue");
            input.nextLine();
        }
        printTime(time);
        System.out.println("hooray you're done");
    }
    public static void showBoard(String[][] board) {
        for(String[] x : board) {
            for(String y : x) {
                System.out.print(y);
            }
            System.out.println();
        }
    }
    public static void showBoard(String[][] userboard, String[][] board, int[] r_s, int[] c_s) {
        for(int i=0;i<sz;i++) {
            for(int j=0;j<sz;j++) {
                if(matchesRowCol(i, j, r_s, c_s)) {
                    System.out.print(board[i][j]);
                } else {
                    System.out.print(userboard[i][j]);
                }
            }
            System.out.println();
        }
    }
    public static boolean matchesRowCol(int i, int j, int[] r_s, int[] c_s) {
        for (int k = 0; k < r_s.length; k++) {
            if (i == r_s[k] && j == c_s[k]) {
                return true;
            }
        }
        return false;
    }
    public static boolean allMatched(int [][] matched) {
        for(int[] x : matched) {
            for(int y : x) {
                if(y == 0) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void shuffle(String[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            // Generate a random index between 0 and i (inclusive)
            int j = (int)(Math.random()*(i+1));

            // Swap array[i] and array[j]
            String temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
    public static void shuffle(String[][] array) {
        for (int i = array.length - 1; i > 0; i--) {
            // Generate a random index between 0 and i (inclusive)
            int j = (int)(Math.random()*(i+1));

            // Swap array[i] and array[j]
            String[] temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
    public static void printTime(long time) {
        double newtime = (System.currentTimeMillis() - time)/1000;
        System.out.println("Time: " + newtime);
    }
}