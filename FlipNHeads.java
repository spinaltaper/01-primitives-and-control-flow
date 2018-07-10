
public class FlipNHeads {
    public static void main(String[] arg){
        int totalFlips=0;
        int consecutiveFlips=0;

        while(consecutiveFlips!=Integer.parseInt(arg[0])){

            double n = Math.random();
            if(n > .5){
                System.out.println("heads");
                consecutiveFlips++;
                totalFlips++;
            }
            else{
                System.out.println("tails");
                consecutiveFlips = 0;
                totalFlips++;
            }
        }
        System.out.println("It took " + totalFlips + " to flip " + arg[0] + " heads in a row.");
    }
}