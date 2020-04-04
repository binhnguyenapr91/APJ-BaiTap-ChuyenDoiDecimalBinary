import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws IOException {
        LinkedList<Integer> stack = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int decimal;
        System.out.println("Enter decimal:");
        decimal = Integer.parseInt(br.readLine());
        while(decimal!=0){
            int rem = decimal%2;
            stack.push(rem);
            decimal = decimal /2;
        }

        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
