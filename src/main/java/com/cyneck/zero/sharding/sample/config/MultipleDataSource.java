package com.cyneck.zero.sharding.sample.config;

import com.baomidou.dynamic.datasource.AbstractRoutingDataSource;
import lombok.Data;

import javax.sql.DataSource;
import java.util.Map;

@Data
public class MultipleDataSource extends AbstractRoutingDataSource {

    private Map<Object, Object> targetDataSources;
    private DataSource defaultTargetDataSource;

    @Override
    protected DataSource determineDataSource() {
        return defaultTargetDataSource;
    }
}
