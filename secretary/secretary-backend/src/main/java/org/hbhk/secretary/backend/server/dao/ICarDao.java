package org.hbhk.secretary.backend.server.dao;

import java.util.List;
import java.util.Map;

import org.hbhk.aili.orm.server.annotation.NativeQuery;
import org.hbhk.aili.orm.server.annotation.NativeUpdate;
import org.hbhk.aili.orm.server.annotation.QueryParam;
import org.hbhk.aili.orm.server.dao.GenericEntityDao;
import org.hbhk.aili.orm.server.surpport.Page;
import org.hbhk.aili.orm.server.surpport.Sort;
import org.hbhk.aili.orm.share.model.Pagination;
import org.hbhk.secretary.backend.shared.pojo.CarInfo;

/**
 * @author  何波
 *
 */
public interface ICarDao extends GenericEntityDao<CarInfo,String>{

	/**
	 * 获取所有CarInfo列表
	 * @return
	 */
	@NativeQuery(model = CarInfo.class)
	List<CarInfo> findAllList();
	
	/**
	 * 通过ids获取CarInfo列表
	 * @param ids
	 * @return
	 */
	@NativeQuery(model = CarInfo.class)
	List<CarInfo> findListByIds(@QueryParam("ids")List<Long> ids);
	
	/**
	 * 通过参数map获取CarInfo列表
	 * @param paraMap
	 * @return
	 */
	@NativeQuery(model = CarInfo.class)
	List<CarInfo> findListByQueryMap(@QueryParam Map<String, Object> paraMap);
	
	/**
	 * 分页获取CarInfo列表
	 * @param start
	 * @param size
	 * @param paraMap
	 * @param sorts 
	 * @return
	 */
	@NativeQuery(model = CarInfo.class)
	Pagination<CarInfo> findListByQueryMapWithPage(Page page,Sort[] sorts,@QueryParam Map<String, Object> paraMap);
	
	
	
	/**
	 * 通过ids批量启用或禁用CarInfo
	 * 设置status =0 或 1
	 * @param ids
	 * @return
	 */
	@NativeUpdate
	int updateStatusByIds(@QueryParam("ids")List<Long> ids,@QueryParam("status")Integer status);
	
	
}
