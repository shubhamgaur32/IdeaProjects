public class PromotionAmbiguityMOL {
    void sum(int a,long b){
        System.out.println("A method invoked");
    }
    void sum(long a,int b){
        System.out.println("B method invoked");
    }

    public static void main(String[] args) {
        PromotionAmbiguityMOL obj=new PromotionAmbiguityMOL();
        obj.sum(20,20);//Now Ambiguity
    }
}
