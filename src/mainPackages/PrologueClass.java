package mainPackages;

import java.util.Scanner;

import basePackages.*;

//���ѷα� ���� Ŭ������ ��� �δ� �� �Դϴ�.
//��� ���� �Ұ͵�
////- �����ϴ� �޼ҵ�(�� Ŭ������ �߽��� Ŭ����)-��� : ������ (�޼ҵ� �̸� : )
//- ���ѷα� ����-��� : ������ (�޼ҵ� �̸� : prologueMethod)
//- ���� ����-��� : ������	(�޼ҵ� �̸� : prologueChoMethod)
public class PrologueClass {
	static Scanner scStr = new Scanner(System.in);
	public static void prologueMethod(){
		BaseFunc.margin10();
		BaseFunc.countStr("");
		BaseFunc.countCh2("OO������ 20�� ���л��� ���۽�����  �����Ǵ� ����� �߻� �Ǿ����ϴ�.");
		BaseFunc.countCh2("�����ڴ� ���б����� ������ �Ͱ��ϴ� ������ ������ �˷�����");
		BaseFunc.countCh2("ſ...");
		BaseFunc.countStr("");
		BaseFunc.countCh2("\"�ٳ�ð�\"");
		BaseFunc.countStr("");
		BaseFunc.countStr("���󿡴� �����Ҽ� ���� �ϵ��� �Ͼ��.");
		BaseFunc.countStr("������ ������ �ְ� �������� �̾߱���̴�.");
		BaseFunc.countStr("");
		BaseFunc.countCh2("\"���� ���� ��Ǻþ�? �װ� ��������ũ�� ���̷�\"");
		BaseFunc.countCh2("\"���� �� �Ҹ��� ����\"");
		BaseFunc.countStr("");
		BaseFunc.countStr("�̷��� �Ǿ��� ����鵵 �� ���� �ȵǴ� �̾߱��� ");
		BaseFunc.countStr("");
		BaseFunc.countCh2("\"�ٵ� ���� ���ϰ�� ���� ���� �̻�!\"");
		BaseFunc.countStr("");
		BaseFunc.countStrNoLn("���� ó�� ������ �� �ϻ��� ���õ� �̷���");
		BaseFunc.countCh1("��zzZZ");
		BaseFunc.countStr("");
		BaseFunc.countCh2("\"�� �Ͼ ���� �Ȱ�?\"");
		BaseFunc.countCh2("\"��..��  �ݹ� ì��� ����\"");
		BaseFunc.countStr("(��� ���� ���� ��)");
		BaseFunc.countCh2("\"��..? �� ��´�.\"");
		BaseFunc.countStr("�ϱ⿹������ �̷� ���̡�");
		BaseFunc.countStr("�� ���� ���� ������..");
		BaseFunc.countCh2("\"�� �� ���ǿ� ��� �ΰ�ͼ� ���� ������!\"");
		BaseFunc.countStr("���� ������ ��Ģ���� ���� �Ͼ�� �� �� �����ϰ�� ��¥�� ����� �λ��̴�.");
		prologueStoryMethod();
	}
	
	public static void prologueStoryMethod(){
		BaseFunc.countStr("");
		BaseFunc.countStr("(���ã�� �����Դ�)"); 
		BaseFunc.countCh2("(�d..! �����嵵..���嵵..�����嵵..���嵵..�����嵵..)");
		BaseFunc.countStr("");
		BaseFunc.countStr("�� ��Ӱ� ����� ���� ����ϱ� ���� �˴��浵 �� �����١�");
		BaseFunc.countStr("");
		BaseFunc.countCh1("(�ǰ�..�ǰ�..)");
		BaseFunc.countStr("");
		BaseFunc.countCh2("�� ��..?");
		BaseFunc.countStr("�� �ڿ� �α�ô�� ��������.");
		BaseFunc.countStr("        �� �ڸ� ���ƺ���                              �� �׳� ����");
		PrintMes.printChoose();
		prologueCho1Method();	//1���� �ޱ� ���� �޼ҵ�
		BaseFunc.countStr("(����ؼ� ����� �͹��͹� �ɾ��.)");
		BaseFunc.countStr("");
		BaseFunc.countCh1("(�ǰ�..�ǰ�..)");
		BaseFunc.countStr("");
		BaseFunc.countCh2("�� ��..? �� �� �߰��� �Ҹ���...");
		BaseFunc.countStr("        �� �ڸ� ���ƺ���                              �� �� ���ƺ��� �ʴ´�");
		
		BaseFunc.countCh2("�� �̹����� ��¥��... ������ ��ħ �Ҹ��� ��ȴ�.");
		BaseFunc.countStr("        �� õõ�� ���� ���ƺ���                              �� ����ɸ� ����ΰ� ���� �׳� ����");
	}
	
	public static void prologueCho1Method(){//1���� �ޱ� ���� �޼ҵ�
		String choose = "";
		choose = scStr.nextLine();
		if (choose.equals("�ڸ� ���ƺ���")) {
			BaseFunc.countCh2("�� ���ž���.");
		} else if (!(choose.equals("�׳ɰ���"))) {
			PrintMes.printReCho();
			prologueCho1Method();		//�ٽ� �Է� �޵��� ���� ȣ��
		}
	}
	
	public static void prologueCho2Method(){//2���� �ޱ� ���� �޼ҵ�
		String choose = "";
		choose = scStr.nextLine();
		if (choose.equals("�ڸ� ���ƺ���")) {
			BaseFunc.countStr("(���ε� �ڿ� �׸��ڰ� ���δ�.)");
			BaseFunc.countStr("        �����ε��� ���캻��                            �� ���캸�� �ʴ´�");
			prologueCatMethod();
		} else if (!(choose.equals("�� ���ƺ��� �ʴ´�"))) {
			PrintMes.printReCho();
			prologueCho2Method();		//�ٽ� �Է� �޵��� ���� ȣ��
		}
	}
	
	public static void prologueCatMethod(){//���ε� ���� �ޱ� ���� �޼ҵ�
		String choose = "";
		choose = scStr.nextLine();
		if (choose.equals("���ε��� ���캻��")) {
			BaseFunc.countCh2("�� ����̴�. �׳� ����.");
		} else if (!(choose.equals("���캸�� �ʴ´�"))) {
			PrintMes.printReCho();
			prologueCatMethod();		//�ٽ� �Է� �޵��� ���� ȣ��
		}
	}
	
	public static void prologueCho3Method(){//2���� �ޱ� ���� �޼ҵ�
		String choose = "";
		choose = scStr.nextLine();
		if (choose.equals("õõ�� ���� ���ƺ���")) {
			BaseFunc.countStr("�� ��������ũ�� �����ƴ�. ����ؾ�����");
		}
		else if (choose.equals("����ɸ� ����ΰ� ���� �׳� ����")) {
			if(GameOverClass.gameOverIn()==1) {
				prologueStoryMethod();
			}
		}
		else {
			PrintMes.printReCho();
			prologueCho2Method();		//�ٽ� �Է� �޵��� ���� ȣ��
		}
	}
}
