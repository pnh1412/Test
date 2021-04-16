public class Timsofibonaci {
    // dung de quy de tinh so fibonaci thu n
    int fibonaci(int n){
     if(n == 1 || n ==2)return 1;
     return fibonaci(n-1) + fibonaci(n-2);
    }
     // khong dung de quy de tim fibonaci
    int fibonaciN(int n){
     if(n == 1 || n == 2) return 1;
     int i =3,a=0,a1 =1,a2 =1;
     while(i<=n){
      a = a1+a2;
      a1 =a2;
      a2 =a;
      i++;
     }
     return a;
      }
      public static void main(String args[]){
       int n =40;
     Timsofibonaci fb = new Timsofibonaci();
     System.out.println("so fibonaci thu n: " + n +" la : " +fb.fibonaci(n));
     System.out.println("so fibonaci thu n: " + n +" la : " +fb.fibonaciN(n));
    }
   }