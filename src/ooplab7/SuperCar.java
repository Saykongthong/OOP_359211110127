package ooplab7;
// Instance variable ของ super car คือ
// car brand ,
// car color,
// car engine size,
// max speed และ
// country of origin และ SuperCar Class
public class SuperCar {

    public  String carbrand;
    private String carcolor;
    private String carenginesize;
    private String maxspeed ;
    private String countryoforigin;


    public SuperCar (){}
    public SuperCar (String brand, String color, String enginesize, String speed, String origin){
        //assign data to class properties
        this.carbrand=brand;//
        this.carcolor=color;
        this.carenginesize=enginesize;
        this.maxspeed=speed;
        this.countryoforigin=origin;
    }
    @Override
    public String toString() {
        return "SuperCar{" +
                "carbrand='" + carbrand + '\'' +
                ", carcolor='" + carcolor + '\'' +
                ", carenginesize='" + carenginesize + '\'' +
                ", maxspeed='" + maxspeed + '\'' +
                ", countryoforigin='" + countryoforigin + '\'' +
                '}';
    }

    public String getCarbrand() {
        return carbrand;
    }

    public void setCarbrand(String carbrand) {
        this.carbrand = carbrand;
    }
    public String getCarcolor() {
        return carcolor;
    }
    public void setCarcolor(String carcolor) {
        this.carcolor = carcolor;
    }
    public String getCarenginesize() {
        return carenginesize;
    }

    public void setCarenginesize(String carenginesize) {
        this.carenginesize = carenginesize;
    }
    public String getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(String maxspeed) {
        this.maxspeed = maxspeed;
    }

    public String getCountryoforigin() {
        return countryoforigin;
    }
    public void setCountryoforigin(String countryoforigin) {
        this.countryoforigin = countryoforigin;
    }}


