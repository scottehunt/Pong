import java.awt.Color;

public class Sprite {

	private int xPosition, yPosition;
	private int xVelocity, yVelocity;
	private int width, height;
	private Color colour;
	
	public int getXPosition() { return xPosition; }
	public int getYPosition() { return yPosition; }
	public int getXVelocity() { return xVelocity; }
	public int getYVelocity() { return yVelocity; }
	public int getWidth() { return width; }
	public int getHeight() { return height; }
	public Color getColour() { return colour; }
	
	public void setColour(Color color) { //need to suss out this one
		colour = color;
	}
	
	private int initialXPosition, initialYPosition;
	public void setInitialPosition(int initialX, int initialY) {
		initialXPosition = initialX;
		initialYPosition = initialY;
	}
	
	public void resetToInitialPosition() {
		setXPosition(initialXPosition);
		setYPosition(initialYPosition);
	}
	
	public void setXPosition(int newX, int panelWidth) {
		xPosition = newX;
		if (xPosition < 0) {
			xPosition = 0;
		} else if(xPosition + width > panelWidth) {
			xPosition = panelWidth - width;
		}
	}
	public void setYPosition(int newY, int panelHeight) {
		yPosition = newY;
		if (yPosition < 0) {
			yPosition = 0;
		} else if(yPosition + height > panelHeight) {
			yPosition = panelHeight - height;
		}
	}
	public void setXPosition(int newX) {
		xPosition = newX;
	}
	public void setYPosition(int newY) {
		yPosition = newY;
	}
	public void setXVelocity(int newXVelocity) {
		xVelocity = newXVelocity;
	}
	public void setYVelocity(int newYVelocity) {
		yVelocity = newYVelocity;
	}
	public void setWidth(int newWidth) {
		width = newWidth;
	}
	public void setHeight(int newHeight) {
		height = newHeight;
	}
}
