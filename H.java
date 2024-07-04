import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
public class H{
    public static void main(String[] args) throws Exception{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] parameters = input.readLine().split(" ");

        int n = Integer.valueOf(parameters[0]);
        int r = Integer.valueOf(parameters[1]);
        int c = Integer.valueOf(parameters[2]);
        LinkedList<Integer> game = new LinkedList<>();
        //Crear la lista que representa el juego
        for(int i=1;i<=n;i++){
            game.add(i);
        }
        ArrayList<Integer> contratados = new ArrayList<>();
        int s1 = 1;
        int s2 = game.size();
        while(game.size()>2){

            s1 = ((s1 + r) % n) -1;
            s2 = (n - ((s2+c) % n)) + 1;
            if(s1 == s2){
                contratados.add(game.get(s1-1));
                game.remove(s1-1);
            }
            else{
                if(s1<s2){
                    game.remove(s2-1);
                    game.remove(s1-1);
                }
                else{
                    game.remove(s1-1);
                    game.remove(s2-1);
                }
            }
            s1--;
            s2--;
        }
        contratados.add(game.getFirst());
        contratados.add(game.getLast());

        for(int element : contratados){
            System.out.println(element);
        }

    }
}
