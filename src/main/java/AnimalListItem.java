import java.util.Objects;

public class AnimalListItem {

    private final Animal value;
    private AnimalListItem next;

    public AnimalListItem(Animal value) {
        this.value = value;
    }

    public void setNext(AnimalListItem next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnimalListItem that = (AnimalListItem) o;
        return Objects.equals(value, that.value) && Objects.equals(next, that.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, next);
    }

    public Animal getValue() {
        return this.value;
    }

    public AnimalListItem getNext() {
        return this.next;
    }

    @Override
    public String toString() {
        return "AnimalListItem{" +
                "\nvalue=" + value +
                ", next=" + next +
                '}';
    }
}
