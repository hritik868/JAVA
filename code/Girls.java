public class Girls extends Boys{
    void display1(){
        System.out.println("Girls");
    }
    void display2(){
        System.out.println("Girls-Girls");
    }

    @Override
    public void abs(){
        System.out.println("Abstract function");
    }
}