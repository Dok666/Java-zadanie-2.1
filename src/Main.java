public class Main {
    public static void main(String[] args) {
        int ticketPrice = 2000; // Стоимость билета в рублях
        int oneMileBonus = 20; // Стоимость одной бонусной мили в рублях
        int bonusMiles = ticketPrice / oneMileBonus; // Количество бонусных милей
        System.out.println("Количество бонусных миль: " + bonusMiles);
    }
}
