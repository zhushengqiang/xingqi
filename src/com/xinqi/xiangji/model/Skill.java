package com.xinqi.xiangji.model;

import java.sql.Date;
import java.util.List;
import java.util.Set;

/**技能
 * @author Yxx&Zsq
 * @version 1.0
 * @date 11/30
 * 
 */
public class Skill {
	int id;
	int statu;//技能状态  映射关系：1，待审核 2，已审核（上架）3，下架
	int type;//技能类型   映射关系：
	String title;//技能名
	String decribe;
	float price;
	String unit;//按unit单位出售
	Date publishTime;//发布日期
	int sellAmount;
	float  score;//评分
	
	User saler;//卖家
	Set<SkillPhoto> skillPhotoPaths;//技能展示图片路径
	Set<SuccessRecord> Records;//交易完成订单（卖家）
	Set<User> favoritUser;//收藏该技能的用户  多对多映射
	
	
	
	
	
}
