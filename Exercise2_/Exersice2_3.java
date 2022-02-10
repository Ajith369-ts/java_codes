package Exercise2_;

class Question23 {
    public static void main(String[] args) {
        // Object of the main class is created
        Question23 q = new Question23();
        // Print method on object of Question class is called
        q.studentMethod();
    }

    void print(Question23 object) {
        System.out.print("Well Done!");
    }

    void studentMethod() {
        print(this);
    }
}
