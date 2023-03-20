package Banking;

public class Main {
	public class account {
		private String id;
		private String name;
		private int balance;
		
		public void Account(String id,String name, int balance) {
			this.id = id;
			this.name = name;
			this.balance = balance;
		}
		
		public void credit(int amount) {
			if(amount < 0 ) {
				System.out.println("Data invalid");
			} balance = balance + amount;
		}
		
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getBalance() {
			return balance;
		}
		public void setBalance(int balance) {
			this.balance = balance;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
}
