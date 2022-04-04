package com.regnosys;

import cdm.event.common.TradeState;

import java.time.LocalDate;

/**
 * An interface comprising various utility methods to load, extract
 * and transform data from a TradeState instance.
 */
public interface TradeStateDataLoader {

    /**
     * This method will get the trade date for the trade
     * @param tradeState the TradeState instance that contains trade date
     * @return trade date
     */
    LocalDate getTradeDate(TradeState tradeState);

}
