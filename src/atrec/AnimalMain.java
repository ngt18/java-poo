package atrec;

public class AnimalMain {
    public static void main(String[] args) {
        Animal animal = new Animal("Thor "," Pitbull",15);
        Animal animal1 = new Animal("bolt"," doberman",11);
        Animal animal2 = new Animal("joao"," sigma",1);
        Animal animal3 = new Animal("tom"," pastor alemao",6);

        System.out.println(animal);
        System.out.println("--------------------");
        System.out.println(animal1);
        System.out.println("--------------------");
        System.out.println(animal2);
        System.out.println("--------------------");
        System.out.println(animal3);
        System.out.println("--------------------");


    }
}
