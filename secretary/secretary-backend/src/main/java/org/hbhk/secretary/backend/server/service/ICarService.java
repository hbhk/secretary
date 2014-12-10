package org.hbhk.secretary.backend.server.service;

import java.util.List;
import java.util.Map;

import org.hbhk.aili.orm.server.service.ICommonService;
import org.hbhk.aili.orm.server.surpport.Page;
import org.hbhk.aili.orm.server.surpport.Sort;
import org.hbhk.aili.orm.share.model.Pagination;
import org.hbhk.secretary.backend.shared.pojo.CarInfo;
/**
 * CarInfoService
 * @author  何波
 *
 */
public interface ICarService extends ICommonService<CarInfo>  {

	
	/**
	 * 通过id获取CarInfo
	 * 
	 */
	CarInfo findById(Long id);

	/**
	 * 获取所有CarInfo列表
	 * @return
	 */
	List<CarInfo> findAllList();
	
	/**
	 * 通过ids获取CarInfo列表
	 * @param ids
	 * @return
	 */
	List<CarInfo> findListByIds(List<Long> ids);
	
	
	/**
	 * 通过ids批量启用或禁用CarInfo
	 * 设置status =0 或 1
	 * @param ids
	 * @return
	 */
	int updateStatusByIds(List<Long> ids,Integer status);
	
	
	/**
	 * 通过参数map获取CarInfo列表
	 * @param paraMap
	 * @return
	 */
	List<CarInfo> findListByQueryMap(Map<String, Object> paraMap);
	
	/**
	 * 分页获取CarInfo列表
	 * @param start
	 * @param size
	 * @param paraMap
	 * @param sorts 
	 * @return
	 */
	Pagination<CarInfo> findListByQueryMapWithPage(Page page,Sort[] sorts,Map<String, Object> paraMap);
	
	
}
