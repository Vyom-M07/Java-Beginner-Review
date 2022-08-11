
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;        

public class Runner {
        public static void main(String[] args) {
                ArrayList<String> list = new ArrayList<String>();
                try {
                        File words = new File("./words.txt");
                        Scanner fileReader = new Scanner(words);
                
                        while(fileReader.hasNextLine()) {
                                list.add(fileReader.nextLine());
                        }
                
                }
                catch (FileNotFoundException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                }
        
                Random random = new Random();
                int randomNum = random.nextInt(list.size());

                String wordle = list.get(randomNum);
                
                System.out.println(wordle);
                WordleDisplay wordledisplay = new WordleDisplay(wordle, list);
        }
}
