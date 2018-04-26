package art.controller;

import java.awt.Component;
import javax.swing.JOptionPane;
import art.view.ArtFrame;

public class Controller 
{
	private ArtFrame appFrame;
	
	public Controller()
	{
		this.appFrame = new ArtFrame(this);
	}
	
	public void start()
	{
		JOptionPane.showMessageDialog(appFrame,  "Ya Like Art?");
	}
	
	public void handleErrors(Exception error)
	{
		JOptionPane.showMessageDialog(appFrame, error.getMessage());
	}
	
	public ArtFrame getFrame()
	{
		return appFrame;
	}
}
