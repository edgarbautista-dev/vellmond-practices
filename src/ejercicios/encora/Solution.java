package ejercicios.encora;

public class Solution {
    public int solution(String s) {
        String[] meetings = s.split("\n");
        int[] minutes = new int[7 * 24 * 60];
        for (String meeting : meetings) {
            String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
            String[] hours = meeting.split(" ");
            int day = 0;
            for (int i = 0; i < days.length; i++) {
                if (days[i].equals(hours[0])) {
                    day = i;
                    break;
                }
            }
            // Sacamos los minutos de la hora de inicio y fin
            String[] timeRange = hours[1].split("-");
            String[] start = timeRange[0].split(":");
            String[] end = timeRange[1].split(":");

            int startHour = Integer.parseInt(start[0]);
            int startMinute = Integer.parseInt(start[1]);
            int endHour = Integer.parseInt(end[0]);
            int endMinute = Integer.parseInt(end[1]);

            int startMinutes = startHour * 60 + startMinute;
            int endMinutes = endHour * 60 + endMinute;

            for (int i = startMinutes; i < endMinutes; i++) {
                minutes[day * 24 * 60 + i] = 1;
            }
        }

        int max = 0;
        int count = 0;
        for (int i = 0; i < minutes.length; i++) {
            if (minutes[i] == 0) {
                count++;
                System.out.println("Count="+count);
            } else {
                max = Math.max(max, count);
                count = 0;
                System.out.println("Max="+max);
            }
        }
        return max;
    }

    public static void main(String[] args){
        String s = "Sun 10:00-20:00\n" +
                "Fri 05:00-10:00\n" +
                "Fri 16:30-23:50\n" +
                "Sat 10:00-24:00\n" +
                "Sun 01:00-04:00\n" +
                "Sat 02:00-06:00\n" +
                "Tue 03:30-18:15\n" +
                "Tue 19:00-20:00\n" +
                "Wed 04:25-15:14\n" +
                "Wed 15:14-22:40\n" +
                "Thu 00:00-23:59\n" +
                "Mon 05:00-13:00\n" +
                "Mon 15:00-21:00";
        String t = "Mon 01:00-23:00\n" +
                "Tue 01:00-23:00\n" +
                "Wed 01:00-23:00\n" +
                "Thu 01:00-23:00\n" +
                "Fri 01:00-23:00\n" +
                "Sat 01:00-23:00\n" +
                "Sun 01:00-21:00";
        EndSolution solution = new EndSolution();
        System.out.println(solution.solution(s));
        System.out.println(solution.solution(t));
    }
}

