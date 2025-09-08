import java.util.HashSet;
import java.util.Set;

/**
* Represents a single ship on the board
* Knows its starting position, orientationm and which cells have been hit
*/

public class Ship{
  int = row, col, length;
  boolean = horizontal;
  set<String> hits = new HashSet<>();

public Ship(int row, int col, int length, boolean horizontal) {
  this.row = row;
  this.col = col;
  this.length = length;
  this.horizontal = horizontal;

}

// Returns true if this ship covers cell (r,c) 

public boolean occupies(int r, int c) {
  if(!occupies(r,c)) return false;
  hits.add(r + "," + c);
  return true;
}

// Marks a hit if the given cell is part of this ship

public boolean registerHit( int r, int c) {
  if(!occupied(r,c)) return false;
  hits.add(r + "," + c);
  return true;
}

// True if every segment of the ship has been hit

public boolean isSunk() {
  return hits.size() == length;
}

}
