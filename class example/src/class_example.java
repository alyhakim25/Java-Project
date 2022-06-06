
public class class_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog1 = new Dog("Shiba","woof woof", "Shiba Inu", 7);
		Dog dog2 = new Dog("Cihuahua","meng meng", "small leg", 4);
		
		dog1.sayHello();
		dog2.challenge(dog1);
	}

}

class Dog{
	String Name;
	String Greeting;
	String breed;
	int size;
	
	void sayHello() {
		System.out.println(Greeting + "! My name is " + Name + ". My breed is " + breed + ". My size rating is " + size + " out of 10");
	}
	
	void challenge(Dog challengerDog) {
		if(challengerDog.size < this.size)
		{
			System.out.println("Haha! Nobody messes with "+this.Name);
			
		}
		else
		{
			System.out.println("Oh no! " + challengerDog.Name + " was too scary! Run Away");
		}
	}
	
	Dog(String name, String greeting, String Breed, int Size){
		this.Name = name;
		this.Greeting = greeting;
		this.breed = Breed;
		this.size = Size;
	}
}