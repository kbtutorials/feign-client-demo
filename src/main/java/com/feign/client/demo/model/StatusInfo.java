package com.feign.client.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StatusInfo {
    private int statudcode;
    private String statusMessage;
}

