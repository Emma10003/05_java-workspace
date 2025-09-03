package edu.polymorphism.pack1.ex3.run;

import edu.polymorphism.pack1.ex3.service.AnimalService;
// 동물 패키지 실행공간
public class AnimalRun {
    public static void main(String[] args) {
        AnimalService animalService = new AnimalService();
        animalService.display();
    }
}
