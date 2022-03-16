package locadoras;

public class Funcionario {
	
		private int vendas;
			
		private String Nome;
		private String RG;
		private String nascimento;
		private boolean contratado;
		private double salario;
		
		public Funcionario(
				String nom,
				String rg,
				String nasciment,
		        boolean contrat,
		        int salar) 
		{
			Nome=nom;
			RG=rg;
			this.nascimento=nasciment;
			this.contratado=contrat;
			this.salario=salar;
		}
		
		public int get_vendas() {
			return vendas;
		}
		
		public void set_vendas( float novavenda) {
			vendas=(int) novavenda;
		}
		
		public void inicio_expediente() {
			System.out.println("Trabalhando");
		}
		
		public boolean fim_expediente() {
			System.out.println("Finalizando");
			return true;
			
		}
		public void Vendas (int vendas_atuais) {
			System.out.println("Total de vendas ate o momento "+vendas_atuais+"!");
		}
		public static void main(String[] args) {
			
			Funcionario F1 = new Funcionario("Clodesvaldo","313332223331","10/10/1994",false,3000);
			Funcionario F2 = new Funcionario ("Cleber","313332223332","10/10/1995",true,2500);
			
			F1.salario=3000;
			F1.RG="313332223331";
			F1.fim_expediente();
			
			F2.Nome="Cleber Tanide";
			F2.Vendas(4);
			F2.fim_expediente();

	}
	}


