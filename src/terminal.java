public class terminal {
    int id;
    Packet[] buffer;
    int tail;
    float chance_of_transmit;


    public terminal(int id) {
        this.id = id;
        buffer = new Packet[5];
        tail = -1;

    }

    public boolean check_if_buffer_is_full(){
        if(tail == 4){
            return true;
        }
        return false;
    }
    public boolean check_if_packets_to_transmit(){
        if(tail == -1){
            return false;
        }
        return true;
    }


    public int transmit(){
        Packet packet_to_be_transmited = buffer[0];
        Packet[] temp_buffer = buffer;
        tail--;
        for(int i = tail; i > -1; i--){
            buffer[i] = temp_buffer[i+1];
        }
        //returning delay
        return packet_to_be_transmited.timestamp_sent - packet_to_be_transmited.timestamp_arrived;

    }
    public boolean add_packet_to_buffer(int time_arrived,int id){
        if(check_if_buffer_is_full()){
            return false;
        }
        tail++;
        buffer[tail] = new Packet(time_arrived,id);
        return true;
    }


}
