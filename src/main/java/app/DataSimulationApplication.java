package app;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import app.creater.DataCreater;

@SpringBootApplication
public class DataSimulationApplication implements CommandLineRunner  {

	
	@Autowired
	DataCreater dc;
	
	private final static Logger logger =  LoggerFactory.getLogger(DataSimulationApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(DataSimulationApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		logger.debug("DataSimulate run");
		System.err.println(Arrays.toString(arg0));
		if(arg0.length>=1&&"true".equals(arg0[0]))
			dc.run("2013-9-1","2017-8-10");
	}
	
}
