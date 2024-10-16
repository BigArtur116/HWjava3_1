public class BonusMilesService {

    public int calculate(int price) {
        int cashLimitOnBonus = 20;
        int result = price / cashLimitOnBonus;
        return result;
    }
}
