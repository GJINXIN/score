package com.score.scorestatistics.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.LinkedHashMap;
import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResultDTO {

    private Integer status;             // 返回状态
    private String msg;                 // 返回消息
    private Map<String, Object> body;   // 返回数据


    public boolean isSuccess() {
        return status == 200;
    }

    public static ResultDTO success() {
        return new ResultDTO(200, "OK", new LinkedHashMap<>());
    }

    public static ResultDTO error(Integer status, String message) {
        return new ResultDTO(status, message, new LinkedHashMap<>());
    }

    public ResultDTO add(String key, Object value) {
        body.put(key, value);
        return this;
    }

    public ResultDTO addAll(Map<String, Object> map) {
        body.putAll(map);
        return this;
    }

    @Override
    public String toString() {
        return String.format(
                "%s(status=%d, msg=%s, body[%s].size=%d",
                this.getClass().getName(), status, msg, body.getClass().getName(), body.size()
        );
    }
}


