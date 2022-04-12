import java.util.Random;
public class Monty{
    private void JustDoIt(int doors){
        int switchSuccess=0;
        for (int i=0; i<1000; i++){
            boolean[] arr = new boolean[3];
            for (int j=0; j<arr.length; j++){
                arr[j]=false;
            }
            Random rand = new Random();
            int car = rand.nextInt(doors);
            arr[car] = true;

            int randomfalse =0;
            int choose1 = rand.nextInt(doors);
            for (int k=0; k<arr.length; k++){
                if(k!=choose1 && k!=car) {
                    randomfalse=k;
                    break;
                }
            }
            int endChoice=0;
            for(int l=0; l<arr.length; l++){
                if(l!=choose1 && l!=randomfalse){
                    endChoice = l;
                    break;
                }
            }
            if(endChoice==car) switchSuccess++;
        }
        System.out.println("The number of times switched worker out = " + String.valueOf(switchSuccess));
    }
    public static void main(String[] args){
        Monty m = new Monty();
        m.JustDoIt(3);
    }
}