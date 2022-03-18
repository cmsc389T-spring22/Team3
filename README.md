# CMSC 389T (Team 3)
Group Members: Ishaan Bhasin, Sreyas Chacko, Darren Kam, Selena Xiao

## Image of PacMan running
![PacMan](https://user-images.githubusercontent.com/49574843/156697925-f197035a-2819-4b30-b853-6065ef9f4dd7.PNG)


## How to run the code from the command line
To compile and run Pacman, go to the P3 directory and run the following commands:
```bash
javac -cp "src/" src/*.java 
java -cp "src/" StartMenu
```

## Functions:
### PacMan:
Sreyas: get_valid_moves(Generates the valid locations to where the PacMan can move from its current location, storing them in an ArrayList.)

Selena: is_ghost_in_range(Checks the map if there are ghosts at any location one away from pacman)

Darren: move(Moves pacman one step from its current location.)

Ishaan: consume(If the location of the cockie is same as the pacman it consumes the cockie.)
### Ghost:
Sreyas: get_valid_moves(Generates the valid locations to where the Ghost can move from its current location, storing them in an ArrayList.)

Selena: move(Moves the ghost to the first valid move, returns false if no possible valid moves)

Darren: is_pacman_in_range(Checks if pacman is at a location one away from the ghost)

Ishaan: attack(If the ghost is in range of pacman, which is checked by is_in_range function, it attacks the pacman.)

### Map:
Sreyas: getLoc(Obtains the icon presently located in the given location.)

Selena: move(Updates locations, components, field with new location of a component)

Darren: eatCookie(Updates locations, components, and field when pacman eats a cookie)

Ishaan: attack(It controls ghost attacking pacman. Successful attacks return true while others return false. )
