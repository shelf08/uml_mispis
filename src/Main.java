public class Main {
    public static void main(String[] args) {
        University university = new University();
        Faculty computerScience = new Faculty("Computer Science Faculty",
                new Employee(1, "Bob Goroh", "cs@vsu.ru") {
                });
        Institute institute = new Institute("Information systems and technologies", "Universitetskaya Ploschad' 1");
        computerScience.addInstitute(institute);
        university.addFaculty(computerScience);
        System.out.println(university);
    }
}
