package by.unit01.main;

public class Start {
	
	public static void main(String[] args) {
		
		System.out.println("Hello, World!!!");
		Second.method();  //добавим метод из другого места(файла)
		
		//Вычислить периметр и площадь прямоугольного треугольника по длинам а и b двух катетов.
		double a, b; // два катета
		double c = 0; // гипотенуза
		double p; // периметр
		double s; // площадь
		a = 10;
		b = 20;
		c = Math.sqrt(a * a + b * b);
		p = a + b + c;
		s = 0.5 * a * b;
		System.out.println("Периметр = " + p + " площадь = " + s);
		
		
		
	}
	
	

}
