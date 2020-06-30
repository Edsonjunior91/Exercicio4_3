
public class Aplicacao {

	public static void main(String[] args) {
		Triangulo tr = new Triangulo();
		tr.base=2.5;
		tr.altura=4;
		double area = tr.calcularArea();
		System.out.println("Área Triangulo: " +area);
		
	
		Quadrado q = new Quadrado ();
		q.lado =3.2;
		area = q.calcularArea();
		System.out.println("Área Quadrado: " + area);
		
		Circunferencia c = new Circunferencia();
		c.raio = 5;
		area = c.calcularArea();
		System.out.println("Area Circunferencia: " + area);
		
		Trapezio tp = new Trapezio();
		tp.baseMaior = 7.1;
		tp.baseMenor = 3.6;
		tp.altura = 2;
		area = tp.calcularArea();
		System.out.println("Área trapézio: "+ area);
		

	}

}
