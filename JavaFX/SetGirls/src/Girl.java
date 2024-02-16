import java.util.Objects;

public class Girl {
    private final String name;//new String attribute
    private final int age;//new int attribute

    @Override
    public String toString() {
        return String.format("%s (%d)", name, age);
    }//toString() method

    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }//constructor

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Girl girl = (Girl) o;
        return age == girl.age && Objects.equals(name, girl.name);
    }//equal() method

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public int compareTo(Girl o) {
        int nameCompare = name.compareTo(o.name);
        return nameCompare == 0 ? age - o.age : nameCompare;
    }//sort the elements on name, if they have the same name, sort them based on age
}