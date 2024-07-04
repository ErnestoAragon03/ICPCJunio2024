import java.io.BufferedReader;
import java.io.InputStreamReader;
public class L{
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int cantpersonas = Integer.valueOf(input.readLine());

        String[] derecho = input.readLine().split(" ");
        String[] izquierdo = input.readLine().split(" ");
        int contador = 0;

        //Ordenar Derecho
        for(int i=0;i<cantpersonas;i++){
            int iz = 0;
            int d = 0;
            for(int j=1;j<cantpersonas;j++){
                if(Integer.valueOf(derecho[j])==i+1 && j>i){
                    
                    String aux = derecho[i];
                    derecho[i]=derecho[j];
                    derecho[j]=aux;
                    contador++;
                    d = 1;
        
                }

                if(Integer.valueOf(izquierdo[j])== i+1 && j>i){
                    String aux = izquierdo[i];
                    izquierdo[i]=izquierdo[j];
                    izquierdo[j]=aux;
                    contador++;
                    iz = 1;
                }

                if(iz == 1 && d == 1){
                    break;
                }
            }

        }

        System.out.println(contador);

    }
}
