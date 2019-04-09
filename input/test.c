#define NUM 4

/* this is a demo program */

int main(){
	int a;
	int b;
	
	a = MARS_SCANF_I();
	b = MARS_SCANF_I();
	
	a = a + b;
	
	MARS_PRINTF_I(a);
	
	return 0;
}
