package all.filereading;
import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.logging.Logger;

public class FilesRead {
    private static final Logger LOGGER =  Logger.getLogger("InfoLogging");

    protected FilesRead(){
        LOGGER.info("File reader initialized");
    }

    static StringBuilder data = new StringBuilder("");
    private static void read(File f) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(f));
        int i;
        while((i=br.read())!=-1){
            data.append((char)i);
        }
        br.close();
    }
    public static void run() throws IOException{
        String path = "C:\\Users\\Tringapps-User5\\Desktop\\Maven projects\\ds\\src\\main\\java\\pk\\1.txt";
        File f = new File(path);
        read(f);
        String str = ""+data;
        String[] words = str.split(" ");

        Map<String, Integer> hashMap = new HashMap<>();
        for (String word : words) {
            Integer integer = hashMap.get(word);
 
            if (integer == null)
                hashMap.put(word, 1);
 
            else {
                hashMap.put(word, integer + 1);
            }
        }

        ArrayList<Entry<String, Integer>> nlist  = new ArrayList<>(hashMap.entrySet());
        nlist.sort(Entry.comparingByValue(Comparator.reverseOrder()));
        String s = ""+nlist;
        LOGGER.info(s);
            

    }
}
