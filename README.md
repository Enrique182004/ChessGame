ChessGame
A complete Java chess game implementation with a graphical user interface built using Swing. This project demonstrates object-oriented programming principles, GUI development, and comprehensive unit testing.
Features

Complete Chess Piece Implementation: All six chess piece types with accurate movement rules

King: Moves one square in any direction
Queen: Combines rook and bishop movement (horizontal, vertical, diagonal)
Rook: Moves horizontally and vertically
Bishop: Moves diagonally
Knight: Moves in L-shaped patterns
Pawn: Moves forward one square (direction depends on color)


Interactive GUI:

Visual 8x8 chessboard with alternating colors
Piece selection and color assignment
Position input with coordinate validation
Real-time move validation and feedback
Chess piece images for visual representation


Smart Validation:

Board coordinate verification (a1-h8)
Move legality checking for each piece type
Prevention of duplicate piece usage
User-friendly error messages



Project Structure
src/
├── main/java/
│   ├── ChessBoard.java          # Board coordinate validation
│   ├── ChessGUI.java            # Main GUI application
│   ├── ChessPiece.java          # Enum for piece types
│   ├── figures/                 # Chess piece implementations
│   │   ├── Figure.java          # Abstract base class
│   │   ├── King.java
│   │   ├── Queen.java
│   │   ├── Rook.java
│   │   ├── Bishop.java
│   │   ├── Knight.java
│   │   └── Pawn.java
│   ├── interfaces/              # Interface definitions
│   │   ├── IntChessBoard.java
│   │   └── IntFigure.java
│   └── resources/
│       └── images/              # Chess piece PNG images
└── test/java/                   # Comprehensive JUnit test suite
    ├── ChessTestSuite.java
    ├── KingTest.java
    ├── QueenTest.java
    ├── RookTest.java
    ├── BishopTest.java
    ├── KnightTest.java
    └── PawnTest.java
How to Run
Prerequisites

Java 8 or higher
Maven 3.6+

Running the Application
bash# Compile and run with Maven
mvn compile exec:java

# Or compile and run manually
javac -cp src/main/java src/main/java/ChessGUI.java
java -cp src/main/java ChessGUI
Running Tests
bash# Run all tests
mvn test

# Run specific test class
mvn test -Dtest=KingTest
How to Play

Select a Piece: Choose from King, Queen, Rook, Bishop, Knight, or Pawn
Choose Color: Select WHITE or BLACK
Set Initial Position: Use the dropdown menus to select column (a-h) and row (1-8)
Place Piece: Click "Place Piece" to add it to the board
Move the Piece: Select a target position and click "Move Piece"
Start Over: Click "New Piece" to clear the board and try a different piece

Technical Highlights

Object-Oriented Design: Uses inheritance, interfaces, and polymorphism
Design Patterns: Template method pattern in the Figure hierarchy
GUI Programming: Custom Swing components with event handling
Test-Driven Development: Comprehensive unit test coverage
Maven Integration: Standard Maven project structure
Resource Management: Efficient image loading and display

Development Notes
This project was developed as part of an Object-Oriented Programming course, demonstrating:

Interface implementation and abstract class usage
Proper encapsulation and data hiding
Event-driven programming with Swing
Unit testing best practices with JUnit
Maven project management
