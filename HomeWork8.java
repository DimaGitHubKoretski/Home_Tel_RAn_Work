/**
 * Java Basic Home Work #8
 *
 * @author Dzmitry Karetsi
 * @todo 28.09.2022
 * @data 29.09.2022
 *
 */
public class HomeWork8 {

    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", "red", 2);
        System.out.println(cat);
        System.out.println(cat.voice());
        Cat cat1 = new Cat("Murzik", "gray", 4);
        System.out.println(cat1);
        System.out.println(cat1.voice());
    }
}

public class Cat {
    String name;
    String color;
    int age;

    public Cat(String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String voice(){
        return name + ": meow!";
    }

    public String toString(){
        return "Cat: " + name + ", color: " + color + ", age:" +age;
    }
}