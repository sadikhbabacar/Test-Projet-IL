
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Departement depart = new Departement("Informatique", 10) ;
		Departement depart1 = new Departement("Electrique", 10) ;
		Departement depart2 = new Departement("Civil", 10) ;
		
		Ecole ecol = new Ecole("ESP", "DAKAR", 3) ;
		ecol.Ajout_Depart(depart) ;
		ecol.Ajout_Depart(depart1) ;
		ecol.Ajout_Depart(depart2) ;
		
		//Affichage des caractéristiques d'une école
		System.out.println("Nom école :"+ ecol.getNom()) ;
		System.out.println("Lieu : "+ ecol.getLieu()) ;
		System.out.println("Nombre de département : "+ ecol.getNbDepart()) ;
		System.out.println("Nom des départements :") ;
		for(int i=0; i<ecol.getNbDepart(); i++){
			System.out.println(ecol.departmt[i].getNomFormation()) ;
			System.out.println(ecol.departmt[i].getNbClasse()) ;
			System.out.println("-------------") ;
		}
			
		
		
	}

}
