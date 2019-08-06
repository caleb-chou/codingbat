public int caughtSpeeding(int speed, boolean isBirthday) {
  int max = 0;
  if(isBirthday) max = 5;
  if(speed<=60+max) return 0;
  else if(speed>=61+max && speed<=81+max) return 1;
  else return 2;
}
