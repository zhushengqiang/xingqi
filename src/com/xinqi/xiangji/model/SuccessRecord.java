package com.xinqi.xiangji.model;

import java.sql.Date;
import java.util.Set;
/**�ɽ�����
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
	Judgement judegment; //����
	Skill skill;//����Ķ���


}
