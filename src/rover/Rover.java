package rover;

import exceptions.ObstacleDetectedException;
import exceptions.OutOfBoundsException;
import grid.Grid;

public class Rover {
    private int x;
    private int y;
    private char direction;
    private Grid grid;
    private int numberOfObstacle = 0;


    public Rover(int x, int y, char direction, Grid grid) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.grid = grid;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public char getDirection() {
        return direction;
    }

    public void move() {
        int newX = x;
        int newY = y;

        switch (direction) {
            case 'N':
                newY++;
                break;
            case 'E':
                newX++;
                break;
            case 'S':
                newY--;
                break;
            case 'W':
                newX--;
                break;
        }

        if (!grid.isWithinBounds(newX, newY)) {
            throw new OutOfBoundsException("Move out of bounds to (" + newX + ", " + newY + ")");
        }

        if (grid.isObstacle(newX, newY)) {
            numberOfObstacle++;
            throw new ObstacleDetectedException("Obstacle detected at (" + newX + ", " + newY + ")");
            
        }

        this.x = newX;
        this.y = newY;
    }

    public void turnLeft() {
        direction = switch (direction) {
            case 'N' -> 'W';
            case 'W' -> 'S';
            case 'S' -> 'E';
            case 'E' -> 'N';
            default -> direction;
        };
    }

    public void turnRight() {
        direction = switch (direction) {
            case 'N' -> 'E';
            case 'E' -> 'S';
            case 'S' -> 'W';
            case 'W' -> 'N';
            default -> direction;
        };
    }
    public int numberOfObstacle() {
        return numberOfObstacle;
    }

    public String reportStatus() {
        return "Rover is at (" + x + ", " + y + ") facing " + direction + ".";
    }
}
