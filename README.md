# Mars Rover Simulation Documentation

## Table of Contents

1. [Overview](#overview)
2. [Key Features](#key-features)
3. [System Requirements](#system-requirements)
4. [Installation](#installation)
5. [Usage](#usage)
6. [Command Pattern](#command-pattern)
7. [Composite Pattern](#composite-pattern)
8. [Grid and Obstacles](#grid-and-obstacles)
9. [Rover Movement](#rover-movement)
10. [Exceptions](#exceptions)
11. [Logger](#logger)
12. [Possible Output](#possible-output)

## Overview
The Mars Rover Simulation is a Java-based project that simulates a Mars Rover navigating a grid-based terrain. The project utilizes Object-Oriented Programming principles and design patterns to provide a scalable and maintainable solution.

## Key Features

* Command Pattern for encapsulating movement commands
* Composite Pattern for representing grid and obstacles
* Adherence to SOLID principles for maintainability and scalability

## System Requirements

* Java Development Kit (JDK) 8 or later
* Git for cloning the repository

## Installation

1. Clone the repository using Git:
   ```bash
   git clone https://github.com/falconfused/mars-rover.git
   ```

2. Navigate to the project directory:
   ```bash
   cd mars-rover
   ```

3. Compile the Java code:
   ```bash
   javac -d bin src/**/*.java
   ```

4. Run the simulation:
   ```bash
   java -cp bin main.Main    
   ```

## Usage

1. Run the simulation using the `main.Main` class:
   ```bash
   java -cp bin main.Main    
   ```

2. Observe the rover's movement and interactions with the grid and obstacles.

## Command Pattern

The Command Pattern is used to encapsulate movement commands for the Mars Rover. This allows for easy extensibility and flexibility in adding new commands in the future. The project includes three types of commands:

1. `MoveCommand`: Moves the rover forward by one unit.
2. `TurnLeftCommand`: Turns the rover left by 90 degrees.
3. `TurnRightCommand`: Turns the rover right by 90 degrees.

## Composite Pattern

The Composite Pattern is used to represent the grid and obstacles in the Mars Rover simulation. This allows for easy handling of complex scenarios where the grid and obstacles may be nested. The project includes two classes:

1. `Grid`: Represents the grid and provides methods for adding and removing obstacles.
2. `Obstacle`: Represents an obstacle on the grid and provides methods for checking collisions.

## Grid and Obstacles

The Mars Rover simulation represents the Martian terrain using a grid. The grid is a 2D array of integers, where 0 represents an empty space and 1 represents an obstacle. Obstacles can be added to the grid using the `addObstacle()` method.

## Rover Movement

The Mars Rover can move forward, backward, left, and right on the grid. The rover's movement is determined by its current position and direction. The rover will stop moving if it encounters an obstacle or reaches the edge of the grid.

## Exceptions

The project includes several exception classes to handle errors and exceptions that may occur during the rover's movement. These include:

1. `RoverException`: Base exception class for rover-related errors.
2. `OutOfBoundsException`: Exception thrown when the rover moves outside the grid.
3. `ObstacleDetectedException`: Exception thrown when the rover encounters an obstacle.

## Logger

The logger is used to log events and errors that occur during the simulation. The logger can be configured to log events at different levels, such as debug, info, warn, and error.

## Possible Output

```
2024-08-21T05:56:05.672820 INFO: Rover is at (0, 1) facing N.
2024-08-21T05:56:05.678189 INFO: Rover is at (0, 2) facing N.
2024-08-21T05:56:05.678259 INFO: Rover is at (0, 2) facing E.
2024-08-21T05:56:05.678317 INFO: Rover is at (1, 2) facing E.
2024-08-21T05:56:05.678368 INFO: Rover is at (1, 2) facing N.
2024-08-21T05:56:05.678423 INFO: Rover is at (1, 3) facing N.
Final Position: (1, 3, N)
Status Report: "Rover is at (1, 3) facing N. No Obstacles detected."
```

