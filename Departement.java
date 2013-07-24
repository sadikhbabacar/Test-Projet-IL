
public class Departement {

	//atributs de la claase
	private String nomFormation ;
	private int nbClasse ;
	
	public Departement(String nomFormation, int nbClasse){
		this.nomFormation = nomFormation ;
		this.nbClasse = nbClasse ;
	}

	public int getNbClasse() {
		return nbClasse;
	}

	public void setNbClasse(int nbClasse) {
		this.nbClasse = nbClasse;
	}
}
