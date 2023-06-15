package Fenyuk_SOLID;

public class SU_27 extends Plane implements TurboAcceleration, StealthTechnology, NuclearStrike  {
	
	int maxSpeed;
	String color;
	
	public SU_27(int length, int height, int weight, int maxSpeed, String color) {
		super(length, height, weight);
		this.maxSpeed = maxSpeed;
		this.color = color;
	}

	public void turboAccelerate() {
		int accSpeed = this.maxSpeed + (int) (Math.random() * this.maxSpeed);
		System.out.println("Турборискорення  запущено. Швидкість літака " + accSpeed + " км/год");
	}


	public void becomeStealth() {
		int unvisibleTime = (int) (Math.random() * 1000);
		System.out.println("Запущена технологія Стелс. Літак зник з радарів на " + unvisibleTime + " cекунд");
	}

	
	public void nuclearStrike() {
		int bombsAmount = (int) (Math.random() * (10 + 1));
		System.out.println("Активована функція ядерного удару. На обєкт буде скинуто " + bombsAmount + " боєголовок");
	}
	

}
