import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalListTest {

    Animal klaus = new Animal("Klaus");
    Animal turtle = new Animal("Turtle");
    Animal dog = new Animal("Dog");
    Animal test = new Animal("test");
    Animal test1 = new Animal("test1");
    Animal test2 = new Animal("test2");

    /*void checkToString() {
        AnimalList animalList = new AnimalList();
        animalList
        assertEquals("Turtle -> Dog -> test -> test1 -> test2 -> Dog", anim);
    }*/

    @Test
    void checkToStringEmpty() {
        AnimalList animalList = new AnimalList();
        assertEquals("", animalList.toString());
    }

    @Test
    void checkRemoveEmpty() {
        AnimalList animalList = new AnimalList();
        animalList.remove(klaus);
        assertEquals("", animalList.toString());
    }

    @Test
    void checkAdd() {
        AnimalList animalList = new AnimalList();
        Animal klaus = new Animal("Klaus");
        animalList.add(klaus);
        assertEquals("Klaus", animalList.toString());
    }

}