package com.github.pradyothadavi.core;

/**
 * Created by pradyot.ha on 12/05/17.
 */

/**
 * https://docs.api.ai/docs/languages
 */
public enum SupportedLanguage {

  BrazilianPortuguese("pt-BR"),
  ChineseCantonese("zh-HK"),
  ChineseSimplified("zh-CN"),
  ChineseTraditional("zh-TW"),
  English("en"),
  Dutch("nl"),
  French("fr"),
  German("de"),
  Italian("it"),
  Japanese("ja"),
  Korean("ko"),
  Portuguese("pt"),
  Russian("ru"),
  Spanish("es"),
  Ukrainian("uk");
  
  private String languageTag;
  
  SupportedLanguage(String languageTag) {
    this.languageTag = languageTag;
  }
  
  public String getLanguageTag() {
    return this.languageTag;
  }
  
  public static SupportedLanguage getDefaultLanguage(){
    return English;
  }
}
