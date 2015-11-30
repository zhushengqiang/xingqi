package com.xinqi.xiangji.model;

import java.sql.Date;
import java.util.List;
import java.util.Set;
/**ÍË¿îÉêÇë
 * @author Yxx&Zsq
 * @version 1.0
 * @date 11/30
 * 
 */
public class RefundRequest {
	int id;
	Date time;
	Order order;
	String describe;
	int type;
	List<RefundRequestPhoto> refoundRequestPhotos; //Í¼Æ¬Æ¾Ö¤Â·¾¶

	
	
}
