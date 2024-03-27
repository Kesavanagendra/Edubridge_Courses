package practice_edu;

import java.util.HashMap;
import java.util.Map;
public class CharCountUsingMap {

	public static Map<Character,Integer>countChar(String s){
		char carr[] = s.toCharArray();
        Map<Character ,Integer> obj= new HashMap<>();
        for(char c:carr) {

            if(obj.containsKey(c)) {
                obj.put(c,obj.get(c)+1);
            }else {
                obj.put(c, 1);
            }
        }
            return obj;	
    }
    public static void main(String[] args) {
        String str="afcdac";
        Map<Character,Integer> res= countChar(str);
        System.out.println(res);

        // for (Map.Entry m : res.entrySet()) {
		// 	System.out.println(m.getKey() + " " + m.getValue());
		// }
    }
}

