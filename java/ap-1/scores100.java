public boolean scores100(int[] scores) {
  for(int i = 1; i<scores.length;i++) if(scores[i]==scores[i-1]&&scores[i]==100) return true;
  return false;
}
