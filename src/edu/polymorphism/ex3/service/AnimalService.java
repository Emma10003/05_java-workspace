package edu.polymorphism.ex3.service;

import edu.polymorphism.ex3.model.AnimalBad;

public class AnimalService {
    public void display() {
        Dog dog = new AnimalBad("멍멍이", 3, "갈색", "개");
        Cat cat = new AnimalBad("야옹이", 2, "흰색", "고양이");
        Bird bird = new AnimalBad("짹짹이", 1, "노란색", "새");

        System.out.println("=== 동물들의 행동 ===");
        /*
        다형성으로 출력
        다형성 변수 이름: animals, animal
        */
        Animal[] animals = {dog, cat, bird};



        // 개
        dog.makeSound();
        dog.move();
        dog.setTrained(true);
        dog.doSpecialAction();
        dog.eat();
        System.out.println(dog.toString());

        System.out.println();

        // 고양이
        cat.makeSound();
        cat.move();
        cat.doSpecialAction();
        cat.eat();
        System.out.println(cat.toString());

        System.out.println();

        // 새
        bird.makeSound();
        bird.move();
        bird.doSpecialAction();
        bird.eat();
        System.out.println(bird.toString());
    }
}
