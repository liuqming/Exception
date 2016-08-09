package liuming.exception;
import java.rmi.RemoteException;

import javax.swing.JOptionPane;

public class Test{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = new String("你好！");
		String str1 = new String("你好！");
		StringBuffer buffer = new StringBuffer("你好！");
		StringBuffer buffer1 = new StringBuffer("你好！");
		//System.out.println(str.equals(str1));
		System.out.println(buffer.equals(buffer));
		
		System.out.println(buffer.toString());
		try {
			srr();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void srr() throws RemoteException{
		try{
			//System.out.println("Something went wrong.");
			String name = JOptionPane.showInputDialog("23132123");
		}finally{
			System.out.println("Finally!");
		}
	}
}
