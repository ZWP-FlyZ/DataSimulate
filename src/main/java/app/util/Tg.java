package app.util;


public class Tg {
	
	//enger type
	public final static String FT_CHAI_YOU = "柴油";//柴油
	public final static String FT_QI_YOU = "汽油";//汽油
	public final static String FT_MEI_YOU = "煤油";//煤油
	public final static String FT_DIAN_NENG = "电能";//电力
	public final static String FT_HUN_HE = "混合燃料";//混合燃料
	public final static String FT_QI_TA = "其他";//其他类型
	public final static String FT_SHI_YOU_QI = "液化石油气";//石油气
	public final static String FT_TIAN_RAN_QI = "液化天然气";//天然气
	
	//traffic type
	public final static String TT_LAND_PASS = "道路客运";
	public final static String TT_LAND_GOODS = "道路货运";
	public final static String TT_LAND_BUS = "公交客运";
	public final static String TT_LAND_TAXI = "出租客运";
	public final static String TT_WATER_RIVER = "内河运输";
	public final static String TT_WATER_PASS = "海洋客运";
	public final static String TT_WATER_GOODS = "海洋货运";
	public final static String TT_WATER_PORT = "港口生产";
	
	//car type
	public final static String CT_C1 = "c1";
	public final static String CT_C2 = "c2";
	public final static String CT_C3 = "c3";
	public final static String CT_C4 = "c4";
	public final static String CT_C5 = "c5";
	public final static String CT_C6 = "c6";
	public final static String CT_C7 = "c7";

	//ship type
	public final static String ST_S1 = "s1";
	public final static String ST_S2 = "s2";
	public final static String ST_S3 = "s3";
	public final static String ST_S4 = "s4";
	public final static String ST_S5 = "s5";
	public final static String ST_S6 = "s6";
	public final static String ST_S7 = "s7";

	
	//类型名称
	public final static String TN_LAND_ENG = "landEngers";
	public final static String TN_LAND_TRA = "landTraffic";
	
	public final static String TN_WATER_ENG = "waterEngers";
	public final static String TN_WATER_TRA = "waterTraffic";
	
	public final static String TN_ALL_ENG = "allEngers";
	public final static String TN_ALL_TRA = "allTraffic";	
	public final static String TN_ALL_TRA_PP = "allTrafficPP";	//附加港口生产
	public final static String TN_CAR = "cars";
	public final static String TN_SHIP = "ship";
	public final static String TN_CITY = "cities";
	
	
	public final static String[] ARR_TN_ALL_TRA_PP = {TT_LAND_PASS,TT_LAND_GOODS,TT_LAND_BUS,TT_LAND_TAXI,
            TT_WATER_RIVER,TT_WATER_PASS,TT_WATER_GOODS,TT_WATER_PORT};
	
	public final static String[] ARR_TN_ALL_ENG = {FT_CHAI_YOU,FT_QI_YOU,FT_MEI_YOU,FT_DIAN_NENG,
			FT_HUN_HE,FT_QI_TA,FT_SHI_YOU_QI,FT_TIAN_RAN_QI};

	public final static String[] ARR_TN_LAND_ENG = {FT_CHAI_YOU,FT_QI_YOU,FT_DIAN_NENG,
			FT_HUN_HE,FT_SHI_YOU_QI,FT_TIAN_RAN_QI,FT_QI_TA};
	
	public final static String[] ARR_TN_WATER_ENG = {FT_CHAI_YOU,FT_QI_YOU,FT_MEI_YOU,FT_DIAN_NENG,
			FT_QI_TA};
	public final static String[] ARR_TN_CAR = {CT_C1,CT_C2,CT_C3,CT_C4,CT_C5,CT_C6,CT_C7};
	
	public final static String[] ARR_TN_SHIP = {ST_S1,ST_S2,ST_S3,ST_S4,ST_S5,ST_S6,ST_S7};
	
	public final static String[] ARR_TN_CITY = {"杭州","宁波","温州","绍兴","湖州","嘉兴","金华","衢州","台州","丽水","舟山"};
	
	public final static String[] ARR_TN_REL_TIME_LAND_ENG = {FT_QI_YOU,FT_DIAN_NENG};

	public final static String[] ARR_TN_REL_TIME_WAT_ENG = {FT_QI_YOU};
	
	public final static String[][] ARR_TN_COUTRIES =
		{   
		    //杭州A
		    {"上城区","下城区","江干区","拱墅区","西湖区","滨江区","萧山区","余杭区","桐庐县","淳安县","建德市","富阳市","临安市"},
		    //宁波B
		    {"海曙区","江东区","江北区","北仑区","镇海区","鄞州区","象山县","宁海县","余姚市","慈溪市","奉化市"},
		    //温州C
		    {"鹿城区","龙湾区","瓯海区","洞头县","永嘉县","平阳县","苍南县","文成县","泰顺县","瑞安市","乐清县"},
		    //绍兴D
		    {"越城区","绍兴县","新昌县","诸暨市","上虞市","嵊州市"},
		    //湖州E
		    {"吴兴区","南浔区","德清县","长兴县","安吉县"},
		    //嘉兴F
		    {"南湖区","秀洲区","嘉善县","海盐县","海宁市","平湖市","桐乡市"},
		    //金华G
		    {"婺城区","金东区","武义县","浦江县","磐安县","兰溪市","义乌市","东阳市","永康市"},
		    //衢州H
		    {"衢江区","常山县","开化县","龙游县","江山市"},
		    //台州J
		    {"椒江区","黄岩区","路桥区","玉环县","三门县","天台县","仙居县","温岭市","临海市"},
		    //丽水K
		    {"莲都区","青田县","缙云县","遂昌县","松阳县","云和县","庆元县","景宁畲族自治县","龙泉市"},
		    //舟山L
		    {"定海区","普陀区","岱山县","嵊泗县"}
		};
	
	public final static String[] ARR_TN_CAR_C = {"A","B","C","D","E","F","G","H","J","K","L"};

	

}
