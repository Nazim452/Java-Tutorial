// public class backTracking {


     

//     //RAT IN AMZE - 4 DIRECTION




//     public static void main(String[] args) {
        
//         int row = 3;
//         int col = 3;
//         boolean[][] isVisited = new boolean[row][col];
//         ratPrint(0,0,row-1, col-1," ", isVisited);



        
    
//     private static void ratPrint(int sr, int sc,int er,int ec, String s, boolean isVisited[][] ){
//         if(sr<0 || sc<0) return;
//         if(ec<sc || er<sr) return;
//         if(sr==er||sc==ec  ) {
//             System.out.println(s);
//             return;
//         }
//         if(isVisited[sr][sc]=true) return;

//         isVisited[sr][sc] = true;

//         //go right
//         ratPrint(sr, sc+1, er, ec,s+"R", isVisited);
//         // go down
//         ratPrint(sr+1, sc, er, ec, s+"D", isVisited);

//         // go left
//         ratPrint(sr, sc-1, er, ec, s+"L", isVisited);
//         // go up
//         ratPrint(sr-1, sc, er, ec, s+"U", isVisited);

//         isVisited[sr][sc] = false;



            
        
//     }

//     }
    
// }








// n - queen




// public class backTracking{
//     public static boolean isSafe(char[][]board, int row, int col){
//         int n = board.length;

//         // check row

//         for(int j = 0; j<n; j++){
//             if(board[row][j]=='Q') return false;

//         }

//         //check col

//         for(int i = 0; i<n; i++){
//             if(board[i][col]=='Q') return false;
//         }

//         //check  NE
//         int i = row;
//         int j = col;
//         while(i>=0  && j<n){
//             if(board[i][j]=='Q') return false;
//         }
//         i--;
//         j++;

//         // check SE
//         i = row;
//         j = col;
//         while(i<n && j<n){
//              if(board[i][j]=='Q') return false;
//         }
//         i++;
//         j++;

//         //check  NW
//         i = row;
//         j= col;
//         while(i>=0  &&j>=0){
//              if(board[i][j]=='Q') return false;
//         }
//         i--;
//         j--;

//         // check SW
//         i= row;
//         j= col;
//         while(i<n && j>=0){
//              if(board[i][j]=='Q') return false;
//         }
//         i++;
//         j--;



//         return true;

//     }
//      public static void nqueen(char[][]board, int row){
//         int n = board.length;
//         if(row==n){
//              for(int i = 0; i<board.length; i++){
//                     for(int j = 0; j<board.length; j++){
//                     System.out.print(board[i][j]);

//                     }
//                     System.out.println();
//             }
//             System.out.println();
//             return;         
//         }

//         for(int j = 0; j<n; j++){
//             if(isSafe(board, row, j)){
//                 board[row][j] = 'Q';
//                 nqueen(board, row+1);
//                 board[row][j] ='.';
//             }
//         }

//     }
    
//     public static void main(String[] args) {
//         int n = 4;
//         char[][] board = new char[n][n];

//         for(int i = 0; i<board.length; i++){
//             for(int j = 0; j<board.length; j++){
//                 board[i][j] = '.';

//             }
//         }
//         nqueen(board,0);

       

        
        
//     }
// }





// maximum no of knight in chessBoard



// if number = 3
// n = 5
// 5X 5 cheassboard me all possible  3 knights


// public class backTracking{
//     static int maxKnight = -1;
//     static int number =8;
//     public static boolean isSafe(char[][]board, int row, int col){
//         int n = board.length;
//         int i, j;
        
//         // 2 UP 1 left

//         i = row-2;
//         j = col-1;
//         if(i>=0  && j>=0  && board[i][j]=='K') return false;
//         i--;
//         j--;

//         // 2 UP ! right
//         i = row-2;
//         j = col+1;
//         if(i>=0  && j<n  && board[i][j]=='K') return false;
//         i--;
//         j++;

//         //2 down 1 left
//         i =row+2;
//         j = col-1;
//         if(i<n  && j>=0  && board[i][j]=='K') return false;
//         i++;
//         j--;

//         //2 down 1 right
//         i = row+2;
//         j= col+1;
//         if(i<n  && j<n && board[i][j]=='K') return false;
//         i++;
//         j++;

//         // 2 Left 1 up

//         i = row-1;
//         j = col-2;
//         if(i>=0  && j>=0  && board[i][j]=='K') return false;
//         i--;
//         j--;

//         // 2 left 1 down
//         i = row+1;
//         j = col-2;
//         if(i<n  && j>=0  && board[i][j]=='K') return false;;
//         i++;
//         j--;

//         //2 right 1 up

//         i = row-1;
//         j = col+2;
//         if(i>=0  && j<n && board[i][j]=='K') return false;;
//         i--;
//         j++;

//         /// 2 right 1 down
//         i = row+1;
//         j = col+2;
//         if(i<n && j<n && board[i][j]=='K') return false;
//         i++;
//         j++;
//         return true;
//     }

//     public static  void knight(char[][]board, int row, int col, int num){
//         int n = board.length;
//         if(row==n){
//             if(num==number){   // num- knight==3 par hi sierf caholo
//                 for(int i = 0; i<n; i++){
//                 for(int j = 0; j<n; j++){
//                     System.out.print(board[i][j]);
//                 }
//                 System.out.println();
//             }
//             System.out.println();
          
//             }
//             maxKnight = Math.max(maxKnight,num);
//               return;
            
//         }
//         else if(isSafe(board, row, col)){
//             board[row][col] = 'K';
//             if(col!=n-1) {
//                 knight(board, row, col+1, num+1);
                
//             }else{
//                 knight(board, row+1, 0, num+1);
//             }
//             board[row][col] = '.';

//         }
//         if(col!=n-1) knight(board, row, col+1, num);  // not safe
//             else knight(board, row+1, 0, num);
       

//     }
//     public static void main(String[] args) {

//         // creating chess board
//         int n   = 4;
//         char[][] board = new char[n][n];

//         for(int i =0;  i<n; i++){
//             for(int j = 0; j<n; j++){
//                 board[i][j] = '.';

//             }
//         }
//         knight(board,0,0,0);
//         System.out.println(maxKnight);
        
//     }
// }

































