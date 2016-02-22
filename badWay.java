private void printGuessStaticsitcs(char candidate, int count) {
  String number;
  String verb;
  String pluralModifier;

  if (count == 0) {
    number = 'no';
    verb = 'are';
    pluralModifier = 's';
  } else if (count ==1) {
    number = '1';
    verb = 'is';
    pluralModifier = '';
  } else {
    number = Integer.ToString(count);
    verb = 'are';
    pluralModifier = 's';
  }
  String guessMessage = String.format('There %s %s %s%ss', verb number, candidate, pluralModifier);
  print(guessMessage);
}