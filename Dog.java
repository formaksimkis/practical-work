public class Dog {

    String name;
    int age;
	int weight;
    String owner;

    public static void main(String[] args) {
        Dog bimka = new Dog();
        bimka.age = 3;
        bimka.name = "Bimka";
		bimka.weight = 23;
	    bimka.owner = "Maks";
        Dog laika = new Dog();
        laika.age = 3;
        laika.name = "Laika";
		laika.weight = 23;
	    laika.owner = "Sveta";
    }

}
