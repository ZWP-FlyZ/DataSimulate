package app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.dao.BusTranMapper;
import app.dao.OceanGoodsMapper;
import app.dao.OceanPassMapper;
import app.dao.PortProMapper;
import app.dao.RiverTranMapper;
import app.dao.RoadGoodsMapper;
import app.dao.RoadPassMapper;
import app.dao.TaxiTranMapper;


@Service
public class DataService {
	
	@Autowired
	public RoadPassMapper roadPassMapper;
	
	@Autowired
	public RoadGoodsMapper roadGoodsMapper;
	
	@Autowired
	public TaxiTranMapper taxiTranMapper;
	
	@Autowired
	public BusTranMapper busTranMapper;
	
	@Autowired
	public RiverTranMapper riverTranMapper;
	
	@Autowired
	public OceanPassMapper oceanPassMapper;
	
	@Autowired
	public OceanGoodsMapper oceanGoodsMapper;
	
	@Autowired
	public PortProMapper portProMapper;
	
}
