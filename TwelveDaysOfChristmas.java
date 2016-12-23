class TwelveDaysOfChristmas {
  static String[] days = {"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "nineth", "tenth", "eleventh", "twelveth"};
  static String[] gifts = {"Partridge in a Pear Tree", "Turtle Doves", "French Hens", "Calling Birds", "Golden Rings", "Geese a Laying", "Swans a Swimming", "Maids a Milking", "Ladies Dancing", "Lords a Leaping", "Pipers Piping", "Drummers Drumming"};
  static String[] plural = {"a", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve"};
  public static void main(String[] args) {
    for(int i = 0; i < 12; i++) {
      System.out.println("On the " + days[i] + " day of Christmas\nMy true love gave to me:");
      for(int j = i; j >= 0; j--) {
        String giftLine = "";
        if((i > 0) && (j == 0)) giftLine += "and ";
        giftLine += (plural[j] + " " + gifts[j]);
        System.out.println(giftLine.substring(0,1).toUpperCase() + giftLine.substring(1));
      }
      System.out.println("");
    }
  }
}
