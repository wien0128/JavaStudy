package ex.singleton;

public class ShopService {
    private static ShopService singleton = new ShopService();
    static ShopService getInstance() {
        return singleton;
    }
}
