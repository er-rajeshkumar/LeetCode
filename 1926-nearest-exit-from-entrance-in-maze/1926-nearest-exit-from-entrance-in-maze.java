class Solution {
    public static int path(char[][] maze, int[] entrance, int[] curr, int steps, boolean[][] visited){
        int right = maze.length;
        int bottom = maze[0].length;
        int currRow = curr[0];
        int currCol = curr[1];
        
        //exit
        if(currRow == 0 || currRow == right - 1 || currCol == 0 || currCol == bottom-1){
            //check if curr is exit or not 
            if(!(currRow == entrance[0] && currCol == entrance[1]) ){
                return steps;
            }
        }
        int moveR = 0, moveL = 0, moveU = 0, moveD = 0; 
        //move right 
        if(currRow < right-1 && maze[currRow + 1][currCol] == '.'  && !visited[currRow + 1][currCol]  ){
            visited[currRow + 1][currCol] = true;
            moveR = path(maze , entrance, new int[]{curr[0] + 1, curr[1]}, steps + 1 , visited);
            visited[currRow + 1][currCol] = false;
        }else{
            moveR = Integer.MAX_VALUE;
        }
        if(currRow > 0 && maze[currRow - 1][currCol] == '.'  && !visited[currRow - 1][currCol]){
            visited[currRow - 1][currCol] = true;
            moveL = path(maze , entrance, new int[]{curr[0] - 1, curr[1]}, steps + 1, visited );
            visited[currRow - 1][currCol] = false;
        }else{
            moveL = Integer.MAX_VALUE;
        }
        if(currCol > 0 && maze[currRow][currCol -1] == '.'  && !visited[currRow][currCol - 1]  ){
            visited[currRow][currCol - 1] = true;
            moveU = path(maze , entrance, new int[]{curr[0], curr[1] - 1}, steps + 1 , visited);
            visited[currRow][currCol - 1] = false;
        }else{
            moveU = Integer.MAX_VALUE;
        }
        if(currCol < bottom -1  && maze[currRow][currCol +1] == '.'  &&  !visited[currRow][currCol + 1] ){
            visited[currRow][currCol + 1] = true;
            moveD = path(maze , entrance, new int[]{curr[0], curr[1] + 1}, steps + 1 , visited);
            visited[currRow][currCol + 1] = false;
        }else{
            moveD = Integer.MAX_VALUE;
        }
        //check if anyof them returning -1 then make them to Integer.MAX_VALUE
        if(moveR == -1){
            moveR = Integer.MAX_VALUE;
        }
        if(moveL == -1){
            moveL = Integer.MAX_VALUE;
        }
        if(moveU == -1){
            moveU = Integer.MAX_VALUE;
        }
        if(moveD == -1){
            moveD = Integer.MAX_VALUE;
        }
        // return minimum of all four 
        int result =  Math.min(Math.min(moveR, moveL), Math.min(moveU, moveD));
        return result == Integer.MAX_VALUE ? -1 : result;
    }

    public int nearestExit(char[][] maze, int[] entrance) {
        int rows = maze.length;
        int cols = maze[0].length;

        // 1. Create queue
        Queue<int[]> queue = new LinkedList<>();

        // 2. Create visited array
        boolean[][] visited = new boolean[rows][cols];

        // 3. Add entrance to queue
        queue.offer(new int[]{
            entrance[0],
            entrance[1],
            0
        });

        visited[entrance[0]][entrance[1]] = true;

        // 4. Four possible directions
        int[][] directions = {
            {1, 0},   // down
            {-1, 0},  // up
            {0, 1},   // right
            {0, -1}   // left
        };

        // 5. BFS traversal
        while (!queue.isEmpty()) {

            int[] curr = queue.poll();

            int currRow = curr[0];
            int currCol = curr[1];
            int steps = curr[2];

            // 6. Check whether current cell is an exit
            // Entrance itself cannot be considered an exit
            if ((currRow == 0 || currRow == rows - 1 ||
                 currCol == 0 || currCol == cols - 1) &&
                !(currRow == entrance[0] &&
                  currCol == entrance[1])) {

                return steps;
            }

            // 7. Explore four directions
            for (int[] dir : directions) {

                int newRow = currRow + dir[0];
                int newCol = currCol + dir[1];

                // Check boundaries, open cell and visited
                if (newRow >= 0 && newRow < rows &&
                    newCol >= 0 && newCol < cols &&
                    maze[newRow][newCol] == '.' &&
                    !visited[newRow][newCol]) {

                    // Mark visited before adding to queue
                    visited[newRow][newCol] = true;

                    // Add next cell with distance + 1
                    queue.offer(new int[]{
                        newRow,
                        newCol,
                        steps + 1
                    });
                }
            }
        }

        // No exit found
        return -1;
    }
}