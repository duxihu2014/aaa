package test;

public class TT {

	 public static void main(String[] args) {
	  // �����������飨ԭʼ�������ͣ�,��㶨��
	  int[] numbs = { 87, 25, 4, 22, 2, 56, 11, 28, 35, 15 };

	  // ����һ����ʱ��������
	  int temp = 0;
	  for (int i = 0; i < numbs.length-1; i++) {
	   for (int j = 0; j < numbs.length ; j++) {
	    if (numbs[i] > numbs[j]) {
	     temp = numbs[i];
	     numbs[i] = numbs[j];
	     numbs[j] = temp;
	    }
	    
	   }
	  }

	  // ��ӡð��������������
	  for (int i = 0; i < numbs.length; i++) {
	   System.out.println(numbs[i]);
	  }
	 }

	}
