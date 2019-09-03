public String alarmClock(int day, boolean vacation) {
  return (!vacation) ? (day > 0 && day < 6) ? "7:00":"10:00" : (day > 0 && day < 6) ? "10:00":"off" ;
}
