package bfs_dfs;

// https://leetcode.com/problems/number-of-provinces/
public class numberOfProvinces {

    //https://www.youtube.com/watch?v=70Gbi7LYZOM
    public static int findCircleNum(int[][] isConnected){
        int providence = 0;

        if(isConnected == null){
            return providence;
        }

        int[] visited = new int[isConnected.length];
        for(int i = 0; i < isConnected.length; i++) {
            if (visited[i] == 0) {
                dfs(isConnected,visited,i);
                providence++;
            }
        }
        return providence;
    }

    public static void dfs(int[][] isConnected, int[] visited, int i){
        for(int j = 0; j < isConnected.length; j++){
            if (isConnected[i][j] == 1 && visited[j] == 0){
                visited[j] = 1;
                dfs(isConnected,visited,j);
            }
        }
    }


    public static void main(String[] args){

    }
}
