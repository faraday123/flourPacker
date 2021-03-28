/**
 * Name: Samuel Adams Adjin
 */
public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        bigCount *= 5;
        int sum = bigCount + smallCount;


        if (((sum >= goal && bigCount <= goal ) ) || (goal % 5 == 0  )) {
            return true;
        }
        else if ((goal % 5) < smallCount){
            return true;
        }



        else if (bigCount < 0 || smallCount < 0) {
            return false;
        } else {
            return false;
        }



    }
}
