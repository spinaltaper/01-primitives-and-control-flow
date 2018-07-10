public class Pluralize {
    public static void main(String[] args){
     if(Integer.parseInt(args[1]) == 1) {
         System.out.println("I have a" + args[0]);
     }
     else{
         System.out.println("I have " + args[1] + args[0] + "s");
     }
    }
}
