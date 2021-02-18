import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Ques9{

    public static void main(String args[]) {
     
        Date today = new Date();
        DateFormat df = new SimpleDateFormat("dd-MM-yy HH:mm:SS z");
        
	df.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
        String IST = df.format(today);
        System.out.println("Date in Indian Timezone (IST) : " + IST);
     
        df.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        String PST = df.format(today);
        System.out.println("Date in PST Timezone : " + PST);

	df.setTimeZone(TimeZone.getTimeZone("Australia/Sydney"));
        String AET = df.format(today);
        System.out.println("Date in AET Timezone : " + AET);

	df.setTimeZone(TimeZone.getTimeZone("Africa/Cairo"));
        String ART = df.format(today);
        System.out.println("Date in ART Timezone : " + ART);

	df.setTimeZone(TimeZone.getTimeZone("Europe/Paris"));
        String ECT = df.format(today);
        System.out.println("Date in ECT Timezone : " + ECT);

	df.setTimeZone(TimeZone.getTimeZone("Asia/Tokyo"));
        String JST = df.format(today);
        System.out.println("Date in JST Timezone : " + JST);

 
    }
 
}

