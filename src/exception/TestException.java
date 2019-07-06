package exception;


import java.io.File;
import java.io.FileNotFoundException;

public class TestException {
	public static void main(String[] args) {
//		int i = 1/0;
//		Computer c  = null;
//		if(c!=null){
//			c.start();   //������null�������˶��󷽷������ԣ�
//		}
		
//		string str = "1234abcf";
//		Integer i = new Integer(str);
		
//		try{
//			Thread.sleep(3000);
//		}catch(Exception e){
//			e.printStackTrace();
//		}finally{
//			System.out.println("aaa");
//		}
		
		File f = new File("c:/tt.txt");
		if (!f.exists())  {
			try {
				throw new FileNotFoundException("File can't be found!"); 
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}

		
	}
}

class Computer{
	void start(){
		System.out.println("�����������");
	}
}