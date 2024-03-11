public class rectclass{
    public static void main(String[] args) {
        rectangle  r = new rectangle();
        r.setdata(10,15);
        System.out.println(r.area());

    }
}

class rectangle{
   double l,w;

     void setdata(double a, double b){
    l=a;
    w=b;
    }
     double area(){
       double area = l*w;
        return area;
    }
}