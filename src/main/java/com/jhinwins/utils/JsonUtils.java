package com.jhinwins.utils;

import com.alibaba.fastjson.JSONObject;
import com.jhinwins.model.ProxyIp;

/**
 * Created by Simon on 2019/1/29 4:11 PM
 * Description:
 */
public class JsonUtils {
    /**
     * 获取代理ip的基本信息
     *
     * @param proxyIp
     */
    public static String getBasicProxyIp(ProxyIp proxyIp) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("ip", proxyIp.getIp());
        jsonObject.put("port", proxyIp.getPort());
        return jsonObject.toJSONString();
    }

    /**
     * 获取代理ip的基本信息
     *
     * @param basicProxyIp
     */
    public static ProxyIp getBasicProxyIp(String basicProxyIp) {
        if (basicProxyIp == null || basicProxyIp.length() == 0) {
            return null;
        }
        JSONObject jsonObject = JSONObject.parseObject(basicProxyIp);
        return new ProxyIp(jsonObject.getString("ip"), jsonObject.getInteger("port"));
    }
}
