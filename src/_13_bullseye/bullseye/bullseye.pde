 void setup(){
size(800,800);
 }
void draw(){
  int size = 200;
  for(int i=0; i<7;i++){
    if(i%2==0){
  fill(#F50202);
    }
    else{
     fill(#000000); 
    }
ellipse(400,400, size, size);
size-=30;

  }
}
