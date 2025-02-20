# SOLID Adventure Game

Adventure Game Refactoring  

## Project Description  

This project is a refactoring of the monolithic "Adventure Game" code using SOLID principles. The original code violated several clean architecture principles, making it difficult to extend and maintain. During the refactoring process, the code was split into multiple separate classes, each responsible for a specific functionality.  

## Issues with the Original Code  

The initial `MonolithicAdventureGame` class combined:  

- Player management (health, experience, inventory)  
- Combat logic with enemies  
- Item pickup handling  
- Level and game state management  

This violated:  

- **SRP (Single Responsibility Principle)** – One class handled multiple responsibilities.  
- **OCP (Open/Closed Principle)** – Adding new enemies or items required modifying the core game logic.  
- **DIP (Dependency Inversion Principle)** – The code was dependent on concrete implementations of enemies and items.  

## Solution  

After refactoring, the project was divided into several classes:  

- **Player** – Manages player attributes like health, experience, and inventory.  
- **Enemy (Interface)** – Defines the common behavior of all enemies.  
- **Skeleton, Zombie** – Implement `Enemy`, each with unique combat behavior.  
- **Item (Interface)** – Defines items with specific effects on the player.  
- **GoldCoin, HealthElixir, MagicScroll** – Implement `Item`.  
- **CombatManager** – Controls damage and fights.  
- **AdventureGame** – Integrates the player, enemies, and items.  

## UML Diagrams  

Before and after refactoring, UML diagrams were created:  

- `before.png` – Structure of the monolithic class.  
- `after.png` – New architecture applying SOLID principles.  
