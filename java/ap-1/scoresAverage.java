public int scoresAverage(int[] scores) {
  int sum1=0, sum2=0;
  for(int i =0; i < scores.length/2; i++) {
    sum1+= scores[i];
  for(int i =scores.length/2; i < scores.length; i++) {
    sum2+= scores[i];
  sum1/=scores.length/2;
  sum2/=scores.length/2;
  return (sum1 > sum2) ? sum1 : sum2;
}

