package com.xinqi.xiangji.model;

import java.util.List;
import java.util.Set;
/**用户
 * @author Yxx&Zsq
 * @version 1.0
 * @date 11/30
 * 
 */
public class User {
	int id; 
	float money;
	String tel;
	String password;
	String name;
	boolean sex;
	String city;
	int job; //工作  映射关系：
	String describe; 
	String headPhotoPath; //头像
	float credit;  //信用评级
	int totalSale; //总销量
	
	Set<UserPhoto> userPhotos; //主页展示图形的路径
	Set<Skill> favoriteSkills; //用户收藏的订单  多对多
	Set<Skill> mySoldSkills; //正在出售订单
	Set<SuccessRecord> boughtRecord; //交易完成订单（买家购买的）
	Set<Order> order; //尚未交易完成的订单
	
	
	
}
