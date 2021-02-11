public class VariableHandlingTest {
    public static void main(String[] args) {
        //Boolean variable (Declaration)
        boolean flag1=true;
        boolean flag2=false;
        System.out.println("Boolean flag1 value:"+flag1);
        System.out.println("Boolean flag2 value:"+flag2);
        System.out.println();//Prints new Line
        //Byte Variable
        byte b1=10;//decimal value 10
        //Literal in HexaDecimal Starts with 0x
        byte b2=0xa;//0xa is Hexadecimal,equals to 10 in decimal
        System.out.println("Byte1 value :"+b1);
        System.out.println("Byte2 value :"+b2);
        System.out.println();//Prints new Line
        //Short Variable
        short s1=11;
        System.out.println("Short value :"+s1);
        System.out.println();//Prints new Line
        //Char variable,Declaration and initialization in one line of code
        //The first Declaration is in UNICODE
        char ch1=65,ch2='A';
        System.out.println("Char1 Value is:"+ch1);
        System.out.println("Char2 Value is:"+ch2);
        System.out.println();
        //Int Variables
        int decimal=100;
        int octal=0144;//An octal variable starts with 0
        int hexa=0x64;//An hexadecimal value starts with 0x or 0X
        System.out.println("Int Decimal value:"+decimal);//prints 100
        System.out.println("Int Octal value:"+octal);//prints 100 too
        System.out.println("Int Hexadecimal value:"+hexa);//prints 100 too
        System.out.println();
        //Long Variables
        long long1=10;//by default a literal is of type int
        long long2=20L;//with suffix l or L the literal is converted to Long
        System.out.println("Long1 value:"+long1);
        System.out.println("Long2 value:"+long2);
        System.out.println();
        //float Variable
        float f1=15;//by default a float literal is of type double
        float f2=22.3f;//with the suffic f or F the literal is converted to float
        System.out.println("Float1 value:"+f1);
        System.out.println("Float2 value:"+f2);
        System.out.println();

        //Double Variables
        double d1=11.0;//by default a float literal is of type double
        double d2=30.15D;//with the suffix D,converts a literal to Double
        System.out.println("Double1 value:"+d1);
        System.out.println("Double2 value:"+d2);
        System.out.println();

    }
}
