package mainPackages;

import basePackages.BaseFunc;
import basePackages.GameEndClass;
import basePackages.ImgClass;

//������ ���� ���� Ŭ������ ��� �δ� �� �Դϴ�.
//��� ���� �Ұ͵�
//- �����ϴ� �޼ҵ�(�� Ŭ������ �߽��� Ŭ����)-��� : ?? (�޼ҵ� �̸� : rightMethod)
//- ���ð�, ����-���ΰ���(�� ��)-��� : �ڼ��� (�޼ҵ� �̸� : houseMethod)
//- ����Ʈ 4�� -��� : ������ (�޼ҵ� �̸� : floor4Method)
//- ����Ʈ ģ��(����)��(11)(������)-��� : �ڼ��� (�޼ҵ� �̸� : floorFriendMethod)
//- ����Ʈ ����-��� : ������ (�޼ҵ� �̸� : rooftopMethod)
public class RightEndingClass {
	public static void rooftopMethod() { //������
		BaseFunc.countCh2("�� ����... ��������ũ�� ���� ���� �Ⱦ��Ѵٴ� �Ҹ��� �����Ͱ���....");
		BaseFunc.countStr("");
		BaseFunc.countCh2("(���� �绡�� �� �������� ���� ���� ���� ������.)");
		BaseFunc.countCh2("(������ ������ �����־��� ���� �� ������ ������.)");
		BaseFunc.countCh2("(�׸��� ��������ũ�� ��ġ�� Ȯ�� �ϱ����� ����Ʈ �Ա��� Ȯ���ߴ�....)");
		BaseFunc.countStr("");
		BaseFunc.countCh2("�� ��.....?");
		BaseFunc.countStr("");
		BaseFunc.countCh2("(���ڱ� ���� ������ ������.)");
		BaseFunc.countCh2("(�׸��� �ٴ��� ���� ��ι��� �ƴ�...)");
		BaseFunc.countStr("");
		BaseFunc.countStr("�� ���� ����� �� ����...");
		BaseFunc.countStr("");
		BaseFunc.countCh2("(�� ���� �������.)");
		BaseFunc.countCh2("(���� ���� ���ڸ� ������ �ȴ� ����� ���̴� �� �ϴ�.)");
		BaseFunc.countStr("");
		BaseFunc.countCh2("�� �̰�... �ָ����ΰ�...");
		BaseFunc.countStr("");
		BaseFunc.countCh2("(���� ���̴� ���� �Ƿ翧....)");
		BaseFunc.countCh2("(��������ũ�� ��Ҹ��� ����ϰ� �鸰��...)");
		BaseFunc.margin20();
		ImgClass.RadMaskImg1();
		BaseFunc.margin10();
		BaseFunc.countCh2("\"��... ����...?\"");
		GameEndClass.gameEndIn();
	}

}
