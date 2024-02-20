 class sum {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int num1 = num;
        int sum = 0 ;
        while(num>0){
                sum +=num%10;
                num /= 10;
        }
        System.out.println(sum);
    }
}
