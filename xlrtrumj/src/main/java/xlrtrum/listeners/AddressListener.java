package xlrtrum.listeners;

/**
 * Created by mingxiao on 2018.3.19.
 */

public interface AddressListener {

    /**
     * Callback to notify an address status change.
     *
     * @param address
     * @param confirmed -> available balance to spend
     * @param unconfirmed -> not available balance.
     * @param numConfirmations -> is the amount of peers which confirm the same balance.
     */
    void onBalanceChange(String address, long confirmed, long unconfirmed,int numConfirmations);

}
