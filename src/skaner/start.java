package skaner;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class start extends JFrame implements ActionListener {
	
	JMenuBar menuBar;
	JMenu mPlik, mNarzedzia, mPomoc;
	JMenuItem iNowy, iOtworz, iZapisz, iZapiszJako, iWyjscie;
	JTextArea textWindow;

	start() {
		super("Skaner");
		
		menuBar = new JMenuBar(); 
		mPlik = new JMenu("Plik"); mNarzedzia = new JMenu("MArzêdzia"); mPomoc = new JMenu("Pomoc");
		
		iNowy = new JMenuItem(); iZapisz = new JMenuItem(); iOtworz = new JMenuItem(); iZapiszJako = new JMenuItem(); iWyjscie = new JMenuItem();
		iNowy = new JMenuItem();
		textWindow = new JTextArea();
		menuBar.add(mPlik);

		setJMenuBar(menuBar);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(900,900);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		new start();
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
