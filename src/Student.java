public class Student {
    private int rollNumber;
    private String name;
    private static String college = "RMIT";

    Student(int r, String n) {
        this.rollNumber = r;
        this.name = n;
    }

    static void change() {
        college = "VinUni";
    }

    void display() {
        System.out.println(this.rollNumber + " " + this.name + " " + this.college);
    }
}
