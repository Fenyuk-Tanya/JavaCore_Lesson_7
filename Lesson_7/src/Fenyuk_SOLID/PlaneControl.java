package Fenyuk_SOLID;

public class PlaneControl {
	
   void moveUp() {
	   System.out.println("Літак рухається вверх "  + Move.move() + " км");
   }
   
   void moveDown() {
	   System.out.println("Літак рухається вниз "  + Move.move() + " км");
   }
   
   void moveLeft() {
	   System.out.println("Літак рухається вліво "  + Move.move() + " км");
   }
   
   void moveRight() {
	   System.out.println("Літак рухається вправо "  + Move.move() + " км");
   }
}
