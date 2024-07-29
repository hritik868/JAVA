// public class Baccha implements Kids{
    public class InnerBaccha implements Kids {
    public void play() {
        System.out.println("Playing with toys");
    }
    public void eat(){
        System.out.println("Eating candies");
    }
    public void sleep(){
        System.out.println("Sleeping");
    }
    
// }


    public static void main(String[] args) {
        
        InnerBaccha bc = new InnerBaccha();
        bc.play();
        bc.eat();
        bc.sleep();
    }
}
