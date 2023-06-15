package Fenyuk_SOLID;

public class Main {

	public static void main(String[] args) {
		
		SU_27 plane = new SU_27(21935, 5932, 16300, 1350, "білий");

		plane.startEngines();
		plane.takeoffPlane();
		plane.moveUp();
		plane.moveLeft();
		plane.moveDown();
		plane.moveRight();
		plane.becomeStealth();
		plane.nuclearStrike();
		plane.turboAccelerate();
		plane.landingPlane();

	}

}
