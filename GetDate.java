package tricks;

import java.text.DateFormat;
import java.util.Date;

public class GetDate {

    public void getDateTime(long timestamp) {
        DateFormat dateFormat = DateFormat.getDateTimeInstance();
        Date netDate = new Date(timestamp);
        dateFormat.format(netDate);
        System.out.println(dateFormat.format(netDate));
    }

    public static void main(String[] args) {
        GetDate object = new GetDate();
        object.getDateTime(2131231030);
    }
}
