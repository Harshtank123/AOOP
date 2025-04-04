public class Main{
         public static void main(String[] args) {
             int num = 222;
             int h = 0;
             while(num != 0){
                 int digit = num % 10;
                 h= h*10+digit;
                 num /= 10;
             }
             System.out.println(h);
        }
     }
