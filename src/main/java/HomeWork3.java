public class HomeWork3 {

    public static void main(String[] args) {
        int[] hotelRooms = new int[10];
        hotelRooms[0] = 8;
        hotelRooms[1] = 5;
        hotelRooms[2] = 1;
        hotelRooms[3] = 7;
        hotelRooms[4] = 3;
        hotelRooms[5] = 2;
        hotelRooms[6] = 4;
        hotelRooms[7] = 9;
        hotelRooms[8] = 6;
        hotelRooms[9] = 10;

        boolean isSorted = false;

        while (!isSorted) {
            boolean elementsSwitched = false;

            for (int i = 0; i < hotelRooms.length - 1; i++) {

                int currentElement = hotelRooms[i];//0
                int nextElement = hotelRooms[i + 1];//1


                if (nextElement < currentElement) {
                    elementsSwitched = true;
                    hotelRooms[i + 1] = currentElement;
                    hotelRooms[i] = nextElement;
                }


                System.out.println(hotelRooms[i]);
                System.out.println(hotelRooms[i + 1]);
            }


            if (!elementsSwitched) {
                isSorted = true;
            }
        }
        for (int i = 0; i < hotelRooms.length; i++) {
            System.out.println(hotelRooms[i]);
        }
    }
}



