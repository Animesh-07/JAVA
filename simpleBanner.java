import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class simpleBanner extends Applet implements Runnable,ActionListener {
	String msg;
	Thread t = null;
	boolean stopFlag;
	Label l1;TextField tf;Button ok;
	public void init() {
		setBackground(Color.white);
		/*System.out.println("Enter The Message!");
		Scanner s = new Scanner(System.in);
		msg = s.next();*/
		l1 = new Label("Enter a Message");
		tf = new TextField(20);
		ok = new Button("OK");
		add(l1);add(tf);add(ok);
		tf.addActionListener(this);
		ok.addActionListener(this);
		ok.setBackground(Color.lightGray);
		ok.setForeground(Color.white);
		tf.setBackground(Color.lightGray);
	}
	public void actionPerformed(ActionEvent ac){
			msg = tf.getText();
			repaint();
	}
	public void start() {
		//msg = getParameter("message");
		
		if(msg == null) 
		{
			msg = "Waiting for ur message -_-      ";
		}
		msg = " " + msg;
		t = new Thread(this);
		stopFlag = false;
		t.start();
		}
	public void run() {
		char ch;
		for( ; ; ) {
			try {
				repaint();
				Thread.sleep(250);
				ch = msg.charAt(0);
				msg = msg.substring(1, msg.length());
				msg += ch;
				if(stopFlag)
					break;
				}
			catch(InterruptedException e) {;}	 
			}
		}
		
	public void stop() {
		stopFlag = true;
	}
	public void paint(Graphics g) {
		Font Monospace = new Font("Monospace",Font.BOLD,36);
		g.setFont(Monospace);
		g.setColor(Color.cyan);
		g.drawString(msg, 100, 150);
	}
}
