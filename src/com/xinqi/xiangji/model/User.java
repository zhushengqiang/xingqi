package com.xinqi.xiangji.model;

import java.util.List;
import java.util.Set;
/**�û�
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
	int job; //����  ӳ���ϵ��
	String describe; 
	String headPhotoPath; //ͷ��
	float credit;  //��������
	int totalSale; //������
	
	Set<UserPhoto> userPhotos; //��ҳչʾͼ�ε�·��
	Set<Skill> favoriteSkills; //�û��ղصĶ���  ��Զ�
	Set<Skill> mySoldSkills; //���ڳ��۶���
	Set<SuccessRecord> boughtRecord; //������ɶ�������ҹ���ģ�
	Set<Order> order; //��δ������ɵĶ���
	
	
	
}
