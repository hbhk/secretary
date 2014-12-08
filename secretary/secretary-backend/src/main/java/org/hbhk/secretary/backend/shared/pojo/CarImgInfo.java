/**   */
package org.hbhk.secretary.backend.shared.pojo;

import org.hbhk.aili.orm.server.annotation.Column;
import org.hbhk.aili.orm.server.annotation.Tabel;
import org.hbhk.aili.orm.share.model.BaseInfo;

/**
 * @DESC 汽车图片
 */
@Tabel("t_sct_car_image")
public class CarImgInfo extends BaseInfo {

	private static final long serialVersionUID = -8754650871679611801L;

	/** 关联的车型颜色 */
	@Column("car_color_id")
	private Integer carColorId;

	/** 关联的车型 */
	@Column("car_spec_id")
	private Integer carSpecId;

	/** 分类 车型部位 中控 座椅 外观 */
	@Column("img_type_code")
	private String imgTypeCode;

	/** 车型部位 中控 座椅 外观 */
	@Column("img_type_name")
	private String imgTypeName;

	/** 排序 */
	@Column("img_order")
	private Integer imgOrder;

	/** 图片地址 */
	@Column("img_url")
	private String imgUrl;

	public Integer getCarColorId() {
		return carColorId;
	}

	public void setCarColorId(Integer carColorId) {
		this.carColorId = carColorId;
	}

	public Integer getCarSpecId() {
		return carSpecId;
	}

	public void setCarSpecId(Integer carSpecId) {
		this.carSpecId = carSpecId;
	}

	public String getImgTypeCode() {
		return imgTypeCode;
	}

	public void setImgTypeCode(String imgTypeCode) {
		this.imgTypeCode = imgTypeCode;
	}

	public String getImgTypeName() {
		return imgTypeName;
	}

	public void setImgTypeName(String imgTypeName) {
		this.imgTypeName = imgTypeName;
	}

	public Integer getImgOrder() {
		return imgOrder;
	}

	public void setImgOrder(Integer imgOrder) {
		this.imgOrder = imgOrder;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

}
