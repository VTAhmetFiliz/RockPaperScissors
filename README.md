# Tyntec Coding Example : Rock-Paper-Scissors

This application is simple game called "Rock-Paper-Scissors". 

Rules:
* Scissors beats Paper
* Rock beat Scissors
* Paper beats Rock
* If both players choose the same, the round is counted as a tie.

Implemented two players:
* Player A always chooses Paper
* Player B chooses randomly

## Technologies used in the project

* JDK 1.8 (must be pre-installed).
* Maven for build automation.
* JUnit for unit testing.

## How to Build and Run the Project

This project uses Maven build system, you can build the project locally just by typing
the following in the console:

    mvn package

To run the application go to the directory '/target' and type the following in the console:

    java -jar Rock-Paper-Scissors-1.0.jar

An example session will look like:

    D:\dev\dev\Workspace\RockPaperScissors\target>java -jar Rock-Paper-Scissors-1.0.jar
    Player A wins 37 of 100 games
    Player B wins 26 of 100 games
    Tie: 37 of 100 games

## Running the tests

You can run the tests by typing the following in the console:

    mvn test

An example output is look like:

    -------------------------------------------------------
     T E S T S
    -------------------------------------------------------
    Running GameTest
    Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.053 sec
    Running PlayerTest
    Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 sec
    
    Results :
    
    Tests run: 5, Failures: 0, Errors: 0, Skipped: 0
    
    [INFO] ------------------------------------------------------------------------
    [INFO] BUILD SUCCESS
    [INFO] ------------------------------------------------------------------------
    [INFO] Total time: 1.185 s
    [INFO] Finished at: 2018-03-22T09:57:37+03:00
    [INFO] Final Memory: 11M/220M
    [INFO] ------------------------------------------------------------------------

### Break down into the tests

There are 2 test classes: GameTest and PlayerTest.

GameTest tests the functionality of game play.

PlayerTest tests the functionality of the constructors.
