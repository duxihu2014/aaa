package test;





import org.junit.Before;
import org.junit.Test;




public class CityManagerTest {
	//CityManager cityManager = null;

	@Before
	public void manager() {
		//cityManager = (CityManager) SpringBeanFactory.getBean("cityManager");
		System.out.println("before__test.....");
	}

	
	//public void addAccount( Account account )
	//��Ȼ�����ɹ�����һ���û��������ݿ��в���һ����¼��
	//����������Ѿ���һ����ͬ���û���Ӧ�÷���һ���û��Ѵ��ڵ���Ϣ

	//�����û�
	@Test
	public void addAccountTest() {
		System.out.println("test.....");
		
	}
	
	//����û��Ƿ����
	@Test
	public void checkAccountTest() {
		System.out.println("test.....");
	}
	
	//Test Case 3: �����Account����ΪNULL
	
}
