int read_int() {
  return MARS_GETI() + 5;
}

int main(int arg0) {
  int a = 10;

  while(a > 0) {
    a = MARS_GETI();
    if(a >= 5) {
      if(a <= 10) {
        MARS_PUTS("Correct!\n");
        break;
      }
    }
  }
  MARS_PUTS("Break!\n");

  do {
    a = read_int();
  } while(a > 0);
  MARS_PUTS("Break2!\n");

  return 0;
}
