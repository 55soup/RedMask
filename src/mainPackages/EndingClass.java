package mainPackages;

import basePackages.*;

//��Ÿ ��������  ��� �� Ŭ�����Դϴ�.
//��� ���� �Ұ͵�
//- ���翣��! (��������ũ�� ���� ��ģ)-��� : ������(�޼ҵ� �̸� : friendEndingMethod) 
public class EndingClass {
	public static void friendEndingMethod(){
		BaseFunc.margin10();
		BaseFunc.countCh2("���� ����ũ�� ���� ������ ���ڰ� �ϱ⿡ ���� �ȷο���� �ְ� �޾Ҵ�.");
		BaseFunc.countCh2("���� ���� �����ϰ� �������� �ִ�.");
		BaseFunc.countCh2("�׷� �ͽ��̵� �ΰ��̵� �̷� ���踦 ģ����� ���� �ִٸ� �츮�� ��ģ�� ���̴�.");
		GameEndClass.gameEndIn();
	}
}
