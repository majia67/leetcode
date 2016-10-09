package easy;

public class prob296 {
    class Point {
        int x;
        int y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }    
    }
    
    List<Point> people = new LinkedList<>();
    int[][] grid;
    int m, n;
    int x, y;
    int dx, dy;
    int minDis;
    
    public int minTotalDistance(int[][] grid) {
        this.grid = grid;
        n = grid.length;
        m = grid[0].length;
        
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if (grid[i][j] == 1)
                    people.add(new Point(i, j));
                    
        x = n / 2;
        y = m / 2;
        dx = dy = 0;
        minDis = Integer.MAX_VALUE;
        boolean flag = calcDis(0, 0);
        while(flag == true) {
            flag = false;
            for (int i = -1; i < 1; i++)
                for (int j = -1; j < 1; j++)
                    flag |= calcDis(i, j);
            if (flag == true) {
                x += dx;
                y += dy;
            }
        }
        
        return minDis;
    }
    
    private boolean calcDis(int dx, int dy) {
        int nx = x + dx;
        int ny = y + dy;
        
        if (nx < 0 || nx >= n || ny < 0 || ny >= m)
            return false;
        
        int totalDis = 0;
        for (Point p : people)
            totalDis += Math.abs(p.x - nx) + Math.abs(p.y - ny);
        
        if (totalDis < minDis) {
            this.dx = dx;
            this.dy = dy;
            minDis = totalDis;
            return true;
        }
        
        return false;
    }
}
