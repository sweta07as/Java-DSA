import java.util.Arrays;

public class IncludingAllPaths {

//    You are making some changes while going in the below recursion calls. So when you
//    go outside those recursion calls, the changes that were made via those recursion calls
//    should also not be available. This is known as Backtracking.

    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

        allPaths("", board, 0, 0);

//      Without the two lines of code (of making and reverting changes) , it kept
//      coming back to the same point where it started, hence it got stuck in an endless loop,
//      that's why it led to Stack Overflow

        int[][] path = new int[board.length][board[0].length];
//        matrixAndPaths("", board, 0, 0, path,  1);
    }

    //Here, all the directions are allowed i.e., Left, Right, Up and Down
    static void allPaths(String p, boolean[][] maze, int r, int c){
        if(r == maze.length - 1 && c == maze[0].length - 1){
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){ // !maze[r][c] means maze[r][c] == false
            return;
        }

        //considering the cell in the path
        maze[r][c] = false; //make change

        if(r < maze.length - 1){
            allPaths(p + 'D', maze, r+1, c);
        }
        if(c < maze[0].length - 1){
            allPaths(p + 'R', maze, r, c+1);
        }
        if(r > 0){
            allPaths(p + 'U', maze, r-1, c);
        }
        if(c > 0){
            allPaths(p + 'L', maze, r, c-1);
        }

        //Before the function is over, undo the changes that were made by that function
        maze[r][c] = true; //revert change
    }


    static void matrixAndPaths(String p, boolean[][] maze, int r, int c, int[][] path, int step){
        if(r == maze.length - 1 && c == maze[0].length - 1){
            path[r][c] = step;
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if(!maze[r][c]){ // !maze[r][c] means maze[r][c] == false
            return;
        }

        //considering the cell in the path
        maze[r][c] = false; //make change

        path[r][c] = step;

        if(r < maze.length - 1){
            matrixAndPaths(p + 'D', maze, r+1, c, path, step+1);
        }
        if(c < maze[0].length - 1){
            matrixAndPaths(p + 'R', maze, r, c+1, path, step+1);
        }
        if(r > 0){
            matrixAndPaths(p + 'U', maze, r-1, c, path, step+1);
        }
        if(c > 0){
            matrixAndPaths(p + 'L', maze, r, c-1, path, step+1);
        }

        //Before the function is over, undo the changes that were made by that function
        maze[r][c] = true; //revert change
        
        path[r][c] = 0;
    }
}
