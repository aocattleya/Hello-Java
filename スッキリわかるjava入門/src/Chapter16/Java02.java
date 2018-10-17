/*
 * ウィンドウアプリケーションの簡単なサンプルコード
 */
package Chapter16;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Java02 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("はじめてのGUI");
		JFrame label = new JFrame("Hello World！");
		JButton button = new JButton("押してね");

		frame.getContentPane().setLayout(new FlowLayout());
		frame.getContentPane().add(label);
		frame.getContentPane().add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 100);
		frame.setVisible(true);
	}
}