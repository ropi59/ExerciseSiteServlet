package Services;

import java.util.ArrayList;
import java.util.List;

import models.User;

public class StudentServices {
	
	// Je crée une variable static qui contiendra l'instance de ma classe StudentServices 
	private static StudentServices instances = null;
	// Je crée une liste d'étudiants vide
	private List<User> studentlist = new ArrayList<User>();
	
	// Création du singleton
	private StudentServices() {
    	
		//TODO recuperer un nom de formation
		// Je crée une liste de formations factice 
		// et je les injecte dans ma liste de formations
		//for (Formation formation : formations) {
    		for (int i = 0; i < 10; i++) {
    			studentlist.add(
    					new User("Doe"+i, 
    	    					"John" + i, 25, i*5, "Nom de la formation à récuperer")
    			);
    		}
    	}	
	//}
	
	// Je crée un méthode static qui va me permettre de récupèrer l'instance de ma classe 
	public static StudentServices getInstance() {
		if (StudentServices.instances == null) {
			StudentServices.instances = new StudentServices();
		}
		return instances;
	}
	
	// Méthode qui renvoi la liste des formations
	public List<User> getUser() {
		return this.studentlist; 
	}
	
	// Méthode qui permet de récupèrer une formation selon son intitulé
	public User getUserByName(String name) {
		User response = null;
		for (User user : studentlist) {
			if (user.getName().equals(name)) {
				response = user;
				break;
			}
		}
		return response;
	}

}
