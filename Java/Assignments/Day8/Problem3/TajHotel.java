package Java.Assignments.Day8.Problem3;

class TajHotel implements Hotel {
    public void welcomeDrink() {
        System.out.println("Welcome Drink from the TajHotel");
    }

    @Override
    public void chickenBiryani() {
        System.out.println("Biryani from Taj Hotel");
    }

    @Override
    public void masalaDosa() {
        System.out.println("MasalaDosa from Taj Hotel");
    }
}
