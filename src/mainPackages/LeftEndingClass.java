package mainPackages;

import java.util.Scanner;

import basePackages.*;

//���� ���� ���� Ŭ������ ��� �δ� �� �Դϴ�.
//��� ���� �Ұ͵�
//- �����ϴ� �޼ҵ�(�� Ŭ������ �߽��� Ŭ����)-��� : ?? (�޼ҵ� �̸� : leftMethod)
//- ��Ź��(�㹫����)-��� : ������ (�޼ҵ� �̸� : cleanerMethod)
//- �����(���ǿ���/��忣��)-��� : �ڼ��� (�޼ҵ� �̸� : policeMethod)
//- ��ȸ(���ǿ���/��忣��)-��� : ������ (�޼ҵ� �̸� : churchMethod)
public class LeftEndingClass {
	static Scanner scStr = new Scanner(System.in);
	public static void leftMethod() {
		BaseFunc.countStr("(�������� �޸� ���� ������ ���� ��� ���߰ڴ�..)");
		BaseFunc.countStr("        �� �����                          �� ��ȸ");
		BaseFunc.countStr("        �� ��Ź�� ");
		BaseFunc.countStr("");
		PrintMes.printChoose();
		String choose = "";
		choose = scStr.nextLine();
		BaseFunc.margin5();
		if (choose.equals("�����")) {
			policeMethod();
		} else if (choose.equals("��ȸ")) {
			churchMethod();
		} else if (choose.equals("��Ź��")) {
			cleanerMethod();
		} else {
			PrintMes.printReCho();
			BaseFunc.margin5();
			leftMethod();// �ٽ� �Է� �޵��� ���� ȣ��
		}
	}
	public static void cleanerMethod() {
		String plcGender=PrologueClass.Plc.gender;	//���� ����
		BaseFunc.countStr("(��Ź�ҷ� ������ �ٱ� �����Ͽ���.)");
		BaseFunc.countCh2("\"��... ��... ��... ��...��....!\"");
		BaseFunc.countStr("");
		BaseFunc.countStr("(�ڿ��� �Ҹ�ġ�� ���� ����ũ�� ��Ҹ��� �鸰��.)");
		BaseFunc.countStr("(����ϰ� ���� ���� �ִ� ��Ź�ҿ� ���� �����ߴ�.)");
		BaseFunc.margin5();
		BaseFunc.countStr("----���� ���� �ٽ� ã�� �� �ּ���----");
		BaseFunc.margin5();
		BaseFunc.countCh2("(�����̵� ��Ź���� ���� �������ִ�.)"); 
		BaseFunc.countStr("(�� ������ ���� �ڴ�.)");
		BaseFunc.countStr("(��Ź�� ���� ���� ���� ���������� ������� ������ ������ ����.)");
		BaseFunc.countStr("(���� ���� ������ �� ������."); 
		BaseFunc.countStr("");
		BaseFunc.countCh2("�� ����� ���� �� ��װ� �ٴϽö�ϱ�... �����ϴ� ���� ������ �����...");
		BaseFunc.countCh2("�� �ƹ�ư  ������� ���� �� �ᱸ�ô� ������ ���� ��ȴ�....");
		BaseFunc.countStr("");
		BaseFunc.countCh1("������..");
		ImgClass.RadMaskImg3();
		BaseFunc.countCh2("�� �ơ� �����鼭 ���� ����ɾ���.. �� ���� �״±�����");
		BaseFunc.countStr("");
		BaseFunc.countStrNoLn("�ƺ�(��Ź�� �����) : ");
		BaseFunc.countCh2("��.. �� ���� �� ��װ� �������� �� ��..����"); 
		BaseFunc.countStr("");
		BaseFunc.countCh2("(����Ծƴ� �ƺ��� ��Ҹ��� �鸮�� ����.. ���� ����ũ�� �� �� �տ���  �������.)");
		BaseFunc.countCh2("(�ƺ��� �տ��� ��� ȭ��ǿ��� �Ӹ��� ���� �ϰ� �Դ��� �����尡 ��� �־���.)");
		BaseFunc.countCh2("(�׷� ������ �ƺ��� �����尡 ���� ��ȴ�...)");
		BaseFunc.countStr("");
		BaseFunc.countStrNoLn("�ƺ�(��Ź�� �����) : ");
		BaseFunc.countCh2("��..! "+(plcGender.equals("��")?"��":plcGender.equals("��")?"�Ƶ�":"��")
				+" �� �ű��־�? ���� ���̷��� �� ������ �� �°� �Ծ�?");
		BaseFunc.countStr("");
		BaseFunc.countCh2("�� �ƴ�.. �� �� �� �ᱸ�� ���� ���.. Ȥ�� ���� ����");
		BaseFunc.countStrNoLn("�ƺ�(��Ź�� �����) : ");
		BaseFunc.countCh2("�ƺ� ��Ź�ҵ� �Ű� ���ְ�츮 "+
				(plcGender.equals("��")?"��":plcGender.equals("��")?"�Ƶ�":"")
				+"���ǳ�. �����ϴٰ� ȭ����� ���ؼ� ���� ���� �־����...����");
		BaseFunc.countCh2("               ���Ǵ� �Ǿ��� ���� ���� ����");
		BaseFunc.margin10();
		BaseFunc.countCh2("�׶� ���ķ� ���� ���� ����ũ�� ������ ����..");
		BaseFunc.countCh2("�ƴ� �׳� �߸� �� ���� ���� �𸣰ڴ�.."); 
		BaseFunc.countCh2("�׷��� ���� �׳� ���� �� �������Ե� ������ �ʾҴ�."); 
		BaseFunc.countCh2("�̷� �͹��� ���� ���� �� ������ ���� ���� �ű⿡...");
		BaseFunc.countCh2("�� ���� �׷� �͹��� ���� �̾߱⸦ �����ʴ� ��� �Ǿ���.");
		GameEndClass.gameEndIn();
	}
	public static void policeMethod(){
		//����
	}
	public static void churchMethod(){
		//����
	}
}
