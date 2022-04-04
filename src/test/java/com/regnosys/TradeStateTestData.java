package com.regnosys;

import cdm.event.common.TradeState;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.regnosys.rosetta.common.serialisation.RosettaObjectMapper;

import java.io.IOException;
import java.net.URL;

public class TradeStateTestData {

    private final ObjectMapper mapper;

    public TradeStateTestData() {
        this.mapper = RosettaObjectMapper.getNewRosettaObjectMapper();
    }

    /**
     * A helper method to load a sample equity trade state from the test/resources folder to be used in testing.
     * @return deserialized TradeState object
     */
    public TradeState getEquityTradeState() throws IOException {
        URL resource = this.getClass().getClassLoader()
                .getResource("equity-trade-state.json");
        return mapper.readValue(resource, TradeState.class);
    }
}
