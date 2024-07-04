import java.io.BufferedReader;
import java.io.InputStreamReader;
public class F {
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] np = input.readLine().split(" ");
        int n = Integer.valueOf(np[0]);
        int p = Integer.valueOf(np[1]);
        String[] premios = input.readLine().split(" ");
        //Bubble Sorting
        int mayor = 0;
        for(int i=0;i<n;i++){
            if(mayor < Integer.valueOf(premios[i]) && Integer.valueOf(premios[i]) <= p){
                mayor = Integer.valueOf(premios[i]);
            }
        }
        System.out.println(mayor);
    }
}
