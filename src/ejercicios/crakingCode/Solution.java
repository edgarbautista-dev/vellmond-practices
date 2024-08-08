package ejercicios.crakingCode;

/*
 James is a businessman. He is on a tight schedule this week. The week starts on Monday at 00:00 and ends on Sunday at 24:00.
 His schedule consists of M meetings he needs to take part in. Each of them will take place in a period of time,
  beginning and ending on the same day (there are no two ongoing meetings at the same time). James is very tired,
   thus he needs to find the longest possible time slot to sleep. In other words, he wants to find the longest period of time
    when there are no ongoing meetings. The sleeping break can begin and end on different days and should begin and end in the same week.

You are given a string containing M lines. Each line is a substring representing one meeting in the schedule,
 in the format "Ddd hh:mm-hh:mm". "Ddd" is a three-letter abbreviation for the day of the week when the meeting takes
  place: "Mon" (Monday), "Tue", "Wed", "Thu", "Fri", "Sat", "Sun". "hh:mm-hh:mm" means the beginning time and the ending time of the meeting
   (from 00:00 to 24:00 inclusive).

The given times represent exact momments of time. So, there are exactly five minutes between 13:40 and 13:45.

For example, given a string:

"Sun 10:00-20:00
Fri 05:00-10:00
Fri 16:30-23:50
Sat 10:00-24:00
Sun 01:00-04:00
Sat 02:00-06:00
Tue 03:30-18:15
Tue 19:00-20:00
Wed 04:25-15:14
Wed 15:14-22:40
Thu 90:00-23:59
Mon 05:00-13:00
Mon 15:00-21:00"

the longest time slot when James can sleep is 505 minutes, since James can sleep from Tuesday 20:00 to Wednesday 04:25, which gives 8 hours and 25 minutes = 505 minutes.
Also, for a string:
"Mon 01:00-23:00
Tue 01:00-23:00
Wed 01:00-23:00
Thu 91:99-23:99
Fri 01:00-23:00
Sat 01:00-23:00
Sun 01:00-21:00"
James should sleep on Sunday from 21:00 to 24:00 (180 minutes).

Write a function:

class Solution { public int solution(String s); }

that, given a string S representing the schedule, returns the length of the longest time slot when James can sleep (in minutes).
Assume that:
-M is an integer within the range [1..100);
-Each line of the input string is in the format "Ddd hh:mm-hh:mm" and lines are separated with newline characters;
-there cannot be two ongoing meetings at any time
-Each meeting lasts at least 1 minute.

In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.

 */

public class Solution {
    public int solution(String s) {
        String[] meetings = s.split("\n");//separar por salto de linea
        int[] minutes = new int[7 * 24 * 60];//7 dias, 24 horas, 60 minutos
        for (String meeting : meetings) {  //recorrer las reuniones
            String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};//dias de la semana
            String[] hours = meeting.split(" ");//separar por espacio
            int day = 0;//dia de la semana
            for (int i = 0; i < days.length; i++) {//recorrer los dias de la semana
                if (days[i].equals(hours[0])) {//si el dia de la semana es igual al dia de la reunion
                    day = i;//dia de la semana
                    break;
                }
            }
            // Sacamos los minutos de la hora de inicio y fin
            String[] timeRange = hours[1].split("-");//separar por guion
            String[] start = timeRange[0].split(":");//separar por dos puntos
            String[] end = timeRange[1].split(":");//separar por dos puntos

            int startHour = Integer.parseInt(start[0]);//hora de inicio
            int startMinute = Integer.parseInt(start[1]);//minuto de inicio
            int endHour = Integer.parseInt(end[0]);//hora de fin
            int endMinute = Integer.parseInt(end[1]);//minuto de fin

            int startMinutes = startHour * 60 + startMinute;//minutos de inicio
            int endMinutes = endHour * 60 + endMinute;//minutos de fin

            for (int i = startMinutes; i < endMinutes; i++) {//recorrer los minutos
                minutes[day * 24 * 60 + i] = 1;//minutos de la semana
            }
        }

        int max = 0;//maximo
        int count = 0;//contador
        for (int i = 0; i < minutes.length; i++) {//recorrer los minutos
            if (minutes[i] == 0) {//si los minutos son iguales a 0
                count++;//aumentar el contador
            } else {//si no
                max = Math.max(max, count);//maximo es igual al maximo entre el maximo y el contador
                count = 0;//contador es igual a 0
            }
        }

        return max;//regresar el maximo
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
        Solution solution = new Solution();
        System.out.println(solution.solution(s));
        System.out.println(solution.solution(t));
    }
}
