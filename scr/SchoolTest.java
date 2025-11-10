// Testprogramm zur Demonstration der Klassen Student und Teacher
public class SchoolTest {
    public static void main(String[] args) {
        System.out.println("=== SCHOOL TEST PROGRAMM ===\n");

        // ===== Objekte erzeugen =====
        Student s1 = new Student("Lena", 16, "10A", 3.5);
        Student s2 = new Student("Tom", 17, "11B", 4.7);
        Teacher t1 = new Teacher("Müller", "Mathe", 5, true);
        Teacher t2 = new Teacher("Schmidt", "Englisch", 12, false);

        // ===== Vorherige Zustände =====
        System.out.println("Vorherige Zustände:\n");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(t1);
        System.out.println(t2);

        // ===== Methoden aufrufen und Zustände ändern =====
        System.out.println("\n--> Zustände werden geändert...\n");

        s1.improveMark(0.5); // Lena wird besser
        s2.improveMark(1.0); // Tom verbessert sich stark
        t1.addExperience(2); // Lehrer bekommt mehr Erfahrung
        t2.setClassTeacher(true); // Schmidt wird Klassenlehrer

        // ===== Nachherige Zustände =====
        System.out.println("Nachherige Zustände:\n");
        System.out.println(s1 + " | Bestanden: " + s1.isPassed());
        System.out.println(s2 + " | Bestanden: " + s2.isPassed());
        System.out.println(t1);
        System.out.println(t2);

        System.out.println("\n=== PROGRAMM ENDE ===");
    }
}
