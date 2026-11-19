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
	public void provoquer(Yakuza adversaire) {
		int force = honneur *2;
		
		if (force>=adversaire.getReputation() ) {
			parler(" je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
			parler("je t'ai eu petit yakusa !" );
			int gain = adversaire.perdre();
			gagnerArgent(gain);
			honneur++;
			
			
		}else {
			honneur--;
			int somme=getArgent();
			perdreArgent(somme);
			parler("jai perdu contre ce yakusa, mon honneur et ma bourse ont en pris un coup.");
			adversaire.gagner(somme);
			
			
		}
	}

}
