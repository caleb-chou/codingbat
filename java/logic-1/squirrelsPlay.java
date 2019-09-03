public boolean squirrelPlay(int temp, boolean isSummer) {
  return (isSummer) ? temp <= 100 && temp >= 60 : temp <= 90 && temp >= 60;
}
