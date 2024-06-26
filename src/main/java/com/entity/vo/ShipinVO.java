package com.entity.vo;

import com.entity.ShipinEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 视频
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("shipin")
public class ShipinVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 视频编号
     */

    @TableField(value = "shipin_uuid_number")
    private String shipinUuidNumber;


    /**
     * 视频名称
     */

    @TableField(value = "shipin_name")
    private String shipinName;


    /**
     * 视频照片
     */

    @TableField(value = "shipin_photo")
    private String shipinPhoto;


    /**
     * 视频试看
     */

    @TableField(value = "shipin_video")
    private String shipinVideo;


    /**
     * 视频类型
     */

    @TableField(value = "shipin_types")
    private Integer shipinTypes;


    /**
     * 赞
     */

    @TableField(value = "zan_number")
    private Integer zanNumber;


    /**
     * 踩
     */

    @TableField(value = "cai_number")
    private Integer caiNumber;


    /**
     * 是否vip视频
     */

    @TableField(value = "vipshipin_types")
    private Integer vipshipinTypes;


    /**
     * 适合年龄段
     */

    @TableField(value = "nianlingduan_types")
    private Integer nianlingduanTypes;


    /**
     * 视频介绍
     */

    @TableField(value = "shipin_content")
    private String shipinContent;


    /**
     * 是否上架
     */

    @TableField(value = "shangxia_types")
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */

    @TableField(value = "shipin_delete")
    private Integer shipinDelete;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：视频编号
	 */
    public String getShipinUuidNumber() {
        return shipinUuidNumber;
    }


    /**
	 * 获取：视频编号
	 */

    public void setShipinUuidNumber(String shipinUuidNumber) {
        this.shipinUuidNumber = shipinUuidNumber;
    }
    /**
	 * 设置：视频名称
	 */
    public String getShipinName() {
        return shipinName;
    }


    /**
	 * 获取：视频名称
	 */

    public void setShipinName(String shipinName) {
        this.shipinName = shipinName;
    }
    /**
	 * 设置：视频照片
	 */
    public String getShipinPhoto() {
        return shipinPhoto;
    }


    /**
	 * 获取：视频照片
	 */

    public void setShipinPhoto(String shipinPhoto) {
        this.shipinPhoto = shipinPhoto;
    }
    /**
	 * 设置：视频试看
	 */
    public String getShipinVideo() {
        return shipinVideo;
    }


    /**
	 * 获取：视频试看
	 */

    public void setShipinVideo(String shipinVideo) {
        this.shipinVideo = shipinVideo;
    }
    /**
	 * 设置：视频类型
	 */
    public Integer getShipinTypes() {
        return shipinTypes;
    }


    /**
	 * 获取：视频类型
	 */

    public void setShipinTypes(Integer shipinTypes) {
        this.shipinTypes = shipinTypes;
    }
    /**
	 * 设置：赞
	 */
    public Integer getZanNumber() {
        return zanNumber;
    }


    /**
	 * 获取：赞
	 */

    public void setZanNumber(Integer zanNumber) {
        this.zanNumber = zanNumber;
    }
    /**
	 * 设置：踩
	 */
    public Integer getCaiNumber() {
        return caiNumber;
    }


    /**
	 * 获取：踩
	 */

    public void setCaiNumber(Integer caiNumber) {
        this.caiNumber = caiNumber;
    }
    /**
	 * 设置：是否vip视频
	 */
    public Integer getVipshipinTypes() {
        return vipshipinTypes;
    }


    /**
	 * 获取：是否vip视频
	 */

    public void setVipshipinTypes(Integer vipshipinTypes) {
        this.vipshipinTypes = vipshipinTypes;
    }
    /**
	 * 设置：适合年龄段
	 */
    public Integer getNianlingduanTypes() {
        return nianlingduanTypes;
    }


    /**
	 * 获取：适合年龄段
	 */

    public void setNianlingduanTypes(Integer nianlingduanTypes) {
        this.nianlingduanTypes = nianlingduanTypes;
    }
    /**
	 * 设置：视频介绍
	 */
    public String getShipinContent() {
        return shipinContent;
    }


    /**
	 * 获取：视频介绍
	 */

    public void setShipinContent(String shipinContent) {
        this.shipinContent = shipinContent;
    }
    /**
	 * 设置：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 获取：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getShipinDelete() {
        return shipinDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setShipinDelete(Integer shipinDelete) {
        this.shipinDelete = shipinDelete;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
