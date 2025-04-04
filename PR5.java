public class Main{
        public static void main(String[] args) {
            int num = 45;
        int a;
        int b;
        for( a=1;a<=num ; a++){
            for(b = 2 ; b <= a ; b++){
                if(a%b ==0){
                    break;
                    }
            }if(a == b){
                System.out.println(b);   
            }
        }
    }
}
