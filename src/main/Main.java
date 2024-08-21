package main;

import commands.Command;
import commands.MoveCommand;
import commands.TurnLeftCommand;
import commands.TurnRightCommand;
import grid.Grid;
import grid.Obstacle;
import rover.Rover;
import utils.Logger;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Obstacle> obstacles = Set.of(new Obstacle(2, 2), new Obstacle(3, 5));
        Grid grid = new Grid(10, 10, obstacles);
        Rover rover = new Rover(0, 0, 'N', grid);

        Command[] commands = {
        new MoveCommand(),
        new MoveCommand(),
        new TurnRightCommand(),
        new MoveCommand(),
        new TurnLeftCommand(),
        new MoveCommand()
        };
        

        for (Command command : commands) {
            try {
                command.execute(rover);
                Logger.logInfo(rover.reportStatus());
            } catch (Exception e) {
                Logger.logError("Error: " + e.getMessage());
            }
        }
        System.out
                .println("Final Position: (" + rover.getX() + ", " + rover.getY() + ", " + rover.getDirection() + ")");

        if (rover.numberOfObstacle() > 0) {
            System.out.println("Status Report: \"" + rover.reportStatus() + " "
                    + (rover.numberOfObstacle() > 1 ? rover.numberOfObstacle() + " Obstacles" : "1 Obstacle")
                    + " detected.\"");
        } else {
            System.out.println("Status Report: \"" + rover.reportStatus() + " No Obstacles detected.\"");
        }
    }
}
