public class ifElse {
    public static String compareIfElse(int a, int b) {
        // Write your code here
        if(a>b){
        return "greater";
        } else if(a==b){
        return "equal";
        } else{
            return "smaller";
        }
    }

    public static void main(String[]args){
          String sum=compareIfElse(1, 2);
          System.out.println(sum);
    }
}