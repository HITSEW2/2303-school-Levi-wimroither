// Klasse Teacher
// Beschreibt eine Lehrkraft mit grundlegenden Attributen
public class Teacher {
    // ===== Attribute =====
    private String name;
    private String subject;
    private int experienceYears;
    private boolean isClassTeacher;

    // ===== Konstruktoren =====
    public Teacher() {
        this.name = "Unbekannt";
        this.subject = "Nicht zugewiesen";
        this.experienceYears = 0;
        this.isClassTeacher = false;
    }

    public Teacher(String name, String subject, int experienceYears, boolean isClassTeacher) {
        this.name = name;
        this.subject = subject;
        this.experienceYears = experienceYears;
        this.isClassTeacher = isClassTeacher;
    }

    // ===== Getter und Setter =====
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSubject() { return subject; }
    public void setSubject(String subject) { this.subject = subject; }

    public int getExperienceYears() { return experienceYears; }
    public void setExperienceYears(int experienceYears) { this.experienceYears = experienceYears; }

    public boolean isClassTeacher() { return isClassTeacher; }
    public void setClassTeacher(boolean classTeacher) { isClassTeacher = classTeacher; }

    // ===== Spezielle Methoden =====
    public void addExperience(int years) {
        if (years > 0) {
            this.experienceYears += years;
        }
    }

    public String getTeacherLevel() {
        if (experienceYears < 3) return "Berufsanfänger";
        else if (experienceYears < 10) return "Erfahren";
        else return "Veteran";
    }

    // ===== toString =====
    @Override
    public String toString() {
        return String.format("Lehrer: %-10s | Fach: %-10s | Erfahrung: %2d Jahre | Klassenlehrer: %b (%s)",
                name, subject, experienceYears, isClassTeacher, getTeacherLevel());
    }
}
