import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.util.Random; 

public class CardGame2 {
	
	private int drawIndex = -1;
			
	public int drawAction() {
		drawIndex = drawIndex + 1;
		if (drawIndex == 52) { 
			drawIndex = 0;
			
		}
		return drawIndex;
	}

	

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		CardGame cards = new CardGame();
		
		frame.setTitle("Card Game");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		frame.setLocationRelativeTo(null);
		
		
		final Container pane = frame.getContentPane();
		
		ImageIcon img0 = new ImageIcon("./img/0.png");
		final JLabel card = new JLabel(img0);
		pane.add(card);
		


		
		//button options
		
		JButton shufflebutton = new JButton("Shuffle");
		JButton stopbutton = new JButton("Stop Shuffle");
		JButton drawbutton = new JButton("Draw");

		
		pane.setBackground(Color.GRAY);
		
		shufflebutton.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				ImageIcon shuffling = new ImageIcon("./img/shuffling.gif");
				card.setIcon(shuffling);
				drawbutton.setEnabled(true);
				shufflebutton.setVisible(false);
				stopbutton.setVisible(true);
				
			}
		});
		
				
		stopbutton.addActionListener( new ActionListener() { 
			public void actionPerformed(ActionEvent event) {
				//shufflebutton.setVisible(false);
				//stopbutton.setVisible(true);
				ImageIcon stop = new ImageIcon("./img/0.png");
				card.setIcon(stop);
			}
		});
				
				

				
			
		
		drawbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				Random r =  new Random();
				int [] a = new int[52];
				for (int i = 0; i < a.length; i++) {
				a[i] = r.nextInt(52);
				//System.out.println(a[i]);
				ImageIcon newCard = new ImageIcon ("./img/" + a[i] + ".png");
				card.setIcon(newCard);
				cards.drawAction();
				}
				
	
			}
		});
	
	
	
		
		JPanel panel = new JPanel();


		
		drawbutton.setEnabled(false);
		stopbutton.setVisible(false);
		panel.add(shufflebutton);
		panel.add(stopbutton);
		panel.add(drawbutton);
		frame.setVisible(true);
		
		pane.add(panel, BorderLayout.PAGE_END);

	}

}
