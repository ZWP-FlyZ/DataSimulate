package app.util;

import java.text.DecimalFormat;
import java.util.Random;

public class Rg {

	private final static Random r = new Random(System.currentTimeMillis());
	private final static DecimalFormat df = new DecimalFormat("#.000");
	
	
	public static int getIntO(int max){
		return getIntO(0,max);
	}
	
	public static int getIntO(int min, int max){
		
		return r.nextInt(max)%(max-min) + min;
	}
	
	
	public static int getInt(int max){
		
		return getInt(0,max);
	}
	
	public static int getInt(int min, int max){
		
		return r.nextInt(max)%(max-min+1) + min;
	}
	
	public static double getDouble(double min,double max){
		return r.nextDouble()*(max-min+1) + min;
	}
	
	public static double getDouble3(double min,double max){
		return Double.parseDouble(df.format(getDouble(min,max)));
	}
}
