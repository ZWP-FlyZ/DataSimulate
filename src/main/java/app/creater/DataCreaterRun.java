package app.creater;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;

import app.model.BusTranData;
import app.model.OceanGoodsData;
import app.model.OceanPassData;
import app.model.PortProData;
import app.model.RiverTranData;
import app.model.RoadGoodsData;
import app.model.RoadPassData;
import app.model.TaxiTranData;
import app.service.DataService;
import app.util.Rg;
import app.util.Tg;
import app.util.UidTools;



@Component
public class DataCreaterRun {
	private  final static Logger logger = LoggerFactory.getLogger(DataCreater.class);
	private final static Gson gson = new Gson();
	@Autowired
	DataService ds;
	
	public void roadPass(String ymd){
		int tmp = 0;
		RoadPassData data = new RoadPassData();
		tmp = Rg.getIntO(Tg.ARR_TN_CITY.length);
		data.setCarId("浙"+Tg.ARR_TN_CAR_C[tmp]+"-"+UidTools.getUUID5());
		data.setInTime(ymd);
		data.setTraType(Tg.ARR_TN_ALL_TRA_PP[0]);
		data.setPlace1(Tg.ARR_TN_CITY[tmp]);
		data.setPlace2(Tg.ARR_TN_COUTRIES[tmp][Rg.getIntO(Tg.ARR_TN_COUTRIES[tmp].length)]);
		data.setCompanyId(UidTools.getUUID9());
		data.setFuelType(Tg.ARR_TN_LAND_ENG[Rg.getIntO(Tg.ARR_TN_LAND_ENG.length)]);
		data.setFuelCsption(Rg.getDouble3(50.0, 300.0));
		data.setGoTurn(Rg.getDouble3(10.0, 60.0));
		data.setCarType(Tg.ARR_TN_CAR[Rg.getIntO(Tg.ARR_TN_CAR.length)]);
		data.setSitCot(Rg.getInt(8, 36));
		data.setTranDis(Rg.getDouble3(25.0, 150.0));
		data.setEntS(Rg.getInt(1, 100));
		//logger.debug(gson.toJson(data));
		ds.roadPassMapper.add(data);
	}
	
	public void roadGoods(String ymd){
		int tmp = 0;
		RoadGoodsData data = new RoadGoodsData();
		tmp = Rg.getIntO(Tg.ARR_TN_CITY.length);
		data.setCarId("浙"+Tg.ARR_TN_CAR_C[tmp]+"-"+UidTools.getUUID5());
		data.setInTime(ymd);
		data.setTraType(Tg.ARR_TN_ALL_TRA_PP[1]);
		data.setPlace1(Tg.ARR_TN_CITY[tmp]);
		data.setPlace2(Tg.ARR_TN_COUTRIES[tmp][Rg.getIntO(Tg.ARR_TN_COUTRIES[tmp].length)]);
		data.setCompanyId(UidTools.getUUID9());
		data.setFuelType(Tg.ARR_TN_LAND_ENG[Rg.getIntO(Tg.ARR_TN_LAND_ENG.length)]);
		data.setFuelCsption(Rg.getDouble3(50.0, 300.0));
		data.setGoTurn(Rg.getDouble3(10.0, 60.0));
		data.setCarType(Tg.ARR_TN_CAR[Rg.getIntO(Tg.ARR_TN_CAR.length)]);
		data.setTonnage(Rg.getDouble3(2.0, 10.0));
		data.setTranDis(Rg.getDouble3(25.0, 150.0));
		data.setEntS(Rg.getInt(1, 100));
		//logger.debug(gson.toJson(data));
		ds.roadGoodsMapper.add(data);
	}
	
	public void busTran(String ymd){
		int tmp = 0;
		BusTranData data = new BusTranData();
		tmp = Rg.getIntO(Tg.ARR_TN_CITY.length);
		data.setCarId("浙"+Tg.ARR_TN_CAR_C[tmp]+"-"+UidTools.getUUID5());
		data.setInTime(ymd);
		data.setTraType(Tg.ARR_TN_ALL_TRA_PP[2]);
		data.setPlace1(Tg.ARR_TN_CITY[tmp]);
		data.setPlace2(Tg.ARR_TN_COUTRIES[tmp][Rg.getIntO(Tg.ARR_TN_COUTRIES[tmp].length)]);
		data.setCompanyId(UidTools.getUUID9());
		data.setFuelType(Tg.ARR_TN_LAND_ENG[Rg.getIntO(Tg.ARR_TN_LAND_ENG.length)]);
		data.setFuelCsption(Rg.getDouble3(50.0, 300.0));
		data.setGoTurn(Rg.getDouble3(10.0, 60.0));
		data.setCarLength(Rg.getDouble3(3.0, 20.0));
		data.setTranDis(Rg.getDouble3(25.0, 150.0));
		data.setEntS(Rg.getInt(1, 100));
		//logger.debug(gson.toJson(data));
		ds.busTranMapper.add(data);
	}
	
	public void taxiTran(String ymd){
		int tmp = 0;
		TaxiTranData data = new TaxiTranData();
		tmp = Rg.getIntO(Tg.ARR_TN_CITY.length);
		data.setCarId("浙"+Tg.ARR_TN_CAR_C[tmp]+"-"+UidTools.getUUID5());
		data.setInTime(ymd);
		data.setTraType(Tg.ARR_TN_ALL_TRA_PP[3]);
		data.setPlace1(Tg.ARR_TN_CITY[tmp]);
		data.setPlace2(Tg.ARR_TN_COUTRIES[tmp][Rg.getIntO(Tg.ARR_TN_COUTRIES[tmp].length)]);
		data.setCompanyId(UidTools.getUUID9());
		data.setFuelType(Tg.ARR_TN_LAND_ENG[Rg.getIntO(Tg.ARR_TN_LAND_ENG.length)]);
		data.setFuelCsption(Rg.getDouble3(50.0, 300.0));
		data.setGoTurn(Rg.getDouble3(10.0, 60.0));
		data.setDpCot(Rg.getDouble3(1.0, 5.0));
		data.setTranDis(Rg.getDouble3(25.0, 150.0));
		data.setEntS(Rg.getInt(1, 100));
		//logger.debug(gson.toJson(data));
		ds.taxiTranMapper.add(data);
	}
	
	public void riverTran(String ymd){
		int tmp = 0;
		RiverTranData data = new RiverTranData();
		tmp = Rg.getIntO(Tg.ARR_TN_CITY.length);
		data.setShipId(UidTools.getUUID9());
		data.setInTime(ymd);
		data.setTraType(Tg.ARR_TN_ALL_TRA_PP[4]);
		data.setPlace1(Tg.ARR_TN_CITY[tmp]);
		data.setPlace2(Tg.ARR_TN_COUTRIES[tmp][Rg.getIntO(Tg.ARR_TN_COUTRIES[tmp].length)]);
		data.setCompanyId(UidTools.getUUID9());
		data.setFuelType(Tg.ARR_TN_WATER_ENG[Rg.getIntO(Tg.ARR_TN_WATER_ENG.length)]);
		data.setFuelCsption(Rg.getDouble3(100.0, 400.0));
		data.setGoTurn(Rg.getDouble3(50.0, 200.0));
		data.setTonnage(Rg.getDouble3(3.0, 15.0));
		data.setShipType(Tg.ARR_TN_SHIP[Rg.getIntO(Tg.ARR_TN_SHIP.length)]);
		data.setTranDis(Rg.getDouble3(25.0, 100.0));
		data.setEntS(Rg.getInt(1, 100));
		//logger.debug(gson.toJson(data));
		ds.riverTranMapper.add(data);
	}
	
	
	public void oceanPass(String ymd){
		int tmp = 0;
		OceanPassData data = new OceanPassData();
		tmp = Rg.getIntO(Tg.ARR_TN_CITY.length);
		data.setShipId(UidTools.getUUID9());
		data.setInTime(ymd);
		data.setTraType(Tg.ARR_TN_ALL_TRA_PP[5]);
		data.setPlace1(Tg.ARR_TN_CITY[tmp]);
		data.setPlace2(Tg.ARR_TN_COUTRIES[tmp][Rg.getIntO(Tg.ARR_TN_COUTRIES[tmp].length)]);
		data.setCompanyId(UidTools.getUUID9());
		data.setFuelType(Tg.ARR_TN_WATER_ENG[Rg.getIntO(Tg.ARR_TN_WATER_ENG.length)]);
		data.setFuelCsption(Rg.getDouble3(500.0, 1000.0));
		data.setGoTurn(Rg.getDouble3(100.0, 200.0));
		data.setSitCot(Rg.getInt(50, 100));
		data.setShipType(Tg.ARR_TN_SHIP[Rg.getIntO(Tg.ARR_TN_SHIP.length)]);
		data.setTranDis(Rg.getDouble3(100.0, 500.0));
		data.setEntS(Rg.getInt(1, 100));
		//logger.debug(gson.toJson(data));
		ds.oceanPassMapper.add(data);
	}
	
	public void oceanGoods(String ymd){
		int tmp = 0;
		OceanGoodsData data = new OceanGoodsData();
		tmp = Rg.getIntO(Tg.ARR_TN_CITY.length);
		data.setShipId(UidTools.getUUID9());
		data.setInTime(ymd);
		data.setTraType(Tg.ARR_TN_ALL_TRA_PP[6]);
		data.setPlace1(Tg.ARR_TN_CITY[tmp]);
		data.setPlace2(Tg.ARR_TN_COUTRIES[tmp][Rg.getIntO(Tg.ARR_TN_COUTRIES[tmp].length)]);
		data.setCompanyId(UidTools.getUUID9());
		data.setFuelType(Tg.ARR_TN_WATER_ENG[Rg.getIntO(Tg.ARR_TN_WATER_ENG.length)]);
		data.setFuelCsption(Rg.getDouble3(500.0, 1000.0));
		data.setGoTurn(Rg.getDouble3(100.0, 200.0));
		data.setTonnage(Rg.getDouble3(100.0, 200.0));
		data.setShipType(Tg.ARR_TN_SHIP[Rg.getIntO(Tg.ARR_TN_SHIP.length)]);
		data.setTranDis(Rg.getDouble3(100.0, 500.0));
		data.setEntS(Rg.getInt(1, 100));
		//logger.debug(gson.toJson(data));
		ds.oceanGoodsMapper.add(data);
	}
	
	
	
	public void portPro(String ymd){
		int tmp = 0;
		PortProData data = new PortProData();
		tmp = Rg.getIntO(Tg.ARR_TN_CITY.length);
		data.setInTime(ymd);
		data.setTraType(Tg.ARR_TN_ALL_TRA_PP[6]);
		data.setPlace1(Tg.ARR_TN_CITY[tmp]);
		data.setPlace2(Tg.ARR_TN_COUTRIES[tmp][Rg.getIntO(Tg.ARR_TN_COUTRIES[tmp].length)]);
		data.setCompanyId(UidTools.getUUID9());
		
		data.setGasoline(Rg.getDouble3(100.0, 200.0));
		data.setDiesel(Rg.getDouble3(100.0, 200.0));
		data.setPower(Rg.getDouble3(100.0, 200.0));
		data.setCoal(Rg.getDouble3(100.0, 200.0));
		data.setOther(Rg.getDouble3(100.0, 200.0));
		data.setProTask(Rg.getDouble3(100.0, 1000.0));
		data.setThroughput(Rg.getDouble3(100.0, 200.0));
		data.setEntS(Rg.getInt(1, 100));
		//logger.debug(gson.toJson(data));
		ds.portProMapper.add(data);
	}
	
	
	
	
	
	
	
	
}
