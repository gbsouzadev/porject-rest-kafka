package com.gbsouza.projectrestkafka.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataRequest {

    private Long code;
    private String productName;
    private Double value;
}
