package jeuDupendu;

import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.StringJoiner;

public class Pendu {
       public static void main(String[] args) {
    	 //decla:
			ArrayList<String> tabDeMots = nouvelleListe();
			
			int listLength = tabDeMots.size(); //on declare listLength etant egale a la longueur du tableau tabDemots
		  int nbreErreursMax = 0;
		 
		  
		  		  Random random = new Random();
		  int indexAleatoire = random.nextInt(10);
		  String motAuHasard = tabDeMots.get(indexAleatoire).toLowerCase();
		 
				System.out.println(motAuHasard); 
				ArrayList<Character> tabLettres = new ArrayList<Character>();
				for (int i = 0; i<10; i++) {
					char lettre = LettreSaisie(nbreErreursMax);
					tabLettres.add(lettre); 
					if(presenceDuCaractere(motAuHasard,lettre)){
						i--;
				    }
					else {
						nbreErreursMax++;
					}
					AfficherLeMotATrouver(motAuHasard,tabLettres);
				}
				System.out.println("C'est perdu");
				
				//if(presenceDuCaractere(motAuHasard,lettre)){
					
//			}
       }
    	   public static ArrayList<String> nouvelleListe()
    	   {
			 
		 
			  ArrayList<String> tabDeMots = new ArrayList<String>();
	
			  tabDeMots.add("Tabulation") ;
			  tabDeMots.add("Equilibre") ;
			  tabDeMots.add("Attirance") ;
			  tabDeMots.add("Pourquoi") ;
			  tabDeMots.add("Arriver") ;
			  tabDeMots.add("Portiere") ;
			  tabDeMots.add("Boursuflure") ;
			  tabDeMots.add("Patriarche") ;
			  tabDeMots.add("Hardrock") ;
			  tabDeMots.add("Miraculeuse") ;
			  return tabDeMots;
    	   	}
	
	
    	   public static char LettreSaisie(int i)
    	   {
	    	 
		    	System.out.println("Essayez de deviner le mot auquel je pense . Rentrez une lettre. Il te reste" + (10-i) + "chances restantes");
				Scanner sc = new Scanner(System.in);//Creer un Scanner
				String reponse = sc.nextLine();// on applique a "reponse" la fonction nextLine pour prendre et lire les reponse une a une
				char caractere = reponse.charAt(0);    // reponse est un string on doit la convertir avec charAt en passant par la creation de la variable "caractere" qui est de type char
			    
			    return Character.toLowerCase(caractere);//renvoie la lettre saisie     
    	   }
		  
		  public static boolean presenceDuCaractere(String entree, char caractereSaisi) 
		  {
		  
			     boolean presenceDuResultat = false;//creation du boolean qui va verifier la saisie
			     for(int i = 0; i< entree.length(); i++) //il boucle autant de fois qu il ya de lettres dans le mot 
			     {
			    	 if(entree.charAt(i) == caractereSaisi) //si un un caractere saisi est egal a un caracter du mot entré par l utilisateur
			    	 { 
			    		 presenceDuResultat = true;//le boolean sera vrai
			    		 break; //pause avant de reboucler
			    	 }
			     }
			     return presenceDuResultat; //renvoyer 	la valeur obtenue
		  }
		 
		    public static void AfficherLeMotATrouver(String motChoisi, ArrayList<Character>lettreChoisies)
		    {
			  int i =0;//declaration de variable a zero au debut
			  char[] tabDuMot = new char[motChoisi.length()];//creation tableau qui affichera soit des tirets soit la lettre adequate. Il est de longeur du mot choisi
			  while (i<motChoisi.length()) {//on fait cette boucle autant de fois qu il ya de lettre dans le mot 
				  if(lettreChoisies.contains(motChoisi.charAt(i))){//on applque "contains"qui appartient a la classe String pour voir si ya la lettre choisie par l'utilsateur est dans dans le mot choisi par l ordi. Il est converti en caractere avec charAt à chaque tour(i)			  }
		             System.out.print(motChoisi.charAt(i)+" ");//affiche le mot chosi, lettre à lettre avec charAt avec des espaces
				     tabDuMot[i] = motChoisi.charAt(i); //pour chaque case du tableau qui affiche le mot a trouver par caractere,mettre le motChoisi qui est converti en caractere avec charAt
				  }
				  else 
				  {
					  System.out.print("_ ");//affiche un tiret un espace a l'ecran
					  tabDuMot[i] = '_'; // le tableau d affichage  du mot . pâr defaut  . il y aura des tirets
				  }
			  i++; //pour chaque lettres du mot ou plutot case du tableau
			  }
			  String caractereTrouve = new String (tabDuMot);
			  if(!presenceDuCaractere(caractereTrouve, '_')) {
				  System.out.println("c'est gagné!");
				  System.exit(0);
			  }
			  //return caractereTrouve;
		  }
		     
		   					
		  

       }	  

