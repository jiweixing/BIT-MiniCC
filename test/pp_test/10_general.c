#define I int
I list[20];

#define ADD(x,y) ((x) + (y))
ADD(a++,2*b)

#define ARR_SIZE(a) (sizeof(a)/ \
sizeof(a[0]))
ARR_SIZE(arr)

#define LOG(l,...) errno=l;printf(__VA_ARGS__);
LOG(3,"%d\n",0)

#define DEBUG
#ifdef DEBUG
printf("flag");
#endif

#line 12
#error "err"
#pragma no effect
