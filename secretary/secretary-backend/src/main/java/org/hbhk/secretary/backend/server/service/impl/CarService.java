package org.hbhk.secretary.backend.server.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.hbhk.aili.orm.server.surpport.Page;
import org.hbhk.aili.orm.server.surpport.Sort;
import org.hbhk.aili.orm.share.model.Pagination;
import org.hbhk.secretary.backend.server.dao.ICarDao;
import org.hbhk.secretary.backend.server.service.ICarService;
import org.hbhk.secretary.backend.shared.pojo.CarInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 * CarInfoManager
 * @author  何波
 *
 */
@Transactional
@Service 
public class CarService implements ICarService {

	private  Logger log = LoggerFactory.getLogger(CarService.class);
	@Autowired
	private ICarDao carDao;


	/**
	 * 保存CarInfo
	 */
	public CarInfo save(CarInfo model){
		model.setCreateTime(new Date());
		return carDao.save(model);
	}
	
	/**
	 *修改CarInfo
	 */
	public CarInfo update(CarInfo model){
		model.setUpdateTime(new Date());
		return carDao.update(model);
	}
	
	
	public CarInfo getOne(CarInfo model){
		return carDao.getOne(model);
	}
	
	public List<CarInfo> get(CarInfo model){
		return carDao.get(model);
	}
	
	public List<CarInfo> get(CarInfo model,Page page){
		return carDao.get(model,page);
	}
	/**
	 * 通过id获取CarInfo
	 * 
	 */
	public CarInfo findById(Long id){
		CarInfo model = new CarInfo();
		return carDao.getOne(model);
	}

	/**
	 * 获取所有CarInfo列表
	 * @return
	 */
	public List<CarInfo> findAllList(){
	
		return carDao.findAllList();
	}
	
	/**
	 * 通过ids获取CarInfo列表
	 * @param ids
	 * @return
	 */
	public List<CarInfo> findListByIds(List<Long> ids){
	
		return carDao.findListByIds(ids);
	}
	
	/**
	 * 通过ids批量启用或禁用CarInfo
	 * 设置status =0 或 1
	 * @param ids
	 * @return
	 */
	public int updateStatusByIds(List<Long> ids,Integer state){
		return carDao.updateStatusByIds(ids,state);
	}
	
	
		/**
	 * 通过参数map获取CarInfo列表
	 * @param paraMap
	 * @return
	 */
	public List<CarInfo> findListByQueryMap(Map<String, Object> paraMap){
		return carDao.findListByQueryMap(paraMap);
	}
	
	/**
	 * 分页获取CarInfo列表
	 * @param start
	 * @param size
	 * @param paraMap
	 * @param sorts 
	 * @return
	 */
	public Pagination<CarInfo> findListByQueryMapWithPage(Page page,Sort[] sorts,Map<String, Object> paraMap){
		return carDao.findListByQueryMapWithPage(page,sorts,paraMap);
	}
	
	
}
