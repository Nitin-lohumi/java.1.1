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
        for(Count C : Count.values()){
           System.out.println(" count  = "+ C + " the value  is "+ C.value);
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
enum Count{
  ONE(1),
  TWO(2),
  three(3),
  four(4),
  five(5);
  int value;
  private Count(int i) {
    this.value = i;
  }
}