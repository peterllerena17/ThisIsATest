package zoo;

public class Animals {
	
	String animalType;
	String color;
	int age;
	int height;
	
	public Animals(String animalType, String color, int age, int height) {
		this.animalType = animalType;
		this.color = color;
		this.age = age;
		this.height = height;
	}
	
	public String getAnimalType() {
		return animalType;
	}

	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public String toString() {
		return getAnimalType() + " " + getColor() + " " + getAge() + " " + getHeight();
	}
	
}
