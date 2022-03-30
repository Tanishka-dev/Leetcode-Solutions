class N_queens{
    public static void main(String[] args) {
        boolean[][] board= new boolean[4][4];
        queens(board,0);
    }

    public static int queens(boolean[][]board, int r){
        if(r==board.length){
            display(board);
            return 1;
        }
        int count=0;

        for(int col=0;col<board.length;col++){
            if(isSafe(board,r,col)){
                board[r][col]=true;
               count+= queens(board, r+1);
                board[r][col]=false;
            }
        }
        return count;
    }
    private static boolean isSafe(boolean[][] board, int r, int col) {
        for(int i=0;i<r;i++){
            if(board[i][col])
              return false;
        }

        int maxLeft=Math.min(r, col);
        for(int i=1;i<=maxLeft;i++){
            if(board[r-i][col-i])
              return false;
        }

        int maxRight=Math.min(r, board.length-col-1);
        for(int i=1;i<=maxRight;i++){
            if(board[r-i][col+i])
              return false;
        }
        return true;

    }

    static void display(boolean[][] board){
        for(boolean row[]: board){
            for (boolean element : row) {
                if(element)
                   System.out.print("Q");
                else
                System.out.print("x");

            }
            System.out.println();
        }
    }
}