package com.keminapera.writ;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author KangPeng
 * @since
 */
public class AbstractWritFillCallback {
    @Getter
    @Setter
    private TagMapping tagMapping;

    @Getter
    @AllArgsConstructor
    public static class TagMapping {
        String key;
        String bookMark;
        String callback;
        String value;
        String description;
    }
}
