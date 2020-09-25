package packParaLaVaina;

import java.awt.*;
import javax.swing.JPanel;
import java.security.*;

public class FigurasAleatorias extends JPanel {

	public void paintComponent( Graphics g ) {

		super.paintComponent( g );

		SecureRandom nRandom = new SecureRandom();
		SecureRandom vAleat = new SecureRandom();

		int anchura = getWidth(); // anchura total
		int altura = getHeight(); // altura total
		int anchn = anchura - anchura;
		int altn = altura - altura;
		int anchn2 = anchura;
		int altn2 = altura;
		int i = 1;

		while(i <= 10) {

			int numb = nRandom.nextInt(2);

			int red = vAleat.nextInt(255);
			int green = vAleat.nextInt(255);
			int blue = vAleat.nextInt(255);
			int x = vAleat.nextInt(anchura / 2 + 15);
			int y = vAleat.nextInt(altura / 2 + 15);
			anchn2 = anchn + vAleat.nextInt(anchura / 2 + 15);
			altn2 = altn + vAleat.nextInt(altura / 2 + 15);
			Color color = new Color(red, green, blue);

			g.setColor(color);

			switch (numb) {
			case 0:
				g.fillRect( x, y, anchn2, altn2 );
				break;
			case 1:
				g.fillOval( x, y, anchn2, altn2 );
				break;

			default:
				g.fillOval( 0, 0, anchura, altura );
				break;
			}
			
			++i;

		}




	}



}


