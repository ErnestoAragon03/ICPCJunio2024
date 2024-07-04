import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.ArrayList;
public class C{
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        

        //leemos un numero(numero de inputs)
        int cant_inputs = Integer.valueOf(input.readLine());
        ArrayList<Integer> contador = new ArrayList<>();

        for(int j = 0; j < cant_inputs; j++){
            String[] ti = input.readLine().split(" ");
            int i = Integer.valueOf(ti[0]);
            int t = Integer.valueOf(ti[1]);
            int count = 0;
            if(t == 1){
                count=i;
            }else{
                for(int n=1; t>n; n++){
                    for(int m=1; i>=m; m++){
                        if((n*m)+1==t){
                            count++;
                        }
                        
                        if((n*m)+1>t){
                            break;
                        }
                    }
                }
            }
            contador.add(count);
        }
        //Imprimir resultado
        for(int element : contador){
            System.out.println(element);
        }
        
    }
}
