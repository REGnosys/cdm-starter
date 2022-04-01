package com.regnosys;

import cdm.event.common.TradeState;

import java.time.LocalDate;

public interface TradeStateDataLoader {

    /**
     * This method will get the first Identifier for the trade
     * @param tradeState
     * @return
     */
    LocalDate getTradeDate(TradeState tradeState);

}
