public class Symbol2 implements Runnable{

    String name;

    Symbol2(String name){
        this.name=name;
    }


    public void run() {
        System.out.println(name + "stars");

        for (int counter = 0; counter < 100; counter++) {
            System.out.print('*');

        }
    }
}
