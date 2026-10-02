# Space Mission Bridge

## Assignment #3 — Bridge Pattern

**Course:** Software Design Patterns
**Language:** Java

This project demonstrates the **Bridge design pattern** using a space mission example.

## Bridge Pattern

The Bridge pattern separates an abstraction from its implementation so they can change independently.

* **Abstraction:** `SpaceMission`
* **Refined Abstractions:** `MarsMission`, `MoonMission`
* **Implementor:** `CommunicationSystem`
* **Concrete Implementors:** `RadioCommunication`, `LaserCommunication`
* **Client:** `Main`

Example:

```java
SpaceMission mars =
        new MarsMission(new RadioCommunication());

mars.sendMessage("Hello from Mars");
```

The communication system can be changed without changing `MarsMission`:

```java
SpaceMission mars =
        new MarsMission(new LaserCommunication());
```

## Project Structure

```text
src/
├── CommunicationSystem.java
├── RadioCommunication.java
├── LaserCommunication.java
├── SpaceMission.java
├── MarsMission.java
├── MoonMission.java
└── Main.java
```

## Clean Code

### 1. Meaningful Names

```java
sendMessage()
```

The method name clearly describes its purpose.

### 2. Small Methods

```java
public void send(String message) {
    System.out.println("Radio: " + message);
}
```

The method performs one simple task.

### 3. Separation of Responsibilities

`SpaceMission` handles the mission abstraction, while communication classes handle communication.

### 4. No Duplicated Logic

Both communication implementations follow the same `CommunicationSystem` interface but provide their own implementation.

### 5. Easy Extension

A new communication method can be added without changing `SpaceMission`.

For example:

```java
public class SatelliteCommunication
        implements CommunicationSystem {
    
    @Override
    public void send(String message) {
        System.out.println("Satellite: " + message);
    }
}
```

Existing mission classes do not need to be changed.

## How to Run

Run `Main.java` in IntelliJ IDEA.
