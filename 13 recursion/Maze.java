import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(count(3,3));

//        path("", 3, 3);
//        System.out.println(pathList("", 3, 3));

//        System.out.println(pathListDiagonal("", 3, 3));

        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };

        pathObstacles("", board, 0, 0);
    }

    //Q1. Counting Paths
    static int count(int r, int c){
        if(r == 1 || c == 1){
            return 1;
        }

        int left = count(r-1, c);
        int right = count(r, c-1);

        return left + right;
    }

    //Here, in mazes, instead of unprocessed, we have row and col variables.

    //Q2. Printing Paths
    static void path(String p, int r, int c){
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }

        if(r > 1){
            path(p + 'D', r-1, c);
        }
        if(c > 1){
            path(p + 'R', r, c-1);
        }
    }

    static ArrayList<String> pathList(String p, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if(r > 1){
            list.addAll(pathList(p + 'D', r-1, c));
        }
        if(c > 1){
            list.addAll(pathList(p + 'R', r, c-1));
        }

        return list;
    }

    //Q3. Including Diagonal Paths
    static ArrayList<String> pathListDiagonal(String p, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if(r > 1){
            list.addAll(pathListDiagonal(p + 'V', r-1, c));
        }
        if(r > 1 && c> 1){
            list.addAll(pathListDiagonal(p + 'D', r-1, c-1));
        }
        if(c > 1){
            list.addAll(pathListDiagonal(p + 'H', r, c-1));
        }

        return list;
    }

    //Q4. Maze With Obstacles
    static void pathObstacles(String p, boolean[][] maze, int r, int c){
        if(r == maze.length - 1 && c == maze[0].length - 1){
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){ // !maze[r][c] means maze[r][c] == false
            return;
        }
        if(r < maze.length - 1){
            pathObstacles(p + 'D', maze, r+1, c);
        }
        if(c < maze[0].length - 1){
            pathObstacles(p + 'R', maze, r, c+1);
        }
    }
}
