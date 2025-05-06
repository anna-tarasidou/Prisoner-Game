<<<<<<< HEAD
# Prisoner-Game
=======

# Prisoner Game 

### Author: Tarasidou Anna

## 🕹️ Game Overview

**Prisoner Game** is a simple turn-based Java game inspired by the classic card game **"31"**. Two players (human or computer-controlled) take turns selecting numbers from **1 to 5**, aiming to accumulate a score close to **31** without exceeding it. The game introduces core Java programming concepts such as:

- **Inheritance**
- **Abstract classes**
- **Random number generation**
- **User input handling**
- **Game loops and control flow**

This project is ideal for **beginners in Java** looking to understand object-oriented design through a fun and interactive program.

---

## 🎮 How to Play

### Objective:
Each player tries to reach a total as close to **31** as possible without going over. If a player exceeds **31**, they **bust**, and their opponent wins the round.

### Game Modes:
Upon starting the game, the user can choose one of three modes:
1. **Human vs Computer**
2. **Computer vs Computer**
3. **Human vs Human**

### Game Rules:
- Each round, both players take turns selecting random (or user-input) numbers from 1 to 5.
- The score increases until a player reaches or exceeds **27**.
- If the score exceeds **31**, the player **loses** the round automatically.
- Otherwise, the player with the higher score **under or equal to 31** wins the round.
- The number of rounds won is tracked across rounds.
- After each round, players are asked if they want to play again.

---

## 📂 Project Structure

- **`Player`**: Abstract base class containing core player attributes and methods.
- **`HumanPlayer`**: Extends `Player`, asks user for input.
- **`ComputerPlayer`**: Extends `Player`, uses random number generation with a delay to simulate thinking.
- **`GameRounds`**: Manages the logic of each round, turn order, and scoring.
- **`PrisonerGame`**: Contains the `main` method and controls the overall game flow and user interaction.

---

## 🧠 Learning Highlights

This project helps beginners learn:
- How to use **abstract classes** and **inheritance** in Java.
- Creating simple **game logic and control flow**.
- Implementing **loops and conditionals**.
- Utilizing **random number generators** (`Random` class).
- Capturing and validating **user input** with `Scanner`.

---

## ▶️ Getting Started

To run the game:

1. Compile all `.java` files:
   ```bash
   javac *.java
   ```
2. Run the main program:
   ```bash
   java PrisonerGame
   ```

---

## ✅ Example Gameplay Output

```
Do you want to play (1). Human vs Computer, (2). Computer vs Computer or (3). Human vs Human?
1
Choose the name of the player!
Anna
--- Anna's turn ---
Give number between 1-5: 5
Player Anna selected 5
...
Anna has 30 points

--- Computer's turn ---
Player Computer selected 3
Player Computer selected 4
...
Computer has 32 points
Computer busted!

Player Anna : 1
Player Computer : 0
Do you want to play another round?
Choose y or Y for yes, n or N for no
```

---

## 📘 License

This project is shared for educational purposes.
>>>>>>> 392a0b0b0028daf7e9453e5fb0a639d937d0b096
