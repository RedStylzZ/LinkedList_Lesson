public class Main {

    public static void main(String[] args) {
        Animal klaus = new Animal("Klaus");
        Animal turtle = new Animal("Turtle");
        Animal dog = new Animal("Dog");
        Animal test = new Animal("test");
        Animal test1 = new Animal("test1");
        Animal test2 = new Animal("test2");
        AnimalList animalList = new AnimalList(new AnimalListItem(klaus));

//        animalList.add(klaus);
        animalList.add(turtle);
        animalList.add(dog);
        animalList.add(test);
        animalList.add(test1);
        animalList.add(test2);
        animalList.add(dog);
        animalList.remove(klaus);
        System.out.println(animalList);
    }

}
