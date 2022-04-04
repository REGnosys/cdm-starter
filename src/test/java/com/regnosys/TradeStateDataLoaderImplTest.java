package com.regnosys;

import cdm.event.common.TradeState;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.LocalDate;

class TradeStateDataLoaderImplTest {

    private TradeStateTestData tradeStateTestData;
    private TradeStateDataLoader tradeStateDataLoader;

    @BeforeEach
    void setUp() {
        tradeStateTestData = new TradeStateTestData();

        tradeStateDataLoader = new TradeStateDataLoaderImpl();
    }

    @Test
    void tradeDate() throws IOException {
        TradeState equityTradeState = tradeStateTestData.equityTradeState();
        LocalDate tradeDate = tradeStateDataLoader.getTradeDate(equityTradeState);
        Assertions.assertEquals(LocalDate.of(2001, 9, 24), tradeDate);


    }



}