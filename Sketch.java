import processing.core.PApplet;

public class Sketch extends PApplet {
	
  public void settings() {
    int width = 900;
    int height = 900;
    size(width, height);
  }

  public void setup() {
    background(210, 255, 173);
  }

  public void draw() {
    
    // The head of the cat
    fill(255,165,0);
    ellipse(width / 2f, height / 1.818f, width / 1.6f, height / 1.6f);

    // The eyes of the cat
    fill(0);
    ellipse(width / 2.67f, height / 2.353f, width / 10f, height / 10f);
    ellipse(width / 1.6f, height / 2.353f, width / 10f, height / 10f);

    // The left whiskers of the cat
    line(width / 2f, height / 1.6f, width / 4.21f, height / 1.905f);
    line(width / 2f, height / 1.6f, width / 4.21f, height / 1.67f);
    line(width / 2f, height / 1.6f, width / 4.21f, height / 1.481f);

    // The right whiskers of the cat
    line(width / 1.95f, height / 1.6f, width / 1.33f, height / 1.9f);
    line(width / 1.95f, height / 1.6f, width / 1.33f, height / 1.67f);
    line(width / 1.95f, height / 1.6f, width / 1.36f, height / 1.48f);

    // The nose of the cat
    fill(101,67,33);
    rect(width / 2.05f, height / 1.63f, width / 26.67f, height / 26.67f);

    // The ears of the cat
    triangle(width / 5f, height / 2.26f, width / 2.96f, height / 3.48f, width / 6.15f, height / 4f);
    triangle(width / 1.26f, height / 2.26f, width / 1.16f, height / 3.81f, width / 1.48f, height / 3.33f);  

  }
  
}