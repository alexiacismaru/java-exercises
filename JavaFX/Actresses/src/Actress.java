public class Actress {
    private String name;
    private int birthYear;

    public Actress(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        return name.equals(((Actress) object).name);
    }//actresses that have the same name are considered the same actress

    public int compareTo(Actress other) {
        int compareYear = birthYear - other.birthYear;
        return (compareYear != 0) ? compareYear : name.compareTo(other.name);
    }//natural sorting order is birthYear and then name

    @Override
    public String toString() {
        return String.format("%s (%d)", name, birthYear);
    }
}
