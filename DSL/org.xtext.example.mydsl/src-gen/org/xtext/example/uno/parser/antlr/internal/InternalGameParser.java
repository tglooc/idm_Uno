package org.xtext.example.uno.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.uno.services.GameGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGameParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Game'", "'{'", "'twoPlayers'", "'}'", "'time'", "'limited'", "'unlimited'", "'rotatingCards'", "'rotatingZero'", "'rotatingSeven'", "'playingSameCards'", "'sameNumber'", "'sameColor'", "'draw'", "'oneCard'", "'threeCards'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalGameParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGameParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGameParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGame.g"; }



     	private GameGrammarAccess grammarAccess;

        public InternalGameParser(TokenStream input, GameGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Game";
       	}

       	@Override
       	protected GameGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGame"
    // InternalGame.g:64:1: entryRuleGame returns [EObject current=null] : iv_ruleGame= ruleGame EOF ;
    public final EObject entryRuleGame() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGame = null;


        try {
            // InternalGame.g:64:45: (iv_ruleGame= ruleGame EOF )
            // InternalGame.g:65:2: iv_ruleGame= ruleGame EOF
            {
             newCompositeNode(grammarAccess.getGameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGame=ruleGame();

            state._fsp--;

             current =iv_ruleGame; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGame"


    // $ANTLR start "ruleGame"
    // InternalGame.g:71:1: ruleGame returns [EObject current=null] : (otherlv_0= 'Game' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_twoPlayers_3_0= 'twoPlayers' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_time_4_0= ruleTime ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rotatingCards_5_0= ruleRotatingCards ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_playingSameCards_6_0= rulePlayingSameCards ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_draw_7_0= ruleDraw ) ) ) ) ) )+ {...}?) ) ) otherlv_8= '}' ) ;
    public final EObject ruleGame() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_twoPlayers_3_0=null;
        Token otherlv_8=null;
        EObject lv_time_4_0 = null;

        EObject lv_rotatingCards_5_0 = null;

        EObject lv_playingSameCards_6_0 = null;

        EObject lv_draw_7_0 = null;



        	enterRule();

        try {
            // InternalGame.g:77:2: ( (otherlv_0= 'Game' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_twoPlayers_3_0= 'twoPlayers' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_time_4_0= ruleTime ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rotatingCards_5_0= ruleRotatingCards ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_playingSameCards_6_0= rulePlayingSameCards ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_draw_7_0= ruleDraw ) ) ) ) ) )+ {...}?) ) ) otherlv_8= '}' ) )
            // InternalGame.g:78:2: (otherlv_0= 'Game' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_twoPlayers_3_0= 'twoPlayers' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_time_4_0= ruleTime ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rotatingCards_5_0= ruleRotatingCards ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_playingSameCards_6_0= rulePlayingSameCards ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_draw_7_0= ruleDraw ) ) ) ) ) )+ {...}?) ) ) otherlv_8= '}' )
            {
            // InternalGame.g:78:2: (otherlv_0= 'Game' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_twoPlayers_3_0= 'twoPlayers' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_time_4_0= ruleTime ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rotatingCards_5_0= ruleRotatingCards ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_playingSameCards_6_0= rulePlayingSameCards ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_draw_7_0= ruleDraw ) ) ) ) ) )+ {...}?) ) ) otherlv_8= '}' )
            // InternalGame.g:79:3: otherlv_0= 'Game' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_twoPlayers_3_0= 'twoPlayers' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_time_4_0= ruleTime ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rotatingCards_5_0= ruleRotatingCards ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_playingSameCards_6_0= rulePlayingSameCards ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_draw_7_0= ruleDraw ) ) ) ) ) )+ {...}?) ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGameAccess().getGameKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getGameAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGame.g:87:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_twoPlayers_3_0= 'twoPlayers' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_time_4_0= ruleTime ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rotatingCards_5_0= ruleRotatingCards ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_playingSameCards_6_0= rulePlayingSameCards ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_draw_7_0= ruleDraw ) ) ) ) ) )+ {...}?) ) )
            // InternalGame.g:88:4: ( ( ( ({...}? => ( ({...}? => ( (lv_twoPlayers_3_0= 'twoPlayers' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_time_4_0= ruleTime ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rotatingCards_5_0= ruleRotatingCards ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_playingSameCards_6_0= rulePlayingSameCards ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_draw_7_0= ruleDraw ) ) ) ) ) )+ {...}?) )
            {
            // InternalGame.g:88:4: ( ( ( ({...}? => ( ({...}? => ( (lv_twoPlayers_3_0= 'twoPlayers' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_time_4_0= ruleTime ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rotatingCards_5_0= ruleRotatingCards ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_playingSameCards_6_0= rulePlayingSameCards ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_draw_7_0= ruleDraw ) ) ) ) ) )+ {...}?) )
            // InternalGame.g:89:5: ( ( ({...}? => ( ({...}? => ( (lv_twoPlayers_3_0= 'twoPlayers' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_time_4_0= ruleTime ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rotatingCards_5_0= ruleRotatingCards ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_playingSameCards_6_0= rulePlayingSameCards ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_draw_7_0= ruleDraw ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getGameAccess().getUnorderedGroup_2());
            				
            // InternalGame.g:92:5: ( ( ({...}? => ( ({...}? => ( (lv_twoPlayers_3_0= 'twoPlayers' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_time_4_0= ruleTime ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rotatingCards_5_0= ruleRotatingCards ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_playingSameCards_6_0= rulePlayingSameCards ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_draw_7_0= ruleDraw ) ) ) ) ) )+ {...}?)
            // InternalGame.g:93:6: ( ({...}? => ( ({...}? => ( (lv_twoPlayers_3_0= 'twoPlayers' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_time_4_0= ruleTime ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rotatingCards_5_0= ruleRotatingCards ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_playingSameCards_6_0= rulePlayingSameCards ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_draw_7_0= ruleDraw ) ) ) ) ) )+ {...}?
            {
            // InternalGame.g:93:6: ( ({...}? => ( ({...}? => ( (lv_twoPlayers_3_0= 'twoPlayers' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_time_4_0= ruleTime ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rotatingCards_5_0= ruleRotatingCards ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_playingSameCards_6_0= rulePlayingSameCards ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_draw_7_0= ruleDraw ) ) ) ) ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=6;
                int LA1_0 = input.LA(1);

                if ( LA1_0 == 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getGameAccess().getUnorderedGroup_2(), 0) ) {
                    alt1=1;
                }
                else if ( LA1_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getGameAccess().getUnorderedGroup_2(), 1) ) {
                    alt1=2;
                }
                else if ( LA1_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getGameAccess().getUnorderedGroup_2(), 2) ) {
                    alt1=3;
                }
                else if ( LA1_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getGameAccess().getUnorderedGroup_2(), 3) ) {
                    alt1=4;
                }
                else if ( LA1_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getGameAccess().getUnorderedGroup_2(), 4) ) {
                    alt1=5;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGame.g:94:4: ({...}? => ( ({...}? => ( (lv_twoPlayers_3_0= 'twoPlayers' ) ) ) ) )
            	    {
            	    // InternalGame.g:94:4: ({...}? => ( ({...}? => ( (lv_twoPlayers_3_0= 'twoPlayers' ) ) ) ) )
            	    // InternalGame.g:95:5: {...}? => ( ({...}? => ( (lv_twoPlayers_3_0= 'twoPlayers' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGameAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleGame", "getUnorderedGroupHelper().canSelect(grammarAccess.getGameAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalGame.g:95:101: ( ({...}? => ( (lv_twoPlayers_3_0= 'twoPlayers' ) ) ) )
            	    // InternalGame.g:96:6: ({...}? => ( (lv_twoPlayers_3_0= 'twoPlayers' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGameAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalGame.g:99:9: ({...}? => ( (lv_twoPlayers_3_0= 'twoPlayers' ) ) )
            	    // InternalGame.g:99:10: {...}? => ( (lv_twoPlayers_3_0= 'twoPlayers' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGame", "true");
            	    }
            	    // InternalGame.g:99:19: ( (lv_twoPlayers_3_0= 'twoPlayers' ) )
            	    // InternalGame.g:99:20: (lv_twoPlayers_3_0= 'twoPlayers' )
            	    {
            	    // InternalGame.g:99:20: (lv_twoPlayers_3_0= 'twoPlayers' )
            	    // InternalGame.g:100:10: lv_twoPlayers_3_0= 'twoPlayers'
            	    {
            	    lv_twoPlayers_3_0=(Token)match(input,13,FOLLOW_5); 

            	    										newLeafNode(lv_twoPlayers_3_0, grammarAccess.getGameAccess().getTwoPlayersTwoPlayersKeyword_2_0_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getGameRule());
            	    										}
            	    										setWithLastConsumed(current, "twoPlayers", lv_twoPlayers_3_0, "twoPlayers");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGameAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalGame.g:117:4: ({...}? => ( ({...}? => ( (lv_time_4_0= ruleTime ) ) ) ) )
            	    {
            	    // InternalGame.g:117:4: ({...}? => ( ({...}? => ( (lv_time_4_0= ruleTime ) ) ) ) )
            	    // InternalGame.g:118:5: {...}? => ( ({...}? => ( (lv_time_4_0= ruleTime ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGameAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleGame", "getUnorderedGroupHelper().canSelect(grammarAccess.getGameAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalGame.g:118:101: ( ({...}? => ( (lv_time_4_0= ruleTime ) ) ) )
            	    // InternalGame.g:119:6: ({...}? => ( (lv_time_4_0= ruleTime ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGameAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalGame.g:122:9: ({...}? => ( (lv_time_4_0= ruleTime ) ) )
            	    // InternalGame.g:122:10: {...}? => ( (lv_time_4_0= ruleTime ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGame", "true");
            	    }
            	    // InternalGame.g:122:19: ( (lv_time_4_0= ruleTime ) )
            	    // InternalGame.g:122:20: (lv_time_4_0= ruleTime )
            	    {
            	    // InternalGame.g:122:20: (lv_time_4_0= ruleTime )
            	    // InternalGame.g:123:10: lv_time_4_0= ruleTime
            	    {

            	    										newCompositeNode(grammarAccess.getGameAccess().getTimeTimeParserRuleCall_2_1_0());
            	    									
            	    pushFollow(FOLLOW_5);
            	    lv_time_4_0=ruleTime();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getGameRule());
            	    										}
            	    										set(
            	    											current,
            	    											"time",
            	    											lv_time_4_0,
            	    											"org.xtext.example.uno.Game.Time");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGameAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalGame.g:145:4: ({...}? => ( ({...}? => ( (lv_rotatingCards_5_0= ruleRotatingCards ) ) ) ) )
            	    {
            	    // InternalGame.g:145:4: ({...}? => ( ({...}? => ( (lv_rotatingCards_5_0= ruleRotatingCards ) ) ) ) )
            	    // InternalGame.g:146:5: {...}? => ( ({...}? => ( (lv_rotatingCards_5_0= ruleRotatingCards ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGameAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleGame", "getUnorderedGroupHelper().canSelect(grammarAccess.getGameAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalGame.g:146:101: ( ({...}? => ( (lv_rotatingCards_5_0= ruleRotatingCards ) ) ) )
            	    // InternalGame.g:147:6: ({...}? => ( (lv_rotatingCards_5_0= ruleRotatingCards ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGameAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalGame.g:150:9: ({...}? => ( (lv_rotatingCards_5_0= ruleRotatingCards ) ) )
            	    // InternalGame.g:150:10: {...}? => ( (lv_rotatingCards_5_0= ruleRotatingCards ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGame", "true");
            	    }
            	    // InternalGame.g:150:19: ( (lv_rotatingCards_5_0= ruleRotatingCards ) )
            	    // InternalGame.g:150:20: (lv_rotatingCards_5_0= ruleRotatingCards )
            	    {
            	    // InternalGame.g:150:20: (lv_rotatingCards_5_0= ruleRotatingCards )
            	    // InternalGame.g:151:10: lv_rotatingCards_5_0= ruleRotatingCards
            	    {

            	    										newCompositeNode(grammarAccess.getGameAccess().getRotatingCardsRotatingCardsParserRuleCall_2_2_0());
            	    									
            	    pushFollow(FOLLOW_5);
            	    lv_rotatingCards_5_0=ruleRotatingCards();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getGameRule());
            	    										}
            	    										set(
            	    											current,
            	    											"rotatingCards",
            	    											lv_rotatingCards_5_0,
            	    											"org.xtext.example.uno.Game.RotatingCards");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGameAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalGame.g:173:4: ({...}? => ( ({...}? => ( (lv_playingSameCards_6_0= rulePlayingSameCards ) ) ) ) )
            	    {
            	    // InternalGame.g:173:4: ({...}? => ( ({...}? => ( (lv_playingSameCards_6_0= rulePlayingSameCards ) ) ) ) )
            	    // InternalGame.g:174:5: {...}? => ( ({...}? => ( (lv_playingSameCards_6_0= rulePlayingSameCards ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGameAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleGame", "getUnorderedGroupHelper().canSelect(grammarAccess.getGameAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalGame.g:174:101: ( ({...}? => ( (lv_playingSameCards_6_0= rulePlayingSameCards ) ) ) )
            	    // InternalGame.g:175:6: ({...}? => ( (lv_playingSameCards_6_0= rulePlayingSameCards ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGameAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalGame.g:178:9: ({...}? => ( (lv_playingSameCards_6_0= rulePlayingSameCards ) ) )
            	    // InternalGame.g:178:10: {...}? => ( (lv_playingSameCards_6_0= rulePlayingSameCards ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGame", "true");
            	    }
            	    // InternalGame.g:178:19: ( (lv_playingSameCards_6_0= rulePlayingSameCards ) )
            	    // InternalGame.g:178:20: (lv_playingSameCards_6_0= rulePlayingSameCards )
            	    {
            	    // InternalGame.g:178:20: (lv_playingSameCards_6_0= rulePlayingSameCards )
            	    // InternalGame.g:179:10: lv_playingSameCards_6_0= rulePlayingSameCards
            	    {

            	    										newCompositeNode(grammarAccess.getGameAccess().getPlayingSameCardsPlayingSameCardsParserRuleCall_2_3_0());
            	    									
            	    pushFollow(FOLLOW_5);
            	    lv_playingSameCards_6_0=rulePlayingSameCards();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getGameRule());
            	    										}
            	    										set(
            	    											current,
            	    											"playingSameCards",
            	    											lv_playingSameCards_6_0,
            	    											"org.xtext.example.uno.Game.PlayingSameCards");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGameAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalGame.g:201:4: ({...}? => ( ({...}? => ( (lv_draw_7_0= ruleDraw ) ) ) ) )
            	    {
            	    // InternalGame.g:201:4: ({...}? => ( ({...}? => ( (lv_draw_7_0= ruleDraw ) ) ) ) )
            	    // InternalGame.g:202:5: {...}? => ( ({...}? => ( (lv_draw_7_0= ruleDraw ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGameAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleGame", "getUnorderedGroupHelper().canSelect(grammarAccess.getGameAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalGame.g:202:101: ( ({...}? => ( (lv_draw_7_0= ruleDraw ) ) ) )
            	    // InternalGame.g:203:6: ({...}? => ( (lv_draw_7_0= ruleDraw ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getGameAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalGame.g:206:9: ({...}? => ( (lv_draw_7_0= ruleDraw ) ) )
            	    // InternalGame.g:206:10: {...}? => ( (lv_draw_7_0= ruleDraw ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGame", "true");
            	    }
            	    // InternalGame.g:206:19: ( (lv_draw_7_0= ruleDraw ) )
            	    // InternalGame.g:206:20: (lv_draw_7_0= ruleDraw )
            	    {
            	    // InternalGame.g:206:20: (lv_draw_7_0= ruleDraw )
            	    // InternalGame.g:207:10: lv_draw_7_0= ruleDraw
            	    {

            	    										newCompositeNode(grammarAccess.getGameAccess().getDrawDrawParserRuleCall_2_4_0());
            	    									
            	    pushFollow(FOLLOW_5);
            	    lv_draw_7_0=ruleDraw();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getGameRule());
            	    										}
            	    										set(
            	    											current,
            	    											"draw",
            	    											lv_draw_7_0,
            	    											"org.xtext.example.uno.Game.Draw");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGameAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getGameAccess().getUnorderedGroup_2()) ) {
                throw new FailedPredicateException(input, "ruleGame", "getUnorderedGroupHelper().canLeave(grammarAccess.getGameAccess().getUnorderedGroup_2())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getGameAccess().getUnorderedGroup_2());
            				

            }

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getGameAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGame"


    // $ANTLR start "entryRuleTime"
    // InternalGame.g:245:1: entryRuleTime returns [EObject current=null] : iv_ruleTime= ruleTime EOF ;
    public final EObject entryRuleTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTime = null;


        try {
            // InternalGame.g:245:45: (iv_ruleTime= ruleTime EOF )
            // InternalGame.g:246:2: iv_ruleTime= ruleTime EOF
            {
             newCompositeNode(grammarAccess.getTimeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTime=ruleTime();

            state._fsp--;

             current =iv_ruleTime; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTime"


    // $ANTLR start "ruleTime"
    // InternalGame.g:252:1: ruleTime returns [EObject current=null] : (otherlv_0= 'time' otherlv_1= '{' ( ( (lv_limited_2_0= 'limited' ) ) | ( (lv_unlimited_3_0= 'unlimited' ) ) ) otherlv_4= '}' ) ;
    public final EObject ruleTime() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_limited_2_0=null;
        Token lv_unlimited_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalGame.g:258:2: ( (otherlv_0= 'time' otherlv_1= '{' ( ( (lv_limited_2_0= 'limited' ) ) | ( (lv_unlimited_3_0= 'unlimited' ) ) ) otherlv_4= '}' ) )
            // InternalGame.g:259:2: (otherlv_0= 'time' otherlv_1= '{' ( ( (lv_limited_2_0= 'limited' ) ) | ( (lv_unlimited_3_0= 'unlimited' ) ) ) otherlv_4= '}' )
            {
            // InternalGame.g:259:2: (otherlv_0= 'time' otherlv_1= '{' ( ( (lv_limited_2_0= 'limited' ) ) | ( (lv_unlimited_3_0= 'unlimited' ) ) ) otherlv_4= '}' )
            // InternalGame.g:260:3: otherlv_0= 'time' otherlv_1= '{' ( ( (lv_limited_2_0= 'limited' ) ) | ( (lv_unlimited_3_0= 'unlimited' ) ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTimeAccess().getTimeKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getTimeAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGame.g:268:3: ( ( (lv_limited_2_0= 'limited' ) ) | ( (lv_unlimited_3_0= 'unlimited' ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            else if ( (LA2_0==17) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalGame.g:269:4: ( (lv_limited_2_0= 'limited' ) )
                    {
                    // InternalGame.g:269:4: ( (lv_limited_2_0= 'limited' ) )
                    // InternalGame.g:270:5: (lv_limited_2_0= 'limited' )
                    {
                    // InternalGame.g:270:5: (lv_limited_2_0= 'limited' )
                    // InternalGame.g:271:6: lv_limited_2_0= 'limited'
                    {
                    lv_limited_2_0=(Token)match(input,16,FOLLOW_7); 

                    						newLeafNode(lv_limited_2_0, grammarAccess.getTimeAccess().getLimitedLimitedKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTimeRule());
                    						}
                    						setWithLastConsumed(current, "limited", lv_limited_2_0, "limited");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:284:4: ( (lv_unlimited_3_0= 'unlimited' ) )
                    {
                    // InternalGame.g:284:4: ( (lv_unlimited_3_0= 'unlimited' ) )
                    // InternalGame.g:285:5: (lv_unlimited_3_0= 'unlimited' )
                    {
                    // InternalGame.g:285:5: (lv_unlimited_3_0= 'unlimited' )
                    // InternalGame.g:286:6: lv_unlimited_3_0= 'unlimited'
                    {
                    lv_unlimited_3_0=(Token)match(input,17,FOLLOW_7); 

                    						newLeafNode(lv_unlimited_3_0, grammarAccess.getTimeAccess().getUnlimitedUnlimitedKeyword_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTimeRule());
                    						}
                    						setWithLastConsumed(current, "unlimited", lv_unlimited_3_0, "unlimited");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTimeAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTime"


    // $ANTLR start "entryRuleRotatingCards"
    // InternalGame.g:307:1: entryRuleRotatingCards returns [EObject current=null] : iv_ruleRotatingCards= ruleRotatingCards EOF ;
    public final EObject entryRuleRotatingCards() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotatingCards = null;


        try {
            // InternalGame.g:307:54: (iv_ruleRotatingCards= ruleRotatingCards EOF )
            // InternalGame.g:308:2: iv_ruleRotatingCards= ruleRotatingCards EOF
            {
             newCompositeNode(grammarAccess.getRotatingCardsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRotatingCards=ruleRotatingCards();

            state._fsp--;

             current =iv_ruleRotatingCards; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRotatingCards"


    // $ANTLR start "ruleRotatingCards"
    // InternalGame.g:314:1: ruleRotatingCards returns [EObject current=null] : ( () otherlv_1= 'rotatingCards' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_rotatingZero_4_0= 'rotatingZero' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rotatingSeven_5_0= 'rotatingSeven' ) ) ) ) ) )* ) ) ) otherlv_6= '}' ) ;
    public final EObject ruleRotatingCards() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_rotatingZero_4_0=null;
        Token lv_rotatingSeven_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalGame.g:320:2: ( ( () otherlv_1= 'rotatingCards' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_rotatingZero_4_0= 'rotatingZero' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rotatingSeven_5_0= 'rotatingSeven' ) ) ) ) ) )* ) ) ) otherlv_6= '}' ) )
            // InternalGame.g:321:2: ( () otherlv_1= 'rotatingCards' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_rotatingZero_4_0= 'rotatingZero' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rotatingSeven_5_0= 'rotatingSeven' ) ) ) ) ) )* ) ) ) otherlv_6= '}' )
            {
            // InternalGame.g:321:2: ( () otherlv_1= 'rotatingCards' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_rotatingZero_4_0= 'rotatingZero' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rotatingSeven_5_0= 'rotatingSeven' ) ) ) ) ) )* ) ) ) otherlv_6= '}' )
            // InternalGame.g:322:3: () otherlv_1= 'rotatingCards' otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_rotatingZero_4_0= 'rotatingZero' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rotatingSeven_5_0= 'rotatingSeven' ) ) ) ) ) )* ) ) ) otherlv_6= '}'
            {
            // InternalGame.g:322:3: ()
            // InternalGame.g:323:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRotatingCardsAccess().getRotatingCardsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRotatingCardsAccess().getRotatingCardsKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getRotatingCardsAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGame.g:337:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_rotatingZero_4_0= 'rotatingZero' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rotatingSeven_5_0= 'rotatingSeven' ) ) ) ) ) )* ) ) )
            // InternalGame.g:338:4: ( ( ( ({...}? => ( ({...}? => ( (lv_rotatingZero_4_0= 'rotatingZero' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rotatingSeven_5_0= 'rotatingSeven' ) ) ) ) ) )* ) )
            {
            // InternalGame.g:338:4: ( ( ( ({...}? => ( ({...}? => ( (lv_rotatingZero_4_0= 'rotatingZero' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rotatingSeven_5_0= 'rotatingSeven' ) ) ) ) ) )* ) )
            // InternalGame.g:339:5: ( ( ({...}? => ( ({...}? => ( (lv_rotatingZero_4_0= 'rotatingZero' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rotatingSeven_5_0= 'rotatingSeven' ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getRotatingCardsAccess().getUnorderedGroup_3());
            				
            // InternalGame.g:342:5: ( ( ({...}? => ( ({...}? => ( (lv_rotatingZero_4_0= 'rotatingZero' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rotatingSeven_5_0= 'rotatingSeven' ) ) ) ) ) )* )
            // InternalGame.g:343:6: ( ({...}? => ( ({...}? => ( (lv_rotatingZero_4_0= 'rotatingZero' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rotatingSeven_5_0= 'rotatingSeven' ) ) ) ) ) )*
            {
            // InternalGame.g:343:6: ( ({...}? => ( ({...}? => ( (lv_rotatingZero_4_0= 'rotatingZero' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_rotatingSeven_5_0= 'rotatingSeven' ) ) ) ) ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( LA3_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getRotatingCardsAccess().getUnorderedGroup_3(), 0) ) {
                    alt3=1;
                }
                else if ( LA3_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getRotatingCardsAccess().getUnorderedGroup_3(), 1) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGame.g:344:4: ({...}? => ( ({...}? => ( (lv_rotatingZero_4_0= 'rotatingZero' ) ) ) ) )
            	    {
            	    // InternalGame.g:344:4: ({...}? => ( ({...}? => ( (lv_rotatingZero_4_0= 'rotatingZero' ) ) ) ) )
            	    // InternalGame.g:345:5: {...}? => ( ({...}? => ( (lv_rotatingZero_4_0= 'rotatingZero' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRotatingCardsAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleRotatingCards", "getUnorderedGroupHelper().canSelect(grammarAccess.getRotatingCardsAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalGame.g:345:110: ( ({...}? => ( (lv_rotatingZero_4_0= 'rotatingZero' ) ) ) )
            	    // InternalGame.g:346:6: ({...}? => ( (lv_rotatingZero_4_0= 'rotatingZero' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getRotatingCardsAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalGame.g:349:9: ({...}? => ( (lv_rotatingZero_4_0= 'rotatingZero' ) ) )
            	    // InternalGame.g:349:10: {...}? => ( (lv_rotatingZero_4_0= 'rotatingZero' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRotatingCards", "true");
            	    }
            	    // InternalGame.g:349:19: ( (lv_rotatingZero_4_0= 'rotatingZero' ) )
            	    // InternalGame.g:349:20: (lv_rotatingZero_4_0= 'rotatingZero' )
            	    {
            	    // InternalGame.g:349:20: (lv_rotatingZero_4_0= 'rotatingZero' )
            	    // InternalGame.g:350:10: lv_rotatingZero_4_0= 'rotatingZero'
            	    {
            	    lv_rotatingZero_4_0=(Token)match(input,19,FOLLOW_8); 

            	    										newLeafNode(lv_rotatingZero_4_0, grammarAccess.getRotatingCardsAccess().getRotatingZeroRotatingZeroKeyword_3_0_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getRotatingCardsRule());
            	    										}
            	    										setWithLastConsumed(current, "rotatingZero", lv_rotatingZero_4_0, "rotatingZero");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRotatingCardsAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalGame.g:367:4: ({...}? => ( ({...}? => ( (lv_rotatingSeven_5_0= 'rotatingSeven' ) ) ) ) )
            	    {
            	    // InternalGame.g:367:4: ({...}? => ( ({...}? => ( (lv_rotatingSeven_5_0= 'rotatingSeven' ) ) ) ) )
            	    // InternalGame.g:368:5: {...}? => ( ({...}? => ( (lv_rotatingSeven_5_0= 'rotatingSeven' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRotatingCardsAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleRotatingCards", "getUnorderedGroupHelper().canSelect(grammarAccess.getRotatingCardsAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalGame.g:368:110: ( ({...}? => ( (lv_rotatingSeven_5_0= 'rotatingSeven' ) ) ) )
            	    // InternalGame.g:369:6: ({...}? => ( (lv_rotatingSeven_5_0= 'rotatingSeven' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getRotatingCardsAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalGame.g:372:9: ({...}? => ( (lv_rotatingSeven_5_0= 'rotatingSeven' ) ) )
            	    // InternalGame.g:372:10: {...}? => ( (lv_rotatingSeven_5_0= 'rotatingSeven' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRotatingCards", "true");
            	    }
            	    // InternalGame.g:372:19: ( (lv_rotatingSeven_5_0= 'rotatingSeven' ) )
            	    // InternalGame.g:372:20: (lv_rotatingSeven_5_0= 'rotatingSeven' )
            	    {
            	    // InternalGame.g:372:20: (lv_rotatingSeven_5_0= 'rotatingSeven' )
            	    // InternalGame.g:373:10: lv_rotatingSeven_5_0= 'rotatingSeven'
            	    {
            	    lv_rotatingSeven_5_0=(Token)match(input,20,FOLLOW_8); 

            	    										newLeafNode(lv_rotatingSeven_5_0, grammarAccess.getRotatingCardsAccess().getRotatingSevenRotatingSevenKeyword_3_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getRotatingCardsRule());
            	    										}
            	    										setWithLastConsumed(current, "rotatingSeven", lv_rotatingSeven_5_0, "rotatingSeven");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRotatingCardsAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getRotatingCardsAccess().getUnorderedGroup_3());
            				

            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getRotatingCardsAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRotatingCards"


    // $ANTLR start "entryRulePlayingSameCards"
    // InternalGame.g:405:1: entryRulePlayingSameCards returns [EObject current=null] : iv_rulePlayingSameCards= rulePlayingSameCards EOF ;
    public final EObject entryRulePlayingSameCards() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlayingSameCards = null;


        try {
            // InternalGame.g:405:57: (iv_rulePlayingSameCards= rulePlayingSameCards EOF )
            // InternalGame.g:406:2: iv_rulePlayingSameCards= rulePlayingSameCards EOF
            {
             newCompositeNode(grammarAccess.getPlayingSameCardsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlayingSameCards=rulePlayingSameCards();

            state._fsp--;

             current =iv_rulePlayingSameCards; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlayingSameCards"


    // $ANTLR start "rulePlayingSameCards"
    // InternalGame.g:412:1: rulePlayingSameCards returns [EObject current=null] : (otherlv_0= 'playingSameCards' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_sameNumber_3_0= 'sameNumber' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sameColor_4_0= 'sameColor' ) ) ) ) ) )+ {...}?) ) ) otherlv_5= '}' ) ;
    public final EObject rulePlayingSameCards() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_sameNumber_3_0=null;
        Token lv_sameColor_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalGame.g:418:2: ( (otherlv_0= 'playingSameCards' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_sameNumber_3_0= 'sameNumber' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sameColor_4_0= 'sameColor' ) ) ) ) ) )+ {...}?) ) ) otherlv_5= '}' ) )
            // InternalGame.g:419:2: (otherlv_0= 'playingSameCards' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_sameNumber_3_0= 'sameNumber' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sameColor_4_0= 'sameColor' ) ) ) ) ) )+ {...}?) ) ) otherlv_5= '}' )
            {
            // InternalGame.g:419:2: (otherlv_0= 'playingSameCards' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_sameNumber_3_0= 'sameNumber' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sameColor_4_0= 'sameColor' ) ) ) ) ) )+ {...}?) ) ) otherlv_5= '}' )
            // InternalGame.g:420:3: otherlv_0= 'playingSameCards' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_sameNumber_3_0= 'sameNumber' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sameColor_4_0= 'sameColor' ) ) ) ) ) )+ {...}?) ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPlayingSameCardsAccess().getPlayingSameCardsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getPlayingSameCardsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGame.g:428:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_sameNumber_3_0= 'sameNumber' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sameColor_4_0= 'sameColor' ) ) ) ) ) )+ {...}?) ) )
            // InternalGame.g:429:4: ( ( ( ({...}? => ( ({...}? => ( (lv_sameNumber_3_0= 'sameNumber' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sameColor_4_0= 'sameColor' ) ) ) ) ) )+ {...}?) )
            {
            // InternalGame.g:429:4: ( ( ( ({...}? => ( ({...}? => ( (lv_sameNumber_3_0= 'sameNumber' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sameColor_4_0= 'sameColor' ) ) ) ) ) )+ {...}?) )
            // InternalGame.g:430:5: ( ( ({...}? => ( ({...}? => ( (lv_sameNumber_3_0= 'sameNumber' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sameColor_4_0= 'sameColor' ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getPlayingSameCardsAccess().getUnorderedGroup_2());
            				
            // InternalGame.g:433:5: ( ( ({...}? => ( ({...}? => ( (lv_sameNumber_3_0= 'sameNumber' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sameColor_4_0= 'sameColor' ) ) ) ) ) )+ {...}?)
            // InternalGame.g:434:6: ( ({...}? => ( ({...}? => ( (lv_sameNumber_3_0= 'sameNumber' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sameColor_4_0= 'sameColor' ) ) ) ) ) )+ {...}?
            {
            // InternalGame.g:434:6: ( ({...}? => ( ({...}? => ( (lv_sameNumber_3_0= 'sameNumber' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sameColor_4_0= 'sameColor' ) ) ) ) ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( LA4_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayingSameCardsAccess().getUnorderedGroup_2(), 0) ) {
                    alt4=1;
                }
                else if ( LA4_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getPlayingSameCardsAccess().getUnorderedGroup_2(), 1) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGame.g:435:4: ({...}? => ( ({...}? => ( (lv_sameNumber_3_0= 'sameNumber' ) ) ) ) )
            	    {
            	    // InternalGame.g:435:4: ({...}? => ( ({...}? => ( (lv_sameNumber_3_0= 'sameNumber' ) ) ) ) )
            	    // InternalGame.g:436:5: {...}? => ( ({...}? => ( (lv_sameNumber_3_0= 'sameNumber' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPlayingSameCardsAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePlayingSameCards", "getUnorderedGroupHelper().canSelect(grammarAccess.getPlayingSameCardsAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalGame.g:436:113: ( ({...}? => ( (lv_sameNumber_3_0= 'sameNumber' ) ) ) )
            	    // InternalGame.g:437:6: ({...}? => ( (lv_sameNumber_3_0= 'sameNumber' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPlayingSameCardsAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalGame.g:440:9: ({...}? => ( (lv_sameNumber_3_0= 'sameNumber' ) ) )
            	    // InternalGame.g:440:10: {...}? => ( (lv_sameNumber_3_0= 'sameNumber' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePlayingSameCards", "true");
            	    }
            	    // InternalGame.g:440:19: ( (lv_sameNumber_3_0= 'sameNumber' ) )
            	    // InternalGame.g:440:20: (lv_sameNumber_3_0= 'sameNumber' )
            	    {
            	    // InternalGame.g:440:20: (lv_sameNumber_3_0= 'sameNumber' )
            	    // InternalGame.g:441:10: lv_sameNumber_3_0= 'sameNumber'
            	    {
            	    lv_sameNumber_3_0=(Token)match(input,22,FOLLOW_10); 

            	    										newLeafNode(lv_sameNumber_3_0, grammarAccess.getPlayingSameCardsAccess().getSameNumberSameNumberKeyword_2_0_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getPlayingSameCardsRule());
            	    										}
            	    										setWithLastConsumed(current, "sameNumber", lv_sameNumber_3_0, "sameNumber");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPlayingSameCardsAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalGame.g:458:4: ({...}? => ( ({...}? => ( (lv_sameColor_4_0= 'sameColor' ) ) ) ) )
            	    {
            	    // InternalGame.g:458:4: ({...}? => ( ({...}? => ( (lv_sameColor_4_0= 'sameColor' ) ) ) ) )
            	    // InternalGame.g:459:5: {...}? => ( ({...}? => ( (lv_sameColor_4_0= 'sameColor' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPlayingSameCardsAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePlayingSameCards", "getUnorderedGroupHelper().canSelect(grammarAccess.getPlayingSameCardsAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalGame.g:459:113: ( ({...}? => ( (lv_sameColor_4_0= 'sameColor' ) ) ) )
            	    // InternalGame.g:460:6: ({...}? => ( (lv_sameColor_4_0= 'sameColor' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPlayingSameCardsAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalGame.g:463:9: ({...}? => ( (lv_sameColor_4_0= 'sameColor' ) ) )
            	    // InternalGame.g:463:10: {...}? => ( (lv_sameColor_4_0= 'sameColor' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePlayingSameCards", "true");
            	    }
            	    // InternalGame.g:463:19: ( (lv_sameColor_4_0= 'sameColor' ) )
            	    // InternalGame.g:463:20: (lv_sameColor_4_0= 'sameColor' )
            	    {
            	    // InternalGame.g:463:20: (lv_sameColor_4_0= 'sameColor' )
            	    // InternalGame.g:464:10: lv_sameColor_4_0= 'sameColor'
            	    {
            	    lv_sameColor_4_0=(Token)match(input,23,FOLLOW_10); 

            	    										newLeafNode(lv_sameColor_4_0, grammarAccess.getPlayingSameCardsAccess().getSameColorSameColorKeyword_2_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getPlayingSameCardsRule());
            	    										}
            	    										setWithLastConsumed(current, "sameColor", lv_sameColor_4_0, "sameColor");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPlayingSameCardsAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getPlayingSameCardsAccess().getUnorderedGroup_2()) ) {
                throw new FailedPredicateException(input, "rulePlayingSameCards", "getUnorderedGroupHelper().canLeave(grammarAccess.getPlayingSameCardsAccess().getUnorderedGroup_2())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getPlayingSameCardsAccess().getUnorderedGroup_2());
            				

            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPlayingSameCardsAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlayingSameCards"


    // $ANTLR start "entryRuleDraw"
    // InternalGame.g:497:1: entryRuleDraw returns [EObject current=null] : iv_ruleDraw= ruleDraw EOF ;
    public final EObject entryRuleDraw() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDraw = null;


        try {
            // InternalGame.g:497:45: (iv_ruleDraw= ruleDraw EOF )
            // InternalGame.g:498:2: iv_ruleDraw= ruleDraw EOF
            {
             newCompositeNode(grammarAccess.getDrawRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDraw=ruleDraw();

            state._fsp--;

             current =iv_ruleDraw; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDraw"


    // $ANTLR start "ruleDraw"
    // InternalGame.g:504:1: ruleDraw returns [EObject current=null] : (otherlv_0= 'draw' otherlv_1= '{' ( ( (lv_oneCard_2_0= 'oneCard' ) ) | ( (lv_threeCards_3_0= 'threeCards' ) ) ) otherlv_4= '}' ) ;
    public final EObject ruleDraw() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_oneCard_2_0=null;
        Token lv_threeCards_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalGame.g:510:2: ( (otherlv_0= 'draw' otherlv_1= '{' ( ( (lv_oneCard_2_0= 'oneCard' ) ) | ( (lv_threeCards_3_0= 'threeCards' ) ) ) otherlv_4= '}' ) )
            // InternalGame.g:511:2: (otherlv_0= 'draw' otherlv_1= '{' ( ( (lv_oneCard_2_0= 'oneCard' ) ) | ( (lv_threeCards_3_0= 'threeCards' ) ) ) otherlv_4= '}' )
            {
            // InternalGame.g:511:2: (otherlv_0= 'draw' otherlv_1= '{' ( ( (lv_oneCard_2_0= 'oneCard' ) ) | ( (lv_threeCards_3_0= 'threeCards' ) ) ) otherlv_4= '}' )
            // InternalGame.g:512:3: otherlv_0= 'draw' otherlv_1= '{' ( ( (lv_oneCard_2_0= 'oneCard' ) ) | ( (lv_threeCards_3_0= 'threeCards' ) ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDrawAccess().getDrawKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getDrawAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGame.g:520:3: ( ( (lv_oneCard_2_0= 'oneCard' ) ) | ( (lv_threeCards_3_0= 'threeCards' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==25) ) {
                alt5=1;
            }
            else if ( (LA5_0==26) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalGame.g:521:4: ( (lv_oneCard_2_0= 'oneCard' ) )
                    {
                    // InternalGame.g:521:4: ( (lv_oneCard_2_0= 'oneCard' ) )
                    // InternalGame.g:522:5: (lv_oneCard_2_0= 'oneCard' )
                    {
                    // InternalGame.g:522:5: (lv_oneCard_2_0= 'oneCard' )
                    // InternalGame.g:523:6: lv_oneCard_2_0= 'oneCard'
                    {
                    lv_oneCard_2_0=(Token)match(input,25,FOLLOW_7); 

                    						newLeafNode(lv_oneCard_2_0, grammarAccess.getDrawAccess().getOneCardOneCardKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDrawRule());
                    						}
                    						setWithLastConsumed(current, "oneCard", lv_oneCard_2_0, "oneCard");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGame.g:536:4: ( (lv_threeCards_3_0= 'threeCards' ) )
                    {
                    // InternalGame.g:536:4: ( (lv_threeCards_3_0= 'threeCards' ) )
                    // InternalGame.g:537:5: (lv_threeCards_3_0= 'threeCards' )
                    {
                    // InternalGame.g:537:5: (lv_threeCards_3_0= 'threeCards' )
                    // InternalGame.g:538:6: lv_threeCards_3_0= 'threeCards'
                    {
                    lv_threeCards_3_0=(Token)match(input,26,FOLLOW_7); 

                    						newLeafNode(lv_threeCards_3_0, grammarAccess.getDrawAccess().getThreeCardsThreeCardsKeyword_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDrawRule());
                    						}
                    						setWithLastConsumed(current, "threeCards", lv_threeCards_3_0, "threeCards");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDrawAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDraw"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000124A000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000124E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000184000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000C04000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000006000000L});

}
