class Student {
    int rollno;
    String name, course;
    float fee;

    Student(int rollno, String name, String course, float fee) {
        this.rollno = rollno;
        this.name = name;
        this.course = course;
        this.fee = fee;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + course + " " + fee);
    }
}

class ThisKey {
    public static void main(String args[]) {
        Student s1 = new Student(2, "ajith", "CS", 80000);
        Student s2 = new Student(4, "stark", "CS", 80000);

        s1.display();
        s2.display();
    }
}
