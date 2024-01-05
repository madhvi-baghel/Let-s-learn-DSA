import java.util.*;
public class dataType {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        //  System.out.println("The character is ");
        String type = sc.nextLine();
        int size = dataTypes("integer");
        System.out.println(size);
    }
    public static int dataTypes(String type){
        // Write your code here
        // if (type == "integer"){
        //     return 4;
        // }else if(type == "Long"){
        //     return 8;
        // }else if(type == "Float"){
        //     return 4;
        // }else if(type == "Double"){
        //     return 8;
        // }else if(type == "Character"){
        //     return 1;
        // }else{
        //     return -1;
        // } 
        switch(type){
            case "integer":
            return 4;
            case "Long":
            return 8;
            case "Float":
            return 4;
            case "Double":
            return 8;
            case "Character":
            return 1;
            default:return 0;
        }
    
    }
}