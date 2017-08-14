package app.util;

import java.util.UUID;

public class UidTools {
    public static String getUUID(){
        return UUID.randomUUID().toString();
    }
    
    public static String getUUID5(){
        String s = getUUID();
    	return s.substring(0,5).toUpperCase();
    }
    
    public static String getUUID9(){
        String s = getUUID();
        String tmp = s.substring(0,8) + s.substring(9,10);
    	return tmp.toUpperCase();
    }
    
}
