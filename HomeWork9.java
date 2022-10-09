/**
 * Java Basic Home Work #4
 *
 * @author Dzmitry Karetsi
 * @todo 5.10.2022
 * @data 9.10.2022
 *
 */
public class HomeWork9 {
    public static void main(String[] args) {
        Cat cat = new Cat("barsik","red", 1);
            Dog dog = new Dog("Guffi", "Black", 4);
            IAnimal[] animals =  { cat, dog};
        for(IAnimal animal : animals ){
                System.out.println(animal);
                System.out.println(animal.voice());
        }
    }
}

/**
public class Animals {
    protected String name;
    protected String color;
    protected int age;
    public Animals(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}

public interface IAnimal {
    public String voice();
}

public class Cat extends Animals implements IAnimal{
    public Cat(String name, String color, int age) {
        super(name, color, age);
    }
    public String voice(){
        return "Gaf-gaf";
    }
}

public class Dog extends Animals implements IAnimal{
    public Dog(String name, String color, int age) {
        super(name, color, age);
    }
    public String voice(){
        return "meow";
    }
}
 */
