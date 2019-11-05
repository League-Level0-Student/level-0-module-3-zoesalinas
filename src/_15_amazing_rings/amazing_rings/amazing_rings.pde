int speed = 1;
int x1 = 200;
int x2 = 600;
void setup(){
  size(800,800);
}
void draw(){
  background(#F500D9);
    int size = 200;
    noFill();
  for(int i=0; i<7;i++){
ellipse(x1,400, size, size);
size-=30;
  }
  x1 += speed;
 size = 200;
    noFill();
  for(int i=0; i<7;i++){
ellipse(x2,400, size, size);
size-=30;
  }
 x2 -= speed; 
 if(x1>=800 ||x1<=0){
   speed*=-1;
 }
}
