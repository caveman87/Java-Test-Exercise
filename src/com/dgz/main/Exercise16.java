/**
 * 
 */
package com.dgz.main;

/**题目：猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不过瘾，又多吃了一个     
 * 第二天早上又将剩下的桃子吃掉一半，又多吃了一个。
 * 以后每天早上都吃了前一天剩下的一半零一个。
 * 到第10天早上想再吃时，见只剩下一个桃子了。
 * 求第一天共摘了多少。   
 * @author DamonTung
 * @date 2016年3月4日
 * @description 
 */
public class Exercise16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodOne();
		
	}
	private static void methodOne(){
		int x = 1;
	     for(int i=2; i<=10; i++) {
	      x = (x+1)*2;
	     }
	     System.out.println("猴子第一天摘了 " + x + " 个桃子");

	}
}
