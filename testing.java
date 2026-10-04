import java.util.Random;
// this file will be kept for testing throughout my process it's probably for checking how my barriers works or some stuff like that without actually including it in the code base
public class testing {
    public static void main(String[] args) {
        Random random = new Random(); 
        int zeroToNine = random.nextInt(10); 
        for (int i=0; i<20; i++){
            System.err.println(zeroToNine);
            zeroToNine = random.nextInt(10); 
        }
        
    }
}
