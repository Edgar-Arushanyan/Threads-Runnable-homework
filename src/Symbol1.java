public class Symbol1 extends Thread{

    String name;

    Symbol1(String name){
        super(name);
    }


    public void run(){
        System.out.println(getName() + "hash");

        for (int counter =0; counter<100; counter++){
            System.out.print('#');

        }
    }

}
