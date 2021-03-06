package edu.stanford.nlp.dcoref;

public class SieveOptions {
  public boolean DO_PRONOUN;
  public boolean USE_iwithini;
  public boolean USE_APPOSITION;
  public boolean USE_PREDICATENOMINATIVES;
  public boolean USE_ACRONYM;
  public boolean USE_RELATIVEPRONOUN;
  public boolean USE_ROLEAPPOSITION;    
  public boolean USE_EXACTSTRINGMATCH;
  public boolean USE_INCLUSION_HEADMATCH;
  public boolean USE_RELAXED_HEADMATCH;
  public boolean USE_INCOMPATIBLE_MODIFIER;
  public boolean USE_DEMONYM;
  public boolean USE_WORDS_INCLUSION;
  public boolean USE_ROLE_SKIP;
  public boolean USE_RELAXED_EXACTSTRINGMATCH;
  public boolean USE_ATTRIBUTES_AGREE;
  public boolean USE_WN_HYPERNYM;
  public boolean USE_WN_SYNONYM;
  public boolean USE_DIFFERENT_LOCATION;
  public boolean USE_NUMBER_IN_MENTION;
  public boolean USE_PROPERHEAD_AT_LAST;
  public boolean USE_ALIAS;
  public boolean USE_SLOT_MATCH;
  public boolean USE_DISCOURSEMATCH;
  
  public String toString() {
    StringBuilder os = new StringBuilder();
    os.append("{");
    if(DO_PRONOUN) os.append("DO_PRONOUN");
    if(USE_iwithini) os.append(", USE_iwithini");
    if(USE_APPOSITION) os.append(", USE_APPOSITION");
    if(USE_PREDICATENOMINATIVES) os.append(", USE_PREDICATENOMINATIVES");
    if(USE_ACRONYM) os.append(", USE_ACRONYM");
    if(USE_RELATIVEPRONOUN) os.append(", USE_RELATIVEPRONOUN");
    if(USE_ROLEAPPOSITION) os.append(", USE_ROLEAPPOSITION");
    if(USE_EXACTSTRINGMATCH) os.append(", USE_EXACTSTRINGMATCH");
    if(USE_INCLUSION_HEADMATCH) os.append(", USE_INCLUSION_HEADMATCH");
    if(USE_RELAXED_HEADMATCH) os.append(", USE_RELAXED_HEADMATCH");
    if(USE_INCOMPATIBLE_MODIFIER) os.append(", USE_INCOMPATIBLE_MODIFIER");
    if(USE_DEMONYM) os.append(", USE_DEMONYM");
    if(USE_WORDS_INCLUSION) os.append(", USE_WORDS_INCLUSION");
    if(USE_ROLE_SKIP) os.append(", USE_ROLE_SKIP");
    if(USE_RELAXED_EXACTSTRINGMATCH) os.append(", USE_RELAXED_EXACTSTRINGMATCH");
    if(USE_ATTRIBUTES_AGREE) os.append(", USE_ATTRIBUTES_AGREE");
    if(USE_WN_HYPERNYM) os.append(", USE_WN_HYPERNYM");
    if(USE_WN_SYNONYM) os.append(", USE_WN_SYNONYM");
    if(USE_DIFFERENT_LOCATION) os.append(", USE_DIFFERENT_LOCATION");
    if(USE_NUMBER_IN_MENTION) os.append(", USE_NUMBER_IN_MENTION");
    if(USE_PROPERHEAD_AT_LAST) os.append(", USE_PROPERHEAD_AT_LAST");
    if(USE_ALIAS) os.append(", USE_ALIAS");
    if(USE_SLOT_MATCH) os.append(", USE_SLOT_MATCH");
    if(USE_DISCOURSEMATCH) os.append(", USE_DISCOURSEMATCH");
    os.append("}");
    return os.toString();
  }
  
  public SieveOptions() {
    DO_PRONOUN= false;
    USE_iwithini = false;
    USE_APPOSITION = false;
    USE_PREDICATENOMINATIVES = false;
    USE_ACRONYM = false;
    USE_RELATIVEPRONOUN = false;
    USE_ROLEAPPOSITION = false;    
    USE_EXACTSTRINGMATCH = false;
    USE_INCLUSION_HEADMATCH = false;
    USE_RELAXED_HEADMATCH = false;
    USE_INCOMPATIBLE_MODIFIER = false;
    USE_DEMONYM = false;
    USE_WORDS_INCLUSION = false;
    USE_ROLE_SKIP = false;
    USE_RELAXED_EXACTSTRINGMATCH = false;
    USE_ATTRIBUTES_AGREE = false;
    USE_WN_HYPERNYM = false;
    USE_WN_SYNONYM = false;
    USE_DIFFERENT_LOCATION = false;
    USE_NUMBER_IN_MENTION = false;
    USE_PROPERHEAD_AT_LAST = false;
    USE_ALIAS = false;
    USE_SLOT_MATCH = false;
    USE_DISCOURSEMATCH = false;
  }
}
