package Facade;

public class CheckFacade {
    private FlightApi flyApi;
    private HotelApi hotelApi;

    public CheckFacade() {
        this.flyApi = new FlightApi();
        this.hotelApi = new HotelApi();
    }

    public void search(String origin, String destination, String city) {
        flyApi.searchFly(origin, destination);
        hotelApi.searchHotel(city);
    }
}
