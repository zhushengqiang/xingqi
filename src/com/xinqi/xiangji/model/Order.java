package com.xinqi.xiangji.model;

import java.sql.Date;

/**δ��ɶ���
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
	RefundRequest refundRequest; //�˿�����,���δ��������Ϊnull
	
	
	
	
	
}
