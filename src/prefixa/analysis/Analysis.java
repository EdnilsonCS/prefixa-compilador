/* This file was generated by SableCC (http://www.sablecc.org/). */

package prefixa.analysis;

import prefixa.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseAPrograma(APrograma node);
    void caseATipoDeclFunc(ATipoDeclFunc node);
    void caseANoneDeclFunc(ANoneDeclFunc node);
    void caseADeclParametros(ADeclParametros node);
    void caseADeclParamAdicional(ADeclParamAdicional node);
    void caseADeclParametro(ADeclParametro node);
    void caseAParametros(AParametros node);
    void caseAParamAdicional(AParamAdicional node);
    void caseADeclVar(ADeclVar node);
    void caseAIdAdicional(AIdAdicional node);
    void caseATipo(ATipo node);
    void caseAIntTipoBase(AIntTipoBase node);
    void caseACharTipoBase(ACharTipoBase node);
    void caseABoolTipoBase(ABoolTipoBase node);
    void caseAVectorComandoAtrib(AVectorComandoAtrib node);
    void caseAIdComandoAtrib(AIdComandoAtrib node);
    void caseAIntValor(AIntValor node);
    void caseARealValor(ARealValor node);
    void caseABoolValor(ABoolValor node);
    void caseAIdValor(AIdValor node);
    void caseAOperacaoStmt(AOperacaoStmt node);
    void caseAChamadaStmt(AChamadaStmt node);
    void caseAIdStmt(AIdStmt node);
    void caseAConstStmt(AConstStmt node);
    void caseAVectorStmt(AVectorStmt node);
    void caseASomaOperacao(ASomaOperacao node);
    void caseAMenosOperacao(AMenosOperacao node);
    void caseAMultOperacao(AMultOperacao node);
    void caseADivOperacao(ADivOperacao node);
    void caseAIgualQueOperacao(AIgualQueOperacao node);
    void caseAMenorIgualQueOperacao(AMenorIgualQueOperacao node);
    void caseAMaiorIgualQueOperacao(AMaiorIgualQueOperacao node);
    void caseAMenorQueOperacao(AMenorQueOperacao node);
    void caseAMaiorQueOperacao(AMaiorQueOperacao node);
    void caseAAndIdOperacao(AAndIdOperacao node);
    void caseAOrIdOperacao(AOrIdOperacao node);
    void caseANotIdOperacao(ANotIdOperacao node);
    void caseAChamada(AChamada node);
    void caseAIfComando(AIfComando node);
    void caseAWhileComando(AWhileComando node);
    void caseAForeachComando(AForeachComando node);
    void caseABlocoComando(ABlocoComando node);
    void caseAExpReturnComando(AExpReturnComando node);
    void caseAComandoAtribComando(AComandoAtribComando node);
    void caseAChamadaComando(AChamadaComando node);
    void caseABlocoFuncao(ABlocoFuncao node);
    void caseAExpReturn(AExpReturn node);
    void caseAIntdecConstante(AIntdecConstante node);
    void caseAIntbinConstante(AIntbinConstante node);
    void caseAInthexConstante(AInthexConstante node);
    void caseACharConstante(ACharConstante node);
    void caseAStringConstante(AStringConstante node);
    void caseABooltrueConstante(ABooltrueConstante node);
    void caseABoolfalseConstante(ABoolfalseConstante node);

    void caseTVazio(TVazio node);
    void caseTAtribuicao(TAtribuicao node);
    void caseTCharId(TCharId node);
    void caseTIntId(TIntId node);
    void caseTBoolId(TBoolId node);
    void caseTRealId(TRealId node);
    void caseTBarraId(TBarraId node);
    void caseTIfId(TIfId node);
    void caseTElseId(TElseId node);
    void caseTStartBlockId(TStartBlockId node);
    void caseTEndBlockId(TEndBlockId node);
    void caseTNotId(TNotId node);
    void caseTAndId(TAndId node);
    void caseTOrId(TOrId node);
    void caseTComma(TComma node);
    void caseTNoneId(TNoneId node);
    void caseTSoma(TSoma node);
    void caseTMenos(TMenos node);
    void caseTMult(TMult node);
    void caseTDiv(TDiv node);
    void caseTMod(TMod node);
    void caseTDoubleDot(TDoubleDot node);
    void caseTBoolType(TBoolType node);
    void caseTWhile(TWhile node);
    void caseTDo(TDo node);
    void caseTForeach(TForeach node);
    void caseTLPar(TLPar node);
    void caseTRPar(TRPar node);
    void caseTLBracket(TLBracket node);
    void caseTRBracket(TRBracket node);
    void caseTLBrace(TLBrace node);
    void caseTRBrace(TRBrace node);
    void caseTIgualQue(TIgualQue node);
    void caseTMenorQue(TMenorQue node);
    void caseTMenorIgualQue(TMenorIgualQue node);
    void caseTMaiorQue(TMaiorQue node);
    void caseTMaiorIgualQue(TMaiorIgualQue node);
    void caseTSemicolon(TSemicolon node);
    void caseTTrueId(TTrueId node);
    void caseTFalseId(TFalseId node);
    void caseTVectorId(TVectorId node);
    void caseTReturn(TReturn node);
    void caseTScan(TScan node);
    void caseTPrint(TPrint node);
    void caseTString(TString node);
    void caseTCharVar(TCharVar node);
    void caseTComments(TComments node);
    void caseTLongComment(TLongComment node);
    void caseTIntType(TIntType node);
    void caseTRealType(TRealType node);
    void caseTIdentifier(TIdentifier node);
    void caseTNumber(TNumber node);
    void caseTNumeroBin(TNumeroBin node);
    void caseTHexNumber(THexNumber node);
    void caseEOF(EOF node);
}
