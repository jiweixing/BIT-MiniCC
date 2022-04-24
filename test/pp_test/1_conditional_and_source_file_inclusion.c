//6.10.1~6.10.2
#define VERSION 1
#if VERSION == 1
	#define INCFILE  "1_test_1.h"
#else
    #define INCFILE  "1_test_N.h"
#endif
#include INCFILE
