package by.unit01.main;

public class Start {
	
	public static void main(String[] args) {
		
		System.out.println("Hello, World!!!");
		Second.method();  //������� ����� �� ������� �����(�����)
		
		//��������� �������� � ������� �������������� ������������ �� ������ � � b ���� �������.
		double a, b; // ��� ������
		double c = 0; // ����������
		double p; // ��������
		double s; // �������
		a = 10;
		b = 20;
		c = Math.sqrt(a * a + b * b);
		p = a + b + c;
		s = 0.5 * a * b;
		System.out.println("�������� = " + p + " ������� = " + s);
		
		
		
	}
	
	

}
