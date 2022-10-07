public class Maze {

   public static void main(String[] args) {
        //maze(3,3,"");
        boolean[][] board = {{true,true,true},
                             {true,true,true},
                             {true,true,true}};
        mazeWithObs(board,0,0,"");
    }

    public static void maze(int row,int col,String ans){

        if( row == 1 && col == 1 ){
            System.out.println(ans);
            return;
        }

        if( row > 1){
            maze(row-1,col,ans + 'D');
        }

        if( col > 1 ){
            maze(row,col-1,ans+"R");
        }

    }

    public static void mazeWithObs(boolean[][] board,int row,int col , String ans){

    if( row == board.length-1 && col == board.length-1){
        System.out.println(ans);
        return;
    }

        if(!board[row][col]){
            return;
        }

        board[row][col] = false;

    if( row < board.length-1){
        mazeWithObs(board,row+1,col,ans+"D");
    }

    if( row > 0){
        mazeWithObs(board,row-1,col,ans+"U");
    }

    if( col < board.length-1){
        mazeWithObs(board,row,col+1,ans+"R");
    }

    if( col > 0){
        mazeWithObs(board,row,col-1,ans+"L");
    }

    if( row< board.length - 1 && col < board.length - 1){
        mazeWithObs(board,row+1,col+1,ans+"S");
    }
    board[row][col] = true;

    }
}
