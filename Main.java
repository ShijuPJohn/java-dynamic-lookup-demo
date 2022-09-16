import java.util.Scanner;

class LivingBeing {
    String name;
    int position;

    public LivingBeing(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public void move(int x) {
        System.out.println("Living Being's move method called");
        this.position += x;
    }
}

class Bird extends LivingBeing {
    public Bird(String name, int position) {
        super(name, position);
    }

    @Override
    public void move(int x) {
        System.out.println("Bird's move method called");
        super.move(x);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Which object do you want to make?");
        System.out.println("1. Living Being");
        System.out.println("2. Bird");
        LivingBeing l1;
        int choice = input.nextInt();
        if (choice == 1) {
            l1 = new LivingBeing("Tiger", 2);
        } else if (choice == 2) {
            l1 = new Bird("Parrot", 5);
        } else {
            l1 = null;
        }
        l1.move(10);
    }
}