package mainPackages;

import java.util.Scanner;

import basePackages.BaseFunc;
import basePackages.GameOverClass;
//���� ���� ���� Ŭ������ ��� �δ� �� �Դϴ�.
//��� ���� �Ұ͵�
//- �����ϴ� �޼ҵ�(�� Ŭ������ �߽��� Ŭ����)-��� : ?? (�޼ҵ� �̸� : leftMethod)
//- ��Ź��(�㹫����)-��� : ������ (�޼ҵ� �̸� : cleanerMethod)
//- �����(���ǿ���/��忣��)-��� : �ڼ��� (�޼ҵ� �̸� : policeMethod)
//- ��ȸ(���ǿ���/��忣��)-��� : ������ (�޼ҵ� �̸� : churchMethod)
import basePackages.ImgClass;
import basePackages.PrintMes;



public class LeftEndingClass {
	public static void churchMethod() {
				
		Scanner sc = new Scanner(System.in);
		String dab;
		
		BaseFunc.countCh2("(�޸��� �� �տ� ��ȸ�� ���δ�.)");
		BaseFunc.countStr("");
		BaseFunc.countCh2("�� ��ȸ��... ��Ҿ�!! ���� ���������ϱ� ���� ����� �����ž�!...");
		BaseFunc.countCh2("�� �ϳ��� �����մϴ�! ���� ��ȸ ������ �ٴҰԿ�!!!");
		BaseFunc.countStr("");
		BaseFunc.countCh2("(��ȸ ���� ���� ����...)");
		BaseFunc.countStr("");
		BaseFunc.countCh2(".");
		BaseFunc.countStr("");
		BaseFunc.countCh2(".");
		BaseFunc.countStr("");
		BaseFunc.countCh2(".");
		BaseFunc.countStr("");
		BaseFunc.countCh2("�� ��....?");
		BaseFunc.countCh2("�� �ƹ��� ����?...");
		BaseFunc.countStr("");
		BaseFunc.countCh2("(�� �� �ڿ��� �鸮�� ��Ҹ�,)");
		ImgClass.RadMaskImg3();
		BaseFunc.countCh2("\"��... ��..��...?\"");
		BaseFunc.countStr("");
		BaseFunc.countCh2("(�׳డ ����ũ�� ����, �ͱ��� ������ ���� ������.)");
		BaseFunc.countStr("");
		BaseFunc.countCh2("��  ����� ����ؾ� ����..? ");
		BaseFunc.countStr("");

		
		while(true) {
			
			System.out.println("          �� ��                               �� �ƴ�");
			PrintMes.printChoose();
			dab = sc.nextLine();
			
			BaseFunc.countStr("");	
			
			if(dab.equals("��")) {
				BaseFunc.countCh2("(�׷��� ���� ����ũ�� ���ߴ�.)");
				BaseFunc.countStr("");
				BaseFunc.countCh2("���� ����ũ : �׷�...�ʵ� �Ȱ��� ������ٰ�....");
				BaseFunc.countCh2("��  ��?!.. ��񸸿�!! ");
				BaseFunc.countStr("");
				BaseFunc.countCh2("(�׳డ �� ���� ��Ҵ�.)");
				BaseFunc.countStr("");
				BaseFunc.countCh2("���� ����ũ : �ʵ�.. �������°ž�...");
				BaseFunc.margin5();
				BaseFunc.countCh2("\"���ε�....\"");
				BaseFunc.margin5();
				GameOverClass.gameOverIn();
			//	break;
			}else if(dab.contentEquals("�ƴ�")) {
				BaseFunc.countCh2("���� ����ũ : �׷�?...");
				BaseFunc.countStr("");
				BaseFunc.countCh2("(�׳డ �� ���� ��Ҵ�.)");
				BaseFunc.countStr("");
				BaseFunc.countCh2("��  ?!.. �����..!! ");
				BaseFunc.countStr("");
				BaseFunc.countCh2("(�׸��� �� ���� ���ڳ��̱��� �������ȴ�.)");
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
}
