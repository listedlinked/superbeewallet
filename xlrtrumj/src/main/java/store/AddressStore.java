package store;

import java.util.Collection;
import java.util.Map;

/**
 * Created by ming on 2018.3.19.
 */

public interface AddressStore {

    /**
     * Insert a base58 address an his status (hash of the address history)
     *
     * @param address
     * @param addressBalance
     */
    void insert(String address, AddressBalance addressBalance) throws CantInsertAddressException;

    /**
     * Get the address status
     */
    AddressBalance getAddressStatus(String address) throws AddressNotFoundException;

    /**
     *
     * @return
     */
    Collection<AddressBalance> listBalance();

    Map<String,AddressBalance> map();

    boolean contains(String address) throws DbException;
}