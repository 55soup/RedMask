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
	public static void leftMethod(){
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
	public static void churchMethod() {
		String dab;
		
		BaseFunc.countCh2("(�޸��� �� �տ� ��ȸ�� ���δ�.)");
		////////////////////////////////������
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("");
		BaseFunc.countCh2("�� ��ȸ��... ��Ҿ�!! ���� ���������ϱ� ���� ����� �����ž�!...");
		BaseFunc.countCh2("�� �ϳ��� �����մϴ�! ���� ��ȸ ������ �ٴҰԿ�!!!");
		////////////////////////////////������
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("");
		BaseFunc.countCh2("(��ȸ ���� ���� ����...)");
		////////////////////////////////������
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("");
		BaseFunc.countCh2(".");
		////////////////////////////////������
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("");
		BaseFunc.countCh2(".");
		////////////////////////////////������
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("");
		BaseFunc.countCh2(".");
		////////////////////////////////������
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("");
		BaseFunc.countCh2("�� ��....?");
		BaseFunc.countCh2("�� �ƹ��� ����?...");
		////////////////////////////////������
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("");
		BaseFunc.countCh2("(�� �� �ڿ��� �鸮�� ��Ҹ�,)");
		////////////////////////////////������
		BaseFunc.count();
		BaseFunc.count();
		ImgClass.RadMaskImg3();
		BaseFunc.countCh2("\"��... ��..��...?\"");
		////////////////////////////////������
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("");
		BaseFunc.countCh2("(�׳డ ����ũ�� ����, �ͱ��� ������ ���� ������.)");
		////////////////////////////////������
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("");
		BaseFunc.countCh2("��  ����� ����ؾ� ����..? ");
		////////////////////////////////������
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("");
		while(true) {
			System.out.println("          �� ��                               �� �ƴ�");
			PrintMes.printChoose();
			dab = scStr.nextLine();
			////////////////////////////////������
			BaseFunc.count();
			BaseFunc.count();
			BaseFunc.countStr("");	
			if(dab.equals("��")) {
				BaseFunc.countCh2("(�׷��� ���� ����ũ�� ���ߴ�.)");
				////////////////////////////////������
				BaseFunc.count();
				BaseFunc.count();
				BaseFunc.countStr("");
				BaseFunc.countStrNoLn("���� ����ũ : ");
				BaseFunc.countCh2("�׷�...�ʵ� �Ȱ��� ������ٰ�....");
				BaseFunc.countCh2("��  ��?!.. ��񸸿�!! ");
				////////////////////////////////������
				BaseFunc.count();
				BaseFunc.count();
				BaseFunc.countStr("");
				BaseFunc.countCh2("(�׳డ �� ���� ��Ҵ�.)");
				////////////////////////////////������
				BaseFunc.count();
				BaseFunc.count();
				BaseFunc.countStr("");
				BaseFunc.countStr("���� ����ũ : ");
				BaseFunc.countCh2("�ʵ�.. �������°ž�...");
				////////////////////////////////������
				BaseFunc.count();
				BaseFunc.count();
				BaseFunc.countStr("");
				BaseFunc.margin5();
				BaseFunc.countCh2("\"���ε�....\"");
				BaseFunc.margin5();
				GameOverClass.gameOverIn();
			//	break;
			}else if(dab.contentEquals("�ƴ�")) {
				BaseFunc.countCh2("���� ����ũ : �׷�?...");
				////////////////////////////////������
				BaseFunc.count();
				BaseFunc.count();
				BaseFunc.countStr("");
				BaseFunc.countCh2("(�׳డ �� ���� ��Ҵ�.)");
				////////////////////////////////������
				BaseFunc.count();
				BaseFunc.count();
				BaseFunc.countStr("");
				BaseFunc.countCh2("��  ?!.. �����..!! ");
				////////////////////////////////������
				BaseFunc.count();
				BaseFunc.count();
				BaseFunc.countStr("");
				BaseFunc.countCh2("(�׸��� �� ���� ���ڳ��̱��� �������ȴ�.)");
				////////////////////////////////������
				BaseFunc.count();
				BaseFunc.count();
				BaseFunc.countStr("");
				BaseFunc.countCh2("���� ����ũ : ���� �ʺ��� ����?...");
				BaseFunc.margin5();
				GameOverClass.gameOverIn();
			//	break;
			}else {
				BaseFunc.countCh2("�ٽ� �Է��ϼ���");
				continue;
			}
		}
	}
	
	public static void cleanerMethod() {
		String plcGender=PrologueClass.Plc.gender;	//���� ����
		BaseFunc.countStr("(��Ź�ҷ� ������ �ٱ� �����Ͽ���.)");
		BaseFunc.countCh2("\"��... ��... ��... ��...��....!\"");
		////////////////////////////////������
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("");
		BaseFunc.countStr("(�ڿ��� �Ҹ�ġ�� ���� ����ũ�� ��Ҹ��� �鸰��.)");
		BaseFunc.countStr("(����ϰ� ���� ���� �ִ� ��Ź�ҿ� ���� �����ߴ�.)");
		////////////////////////////////������
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.margin5();
		BaseFunc.countStr("----���� ���� �ٽ� ã�� �� �ּ���----");
		////////////////////////////////������
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.margin5();
		BaseFunc.countCh2("(�����̵� ��Ź���� ���� �������ִ�.)"); 
		BaseFunc.countStr("(�� ������ ���� �ڴ�.)");
		BaseFunc.countStr("(��Ź�� ���� ���� ���� ���������� ������� ������ ������ ����.)");
		BaseFunc.countStr("(���� ���� ������ �� ������."); 
		////////////////////////////////������
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("");
		BaseFunc.countCh2("�� ����� ���� �� ��װ� �ٴϽö�ϱ�... �����ϴ� ���� ������ �����...");
		BaseFunc.countCh2("�� �ƹ�ư  ������� ���� �� �ᱸ�ô� ������ ���� ��ȴ�....");
		////////////////////////////////������
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("");
		BaseFunc.countCh1("������..");
		////////////////////////////////������
		BaseFunc.count();
		BaseFunc.count();
		ImgClass.RadMaskImg3();
		////////////////////////////////������
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countCh2("�� �ơ� �����鼭 ���� ����ɾ���.. �� ���� �״±�����");
		////////////////////////////////������
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("");
		BaseFunc.countStrNoLn("�ƺ�(��Ź�� �����) : ");
		BaseFunc.countCh2("��.. �� ���� �� ��װ� �������� �� ��..����"); 
		////////////////////////////////������
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("");
		BaseFunc.countCh2("(����Ծƴ� �ƺ��� ��Ҹ��� �鸮�� ����.. ���� ����ũ�� �� �� �տ���  �������.)");
		BaseFunc.countCh2("(�ƺ��� �տ��� ��� ȭ��ǿ��� �Ӹ��� ���� �ϰ� �Դ��� �����尡 ��� �־���.)");
		BaseFunc.countCh2("(�׷� ������ �ƺ��� �����尡 ���� ��ȴ�...)");
		////////////////////////////////������
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("");
		BaseFunc.countStrNoLn("�ƺ�(��Ź�� �����) : ");
		BaseFunc.countCh2("��..! "+(plcGender.equals("��")?"��":plcGender.equals("��")?"�Ƶ�":"��")
				+" �� �ű��־�? ���� ���̷��� �� ������ �� �°� �Ծ�?");
		////////////////////////////////������
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("");
		BaseFunc.countCh2("�� �ƴ�.. �� �� �� �ᱸ�� ���� ���.. Ȥ�� ���� ����");
		BaseFunc.countStrNoLn("�ƺ�(��Ź�� �����) : ");
		BaseFunc.countCh2("�ƺ� ��Ź�ҵ� �Ű� ���ְ�츮 "+
				(plcGender.equals("��")?"��":plcGender.equals("��")?"�Ƶ�":"")
				+"���ǳ�. �����ϴٰ� ȭ����� ���ؼ� ���� ���� �־����...����");
		BaseFunc.countCh2("               ���Ǵ� �Ǿ��� ���� ���� ����");
		////////////////////////////////������
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.margin20();
		BaseFunc.countCh2("�׶� ���ķ� ���� ���� ����ũ�� ������ ����..");
		BaseFunc.countCh2("�ƴ� �׳� �߸� �� ���� ���� �𸣰ڴ�.."); 
		BaseFunc.countCh2("�׷��� ���� �׳� ���� �� �������Ե� ������ �ʾҴ�."); 
		BaseFunc.countCh2("�̷� �͹��� ���� ���� �� ������ ���� ���� �ű⿡...");
		BaseFunc.countCh2("�� ���� �׷� �͹��� ���� �̾߱⸦ �����ʴ� ��� �Ǿ���.");
		GameEndClass.gameEndIn();
	}
	public static void policeMethod(){
		//����
		BaseFunc.margin20();
		BaseFunc.countStr("(���� �ó��Ա��� ���� ����� ���⼭�� �ٸ������ߴ�.)");
		BaseFunc.count();
		BaseFunc.countStr("(���� ���ڵ��� �� �Ա����� �پ���.)");
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("");
		BaseFunc.countCh2("�� ��...��..");
		////////////////////////////////������
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("");
		///////////////////////////////������
		BaseFunc.countStr("(���� ������ ���� �߰��ٹ��� �ϰ� �ִ� ������ 1���� ȭ��¦ �����.)");
		////////////////////////////////������
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.count();
		///////////////////////////////������
		BaseFunc.countStr("");
		BaseFunc.countStrNoLn("������: ");
		BaseFunc.countCh2("������ �̽ʴϱ�?"); //������
		////////////////////////////////������
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("");
		///////////////////////////////������
		BaseFunc.countStr("(������ �¸��� �����ִ� ���� ���� �������� ���� �ڸ��� ������� �Ͽ���.)");
		////////////////////////////////������
		BaseFunc.count();
		BaseFunc.count();
		///////////////////////////////������
		BaseFunc.countStr("(���� ������ ���� ������ ���浵 �����ʾҴ�.)");
		////////////////////////////////������
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("");
		///////////////////////////////������
		BaseFunc.countCh2("�� ��...�� ��� ��, �Ѿƿ��� ���� ����ũ�� �־�..�־�..��");
		BaseFunc.countCh2("��. �Ʊ���� ���, �б����� ����.. �� �ѾƿͿ�.. �����ּ���...");
		///////////////////////////////������
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("");
		///////////////////////////////������
		BaseFunc.countStr("(������ �� �̾߱⸦ �� ���� �ɰ��� ���̴� ��ġ�� �ƴϿ���.)");
		///////////////////////////////������
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("");
		///////////////////////////////������
		BaseFunc.countStrNoLn("������ : ");
		BaseFunc.countCh2("�л�, �ʹ� ���θ� ������ �Ѱ� �ƴϾ�?");
		BaseFunc.countCh2("         ���ε� ���������ؾ��� �ʹ� �׷��� �����ϸ�...");
		BaseFunc.countStr("");
		BaseFunc.countCh2("(...)");
		////////////////////////////////������
		BaseFunc.count();
		BaseFunc.count();
		///////////////////////////////������
		BaseFunc.margin10(); //20ĭ ����
		BaseFunc.countCh2("(���� �߸� ���Ŷ��??)");
		BaseFunc.countCh1NoLn("(�ƴѵ�...)");
		BaseFunc.margin10(); //20ĭ ����
		BaseFunc.countCh("�ôµ�... �ôµ�... �ôµ�... �ôµ�...�ôµ�... �ôµ�... �ôµ�... �ôµ�...�ôµ�... �ôµ�... ");
		for(int i =0; i<150;i++) {
			BaseFunc.countStrNoLn("�ôµ�...");
			if(i%12==0) {
				BaseFunc.countStr("");
			}
		}
		BaseFunc.countStr("");
		BaseFunc.countCh("(�帴�ϰ� �̻��� ��ü�� ����...)");
		// ###��������ũ ��� ����
		ImgClass.RadMaskImg3();
		////////////////////////////////������
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.count();
		////////////////////////////////������
		BaseFunc.margin20();
		//////////////////////////////���忣��
		BaseFunc.countStrNoLn("(�����Ҹ�)");
		////////////////////////////////������
		BaseFunc.count();
		BaseFunc.count();
		////////////////////////////////������
		/////////////////////////////////����
		// ###�������� ������ �÷��̾� ���� ��� ���??
		BaseFunc.countCh2("oo������ ���۽����� ������ 10�� ���л�/���л���");
		BaseFunc.countCh2("�� �ð� ����ҿ��� ��� ���� �ִ� �������� �����Ǵ� ����� �߻��Ǿ��ٰ� �մϴ�.");
		BaseFunc.countCh2("������ 20�� ���л� ������ ����� ���¸� ��� �־� ���� ȭ���� �ǰ��ֽ��ϴ�.");
		BaseFunc.countCh2("���� �����ϰ� �ִ� �������� ������ �ð�, ����� ���� cctv�� ���ڱ� ���� ������ ���Ͽ�");
		BaseFunc.countCh2("������ ������ �ް� �ֽ��ϴ�.");
		/////////////////////////////////����
		////////////////////////////////������
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.margin5();
		////////////////////////////////������
		BaseFunc.countStrNoLn("�� �л��� ����: ");
		BaseFunc.countCh2("���̱� ������... �� ������ ���� ���Ͷ�.");
		BaseFunc.countStrNoLn("�л�: ");
		BaseFunc.countCh2("�� �ٳ�ð�...");
		////////////////////////////////������
		BaseFunc.margin20();
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.margin20();
		////////////////////////////////������
		BaseFunc.countStr("(ſ...)");
		////////////////////////////////������
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.margin20();
		////////////////////////////////������
		GameEndClass.gameEndIn();
	}
}
