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
	static Scanner scInt = new Scanner(System.in);
	static public PlayerClass Plc = new PlayerClass();
	public static void playerSet() {
		BaseFunc.margin10();
		System.out.println("����� �̸���?");
		System.out.print("�Է� : ");
		Plc.playerName = scStr.nextLine();
		System.out.println("����� ������?");
		System.out.print("�Է� : ");
		Plc.gender= scStr.nextLine();
	}
	public static void prologueMethod(){
		playerSet();
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
		prologueCho1Method();	//1���� �ޱ� ���� �޼ҵ�
		BaseFunc.countStr("(����ؼ� ����� �͹��͹� �ɾ��.)");
		BaseFunc.countStr("");
		BaseFunc.countCh1("(�ǰ�..�ǰ�..)");
		BaseFunc.countStr("");
		BaseFunc.countCh2("�� ��..? �� �� �߰��� �Ҹ���...");
		prologueCho2Method();	
		BaseFunc.countStr("");
		BaseFunc.countCh2("(�ݷ� �ݷ�)");
		BaseFunc.countStr("");
		BaseFunc.countCh2("�� �̹����� ��¥��... ������ ��ħ �Ҹ��� ��ȴ�.");
		prologueCho3Method();
	}
	
	public static void prologueCho1Method(){//1���� �ޱ� ���� �޼ҵ�
		BaseFunc.countStr("        �� �ڸ� ���ƺ���                              �� �׳� ����");
		BaseFunc.countStr("");
		PrintMes.printChoose();
		String choose = "";
		choose = scStr.nextLine();
		if (choose.equals("�ڸ� ���ƺ���")) {
			BaseFunc.countStr("");
			BaseFunc.countCh2("�� ���ž���.");
		} else if (!(choose.equals("�׳ɰ���"))) {
			PrintMes.printReCho();
			BaseFunc.margin5();
			prologueCho1Method();		//�ٽ� �Է� �޵��� ���� ȣ��
		}
	}
	
	public static void prologueCho2Method(){//2���� �ޱ� ���� �޼ҵ�
		BaseFunc.countStr("        �� �ڸ� ���ƺ���                              �� �� ���ƺ��� �ʴ´�");
		BaseFunc.countStr("");
		PrintMes.printChoose();
		String choose = "";
		choose = scStr.nextLine();
		if (choose.equals("�ڸ� ���ƺ���")) {
			prologueCatMethod();
		} else if (!(choose.equals("�� ���ƺ��� �ʴ´�"))) {
			PrintMes.printReCho();
			BaseFunc.margin5();
			prologueCho2Method();		//�ٽ� �Է� �޵��� ���� ȣ��
		}
	}
	
	public static void prologueCatMethod(){//���ε� ���� �ޱ� ���� �޼ҵ�
		BaseFunc.countStr("(���ε� �ڿ� �׸��ڰ� ���δ�.)");
		BaseFunc.countStr("        �����ε��� ���캻��                            �� ���캸�� �ʴ´�");
		BaseFunc.countStr("");
		PrintMes.printChoose();
		String choose = "";
		choose = scStr.nextLine();
		if (choose.equals("���ε��� ���캻��")) {
			BaseFunc.countCh2("�� ����̴�. �׳� ����.");
		} else if (!(choose.equals("���캸�� �ʴ´�"))) {
			PrintMes.printReCho();
			BaseFunc.margin5();
			prologueCatMethod();		//�ٽ� �Է� �޵��� ���� ȣ��
		}
	}
	
	public static void prologueCho3Method(){//3���� �ޱ� ���� �޼ҵ�
		BaseFunc.countStr("        �� õõ�� ���� ���ƺ���                              �� ����ɸ� ����ΰ� ���� �׳� ����");
		BaseFunc.countStr("");
		PrintMes.printChoose();
		String choose = "";
		choose = scStr.nextLine();
		if (choose.equals("õõ�� ���� ���ƺ���")) {
			prologueMaskMethod();
		}
		else if (choose.equals("����ɸ� ����ΰ� ���� �׳� ����")) {
			prologueReMethod();
		}
		else {
			PrintMes.printReCho();
			BaseFunc.margin5();
			prologueCho3Method();		//�ٽ� �Է� �޵��� ���� ȣ��
		}
	}
	
	public static void prologueMaskMethod(){
		BaseFunc.countStr("�� ��������ũ�� �����ƴ�. ����ؾ�����..?");
		BaseFunc.countStr("        �� ��������ũ ���� ������Ű�� ã�ƺ���                             �� ����ģ��");
		BaseFunc.countStr("        �� �ν�Ÿ�� �������� ��´�                              ");
		BaseFunc.countStr("");
		PrintMes.printChoose();
		String choose = "";
		choose = scStr.nextLine();
		if (choose.equals("��������ũ ���� ������Ű�� ã�ƺ���")) {
			prologueReMethod();
		}
		else if (choose.equals("�ν�Ÿ�� �������� ��´�")) {
			prologueInstaMethod();
		}
		else if (choose.equals("����ģ��")) {
			prologueforkMethod();
		}
		else  {
			PrintMes.printReCho();
			BaseFunc.margin5();
			prologueMaskMethod();		//�ٽ� �Է� �޵��� ���� ȣ��
		}
	}
	
	public static void prologueInstaMethod(){
		BaseFunc.countStr("(��������ũ�� ���� �ٰ��´�...)");
		BaseFunc.countStr("        ���λ��Ѵ�                    �� ������ ���ظ� ���Ѵ�");
		BaseFunc.countStr("        ������ģ��                    �� ��������ũ���� ������ ��Ź�Ѵ�");
		BaseFunc.countStr("");
		PrintMes.printChoose();
		String choose = "";
		choose = scStr.nextLine();
		if (choose.equals("�λ��Ѵ�")) {
			BaseFunc.countCh2("(��������ũ�� �λ��ߴ�.)");
			BaseFunc.countStr("");
			BaseFunc.countStrNoLn("���� ����ũ : ");
			BaseFunc.countCh2("Ȥ��... ��..��Ÿ..�� ��..��..���� ..?");
			BaseFunc.countStr("");
			BaseFunc.countCh2("�� ��..��..�����Ͻø�.. �����....��?");
			BaseFunc.countStr("");
			BaseFunc.countStrNoLn("���� ����ũ : ");
			BaseFunc.countCh2("��...��..��..��..�� ��..�ϰ�.. �˷��ࡦ");
			BaseFunc.countStr("");
			BaseFunc.countCh2("(��ó���ϰ� ���� ���������� ģ���ϰ� �˷��־���.)");
			BaseFunc.countCh2("(�׷��� ���� ����ũ�� ���� ��ī�� ���ڰ� �Ͽ���.)");
			BaseFunc.countCh2("(�̻������� ���� ��ġ���� ������ �����̴١�)");
			EndingClass.friendEndingMethod();
		}
		else if (choose.equals("������ ���ظ� ���Ѵ�")) {
			BaseFunc.countStrNoLn("���� ����ũ : ");
			BaseFunc.countCh2("�׷�.. ��ī��.. ����...��.?");
			BaseFunc.countCh2("�� ��..��.. �׷� ������..");
			BaseFunc.countStrNoLn("���� ����ũ : ");
			BaseFunc.countCh2("�׸���..��..��..�� ��..�ϰ�.. �˷��ࡦ");
			BaseFunc.countCh2("�� �ڵ�����... ��������...?");
			BaseFunc.countCh2("(��ó���ϰ� ���� ���������� ģ���ϰ� �˷��־���.)");
			BaseFunc.countCh2("(�̻������� ���� ��ġ���� ������ �����̴١�)");
			EndingClass.friendEndingMethod();
		}
		else if (choose.equals("��������ũ���� ������ ��Ź�Ѵ�")) {
			prologueReMethod();
		}
		else if (choose.equals("����ģ��")) {
			prologueforkMethod();
		}
		else {
			PrintMes.printReCho();
			BaseFunc.margin5();
			prologueInstaMethod();	//�ٽ� �Է� �޵��� ���� ȣ��
		}
	}
	public static void prologueforkMethod() {
		BaseFunc.countStr("(�������̴�..)");
		BaseFunc.countStr("        ��������                  �� ����");
		PrintMes.printChoose();
		String choose = "";
		choose = scStr.nextLine();
		if (choose.equals("������")) {
			RightEndingClass.rightMethod();
		}
		else if (choose.equals("����")){
			LeftEndingClass.leftMethod();
		}
		else {
			PrintMes.printReCho();
			BaseFunc.margin5();
			prologueforkMethod();		//�ٽ� �Է� �޵��� ���� ȣ��
		}
	}
	public static void prologueReMethod() {
		if(GameOverClass.gameOverIn()==1) {
			prologueStoryMethod();
		}
	}
}
