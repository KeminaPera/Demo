package com.keminapera.spring.import_annotation.import_selector;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author keminapera
 * @date 2020/10/19
 */
@Configuration
@Import(NameEndWithDogImportSeclector.class)
public class ImportSelectorConfiguration {
}
