package com.example.dto;

/**
 * 　* @Description: TODO
 * 　* @param ${tags}
 * 　* @return ${return_type}
 * 　* @throws
 * 　* @author lwj
 * 　* @date $date$ $time$
 *
 */
public class ResultDto<Dto> {

    private Dto dto;

    private String errorMessage;

    private String errorReason;

    public ResultDto(String errorMessage, String errorReason) {
        this.errorMessage = errorMessage;
        this.errorReason = errorReason;
    }

    public ResultDto(Dto dto) {
        this.dto = dto;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorReason() {
        return errorReason;
    }

    public void setErrorReason(String errorReason) {
        this.errorReason = errorReason;
    }

    public ResultDto(Dto dto, String errorMessage, String errorReason) {
        this.dto = dto;
        this.errorMessage = errorMessage;
        this.errorReason = errorReason;
    }
}
