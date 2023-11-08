import java.sql.Timestamp;

public class Packet {
    int id;
    int  timestamp_arrived;
    int timestamp_sent;

    public Packet(int id, int timestamp_arrived) {
        this.id = id;
        this.timestamp_arrived = timestamp_arrived;
    }

    public void setTimestamp_sent(int timestamp_sent) {
        this.timestamp_sent = timestamp_sent;
    }

}
