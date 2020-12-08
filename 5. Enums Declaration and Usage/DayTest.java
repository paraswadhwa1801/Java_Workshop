class DayOfWeek{
    enum Days{
        MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
    }
    Days days;              //enum defined inside the class
    Day day;                //enum which is defined outside the class and used here
}
public class DayTest {
    
    protected enum Month{
        JAN,FEB,MAR
    };                  //; is optional
    public enum Month1{
        JAN("Jan"),FEB("Feb");
        private String value;
        private Month1(String value){           //constructor to set values 
            this.value=value;
        }
        private String getValue(){              //getter()
            return value;
        }
    }
   // public static void wrong() {
        // enum Day{                            //enum is static by default so related to class level,cann't be local
        //     MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
        // }
       // DayOfWeek test=new DayOfWeek();
       // test.day=Day.MONDAY;

    //}
    
    public static void main(String[] args) {
        DayOfWeek dayOfWeek=new DayOfWeek();
        dayOfWeek.day=Day.TUESDAY;                  //way to retreive value from enum defined outside the class
        dayOfWeek.days=DayOfWeek.Days.TUESDAY;      //way to retreive value from enum defined inside the class
        System.out.println(dayOfWeek.day);

        for(Month m:Month.values()){
                System.out.println(m);
        }
        for(Month1 m:Month1.values()){
            System.out.println(m.getValue());
    }

        //wrong();
    }
}
