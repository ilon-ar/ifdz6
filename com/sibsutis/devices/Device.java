public abstract class Device implements Printable{
    private int id;
    private int price;
    private String ip;

    public Device(int id, int price, String ip) {
        this.id = id;
        this.ip = ip;
        this.price = price;
    }
    
    public int getId() {
        return id;
    }
    public int getPrice(){
        return price;
    }
    public String getIp(){
        return ip;
    }
    @Override
    public String print(){        
        return (String)ip + " " + (String)price + " " + ip;
    }
    public abstract String getDeviceType();
}