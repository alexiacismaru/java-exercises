import java.util.Objects;

public class Girl {
    private String name;
    private int age;

    @Override
    public String toString() {
        return String.format("%s (%d)", name, age);
    }

    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Girl girl = (Girl) o;
        return age == girl.age && Objects.equals(name, girl.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public int compareTo(Girl o) {
        int nameCompare = name.compareTo(o.name);
        return nameCompare == 0 ? age - o.age : nameCompare;
    }//sort the elements on name, if they have the same name, sort them based on age
}