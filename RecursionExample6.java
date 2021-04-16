public class RecursionExample6 {
    

        public static void main(String[] args) {
            
    /*		int kq = giaithua(6);
            System.out.print("Ket qua n! = " +kq);
        }
        
        public static int giaithua(int n)
        {
            if(n==1)
                return 1;
            return giaithua(n-1)*n;
        }
    
    }*/
            int kq = a(7);
            System.out.print("Ket qua = " +kq);
        }
        
        public static int a(int n)
        {
            if(n==1)
                return 1;
            return a(n-1)+(2*n-1);
        }
    
    
}
