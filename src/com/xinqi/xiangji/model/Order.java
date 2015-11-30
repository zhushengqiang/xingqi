package com.xinqi.xiangji.model;

import java.sql.Date;

/**未完成订单
 * @author Yxx&Zsq
 * @version 1.0
 * @date 11/30
 * 
 */
public class Order {
	int id;
	int state;
	User buyer;
	User saler;
	Date date;
	float price;
	String skillTitle;
	RefundRequest refundRequest; //退款请求,买家未发出请求为null
	
	
	
	
	
}
