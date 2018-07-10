import java.time.LocalDateTime;

public class cmdClock {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        int currentSecond = now.getSecond();
        while(true){
            now = LocalDateTime.now();
            int newSecond = now.getSecond();
            if(currentSecond !=  newSecond){
                System.out.println(now.getHour() + ":" + now.getMinute() + ":" + now.getSecond());
                currentSecond=now.getSecond();
            }
        }
    }
}