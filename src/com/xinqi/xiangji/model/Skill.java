package com.xinqi.xiangji.model;

import java.sql.Date;
import java.util.List;
import java.util.Set;

/**����
 * @author Yxx&Zsq
 * @version 1.0
 * @date 11/30
 * 
 */
public class Skill {
	int id;
	int statu;//����״̬  ӳ���ϵ��1������� 2������ˣ��ϼܣ�3���¼�
	int type;//��������   ӳ���ϵ��
	String title;//������
	String decribe;
	float price;
	String unit;//��unit��λ����
	Date publishTime;//��������
	int sellAmount;
	float  score;//����
	
	User saler;//����
	Set<SkillPhoto> skillPhotoPaths;//����չʾͼƬ·��
	Set<SuccessRecord> Records;//������ɶ��������ң�
	Set<User> favoritUser;//�ղظü��ܵ��û�  ��Զ�ӳ��
	
	
	
	
	
}
