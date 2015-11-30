package com.xinqi.xiangji.model;

import java.sql.Date;
import java.util.Set;
/**成交订单
 * @author Yxx&Zsq
 * @version 1.0
 * @date 11/30
 * 
 */
public class SuccessRecord {
	
	int id;
	User buyer;  
	User saler;  
	Date date;  
	float price;
	String skillTitle;
	Judgement judegment; //评论
	Skill skill;//购买的订单


}
