void perfectNumber(int n){
	int p[80];  //淇濆瓨鍒嗚В鐨勫洜瀛�
	int i,num,count,s,c = 0;
	for(num = 2; num < n; num++)
	{
		count = 0;
		s = num;
		for(i = 1; i < num/2+1; i++)      //寰幆澶勭悊姣忎釜鏁�
		{
			if(num % i == 0)          //鑳借i鏁撮櫎
			{
				p[count++]  = i;      //淇濆瓨鍥犲瓙锛岃璁℃暟鍣╟ount澧炲姞1
				s -= i;               //鍑忓幓涓�涓洜瀛�
			}
		}
		if( 0 == s)
		{
			Mars_PrintInt(num);
			c++;
		}
	}
	Mars_PrintStr("The sum is :\n");
	Mars_PrintInt(c);
	return ;
}
int main(){
	Mars_PrintStr("All perfect numbers within 100:\n");	// A perfect number is a number equal to the sum of its factors
	perfectNumber(100);
    return 0;
}