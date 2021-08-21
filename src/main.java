import java.util.Random;
import java.util.Random;
import java.util.Scanner;

public class main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        float x,y,num_point_total=0,num_point_circle=0,pi;
        double distance;
        System.out.println("Ingrese un numero: (llegue 10.000.000) \n");
        num_point_total = in.nextInt();
        for(int i=0;i<num_point_total;i++){
            x = rand.nextFloat();
            y = rand.nextFloat();
            distance = Math.pow(x,2)+ Math.pow(y,2);
            if(distance <= 1){
                num_point_circle++;
            }
        }
        pi = (4*(num_point_circle/num_point_total));
        System.out.println("Pi=" + pi);
    }
}
