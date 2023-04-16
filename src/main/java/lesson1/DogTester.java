package lesson1;

import java.util.Arrays;

public class DogTester {
    public static void main(String[] args) {
        Dog trezor = new Dog();

        trezor.age = 5;
        trezor.name = "Trezor";
        trezor.breed = "Bulldog";
        trezor.color = "White";

        System.out.println("Trezor breed is:" + trezor.breed);
        String dogBreed;
        String dogName;
        int dogAge;
        String dogColor;
        Dog eleonora = new Dog(dogBreed = "Bolonka", dogName = "Eleonora", dogAge = 3, dogColor = "White");

        System.out.println("Eleonora's age is: " + eleonora.age);


        trezor.bark();
        eleonora.bark();
    }
}
class Dog {
    public int age;
    public String name;
    public String breed;
    public String color;

    public Dog(String s, String s1, int i, String s2) {
    }

    public Dog() {
        
    }
    //public  Dog(String dogBreed, String dogName, int dogAge, String dogColor)//   {
  // breed = dogBreed;
      //  name = dogName;
       //age = dogAge;
        //color = dogColor;
    }


   /* public Dog()

    {

    }

    private String breed;
    private String name;
    private int age;
    private String color;
    //методы функции действия*/
    void bark()
    {
        System.out.println(name + "bark-bark!");
        

    }

}*/

