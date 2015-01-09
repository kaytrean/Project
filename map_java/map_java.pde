int rectX, rectY;      // Position of square button
int rect2X, rect2Y;
int circleX, circleY;  // Position of circle button
int rectSize = 90;     // Diameter of rect
int rect2Size = 90;
int circleSize = 93;   // Diameter of circle
color rectColor, rect2Color, circleColor, baseColor;
color rectHighlight, rect2Highlight, circleHighlight;
color currentColor;
boolean rectOver = false;
boolean rect2Over = false;
boolean circleOver = false;

void setup() {
  size(640, 360);
  rectColor = color(0);
  rectHighlight = color(51);
  circleColor = color(255);
  circleHighlight = color(204);
  rect2Color = color(#DE4848);
  rect2Highlight = color(#7B48DE);
  baseColor = color(102);
  currentColor = baseColor;
  circleX = width/2+circleSize/2+10;
  circleY = height/2;
  rectX = 0;
  rectY = 0;
  rect2X = 0;
  rect2Y = 360;
  ellipseMode(CENTER);
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
  rect(rectX, rectY, rectSize, rectSize);
 
 if (rect2Over){
   fill(rect2Highlight);
 }else{
   fill (rect2Color);
 }
 stroke(255);
 rect(rect2X, rect2Y, rect2Size, rect2Size);
  
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
  } else if ( overRect(rectX, rectY, rectSize, rectSize) ) {
    rectOver = true;
    circleOver = false;
  } else {
    circleOver = rectOver = false;
  }
}

void mousePressed() {
  if (circleOver) {
    currentColor = circleColor;
  }
  if (rectOver) {
    currentColor = rectColor;
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

boolean overCircle(int x, int y, int diameter) {
  float disX = x - mouseX;
  float disY = y - mouseY;
  if (sqrt(sq(disX) + sq(disY)) < diameter/2 ) {
    return true;
  } else {
    return false;
  }
}
