
public class ADHERENT {


public class LIVRE {


		public void main(String[] args) {
		}
		
				private String ISBN;
				private String Titre;
				private String Auteur;
				private String prix;
				private ADHERENT emprunteur;
				
				
				public String getISBN() {
					return Titre;
				}
				public void setISBN(String ISBN) {
					this.ISBN = ISBN;
				}
				public String getTitre() {
					return Titre;
				}
				public void setTitre(String Titre) {
					this.Titre = Titre;
				}
				public String getAuteur() {
					return Auteur;
				}
				public void setAuteur(String auteur) {
					this.Auteur = auteur;
				}
				public String getprix() {
					return prix;
				}
				public void setprix(String prix) {
					this.prix = prix;
				}
				public String getemprunteur() {
					return getemprunteur();
				}
				public void setemprunteur( ADHERENT emprunteur) {
					this.emprunteur = emprunteur;
				}
				
				public void affichev() {
					System.out.println("ISBN : " + ISBN);
			        System.out.println ("Titre : " + Titre);
			        System.out.println ("Auteur : " + Auteur);
			        System.out.println("prix : " + prix);
			                   
				}
				public LIVRE(String iSBN, String titre, String auteur, String prix, ADHERENT emprunteur) {
					super();
					ISBN = iSBN;
					Titre = titre;
					Auteur = auteur;
					this.prix = prix;
					this.emprunteur = emprunteur;
				}
				
				public LIVRE(String iSBN, String titre, String auteur, String prix) {
					super();
					ISBN = iSBN;
					Titre = titre;
					Auteur = auteur;
					this.prix = prix;
				}
				
			
			
				
	}



}
