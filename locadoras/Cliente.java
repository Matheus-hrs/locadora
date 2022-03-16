package locadoras;

public class Cliente {
	
		private int aluguel;
			
		private String Nome;
		private String RG;
		private String nascimento;
		private boolean alugando;
		
		public Cliente(
				String nom,
				String rg,
				String nasciment,
		        boolean alug) 
		{
			Nome=nom;
			RG=rg;
			this.nascimento=nasciment;
			this.alugando=alugando;
			
		}
		
		public int get_aluguel() {
			return aluguel;
		}
		
		public void set_aluguel( float novoaluguel) {
			aluguel=(int) novoaluguel;
		}
		
		public void inicio_aluguel() {
			System.out.println("Alugado");
		}
		
		public boolean fim_aluguel() {
			System.out.println("Finalizando");
			return true;
			
		}
		public void Alugueis (int alugueis_atuais) {
			System.out.println("Total de alugueis ate o momento "+alugueis_atuais+"!");
		}
		public static void main(String[] args) {
			
			Cliente C1 = new Cliente("Neide","313332223331","10/03/20222",false);
			Cliente C2 = new Cliente ("Claudia","313332223332","16/03/1995",true);
			
			C1.nascimento="22/02/194";
			C1.RG="313332223331";
			C1.fim_aluguel();
			
			C2.Nome="Claudia Tanide";
			C2.Alugueis(2);
			C2.fim_aluguel();

	}
	}

