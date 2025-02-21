public class Task2_1_7 {
    public enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

        public static boolean isWeekend(String day) {
            Day day1 = Day.valueOf(day);
            if (day1.equals(SATURDAY) || day1.equals(SUNDAY)) {
                return true;
            } else return false;
        }

        public static String getRusName(String day) {
            Day day1 = Day.valueOf(day);
            switch (day1) {
                case MONDAY:
                    day = "Понедельник";
                    break;
                case TUESDAY:
                    day = "Вторник";
                    break;
                case WEDNESDAY:
                    day = "Среда";
                    break;
                case THURSDAY:
                    day = "Четверг";
                    break;
                case FRIDAY:
                    day = "Пятница";
                    break;
                case SATURDAY:
                    day = "Суббота";
                    break;
                case SUNDAY:
                    day = "Воскресенье";
                    break;
            }

            return day;
        }
    }
}
