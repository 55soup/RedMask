package mainPackages;

import basePackages.BaseFunc;

//���� ���� ���� Ŭ������ ��� �δ� �� �Դϴ�.
//��� ���� �Ұ͵�
//- �����ϴ� �޼ҵ�(�� Ŭ������ �߽��� Ŭ����)-��� : ?? (�޼ҵ� �̸� : leftMethod)
//- ��Ź��(�㹫����)-��� : ������ (�޼ҵ� �̸� : cleanerMethod)
//- �����(���ǿ���/��忣��)-��� : �ڼ��� (�޼ҵ� �̸� : policeMethod)
//- ��ȸ(���ǿ���/��忣��)-��� : ������ (�޼ҵ� �̸� : churchMethod)
public class LeftEndingClass {
	public static void policeMethod() {
		BaseFunc.margin20();
		BaseFunc.countStr("(���� �ó��Ա��� ���� ����� ���⼭�� �ٸ������ߴ�.)");
		BaseFunc.count();
		BaseFunc.countStr("(���� ���ڵ��� �� �Ա����� �پ���.)");
		BaseFunc.countCh1("\"����...��..\"");
		BaseFunc.countStr("(���� ������ ���� �߰��ٹ��� �ϰ� �ִ� ������ 1���� ȭ��¦ �����.)");
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.margin10();
		BaseFunc.countStrNoLn("������ : ");
		BaseFunc.countCh2("������ �̽ʴϱ�?"); //������
		BaseFunc.countStr("(������ �¸��� �����ִ� ���� ���� �������� ���� �ڸ��� ������� �Ͽ���.)");
		BaseFunc.countStr("(������ ���� ������ ���浵 �����ʾҴ�.)");
		BaseFunc.countCh2("\"����...�� ��� ��, �Ѿƿ��� ���� ����ũ�� �־�..�־�..��\"");
		BaseFunc.countCh2("\"����. �Ʊ���� ���, �б����� ����.. �� �ѾƿͿ�.. �����ּ���\"");
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.count();
		BaseFunc.countStr("(������ �� �̾߱⸦ �� ���� �ɰ��� ���̴� ��ġ�� �ƴϿ���.)");
		BaseFunc.countStrNoLn("������ : ");
		BaseFunc.countCh2("\"�л�, �ʹ� ���θ� ������ �Ѱ� �ƴϾ�?\"");
	}
}
