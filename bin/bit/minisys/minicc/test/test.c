#include <stdio.h>

int foo(int p){
	int i = 0;
	
	if(p > 0){
		i++;
	}else{
		i--;
	}
}

int main(){
	foo(10);
}

