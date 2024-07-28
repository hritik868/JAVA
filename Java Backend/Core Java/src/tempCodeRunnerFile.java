class mtThreadRunnable1 implements Runnable{
    int i = 0;
    public void run(){
        while(i<5){
        System.out.println("Thread - 1");
        i++;
    }
}
}

class mtThreadRunnable2 implements Runnable{
    int i = 0;
    public void run(){
            while(i<5){
            System.out.println("Thread - 2");
            i++;
        }
    }
}

class mtThreadRunnable3 implements Runnable{
    int i = 0;
    public void run(){
        while(i<5){
        System.out.println("Thread - 3");
        i++;
    }
}
}










public class using_runnable_interface {
    public static void main(String[] args) {

        mtThreadRunnable1 t1 = new mtThreadRunnable1();
        Thread r1 = new Thread(t1);
        
        mtThreadRunnable2 t2 = new mtThreadRunnable2();
        Thread r2 = new Thread(t2);

        mtThreadRunnable3 t3 = new mtThreadRunnable3();
        Thread r3 = new Thread(t3);

        r1.start();
        r2.start();
        r3.start();
        
    }
    
}
