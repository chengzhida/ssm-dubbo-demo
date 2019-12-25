package com.czd.enums;

public interface BaseEnum<C> {
    /**
     * 编码
     *
     * @return
     */
    C code();

    /**
     * 注释
     *
     * @return
     */
    default String comment() {
        return null;
    }

    /**
     * 解析枚举
     *
     * @param enumType 枚举类型
     * @param code     编码
     * @return
     */
    public static <T extends BaseEnum<?>> T parse(Class<T> enumType, Object code) {
        T[] enums = enumType.getEnumConstants();
        for (T t : enums) {
            if (t.code().equals(code)) {
                return t;
            }
        }
        return null;
    }
}