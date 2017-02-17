package streams;

/**
 * Created by yevgen on 16.02.17.
 */
public class HotelRoom {

    private Integer countOfRooms;
    private Integer cost;
    private boolean free;

    public HotelRoom(Integer countOfRooms, Integer cost, boolean free) {
        this.countOfRooms = countOfRooms;
        this.free = free;
        this.cost = cost;
    }

    public Integer getCountOfRooms() {
        return countOfRooms;
    }

    public void setCountOfRooms(Integer countOfRooms) {
        this.countOfRooms = countOfRooms;
    }

    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }
}
