package lesson_08;

import static lesson_08.HouseWithBuilder.Builder;

public class TestHouseBuilder {

    public static void main(String[] args) {

        //remove housewhith thi phai import Builder
//
//        Builder builder = new Builder();
//        builder.setDoorNumber(2);
//        builder.setTopRoofColor("dark blue");
//        builder.setColor("Green");
//        HouseWithBuilder house = builder.build();
//
//        System.out.println(house);

        //method chaining
        //khi nao use design pattern: khi co qua nhieu attribute
        Builder builder = new Builder();
        HouseWithBuilder house = builder
                .setDoorNumber(2)
                .setTopRoofColor("dark blue")
                .setColor("Green")
                .build();

        System.out.println(house);
    }

}
