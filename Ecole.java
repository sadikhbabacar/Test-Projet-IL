
public class Ecole {
	//attributs de la classe
	private String nom, lieu ;
	private Departement[] departmt ;
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	public Departement[] getDepartmt() {
		return departmt;
	}

	public void setDepartmt(Departement[] departmt) {
		this.departmt = departmt;
	}

	//Constructeur de la classe
	public Ecole(String nom, String lieu, int nbDepart){
		this.nom = nom; 
		this.lieu = lieu ;
		departmt = new Departement[nbDepart] ;
	}
	

}
