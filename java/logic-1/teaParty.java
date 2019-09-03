public int teaParty(int tea, int candy) {
    return (tea < 5 || candy < 5) ? 0 : ((tea * 2) <= candy || (candy*2) <= tea) ? 2 : 1;
}
  