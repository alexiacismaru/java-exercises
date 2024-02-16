import java.util.List;

public class RunStudents {
    private static List<Student> data = List.of(
            new Student("Mary", 13.5),
            new Student("Marjory", 9.5),
            new Student("Pilar", 15),
            new Student("Marie Antoinette", 14.92
            ));

    public static void main(String[] args) {
        Students team = new Students(data);
        team.sortByScore(true);
        System.out.println("Team sorted by score: ");
        System.out.println(team);

        team.sortByScore(false);
        System.out.println("Team sorted by score descending: ");
        System.out.println(team);

        System.out.println("Student with highest Score: " + team.getHighScore());
        System.out.println("Student with lowest Score : " + team.getLowScore());
    }
}