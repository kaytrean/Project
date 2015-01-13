int rectX, rectY;      // Position of square 1 button(school-red)
int rect2X, rect2Y;    // Position of square 2 button(gym-blue)
int rect3X, rect3Y;    // Position of square 3 button(store-purple)
int rect4X, rect4Y;    // Position of square 4 button(park-green)
int circleX, circleY;  // Position of circle button(home-yellow)

int rectSize = 180;     // Diameter of rect
int rect2Size = 180; 
int rect3Size = 180; 
int rect4Size = 180; 
int circleSize = 93;   // Diameter of circle
color rectColor, rect2Color, rect3Color, rect4Color, circleColor, baseColor;
color rectHighlight, rect2Highlight, rect3Highlight, rect4Highlight, circleHighlight;
color currentColor;
boolean rectOver = false;
boolean rect2Over = false;
boolean rect3Over = false;
boolean rect4Over = false;
boolean circleOver = false;

//original map loading
void setup() {
  size(750, 360);
  rectColor = color(255,0,0);
  rectHighlight = color(252,87,101);
  rect2Color = color(16,0, 255);
  rect2Highlight = color(117,109,245);
  rect3Color = color(180,9,219);
  rect3Highlight = color(206,141,222);
  rect4Color = color(1,108,7);
  rect4Highlight = color(82,285,88);
  circleColor = color(246,255,0);
  circleHighlight = color(204);
  baseColor = color(45,165,52);
  currentColor = baseColor;
  circleX = width/2;
  circleY = height/2;
  rectX = 0;
  rectY = 0;
  rect2X = 0;
  rect2Y = height-rect2Size/2;
  rect3X = width-rect3Size;
  rect3Y = 0;
  rect4X = width-rect4Size;
  rect4Y = height-rect4Size/2; 
  ellipseMode(CENTER);
  imgSchool = loadImage("school.jpg");  // Load the image into the program  
}

void draw() {
  update(mouseX, mouseY);
  background(currentColor);
  
  if (rectOver) {
    fill(rectHighlight);
  } else {
    fill(rectColor);
  }
  stroke(255);
  rect(rectX, rectY, rectSize, rectSize/2);
  
  if (rect2Over) {
    fill(rect2Highlight);
  } else {
    fill(rect2Color);
  }
  stroke(255);
  rect(rect2X, rect2Y, rect2Size, rect2Size/2);

 if (rect3Over) {
    fill(rect3Highlight);
  } else {
    fill(rect3Color);
  }
  stroke(255);
  rect(rect3X, rect3Y, rect3Size, rect3Size/2);

  if (rect4Over) {
    fill(rect4Highlight);
  } else {
    fill(rect4Color);
  }
  stroke(255);
  rect(rect4X, rect4Y, rect4Size, rect4Size/2);  
  
  if (circleOver) {
    fill(circleHighlight);
  } else {
    fill(circleColor);
  }
  stroke(0);
  ellipse(circleX, circleY, circleSize, circleSize);
}

void update(int x, int y) {
  if ( overCircle(circleX, circleY, circleSize) ) {
    circleOver = true;
    rectOver = false;
  } else if ( overRect(rectX, rectY, rectSize, rectSize/2) ) {
    rectOver = true;
    circleOver = false;
  } else if ( overRect2(rect2X, rect2Y, rect2Size, rect2Size/2) ) {
    rect2Over = true;
    circleOver = false;
  } else if ( overRect3(rect3X, rect3Y, rect3Size, rect3Size/2) ) {
    rect3Over = true;
    circleOver = false;    
  } else if ( overRect4(rect4X, rect4Y, rect4Size, rect4Size/2) ) {
    rect4Over = true;
    circleOver = false;
  } else {
    circleOver = rectOver = false;
  }
}

//image loading
PImage imgSchool;  

/*void setupSchool() {
  size(640, 360);
  // The image file must be in the data folder of the current sketch 
  // to load successfully
  imgSchool = loadImage("school.jpg");  // Load the image into the program  
}
*/

void drawSchool() {
  // Displays the image at point (0, height/2) at half of its size
  image(imgSchool, 0, 0, imgSchool.width/2, imgSchool.height/2);
}

//interactions with map
void mousePressed() {
  if (circleOver) {
    currentColor = circleColor;
  }
  if (rectOver) {
    drawSchool();
  }
}

boolean overRect(int x, int y, int width, int height)  {
  if (mouseX >= x && mouseX <= x+width && 
      mouseY >= y && mouseY <= y+height) {
    return true;
  } else {
    return false;
  }
}

boolean overRect2(int x, int y, int width, int height)  {
  if (mouseX >= x && mouseX <= x+width && 
      mouseY >= y && mouseY <= y+height) {
    return true;
  } else {
    return false;
  }
}

boolean overRect3(int x, int y, int width, int height)  {
  if (mouseX >= x && mouseX <= x+width && 
      mouseY >= y && mouseY <= y+height) {
    return true;
  } else {
    return false;
  }
}

boolean overRect4(int x, int y, int width, int height)  {
  if (mouseX >= x && mouseX <= x+width && 
      mouseY >= y && mouseY <= y+height) {
    return true;
  } else {
    return false;
  }
}

boolean overCircle(int x, int y, int diameter) {
  float disX = x - mouseX;
  float disY = y - mouseY;
  if (sqrt(sq(disX) + sq(disY)) < diameter/2 ) {
    return true;
  } else {
    return false;
  }
}


