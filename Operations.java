class Operations {

	public static void main(String args[]) {
		// Construction d'un tableau:
		int[] tableau = {3, 7, 1, 9, 2, 8, 9, 1, 2, 5};
		// Operations sur le tableau:
		operations(tableau);

		// La meme chose pour d'autres tableaux:
		int[] tableau1 = remplir1(5);
		operations(tableau1);

		int[] tableau2 = remplir2(10);
		operations(tableau2);

		int[] tableau3 = remplir3(5);
		operations(tableau3);
	}

	/**
	 * Cette méthode retourne un tableau int[] de nb éléments
	 * initialisés en ordre croissant de 0 à nb-1.
	 * @param nb La taille du tableau (nombre d'élements).
	 * @return tableau Le tableau correctement rempli.
	 */
	static int[] remplir1(int nb) {
		int[] tableau = new int[nb];
		for (int i = 0; i < nb; i++) {
			tableau[i] = i;
		}
		return tableau;
	}

	/**
	 * Cette méthode retourne un tableau int[] de nb éléments
	 * initialisés en ordre croissant à partir de 5.
	 * @param nb La taille du tableau (nombre d'élements).
	 * @return tableau Le tableau correctement rempli.
	 */
	static int[] remplir2(int nb) {
		int[] tableau = new int[nb];
		for (int i=0;i<nb;i++) {
			tableau[i]= 5+i;
		}
		return tableau;
	}

	/**
	 * Cette méthode retourne un tableau int[] de nb éléments
	 * initialisés en ordre décroissant de nb à 1.
	 * @param nb La taille du tableau (nombre d'élements).
	 * @return tableau Le tableau correctement rempli.
	 */
	static int[] remplir3(int nb) {
		int[] tableau = new int[nb];
		for (int i=0;i<nb;i++) {
			tableau[i]=nb-i;
		}
		return tableau;
	}

	/**
	 * Affiche le tableau puis effectue les opérations 1 à 5 sur le tableau.
	 * @param tableau Le tableau à traiter.
	 */
	static void operations(int[] tableau) {
		afficher(tableau);
		operation1(tableau);
		operation2(tableau);
		operation3(tableau);
		operation4(tableau);
		operation5(tableau);
	}

	/**
	 * Cette méthode affiche tous les éléments du tableau reçu en
	 * paramètre sur une meme ligne. Les éléments sont séparés par
	 * deux espaces.
	 * @param tableau Le tableau à afficher.
	 */
	static void afficher(int[] tableau) {
		for (int i = 0; i < tableau.length; i++) {
			System.out.print(tableau[i]);
			System.out.print("  ");
		}
		// Saut de ligne à la fin de l'affichage
		System.out.println();
	}

	/**
	 * Cette méthode calcule et affiche le nombre d'éléments de valeur
	 * 9 dans le tableau. La variable nb sert à compter les éléments
	 * trouvés. Elle est initialisée à 0 et incrémentée dans la boucle
	 * qui parcourt le tableau chaque fois que l'on trouve un 9.
	 * @param tableau Le tableau à traiter.
	 */
	static void operation1(int[] tableau) {
		int nb = 0;
		for (int i = 0; i < tableau.length; i++) {
			if (tableau[i] == 9)
				nb++;
		}
		System.out.println("Il y a " + nb + " elements de valeur 9 dans le tableau");
	}

	/**
	 * Cette méthode calcule et affiche le nombre d'éléments qui sont
	 * plus grand que 4 OU plus petit que 2.
	 * @param tableau Le tableau à traiter.
	 */
	static void operation2(int[] tableau) {
		int e=0;
		for (int i= 0;i<tableau.length;++i) {
			int a = tableau[i];
			
			if (a<2||a>4) {
			e = e+1;
			}
		}
		System.out.println("Il y a "+e+" �l�ments plus grand que 4 ou plus petit que 2");
	}

	/**
	 * Cette méthode calcule et affiche le somme de tous les éléments du tableau.
	 * @param tableau Le tableau à traiter.
	 */
	static void operation3(int[] tableau) {
		int f=0;
		for (int i =0; i<tableau.length;++i) {
			int a= tableau[i];
			f=f+a;
		}
		System.out.println("La somme des �l�ments est " + f);
	}

	/**
	 * Cette méthode calcule et affiche la moyenne arithmétique de
	 * tous les éléments du tableau.
	 * @param tableau Le tableau à traiter.
	 */
	static double operation4(int[] tableau) {
		double a=0.0;
		for (int i=0;i<tableau.length;++i) {
			int b;
			b=tableau[i];
			a=a+b;
		}
		a=a/tableau.length;
		System.out.println("La moyenne arithm�tique des �l�ments est "+a);
		return a;
	}

	/**
	 * Cette méthode calcule et affiche le plus grand élément du tableau.
	 * @param tableau Le tableau à traiter.
	 */
	
	static void operation5(int[] tableau) {		
		int d=0;
		for (int i=0;i<tableau.length;++i) {
			int a;
			a=tableau[i];
			if (i==0) {
				d=a;
			}
			if (a>d) {
				d=a;
			}
		}
		System.out.println("Le plus grand �l�ment vaut: "+ d);
	}
}
