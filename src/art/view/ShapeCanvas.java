package art.view;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.JPanel;

public class ShapeCanvas eArrayList<E>anel 
{
	private ArrayList<Polygon> triangleList;
	private ArrayList<Polygon> polygonList;
	private ArrayList<Ellips2D> ellipseList;
	private ArrayList<Rectangle> rectangleList;
	private Controller app;
	private int previousX;
	private int previousY;
	
	private BufferedImage canvasImage;
	
	public ShapeCanvas(Controller app)
	{
		super();
		this.app = app;
		
		resetPoint();
		triangleList = new ArrayList<Polygon>();
		polygonList = new ArrayList<Polygon>();
		ellipseList = new ArrayList<Ellipse2D>();
		rectangleList = new ArrayList<Rectangle>();
		
		canvasImage = new BufferedImage(600, 600, BufferedImage.TYPE_INT_ARGB);
		this.setMinimumSize(new Dimension(600, 600));
		this.setPreferredSize(new Dimension(600, 600));
		this.setMaximumSize(getPreferredSize());
	}
	
	public void addShape(Shape current)
	{
		if (current instanceof Polygon)
		{
			if(((Polygon)current).xpoints.length == 3)
			{
				triangleList.add((Polygon) current);
			}
			else
			{
				polygonList.add((Polygon)current);
			}
		}
		else if (current instanceof Ellipse2D)
		{
			ellipseList.add((Ellipse2D)current);
		}
		else
		{
			rectangleList.add((Rectangle)current):
		}
		updateImage();
	}
	
	public void clear()
	{
		
	}
	
	public void changeBackround()
	{
		
	}
	
	public void save()
	{
		
	}
	
	public void drawOnCanvas(int xPosition, int yPosition, int lineWidth)
	{
		Graphics2D current = canvasImage.createGraphics();
		current.setPaint(Color.DARK_GRAY);
		current.setStroke(new BasicStroke(lineWidth));
		
		if (previousX == Integer.MIN_VALUE)
		{
			current.drawLine(xPosition, yPosition, xPosition, yPosition);
		}
		else
		{
			current.drawLine(previousX, previousY, xPosition, yPosition);
		}
		previousX = xPosition;
		previousY = yPosition;
		updateImage();
	}
	
	public void resetPoint()
	{
		previousX = Integer.MIN_VALUE;
		previousY = Integer.MIN_VALUE;
	}

}
