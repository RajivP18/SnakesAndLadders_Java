# 🎲 Snakes and Ladders Game in Java

A simple and interactive **console-based Snakes and Ladders game** built in Java. This game simulates multiple players rolling a dice and moving on a 10x10 board while encountering snakes 🐍 and ladders 🪜.

![Game Banner](images/banner.png)

---

## 📜 Table of Contents
- [Features](#features)
- [Game Rules](#game-rules)
- [Class Overview](#class-overview)
- [How to Run](#how-to-run)
- [Demo](#demo)
- [Screenshots](#screenshots)
- [Contributing](#contributing)
- [License](#license)

---

## ✨ Features

- 🎯 Classic Snakes and Ladders logic.
- 👥 Supports multiple players.
- 🎲 Random dice rolls.
- 🐍 Snakes and 🪜 ladders implemented via `Map`.
- 🧠 Clean object-oriented design.
- 📦 Lightweight and console-based.

---

## 🎮 Game Rules

- Each player starts at position 1.
- On each turn, a player rolls a dice (1–6).
- Landing at the bottom of a ladder takes the player up.
- Landing at the head of a snake sends the player down.
- First player to reach position 100 wins.
- If a dice roll moves a player beyond 100, they skip that turn.

---

## 🧩 Class Overview

- `Board.java`: Holds board size, snakes, and ladders.
- `Dice.java`: Simulates dice rolls.
- `Player.java`: Holds player name and current position.
- `Game.java`: Main game logic loop.
- `MainRunner.java`: Initializes and starts the game.

![Class Diagram] [image](https://github.com/user-attachments/assets/1bd3238f-8a05-463f-9279-c7a7ad80865c)


---

## ⚙️ How to Run

1. **Clone the repository**
   ```bash
   git clone https://github.com/yourusername/snake-and-ladder-java.git
   cd snake-and-ladder-java
