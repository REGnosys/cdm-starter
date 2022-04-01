package com.regnosys;

import cdm.event.common.TradeState;

import java.time.LocalDate;

public class TradeStateDataLoaderImpl implements TradeStateDataLoader {
    @Override
    public LocalDate getTradeDate(TradeState tradeState) {
        return tradeState.getTrade().getTradeDate().getValue().toLocalDate();
    }
}
