package Services;

import java.util.ArrayList;
import java.util.List;

import models.Formation;

public class FormationsServices {
	
	// Je crée une variable static qui contiendra l'instance de ma classe FormationsServices 
	private static FormationsServices instances = null;
	// Je crée une liste de formations vide
	private List<Formation> formations = new ArrayList<Formation>();
	
	// Création du singleton
	private FormationsServices() {
    	
		// Je crée une liste de formations factice 
		// et je les injecte dans ma liste de formations
		//for (Formation formation : formations) {
    		for (int i = 0; i < 10; i++) {
    			formations.add(
    					new Formation("formation"+i, 
    	    					"program-content" + i, i * 5)
    			);
    		}
    	}	
	//}
	
	// Je crée un méthode static qui va me permettre de récupèrer l'instance de ma classe 
	public static FormationsServices getInstance() {
		if (FormationsServices.instances == null) {
			FormationsServices.instances = new FormationsServices();
		}
		return instances;
	}
	
	// Méthode qui renvoi la liste des formations
	public List<Formation> getFormation() {
		return this.formations; 
	}
	
	// Méthode qui permet de récupèrer une formation selon son intitulé
	public Formation getFormationByTitle(String title) {
		Formation response = null;
		for (Formation formation : formations) {
			if (formation.getTitle().equals(title)) {
				response = formation;
				break;
			}
		}
		return response;
	}

}
