#include<stdio.h>
#include<string.h>
int reverse(char* str) {
	int i,j,len = strlen(str);
	for(i=0,j=len-1; i<len/2; i++,j--) {
		char tmp;
		tmp = str[i];
		str[i] = str[j];
		str[j] = tmp;
	}
	printf("%s",str);
	return 0;
}

int main(void) {
	char str[] = "Hello World";
	reverse(str);
	return 0;
}