package HotelReservation;

public class PriceCalculator {

    public static double calculate(Reservation reservation) {

        double basePrice = reservation.getPricePerDay() *
                reservation.getNumberOfDays() *
                reservation.getSeason().getMultiplier();

        double percent = 1 - (reservation.getDiscountType().getPercentDiscount() / 100.0);
        return basePrice * percent;
    }
}
