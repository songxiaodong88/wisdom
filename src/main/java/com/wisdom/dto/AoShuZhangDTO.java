package com.wisdom.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 奥数张老师
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AoShuZhangDTO implements Serializable {

    //  查询结果后的序号
    private Integer indexId;
    //  主键ID
    private Integer cdId;
    //  班级名称
    private String cname;
    //   上课时间
    private String schooltime;
    //   姓名
    private String sname;
    //  总课次数
    private Integer classHour;
    //  课次单价
    private Double price;
    //  学费总额
    private Double total;
    //  9月消课
    private Integer september;
    //  10月消课
    private Double october;
    //  11月消课
    private Double november;
    //  12月消课
    private Integer december;
    //  1月
    private Integer january;
    //  2月
    private Integer february;
    //  3月
    private Integer march;
    //  4月
    private Integer april;
    //  5月
    private Integer may;
    //  6月
    private Integer june;
    //  7月
    private Integer july;
    //  8月消课
    private Integer august;
    //  书费单价
    private Double bookPrice;
    //    学费总额统计
    private Double sumTotal;
    //    九月课时统计
    private Integer sumJiu;
    //    十月课时统计
    private Integer sumShi;
    //  11月课时统计
    private Integer sumShy;
    //  12月课时统计
    private Integer sumShe;
    //  删除状态，1：正常；0：删除
    private Integer status;


}
