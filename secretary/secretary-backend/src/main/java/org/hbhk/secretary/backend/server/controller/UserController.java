package org.hbhk.secretary.backend.server.controller;

import java.util.List;

import org.hbhk.aili.core.server.web.BaseController;
import org.hbhk.aili.orm.server.intercptor.QueryBeanParam;
import org.hbhk.aili.orm.server.page.bean.QueryBean;
import org.hbhk.aili.orm.share.model.Pagination;
import org.hbhk.secretary.backend.server.service.ICarService;
import org.hbhk.secretary.backend.shared.pojo.CarInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * @author  何波
 */
@Controller
@RequestMapping("/user")
public class UserController extends BaseController {

	@Autowired
	private ICarService carService;


	/**
	 * 保存CarInfo
	 */
	@RequestMapping("/save")
	@ResponseBody
	public CarInfo save(CarInfo model){
	
		return carService.save(model);
	}
	
	/**
	 * 通过id获取CarInfo
	 * 
	 */
	@RequestMapping("/findById")
	@ResponseBody
	public CarInfo findById(Long id){
		return carService.findById(id);
	}

	/**
	 * 获取所有CarInfo列表
	 * @return
	 */
	@RequestMapping("/findAllList")
	@ResponseBody
	public List<CarInfo> findAllList(){
	
		return carService.findAllList();
	}
	
	/**
	 * 通过ids获取CarInfo列表
	 * @param ids
	 * @return
	 */
	@RequestMapping("findListByIds")
	@ResponseBody
	public List<CarInfo> findListByIds(List<Long> ids){
	
		return carService.findListByIds(ids);
	}
	
	/**
	 * 通过参数map获取CarInfo列表
	 * @param paraMap
	 * @return
	 */
	@RequestMapping("findList")
	@ResponseBody
	public List<CarInfo> findList(@QueryBeanParam QueryBean queryBean){
	
		return carService.findListByQueryMap(queryBean.getParaMap());
	};
	
	/**
	 * 分页获取CarInfo列表
	 * @param start
	 * @param size
	 * @param paraMap
	 * @param sorts 
	 * @return
	 */
	@RequestMapping("findListPage")
	@ResponseBody
	public Pagination<CarInfo> findListPage(@QueryBeanParam QueryBean queryBean){
	
		return carService.findListByQueryMapWithPage(queryBean.getPage(), queryBean.getSorts(),
				queryBean.getParaMap());
	}
	
	
	
	/**
	 * 通过ids批量启用或禁用CarInfo
	 * 设置status =0 或 1
	 * @param ids
	 * @return
	 */
	@RequestMapping("updateStatusByIds")
	@ResponseBody
	public int updateStatusByIds(List<Long> ids,Integer state){
		return carService.updateStatusByIds(ids,state);
	}
	
	
}
