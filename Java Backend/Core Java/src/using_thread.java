class myThread1 extends Thread{
    public void run(){
        int i = 0;
        while(i<5){
        System.out.println("Task - 1");
        i++;
        }
    }
}

class myThread2 extends Thread{
    public void run(){
        int i = 0;
        while(i<5){
        System.out.println("Task - 2");
        i++;
        }
    }
}

class myThread3 extends Thread{
    public void run(){
        int i = 0;
        while(i<5){
        System.out.println("Task - 3");
        i++;
        }
    }
}



public class using_thread{
    public static void main(String[] args) {
        myThread1 mt1 = new myThread1();
        myThread2 mt2 = new myThread2();
        myThread3 mt3 = new myThread3();

        mt1.start();
        mt2.start();
        mt3.start();

}}
