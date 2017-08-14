package app.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class TimeTools {
	private final static SimpleDateFormat sdf = 
				new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	private final static SimpleDateFormat sdfYMD = 
			new SimpleDateFormat("yyyy-MM-dd");
	
	public static String getNow(){
		return sdf.format(new Date());
	}
	

	public static List<String> getYMDlist(String start,String end){
		List<String> ymds = new ArrayList<>();
		 String[] ss = {start,end};
		try {
			Date ds = sdfYMD.parse(ss[0]);
			Date de = sdfYMD.parse(ss[1]);
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(ds);
			while(calendar.getTime().before(de)||
						calendar.getTime().equals(de)){
				ymds.add(sdfYMD.format(calendar.getTime()));
				calendar.add(Calendar.DAY_OF_YEAR, 1);
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ymds;
	}
	
	
	
	
}
