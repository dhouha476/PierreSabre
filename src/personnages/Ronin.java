package personnages;

public class Ronin extends Humain {
	private int honneur;
	public Ronin(String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
		this.honneur=1;
	}
	public void donner(Commercant beneficaire) {
		int montant=getArgent()/10;
		perdreArgent(montant);
		parler(beneficaire.getNom()+" prend ces "+ montant+" sous.");
		beneficaire.recevoir(montant);
	}

}
