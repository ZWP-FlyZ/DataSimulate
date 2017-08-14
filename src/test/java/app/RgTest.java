package app;

import org.junit.Test;

import app.util.Rg;

public class RgTest {

	@Test
	public void test() {
		for(int i=0;i<100;i++){
			System.err.println(Rg.getIntO(10,20) + "   "+ Rg.getDouble(0.0, 10.0)+ "   "+ Rg.getDouble3(0.0, 10.0));
		}
	}

}
