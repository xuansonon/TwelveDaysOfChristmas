import java.io.*;

class TwelveDaysOfChristmas {
  static String[] days = {"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "nineth", "tenth", "eleventh", "twelveth"};
  static String[] gifts = {"Partridge in a Pear Tree", "Turtle Doves", "French Hens", "Calling Birds", "Golden Rings", "Geese a Laying", "Swans a Swimming", "Maids a Milking", "Ladies Dancing", "Lords a Leaping", "Pipers Piping", "Drummers Drumming"};

  public static String intToString(int aNumber) {
    String valueOfInt = null;
    switch(aNumber) {
      case 1:
        valueOfInt = "a";
        break;
      case 2:
        valueOfInt = "two";
        break;
      case 3:
        valueOfInt = "three";
        break;
      case 4:
        valueOfInt = "four";
        break;
      case 5:
        valueOfInt = "five";
        break;
      case 6:
        valueOfInt = "six";
        break;
      case 7:
        valueOfInt = "seven";
        break;
      case 8:
        valueOfInt = "eigth";
        break;
      case 9:
        valueOfInt = "nine";
        break;
      case 10:
        valueOfInt = "ten";
        break;
      case 11:
        valueOfInt = "eleven";
        break;
      case 12:
        valueOfInt = "twleve";
        break;
      default:
        break;
    }
    return valueOfInt;
  }

  public static void main(String[] args) {
    for(int i = 0; i < 12; i++) {
      System.out.println("On the " + days[i] + " day of Christmas\nMy true love gave to me:");
      for(int j = i; j >= 0; j--) {
        if((i > 0) && (j == 0)) {
          System.out.print("and ");
        }
        System.out.println(intToString(j + 1) + " " + gifts[j]);
      }
      System.out.println("");
    }
  }
}
