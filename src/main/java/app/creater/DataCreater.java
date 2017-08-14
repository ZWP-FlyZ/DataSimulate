package app.creater;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.util.TimeTools;

@Component
public class DataCreater {
	
	
	private boolean lock = true;
	private int t = 100;
	private String startTime;
	private String endTime;
	private List<String> times;
	
	private int cout1 = 0;
	private int cout2 = 0;
	private int allc = t * 365 *  12 * 4  ;
	
	@Autowired
	DataCreaterRun dcr;
	
	
	private  final static Logger logger = LoggerFactory.getLogger(DataCreater.class);
	public void setTimeRange(String startTime,String endTime){
		this.startTime = startTime;
		this.endTime = endTime;
		times=TimeTools.getYMDlist(this.startTime, this.endTime);
	}
	
	public  int run(){
		cout1 = cout2 = 0;
		if(!lock) return -1;
		
		for(String ymd:times){
			//logger.debug(ymd);
			StringBuffer sb = new StringBuffer();
			cout2++;
			for(int i=0;i<t;i++){
				cout1++;
				dcr.roadPass(ymd);
				dcr.roadGoods(ymd);
				dcr.busTran(ymd);
				dcr.taxiTran(ymd);
				
				dcr.riverTran(ymd);
				dcr.oceanPass(ymd);
				dcr.oceanGoods(ymd);
				dcr.portPro(ymd);
			}
			sb.append(" ["+cout1);
			sb.append(" /"+ allc+"] (");
			sb.append((cout1 / allc*100.0) +"%)");
			sb.append(" AT=["+ymd+"] ");
			System.err.println(sb.toString());
			System.err.println();
		}
		return 8* times.size();
	}
	
	public  int run(String startTime,String endTime){
		setTimeRange(startTime,endTime);
		return run();
	}

}
