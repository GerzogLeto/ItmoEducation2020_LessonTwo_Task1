import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        int start = 1;
        int finish = 100;
        int guess;
        int num;
        do {
            System.out.println("Enter a number from 1 up to 100: ");
            str = br.readLine();
            try{
                num = Integer.valueOf(str);
            }
            catch(NumberFormatException e){
                num = 0;
                System.out.println("Please, enter a number from 1 up to 100: ");
            }
        } while(num < 1 || num > 100 );
        System.out.println("number is: " + 1 + " ?" );
        str = br.readLine();
        if(Integer.valueOf(str) == 1){
            System.out.println("You win! This number is: " + 1);
            br.close();
            return;
        }
        System.out.println("number is: " + 100 + " ?" );
        str = br.readLine();
        if(Integer.valueOf(str) == 1){
            System.out.println("You win! This number is: " + 100);
            br.close();
            return;
        }
        while(true){
            int item = (start + finish)/2;
            int answer;
            System.out.println("number is: " + item + " ?" );
            str = br.readLine();
            answer = Integer.valueOf(str);
            if (answer == 0) {
                System.out.println("number greater than: " + item + " ?" );
                str = br.readLine();
                answer = Integer.valueOf(str);
                if(answer == 0){
                    finish  = item;
                    continue;
                } else {
                    start = item;
                    continue;
                }
            } else {
                System.out.println("You win! This number is: " + item);
                br.close();
                return;
            }
        }
    }
}
