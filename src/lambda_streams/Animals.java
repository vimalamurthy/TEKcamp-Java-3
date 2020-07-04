package lambda_streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Animals {

    static List<String> animals = Arrays.asList("peacoCK","rabbit","chiwawa","OranguTAN","vipeR","cobra","paNDa","bUffalo","DeeR","maLLard");

    public static void main(String[] args) {
        System.out.println("original animals : " + animals);

        List<String> cleaned = capsFirst(animals, false);
        System.out.println(cleaned );

        addAnimal("rEIndeeR");
        addAnimal("Platypus");
        addAnimal("frOg");
        addAnimal("lEOpArD");

        capsFirst(animals,true);
        System.out.println(animals);

        List<String> lowered = lowerFirst(animals,false);
        System.out.println(lowered);

        List<String> reverseAnimals = flipAnimals(false);
        System.out.println(reverseAnimals);

        List<String> sortedAnimals = sortAnimals(true);
        System.out.println(sortedAnimals);
    }

    static List<String> capsFirst(List<String> animalList, boolean mutate) {
        if (mutate) {
            animals=
            animals.stream()
                    .map(x -> x.toLowerCase())
                    .map(x -> x.substring(0, 1).toUpperCase() + x.substring(1))
                    .collect(Collectors.toList());
            return animals;
        } else {
            List<String> animalListCopy =
            animalList.stream()
                    .map(x -> x.toLowerCase())
                    .map(x -> x.substring(0, 1).toUpperCase() + x.substring(1))
                    .collect(Collectors.toList());
            return animalListCopy;
        }
    }

    static String addAnimal(String animal) {
        //add an animal to the animal list.
        List<String> newAnimals = new ArrayList<String>(animals);
        newAnimals.add(animal);
        animals=
                newAnimals.stream()
                        .map(x -> x.toLowerCase())
                        .map(x -> x.substring(0, 1).toUpperCase() + x.substring(1))
                        .collect(Collectors.toList());
        return animal;
    };

    static List<String> lowerFirst(List<String> animalList, boolean mutate) {
      if (mutate) {
            animals=
                    animals.stream()
                            .map(x -> x.toUpperCase())
                            .map(x -> x.substring(0, 1).toLowerCase() + x.substring(1))
                            .collect(Collectors.toList());
            return animals;
        } else {
            List<String> animalListCopy =
                    animalList.stream()
                            .map(x -> x.toUpperCase())
                            .map(x -> x.substring(0, 1).toLowerCase() + x.substring(1))
                            .collect(Collectors.toList());
            return animalListCopy;
        }
    }

    static List<String> flipAnimals(boolean mutate) {
        if (mutate){
            Collections.reverse(animals);
            return animals;
        } else {
            List<String> reverseanimalList =  new ArrayList<String>(animals);
            Collections.reverse(reverseanimalList);
            return reverseanimalList;
        }
    }

    static List<String> sortAnimals(boolean mutate) {
        if (mutate){
            animals = animals.stream()
                    .sorted((o1,o2)-> o1.compareTo(o2))
                    .collect(Collectors.toList());
            return animals;
        } else {
            List<String> sortedanimalList= animals.stream()
                    .sorted((o1,o2)-> o1.compareTo(o2))
                    .collect(Collectors.toList());
            return sortedanimalList;
        }
    }
}
