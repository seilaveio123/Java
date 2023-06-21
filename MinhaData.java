package sobre00;

public class MinhaData {
	int dia;
	int mes;
	int ano;
	
	public MinhaData(int d, int m, int a) {
		dia = d;
		mes = m;
	    ano = a;
	}
	
	
	public String toString(){
		return dia+ "/"+ mes +"/"+ ano;
	}
	
	
}