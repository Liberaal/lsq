package com.ruoyi.system.domain;

import lombok.Data;

@Data
public class Works {
    private Integer workID;
    private String workTitle;
    private byte[] workContent;
    private Integer uploadedBy;
    private double score;
    private String school;
    private String team;
    private String phone;

}
