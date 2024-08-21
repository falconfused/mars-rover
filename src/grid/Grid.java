package grid;

import java.util.HashSet;
import java.util.Set;

public class Grid {
    private int width;
    private int height;
    private Set<Obstacle> obstacles;

    public Grid(int width, int height, Set<Obstacle> obstacles) {
        this.width = width;
        this.height = height;
        this.obstacles = obstacles != null ? obstacles : new HashSet<>();
    }

    public boolean isObstacle(int x, int y) {
        return obstacles.stream().anyMatch(obstacle -> obstacle.getX() == x && obstacle.getY() == y);
    }

    public boolean isWithinBounds(int x, int y) {
        return x >= 0 && x < width && y >= 0 && y < height;
    }
}
