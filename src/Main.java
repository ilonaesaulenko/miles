public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: одну для хранения
        // стоимости билета, другую для хранения количества
        // рублей для одной бонусной милли

        // Рассчитываете количество бонусных милль, используя
        // значения заведённых переменных. Ответ сохраняете в
        // новую переменную и выводите на экран


        int ticketPrice = 5000;
        int oneMile = 20;
        int bonusMile = ticketPrice / oneMile;
        int total = bonusMile;

        System.out.println(total + "Миль");


    }
}