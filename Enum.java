class Enum {
    public enum Season{
      WINTER, SUMMER , SPRING, FALL
    }
    public static void main(String[] args) {
        for(Season s : Season.values()){
         System.out.println(s);
        }
        for(Day d : Day.values()){
          System.out.println("day =>"+d);
        }
    }
}

enum Day {
 MONDAY,
 TUESDAY,
 WEDNESDAY,
 THRUSDAY,
 FRIDAY,
 SATURDAY,
 SUNDAY
}