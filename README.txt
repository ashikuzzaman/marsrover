=================
Problem Statement
=================

This is a quick programming task that we would like to see how he tackles. The deliverable is a
github link (or bitbucket , or some other git repo) which implements the behavior described below.
Choice of tools (language , frameworks if any ) are up to the contender.

A squad of robotic rovers are to be landed by NASA on a plateau on Mars.
This plateau, which is curiously rectangular, must be navigated by the
rovers so that their on-board cameras can get a complete view of the
surrounding terrain to send back to Earth.

A rover's position and location is represented by a combination of x and y
co-ordinates and a letter representing one of the four cardinal compass
points. The plateau is divided up into a grid to simplify navigation. An
example position might be 0, 0, N, which means the rover is in the bottom
left corner and facing North.

In order to control a rover, NASA sends a simple string of letters. The
possible letters are "L", R" and "M". L and R makes the rover spin 90
degrees left or right respectively, without moving from its current spot.
M means move forward one grid point, and maintain the same heading.
Assume that the square directly North from (x, y) is (x, y+1).

INPUT:
------
The first line of input is the upper-right coordinates of the plateau, the
lower-left coordinates are assumed to be 0,0.
The rest of the input is information pertaining to the rovers that have
been deployed. Each rover has two lines of input. The first line gives the
rover's position, and the second line is a series of instructions telling
the rover how to explore the plateau.

The position is made up of two integers and a letter separated by spaces,
corresponding to the x and y co-ordinates and the rover's orientation.
Each rover will be finished sequentially, which means that the second rover
won't start to move until the first one has finished moving.

OUTPUT:
-------
The output for each rover should be its final co-ordinates and heading.

INPUT AND OUTPUT:
-----------------

Test Input:
5 5
1 2 N
LMLMLMLMM
3 3 E
MMRMMRMRRM

Expected Output:
1 3 N
5 1 E

===============
Solution Design
===============

We have a “Rover” that should have a sense of its “Coordinates” and “Direction”. 
Coordinate and direction together would make for a “Location”. There are “Commands” 
that rover can understand. And finally rover must have been deployed on a “Plateau”. 
We implement left, right and move commands using Command Design pattern.

========================================
How To Compile, Test and Run the program
========================================

* Download and install gradle
* Unzip the file into a folder and change directory to it.
* Run the below commands one by one
* ./gradlew build
* ./gradlew test
* ./gradlew run

Here is a sample output of running the program.

-----------------------------------------------------------------------

uzzaman@uzzaman-macOS cloud-passage-mars-rover $ ./gradlew run

> Task :run
Landing Position -> 1 2 N
First Mars Rover Position after turn -> 1 3 N
Second Mars Rover Position after turn -> 3 3 E


BUILD SUCCESSFUL in 0s
2 actionable tasks: 2 executed
uzzaman@uzzaman-macOS cloud-passage-mars-rover $ ./gradlew run

> Task :run
Landing Position -> 1 2 N
First Mars Rover Position after turn -> 1 3 N
Second Mars Rover Position after turn -> 5 1 E


BUILD SUCCESSFUL in 0s
2 actionable tasks: 2 executed
uzzaman@uzzaman-macOS cloud-passage-mars-rover $

-----------------------------------------------------------------------
