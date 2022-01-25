package bfs_dfs;

//https://leetcode.com/problems/number-of-islands/
public class numberOfIslands {

    //https://www.youtube.com/watch?v=__98uL6wst8
    //https://www.youtube.com/watch?v=pV2kpPD66nE

    public static void bfs(int row, int col, char[][] grid){
        if(row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] != '1'){
            return;
        }

        grid[row][col] = '2';
        bfs(row,col+1,grid);
        bfs(row+1,col,grid);
        bfs(row - 1, col,grid);
        bfs(row,col-1,grid);
    }

    public static int numIslands(char[][] grid){
        int islandCount = 0;

        if(grid == null){
            return islandCount;
        }
        int rows = grid.length, cols = grid[0].length;
        for(int row = 0; row < rows; row++){
            for(int col = 0; col < cols; col++){
                if (grid[row][col] == '1'){
                    bfs(row,col,grid);
                    islandCount += 1;
                }
            }
        }

        return islandCount;
    }

    public static void main(String[] args){
        char[][] grid = new char[][]{{'1','1','1','1','0'},
                {'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
        System.out.println(numIslands(grid));

    }
}
