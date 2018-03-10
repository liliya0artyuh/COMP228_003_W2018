package application;

public enum PenSize {
	   // enum representing pen sizes
	      SMALL(2), 
	      MEDIUM(4), 
	      LARGE(6);
	      
	      private final int radius;
	      
	      PenSize(int radius) {this.radius = radius;}
	      
	      public int getRadius() {return radius;}
}
