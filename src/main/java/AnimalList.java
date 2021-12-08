import java.util.Objects;

public class AnimalList {

    AnimalListItem head;

    public AnimalList(AnimalListItem head) {
        this.head = head;
    }
    public AnimalList() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnimalList that = (AnimalList) o;
        return Objects.equals(head, that.head);
    }

    @Override
    public int hashCode() {
        return Objects.hash(head);
    }

    @Override
    public String toString() {
        if (head == null) return "";
        StringBuilder stringBuilder = new StringBuilder();
        AnimalListItem nextAnimalList = head;

        while (nextAnimalList != null) {
            stringBuilder.append(nextAnimalList.getValue().getName()).append(nextAnimalList.getNext() == null ? "" : " -> ");
            nextAnimalList = nextAnimalList.getNext();
        }

        return stringBuilder.toString();
    }

    public void add(Animal animal) {
        if (head == null) {
            this.head = new AnimalListItem(animal);
            return;
        }
        AnimalListItem nextAnimalList = head;

        while (nextAnimalList.getNext() != null) {
            nextAnimalList = nextAnimalList.getNext();
        }
        nextAnimalList.setNext(new AnimalListItem(animal));
    }

    public void remove(Animal animal) {
        if (head == null) return;
        AnimalListItem nextAnimalList = head;

        while (nextAnimalList.getNext() != null) {
            if (head.equals(nextAnimalList)) {
                head = nextAnimalList.getNext();
                nextAnimalList = nextAnimalList.getNext();
            }
            if (nextAnimalList.getNext().getValue().equals(animal)) {
                nextAnimalList.setNext(nextAnimalList.getNext().getNext());
                continue;
            }
            nextAnimalList = nextAnimalList.getNext();
        }

    }

}
