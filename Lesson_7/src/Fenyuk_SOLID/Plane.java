package Fenyuk_SOLID;

public abstract class Plane {
	
	private int length;
	private int height;
	private int weight;
	
	
	public Plane(int length, int height, int weight) {
		super();
		this.length = length;
		this.height = height;
		this.weight = weight;
	}
	
	public void startEngines() {
		int countdown = 20 + (int) (Math.random() * (68 + 1));
		System.out.println("Запуск двигунів. До злету залишилося " + countdown + " секунд");
	}
	
	public void takeoffPlane() {
		double distance = (Math.random() * 1000);
		System.out.println("Взлітаю. Літак з повним баком пролетить " + distance + " км");
	}
	
	public void landingPlane() {
		System.out.println("Виконую посадку. Розпочинаю зниження ...");
	}
	
	
	private PlaneControl planeControl = new PlaneControl();
	
	public void moveUp() {
		planeControl.moveUp();
	}

	public void moveDown() {
		planeControl.moveDown();
	}

	public void moveLeft() {
		planeControl.moveLeft();
	}

	public void moveRight() {
		planeControl.moveRight();
	}

}
