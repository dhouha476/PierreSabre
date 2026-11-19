package personnages;

public class Yakuza  extends Humain{
	private String clan;
	private int reputation;
	
	public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
		super(nom, boissonFavorite, argent);
		this.clan= clan;
		this.reputation=0;
	}
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par la ?");
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse!");
		int somme= victime.seFaireExtorquer();
		gagnerArgent(somme);
		reputation ++;
		parler("j'ai piqué les "+ somme+ " sous de "+victime.getNom()+", ce qui me fait "+ getArgent()+ " sous dans ma poche. Hi ! Hi !");
	}

}
