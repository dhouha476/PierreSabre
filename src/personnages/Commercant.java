package personnages;

public class Commercant extends Humain {
	public Commercant(String nom,int argent) {
		super(nom, "thé", argent);
	}
	public int seFaireExtorquer() {
		int somme=getArgent();
		perdreArgent(somme);
		parler("j'ai tout  perdu !le monde est trop injuste...");
		return somme; 
	}
	public void recevoir(int argent) {
		gagnerArgent(argent);
		parler(argent + " sous ! je te remercie généreux donateur! ");
	}
	
	

}
