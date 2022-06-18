package lesson_08;

public class HouseWithBuilder {

    private int doorNumber = 1;
    private String topRoofColor = "read";
    private String color = "white";

    public HouseWithBuilder() {
    }

    protected HouseWithBuilder(Builder builder) {     //KHOA LAI, chi cho thang con dung thi dung proceted
        doorNumber = builder.doorNumber;
        topRoofColor = builder.topRoofColor;
        color = builder.color;
    }

    //read only
    public int getDoorNumber() {
        return doorNumber;
    }

    public String getTopRoofColor() {
        return topRoofColor;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "HouseWithBuilder{" +
                "doorNumber=" + doorNumber +
                ", topRoofColor='" + topRoofColor + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    //Customer service | Inner class : khong duoc thay doi, chi de lay yeu cau
    public static class Builder{

        private int doorNumber = 1;
        private String topRoofColor = "read";
        private String color = "white";

        //WRITE ONLY
        public Builder setDoorNumber(int doorNumber) {
            this.doorNumber = doorNumber;
            return this;
        }

        public Builder setTopRoofColor(String topRoofColor) {
            this.topRoofColor = topRoofColor;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public HouseWithBuilder build(){

            return new HouseWithBuilder(this); //this: sinh ra tu builder nay
        }

    }
}
