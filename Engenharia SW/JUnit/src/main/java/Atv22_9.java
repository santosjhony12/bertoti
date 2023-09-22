public class Atv22_9 {
    public static void main(String[] args){

        for(int cont = -32567; cont<32569; cont++ ){
            if(function1(cont) != function2(cont)) System.out.println(cont);
        }
    }
    public static int function1(int a){
        int b = a+1;
        int c = b/30000;
        return c;
    }
    public static int function2(int a){
        int b = a-1;
        int c = b/30000;
        return c;
    }

}
