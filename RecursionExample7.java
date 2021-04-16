public class RecursionExample7 {
    public static void main(String[] args){
        convertToBin(10);
        System.out.println("");
    }
    public static void convertToBin(int decimalNum){
        int quotient = decimalNum/2;
        int remainder = decimalNum%2;
        if(quotient>0){
            convertToBin(quotient);
            }
            System.out.print(remainder);
    }
}
