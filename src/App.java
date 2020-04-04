import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws IOException {
        Stack e = new Stack();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int decimal;
        System.out.println("Enter decimal:");
        decimal = Integer.parseInt(br.readLine());
        while(decimal!=0){
            int rem = decimal%2;
            e.push(rem);
            decimal = decimal /2;
        }
        while (!e.isEmpty()){
            System.out.print(e.pop());
        }
    }
}

