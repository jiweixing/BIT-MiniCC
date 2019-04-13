#define NUM 4

/* this is a demo program */

int main(){
  int a;
  int b;
  
  a = MARS_GETI();
  b = MARS_GETI();
  
  a = a + b;
  
  MARS_PUTI(a);
  
  return 0;
}
