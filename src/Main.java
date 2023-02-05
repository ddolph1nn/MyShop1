public class Main {

    static int account = 312; //счет
    static int palto = 70; //пальто
    static int custom = 53; //дорогой костюм
    static int shlyapa = 25; //шляпа
    static int sorochka = 19; //сорочка
    static int tyfli = 41; //туфли



    public static void main(String[] args) {

        if (account >= palto) {
            System.out.println("Богач, ты смог купить дорогое пальто! ");
            System.out.println(balance(account, palto));
        }
            else System.out.println("Ты бедни, иди работай!"); {
            if (account >= custom) {
                System.out.println("Богач, ты смог купить дорогой костюм! ");
                System.out.println(balance(account, custom));
            }
            else System.out.println("Ты бедни, иди работай!");
            if (account >= shlyapa) {
                System.out.println("Богач, ты смог купить красивую шляпу! ");
                System.out.println(balance(account, shlyapa));
            }
            else System.out.println("Ты бедни, иди работай!");
            if (account >= sorochka) {
                System.out.println("Богач, ты смог купить балдежную сорочку!");
                System.out.println(balance(account, sorochka));
            }
            else System.out.println("Ты бедни, иди работай!");
            if (account >= tyfli) {
                System.out.println("Богач, ты смог купить туфли! ");
                System.out.println(balance(account, tyfli));
            }
            else System.out.println("Ты бедни, иди работай!");

        }
    }

    public static int balance(int a, int b) {
        return a - b;
    }
}