public class Main {

    /*
    Написать метод 100 раз печатающий символ и вывести на экран
     результат его работы для двух потоков (Например, один поток печатает # а второй *).
    В конце работы на экран должно выводиться "end of main"
     */
    public static void main(String[] args)throws Exception {


        Symbol1 symbol1 = new Symbol1("Thread1");
        Thread newThread = new Thread(symbol1);
        newThread.start();
        newThread.join();

        System.out.println();

        Symbol2 symbol2 = new Symbol2("Thread2");
        Thread newThread1 = new Thread(symbol2);
        newThread1.start();
        newThread1.join();

        System.out.println(" end of main");
        /*
        Thread1hash
        ####################################################################################################
        Thread2stars
        **************************************************************************************************** end of main
         */


    }
}