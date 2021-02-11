public class MOLTypePromotion {
    void Sum(int a,long b){
        System.out.println(a+b);
    }
    void Sum(int a,int b,int c){
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
        MOLTypePromotion obj1=new MOLTypePromotion();
        obj1.Sum(10,12);//now the second int literal will be promoted to long
        obj1.Sum(10,12,14);
    }

}
