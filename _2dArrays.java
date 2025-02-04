// concentration game
import java.util.Scanner;
public class _2dArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String red = "\033[0;31mr\033[0m";
        String green = "\033[0;32mg\033[0m";
        String blue = "\033[0;34mb\033[0m";
        String yellow = "\033[0;33my\033[0m";
        System.out.println("dimensions");
        System.out.print("width:");
        int w = input.nextInt();
        System.out.print("height:");
        int h = input.nextInt();
        input.nextLine();
        while(((w%2==1) && (h%2==1)) || (w*h<4)) {
            System.out.println("pick different dimensions");
            System.out.print("width:");
            w = input.nextInt();
            System.out.print("height:");
            h = input.nextInt();
            input.nextLine();
        }
        String[][] board = new String[w][h];
        if((w*h) % 8 == 0 && w*h > 4) {
            int ct = (w*h)/8;
            placeTiles(board, red, ct);
            placeTiles(board, green, ct);
            placeTiles(board, blue, ct);
            placeTiles(board, yellow, ct);
        } else {
            int ct = ((w*h)-2)/2;
            String[] cols = {red,green,blue,yellow};
            for(int i = 0; i < ct; i++) {
                placeTiles(board, cols[i%4], 2);
            }
            placeTiles(board, cols[(int)(Math.random() * 4)], 2);
        }
        String[][] userboard = new String[w][h];
        for(int r = 0; r<w; r++) {
            for(int c = 0; c<h; c++) {
                userboard[r][c] = "-";
            }
        }
        int[][] matched = new int[w][h];
        long time = System.currentTimeMillis();
        while(!allMatched(matched)) {
            System.out.print("\033[H\033[2J"); // ansi code for clear screen & return cursor to home
            System.out.flush();
            showBoard(userboard);
            printTime(time);
            System.out.println("indexing starts at (1,1) from top left");
            System.out.print("row:");
            int row1 = input.nextInt()-1;
            System.out.print("column:");
            int col1 = input.nextInt()-1;
            input.nextLine(); // consume trailing newline?(idk what that means)
            while(row1<0 || row1>w-1 || col1<0 || col1>h-1 || matched[row1][col1]==1) {
                System.out.println("pick a different square");
                System.out.print("row:");
                row1 = input.nextInt()-1;
                System.out.print("column:");
                col1 = input.nextInt()-1;
                input.nextLine();
            }
            showBoard(userboard,board,new int[]{row1},new int[]{col1});
            System.out.print("second row:");
            int row2 = input.nextInt()-1;
            System.out.print("second column:");
            int col2 = input.nextInt()-1;
            input.nextLine();
            while((row1==row2 && col1==col2) || row2<0 || row2>w-1 || col2<0 || col2>h-1 || matched[row2][col2]==1) {
                System.out.println("pick a different square");
                System.out.print("second row:");
                row2 = input.nextInt()-1;
                System.out.print("second column:");
                col2 = input.nextInt()-1;
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
        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board[0].length;j++) {
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
    public static void printTime(long time) {
        double newtime = (System.currentTimeMillis() - time)/1000;
        System.out.println("Time passed: " + newtime + " seconds");
    }
    public static void placeTiles(String[][] board, String tile, int ct) {
        for(int i = 0; i < ct; i++) {
            int r = (int)(Math.random()*board.length);
            int c = (int)(Math.random()*board[0].length);
            while(board[r][c] != null) {
                r = (int)(Math.random()*board.length);
                c = (int)(Math.random()*board[0].length);
            }
            board[r][c] = tile;
        }
    }
}