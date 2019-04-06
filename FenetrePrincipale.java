
  import java.awt.*;
import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import javax.swing.JTextField;


public class FenetrePrincipale extends JFrame {

		//Constructeur
		
		FenetrePrincipale(){
		//Proprietes de la fenetre
	    setTitle("Stratego");
	    setSize(900,900);
	    setResizable(false);
	    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	    setLayout(null);
	    JPanel panel=new JPanel();
	    setContentPane(panel);
	    panel.setLayout(null);
	    JMenuBar MyMenuBar=new JMenuBar();//creation de la barre de menu
	    panel.add(MyMenuBar);
	    MyMenuBar.setBounds(0,0,400,30);
	    JMenu MenuFichier=new JMenu("Fichier");//creation du menu fichier
	    MyMenuBar.add(MenuFichier);
	    JMenu MenuHistorique=new JMenu("Historique");//creation du menu historique
	    MyMenuBar.add(MenuHistorique);
	    JMenu MenuSelectPlayer=new JMenu("SelectPlayer");//creation du menu selectPlayer
	    MyMenuBar.add(MenuSelectPlayer);
	    
	    JMenuItem MenuNoveau= new JMenuItem("Nouvelle partie");
	    JMenuItem MenuOuvrir =new JMenuItem("Ouvrir");
	    JMenuItem MenuEnregistrer= new JMenuItem("Enregistrer");
	    MenuFichier.add(MenuNoveau);
	    MenuFichier.add(MenuOuvrir);
	    MenuFichier.add(MenuEnregistrer);
	    
	    
	  
	    
	    //Echiquier
	    
	    PlayersStratego ecq= new PlayersStratego();
	    ecq.setBounds(30,30,452,465);
	    add(ecq);
	    
	 }

	    //Demarage de l'application
	  public static void main(String[] args) {
		  EventQueue.invokeLater(new Runnable(){
	       public void run() {
	    	   UIManager.put("swing.boldMetal", Boolean.FALSE);
	    	   new FenetrePrincipale().setVisible(true);
	       }
		  });
	  }
	  }


