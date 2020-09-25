package packParaLaVaina;

import javax.swing.JFrame;

public class PruebaFigurasAleatorias {

	public static void main(String[] args) throws InterruptedException {
		// TODO Apéndice de método generado automáticamente
		
		FigurasAleatorias panel = new FigurasAleatorias();
		
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel); 
		application.setSize(290, 310); 
		application.setTitle( "Figuras Aleatorias" );
		application.setVisible(true); 
	    application.setLocationRelativeTo(null);
	    
	    while(true) {
		
	    	application.repaint();
	    	Thread.sleep(1000);
	    
	    }
		
	}

}
