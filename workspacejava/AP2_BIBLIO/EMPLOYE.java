
public class EMPLOYE {

	public static void main(String[] args) {
		private String nom;
		private String adresse; 
		private string numtel;
		private String email;
		private int salaire;
		
		
		public String getnom() {
			return nom;
		}
		public void setnom(String nom) {
			this.nom = nom;
		}
		public String getadresse() {
			return adresse;
		}
		public void setadresse(String adresse) {
			this.adresse = adresse;
		}
		public String getnumtel() {
			return numtel;
		}
		public void setnumtel(String numtel) {
			this.numtel = numtel;
		}
		public String getemail() {
			return email;
		}
		public void setemail(String email) {
			this.email = email;
		}
		public int getesalaire() {
			return salaire();
		}
		public void setsalaire( salaire) {
			this.salaire = salaire;
		}
		
		public void affichev() {
			System.out.println("nom : " + nom);
	        System.out.println ("adresse : " + adresse);
	        System.out.println ("numtel : " + numtel);
	        System.out.println("email : " + email);
	        System.out.println("salaire : " + salaire);
	        

	}

}
