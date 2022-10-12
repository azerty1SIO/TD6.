import java.util.Scanner;
public class shifumi {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("En combien de point doit se dérouler la partie ?");
		int nb;
		int ChoixJ;
		int ChoixPC;
		int nbsec;
		int PointJ;
		int PointPC; 
		int Replay;
		int Go;
		int MP;
		Scanner Saisie = new Scanner (System.in);
		Replay=0;
		PointJ=0;
		PointPC=0;
		nbsec=3;
		nb=0;
		ChoixJ=0;
		ChoixPC=0;
		Go=2;
		MP=2;

		while (Replay==0)
		{
			System.out.println("Bienvenue dans le jeu");

			while (MP!=1 && MP!=0)
			{
				System.out.println("Veuillez choisir votre mode de jeu (0 = avec Puit / 1 = Sans puit)");
				MP=Saisie.nextInt();
			}
			while(nb!=3 && nb!=5 && nb!=10)
			{
				System.out.println("En combien de point ? (3, 5, 10)");
				nb=Saisie.nextInt();	
			}
			if (MP==1)
			{
				while (PointJ!=nb && PointPC!=nb)
				{
					while(ChoixJ!=1 && ChoixJ!=2 && ChoixJ!=3)
					{
						System.out.println("Choisissez Pierre, Feuille ou Ciseau (1 = ø / 2 = _ / 3 = >)");
						ChoixJ=Saisie.nextInt();
					}
					switch (ChoixJ)
					{
					case 3:
						System.out.println("Vous avez choisit > !");
						break;
					case 2:
						System.out.println("Vous avez choisit _ !");
						break;
					case 1:
						System.out.println("Vous avez choisit ø !");
						break;
					}
					ChoixPC= (int)(Math.random()*(3))+1;
					System.out.println("A l'ordinateur de jouer !"); 
					Thread.sleep(nbsec*1000);
					switch (ChoixPC)
					{
					case 1:
						System.out.println("Le PC fait ø !");
						switch (ChoixJ)
						{
						case 1:
							System.out.println("Egalité !");
							System.out.println("Le joueur a "+PointJ+" points et le PC a "+PointPC+" points.");
							break;
						case 2:
							System.out.println("Le joueur a gagné une manche !");
							PointJ = PointJ + 1;
							System.out.println("Le joueur a "+PointJ+" points et le PC a "+PointPC+" points.");
							break;
						case 3:
							System.out.println("Le PC a gagné une manche !");
							PointPC = PointPC + 1;
							System.out.println("Le joueur a "+PointJ+" points et le PC a "+PointPC+" points.");
							break;
						}
						break;
					case 2:
						System.out.println("Le PC fait _ !");
						switch (ChoixJ)
						{
						case 1:
							System.out.println("Le PC a gagné une manche !");
							PointPC = PointPC + 1;
							System.out.println("Le joueur a "+PointJ+" points et le PC a "+PointPC+" points.");
							break;
						case 2:
							System.out.println("Egalité !");
							System.out.println("Le joueur a "+PointJ+" points et le PC a "+PointPC+" points.");
							break;                	    	
						case 3:
							System.out.println("Le joueur a gagné une manche !");
							PointJ = PointJ + 1;
							System.out.println("Le joueur a "+PointJ+" points et le PC a "+PointPC+" points.");
							break;            	    	 
						}
						break;
					case 3:
						System.out.println("Le PC fait > !");
						switch (ChoixJ)
						{
						case 1:
							System.out.println("Le joueur a gagné une manche !");
							PointJ = PointJ + 1;
							System.out.println("Le joueur a "+PointJ+" points et le PC a "+PointPC+" points.");
							break;
						case 2:
							System.out.println("Le PC a gagné une manche !");
							PointPC = PointPC + 1;
							System.out.println("Le joueur a "+PointJ+" points et le PC a "+PointPC+" points.");
							break;
						case 3:
							System.out.println("Egalité");
							System.out.println("Le joueur a "+PointJ+" points et le PC a "+PointPC+" points.");
							break;
						}                	
						break;
					}
					ChoixJ = 0;
					continue;
				}
				if (PointJ>PointPC)
				{
					System.out.println("Le joueur à gagné la partie !");
				}
				else
				{
					if (PointPC>PointJ)
					{
						System.out.println("Le PC a gagné la partie !");
					}
				}

			}
			else
			{
				while (PointJ!=nb && PointPC!=nb)
				{
					while(ChoixJ!=1 && ChoixJ!=2 && ChoixJ!=3 && ChoixJ!=4)
					{
						System.out.println("Choisissez Pierre, Feuille, Ciseau ou Puit (1 = ø / 2 = _ / 3 = > / 4 = Puit)");
						ChoixJ=Saisie.nextInt();
					}
					switch (ChoixJ)
					{
					case 3:
						System.out.println("Vous avez choisit > !");
						break;
					case 2:
						System.out.println("Vous avez choisit _ !");
						break;
					case 1:
						System.out.println("Vous avez choisit ø !");
						break;
					case 4:
						System.out.println("Vous avez choisit Puit");
						break;
					}
					ChoixPC= (int)(Math.random()*(4))+1;
					System.out.println("A l'ordinateur de jouer !"); 
					Thread.sleep(nbsec*1000);
					switch (ChoixPC)
					{
					case 1:
						System.out.println("Le PC fait ø !");
						switch (ChoixJ)
						{
						case 1:
							System.out.println("Egalité !");
							System.out.println("Le joueur a "+PointJ+" points et le PC a "+PointPC+" points.");
							break;
						case 2:
							System.out.println("Le joueur a gagné une manche !");
							PointJ = PointJ + 1;
							System.out.println("Le joueur a "+PointJ+" points et le PC a "+PointPC+" points.");
							break;
						case 3:
							System.out.println("Le PC a gagné une manche !");
							PointPC = PointPC + 1;
							System.out.println("Le joueur a "+PointJ+" points et le PC a "+PointPC+" points.");
							break;
						case 4:
							System.out.println("Le joueur a gagné une manche !");
							PointJ = PointJ + 1;
							System.out.println("Le joueur a "+PointJ+" points et le PC a "+PointPC+" points.");
							break;
						}
						break;
					case 2:
						System.out.println("Le PC fait _ !");
						switch (ChoixJ)
						{
						case 1:
							System.out.println("Le PC a gagné une manche !");
							PointPC = PointPC + 1;
							System.out.println("Le joueur a "+PointJ+" points et le PC a "+PointPC+" points.");
							break;
						case 2:
							System.out.println("Egalité !");
							System.out.println("Le joueur a "+PointJ+" points et le PC a "+PointPC+" points.");
							break;                	    	
						case 3:
							System.out.println("Le joueur a gagné une manche !");
							PointJ = PointJ + 1;
							System.out.println("Le joueur a "+PointJ+" points et le PC a "+PointPC+" points.");
							break;
						case 4:
							System.out.println("Le PC a gagné une manche !");
							PointPC = PointPC + 1;
							System.out.println("Le joueur a "+PointJ+" points et le PC a "+PointPC+" points.");
							break;
						}
						break;
					case 3:
						System.out.println("Le PC fait > !");
						switch (ChoixJ)
						{
						case 1:
							System.out.println("Le joueur a gagné une manche !");
							PointJ = PointJ + 1;
							System.out.println("Le joueur a "+PointJ+" points et le PC a "+PointPC+" points.");
							break;
						case 2:
							System.out.println("Le PC a gagné une manche !");
							PointPC = PointPC + 1;
							System.out.println("Le joueur a "+PointJ+" points et le PC a "+PointPC+" points.");
							break;
						case 3:
							System.out.println("Egalité");
							System.out.println("Le joueur a "+PointJ+" points et le PC a "+PointPC+" points.");
							break;
						case 4:
							System.out.println("Le joueur a gagné une manche !");
							PointJ = PointJ + 1;
							System.out.println("Le joueur a "+PointJ+" points et le PC a "+PointPC+" points.");
							break;	    	 
						}                	
						break;
					case 4:
						System.out.println("Le PC fait Puit !");
						switch (ChoixJ)
						{
						case 1:
							System.out.println("Le PC a gagné une manche !");
							PointPC = PointPC + 1;
							System.out.println("Le joueur a "+PointJ+" points et le PC a "+PointPC+" points.");
							break;
						case 2:
							System.out.println("Le joueur a gagné une manche !");
							PointJ = PointJ + 1;
							System.out.println("Le joueur a "+PointJ+" points et le PC a "+PointPC+" points.");
							break;
						case 3:
							System.out.println("Le PC a gagné une manche !");
							PointPC = PointPC + 1;
							System.out.println("Le joueur a "+PointJ+" points et le PC a "+PointPC+" points.");
							break;
						case 4:
							System.out.println("Egalité");                          	    
							System.out.println("Le joueur a "+PointJ+" points et le PC a "+PointPC+" points.");
							break;	    	 
						}                	
						break;
					}
					ChoixJ = 0;
					continue;
				}
				if (PointJ>PointPC)
				{
					System.out.println("Le joueur à gagné la partie !");
				}
				else
				{
					if (PointPC>PointJ)
					{
						System.out.println("Le PC a gagné la partie !");
					}
				}

			}
			while (Go!=1 && Go!=0)
			{
				System.out.println ("Voulez-vous rejouer ? (0=Oui / 1=Non)");
				Go=Saisie.nextInt();
				if (Go==0)
				{
					Replay=0;
					nb=0;
					PointJ=0;
					PointPC=0;
					MP=2;           		
				}
				else
				{
					System.out.println("Fin de la partie !");
					Replay=1;
				}  	 
			}
			if (Go==0)
			{
				Go=2;
			}

		}

	}
}

	


