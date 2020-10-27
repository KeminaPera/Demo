package com.keminapera.writ.baws.callback.impl;

import com.keminapera.writ.AbstractWritFillCallback;
import com.keminapera.writ.annotation.TagMapping;
import org.springframework.stereotype.Component;

/**
 * @author KangPeng
 * @since
 */
@Component
@TagMapping(key = "当事人段", bookMark = "dsrd", callback = "DSRD")
public class BawsBgrdCallback extends AbstractWritFillCallback implements IBawsWritFillCallback {
}
