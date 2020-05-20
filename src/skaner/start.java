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
		mPlik = new JMenu("Plik"); mNarzedzia = new JMenu("Narzêdzia"); mPomoc = new JMenu("Pomoc");
			iNowy = new JMenuItem("Nowy"); iNowy.addActionListener(this);
			iZapisz = new JMenuItem("Zapisz"); iZapisz.addActionListener(this);
			iOtworz = new JMenuItem("Otwórz"); iOtworz.addActionListener(this);
			iZapiszJako = new JMenuItem("Zapisz jako ..."); iZapiszJako.addActionListener(this); 
			iWyjscie = new JMenuItem("Wyjœcie"); iWyjscie.addActionListener(this);

		mPlik.add(iNowy); mPlik.add(iOtworz); mPlik.add(iZapisz); mPlik.add(iZapiszJako); mPlik.add(iWyjscie);
		textWindow = new JTextArea();
		menuBar.add(mPlik);
		menuBar.add(mNarzedzia);
		menuBar.add(mPomoc);

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
	public void actionPerformed(ActionEvent e) {
		Object cel = e.getSource();
		if(cel==iWyjscie) System.exit(0); else
		if(cel==iNowy) {};
		
	}

}
