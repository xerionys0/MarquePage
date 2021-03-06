package view;

import java.util.List;

import model.entities.Anime;
import model.entities.Jeu;
import view.exceptions.VueException;

public interface FacadeVue {

	public void afficherMessage(final String message);
	
	public int afficherMenu(final String[] menu, final String titre);
	
	public int afficherMenuPrincipal();
	
	
	public Anime saisirAnime() throws VueException;
	public Jeu saisirJeu() throws VueException;
	

	public void afficherListingAnime(List<Anime> animes);

	public void afficherListingJeu(List<Jeu> jeux);

	

	public Jeu recupererChoixJeuSupprimer(List<Jeu> jeux);

	public Anime recupererChoixAnimeSupprimer(List<Anime> animes);
	
	public Anime modifierAnime(Anime anime) throws VueException;
	public Jeu modifierJeu(Jeu jeu) throws VueException;

	public Anime recupererChoixAnimeModifier(List<Anime> recupererListeAnimes);
	public Jeu recupererChoixJeuModifier(List<Jeu> recupererListeJeux);
}
