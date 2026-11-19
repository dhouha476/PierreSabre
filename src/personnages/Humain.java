package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int argent;
	public Humain(String nom, String boissonFavorite, int argent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;
	}
	public String getNom() {
		return nom;
	}
	protected void parler(String texte) {
		System.out.println("("+nom + ") - "+ texte);
	}
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle "+nom +" et j'aime boire du "+ boissonFavorite + "." );
	}
	public void boire() {
		parler("Mmmmm, un bon verre de "+ boissonFavorite +" ! GLOUPS !" );
	}
	protected void gagnerArgent( int gain) {
		argent = argent + gain;
	}
	protected void perdreArgent(int perte) {
		argent=argent-perte;
	}
	public int getArgent() {
		return argent;
	}
	public void acheter(String bien, int prix) {
		if (argent >= prix) {
			parler("J'ai "+argent +"sous en poche. je vais pouvoir m'offrir un " + bien +" à "+prix +"sous");
			perdreArgent(prix);
		}else {
			parler("je n'ai plus que "+argent +" sous en poche. je ne peux meme pas m'offrir un "+bien +" à "+prix+" sous.");
		}
	}
	

}
