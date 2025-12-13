package com.cperazzolli.algasensors.temperature.processing.api.config.web;

import io.hypersistence.tsid.TSID;
import org.springframework.core.convert.converter.Converter;


public class StringTSIDWebConverter implements Converter<String, TSID> {

    @Override
    public TSID convert(String source) {
        return TSID.from(source);
    }
}
