package geeks_practice;
public class Split_words {
    public static void main(String[] args)
        {
            String s = "Geeks for Geeks";
            
            String str[] = s.split(" ");
            for(String t : str)
                System.out.println(t);
        }
    
}
