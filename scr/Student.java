// Klasse Student
// Beschreibt einen Schüler mit grundlegenden Attributen
public class Student {
    // ===== Attribute (private für Datenkapselung) =====
    private String name;
    private int age;
    private String grade;
    private double averageMark;

    // ===== Konstruktoren =====
    public Student() {
        this.name = "Unbekannt";
        this.age = 0;
        this.grade = "Unbekannt";
        this.averageMark = 0.0;
    }

    public Student(String name, int age, String grade, double averageMark) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.averageMark = averageMark;
    }

    // ===== Getter und Setter =====
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getGrade() { return grade; }
    public void setGrade(String grade) { this.grade = grade; }

    public double getAverageMark() { return averageMark; }
    public void setAverageMark(double averageMark) { this.averageMark = averageMark; }

    // ===== Spezielle Methoden =====
    public boolean isPassed() {
        return averageMark >= 4.0; // Note 4 oder besser = bestanden
    }

    public void improveMark(double value) {
        this.averageMark -= value;
        if (this.averageMark < 1.0) this.averageMark = 1.0; // Beste Note
    }

    // ===== toString =====
    @Override
    public String toString() {
        return String.format("Student: %-10s | Alter: %2d | Klasse: %-6s | Durchschnitt: %.2f",
                name, age, grade, averageMark);
    }
}
