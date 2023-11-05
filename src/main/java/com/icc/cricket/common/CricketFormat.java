package com.icc.cricket.common;

import java.security.InvalidParameterException;

public enum CricketFormat {
    ONE_DAY("1", "1D", "One Day"),
    TEST("2", "TEST", "Test"),
    T20("3", "T20", "Twenty20");

    private String id;
    private String displayName;
    private String code;
    CricketFormat(String id, String code, String displayName) {
        this.id = id;
        this.code = code;
        this.displayName = displayName;
    }
    public CricketFormat getCricketFormatById(String id) {
        for (CricketFormat cf: CricketFormat.values()) {
            if(cf.id.equals(id)) {
                return cf;
            }
        }
        throw new InvalidParameterException("No cricket format exist for given id "+id);
    }
    public String getCodeById(String id) {
        for (CricketFormat cf: CricketFormat.values()) {
            if(cf.id.equals(id)) {
                return cf.getCode();
            }
        }
        throw new InvalidParameterException("No cricket format exist for given id "+id);
    }
    public String getDisplayNameById(String id) {
        for (CricketFormat cf: CricketFormat.values()) {
            if(cf.id.equals(id)) {
                return cf.getDisplayName();
            }
        }
        throw new InvalidParameterException("No cricket format exist for given id "+id);
    }

    private String getDisplayName(){
        return this.displayName;
    }
    private String getCode(){
        return this.code;
    }
}
