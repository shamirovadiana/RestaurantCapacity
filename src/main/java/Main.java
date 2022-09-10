import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacity = 300;
        System.out.println("Введите количество человек, которые собираются посетить заведение :");
        int num = scanner.nextInt();
        if (num > capacity) {
            System.out.println("Недостаточно мест, чтобы принять столько посетителей");
        } else {
            int emptySeats = capacity - num;
            System.out.println("Рады будем приветствовать в нашем заведении!");
            System.out.println("Количество оставшихся мест : " + emptySeats);
        }

    }
}
