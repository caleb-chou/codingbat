public boolean scoresIncreasing(int[] scores) {
  int temp = scores[0];
  for(int i=1;i<scores.length;i++)
    if(scores[i]>=temp) temp = scores[i];
    else return false;
  return true;
}
