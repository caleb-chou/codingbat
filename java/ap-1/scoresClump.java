public boolean scoresClump(int[] scores) {
  for(int i =0; i< scores.length-2;i++)
    if(scores[i+1]-scores[i]<3&&
    scores[i+2]-scores[i+1]<3 && 
    scores[i+2] - scores[i] < 3)
    return true;
  return false;
}
