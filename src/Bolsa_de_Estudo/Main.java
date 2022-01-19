package Bolsa_de_Estudo;

public class Main {

	public static void main(String[] args) {
		   Visitante v1 = new Visitante();
	       v1.setNome("Juvenal");
	       v1.setIdade(22);
	       v1.setSexo("M");
	       v1.toString();
	       System.out.println(v1.toString());
	       System.out.println("====================================");
		
		   Aluno a1 = new Aluno();
	       a1.setNome("Aline");
	       a1.setIdade(28);
	       a1.setSexo("F");
	       a1.pagarMensalidade();
	       System.out.println(a1.toString());
	       System.out.println("====================================");
	       
	       Bolsista b1 = new Bolsista();
	       b1.setNome("Jubileu");
	       b1.setIdade(23);
	       b1.setSexo("M");
	       b1.pagarMensalidade();
	       System.out.println(b1.toString());
	       System.out.println("====================================");
	       
	       

	}

}
