public class Cat {

    String name;
    int age;
	String sex;
    public void eat() {
        System.out.println("It's time for food");
    }

    public static void main(String[] args) {
        Cat tima = new Cat();
        tima.age = 5;
        tima.name = "Tima";
		tima.sex = "male";
		Cat barsik = new Cat();
        barsik.age = 3;
        barsik.name = "Barsik";
		barsik.sex = "male";
    }

}
