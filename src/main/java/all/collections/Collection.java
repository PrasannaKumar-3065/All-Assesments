package all.collections;
import java.util.*;
import java.util.logging.Logger;



public class Collection{
    public static final Logger Log = Logger.getLogger("InfoLogging");
    protected Collection(){
        Log.info("Collections initiated");
    }
    private static void treeset(){
        TreeSet<String> names = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
              return s1.compareTo(s2);
            }
          });
    
        names.add("prasanna");
        names.add("nixon");
        names.add("jeeva");
        names.add("jeshinth");
        names.add("thavasu");
    
        String tree ="TreeSet" + names;
        Log.info(tree);  
        String stree = "ascending order: " + names;
        Log.info(stree);  
        stree = ""+names.contains("nixon");
        Log.info(stree);
        names.remove("prasanna");
        stree = ""+names;
        Log.info(stree);  
        stree = "First element: " + names.first();
        Log.info(stree); 
        stree = "Last element: " + names.last();
        Log.info(stree);  
        String size = "Length: " + names.size();
        Log.info(size);  
        names.clear();
    }
    private static void hashmap(){
            HashMap<String,String> hash = new HashMap<String,String>();
            hash.put("stu101","prasanna");
            hash.put("stu102","nixon");
            hash.put("stu103","jeeva");
            hash.put("stu104","vignesh");
            String s = ""+hash;
            Log.info(s);
            s = "Size: "+hash.size();
            Log.info(s);
            String key = ""+hash.keySet();
            Log.info(key);
            String val = ""+hash.values();
            Log.info(val);
            hash.remove("emp012");
            s = ""+hash;
            Log.info(s);
            hash.replace("stu103", "thavasu");
            s = ""+hash;
            Log.info(s);
            s = ""+hash.get("stu101");
            Log.info(s);
    }
    private static void hashset(){
        HashSet<Studentdetails> set = new HashSet<Studentdetails>();
        Studentdetails sd1 = new Studentdetails("prasanna", "1st street", 101);
        set.add(sd1);
        sd1 = new Studentdetails("nixon","2nd Street", 102);
        set.add(sd1);
        sd1 = new Studentdetails("vignesh", "3rd Street", 103);
        set.add(sd1);
        String s1;

        for (Studentdetails s : set) {
            s1 =s.studentName + " " + s.studentAddress + " " + s.id;
            Log.info(s1);
        }
        s1 = "" + set.remove(sd1);
        Log.info(s1);
        for (Studentdetails s : set) {
            s1 = s.studentName + " " + s.studentAddress + " " + s.id;
            Log.info(s1);
        }
        s1 = ""+set.size();
        Log.info(s1);
        s1 = ""+sd1.hashCode();
        Log.info(s1);
    }
    public static void run() {
        Scanner sc = new Scanner(System.in);
        int h = 0;
       do{
        try{
                Log.info("1.HashMap 2.HashSet 3.TreeSet 4.Exit");
                int choice = sc.nextInt();
                if(choice == 1){
                    hashmap();
                }
                else if(choice == 2){
                    hashset();
                }
                else if(choice == 3){
                    treeset();
                }
                else if(choice == 4){
                    h = 1;
                }
            }catch(Exception e){
                String s = ""+e;
                Log.info(s);
                sc.nextLine();
            }
       }while(h == 0);

    }
}
