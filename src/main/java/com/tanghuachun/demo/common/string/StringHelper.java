package com.tanghuachun.demo.common.string;

import cn.hutool.core.util.StrUtil;

public final class StringHelper {
    /**
     * 去除字符串两边某个字符
     *
     * @param src
     * @param c
     * @return
     */
    public static String trim(String src, char c) {
        if (StrUtil.isBlank(src)) {
            return src;
        }
        String rex = String.format("^[%c]+|[%c]+$", c, c);
        return src.replaceAll(rex, "");
    }

    /**
     * 去除字符串左边某个字符
     *
     * @param src
     * @param c
     * @return
     */
    public static String trimLeft(String src, char c) {
        if (StrUtil.isBlank(src)) {
            return src;
        }
        String rex = String.format("^[%c]+", c);
        return src.replaceAll(rex, "");
    }

    /**
     * 去除字符串右边某个字符
     *
     * @param src
     * @param c
     * @return
     */
    public static String trimRight(String src, char c) {
        if (StrUtil.isBlank(src)) {
            return src;
        }
        String rex = String.format("[%c]+$", c);
        return src.replaceAll(rex, "");
    }
}
