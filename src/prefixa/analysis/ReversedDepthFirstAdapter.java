/* This file was generated by SableCC (http://www.sablecc.org/). */

package prefixa.analysis;

import java.util.*;
import prefixa.node.*;

public class ReversedDepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getEOF().apply(this);
        node.getPPrograma().apply(this);
        outStart(node);
    }

    public void inAPrograma(APrograma node)
    {
        defaultIn(node);
    }

    public void outAPrograma(APrograma node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPrograma(APrograma node)
    {
        inAPrograma(node);
        {
            List<PDeclFunc> copy = new ArrayList<PDeclFunc>(node.getDeclFunc());
            Collections.reverse(copy);
            for(PDeclFunc e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PDeclVar> copy = new ArrayList<PDeclVar>(node.getDeclVar());
            Collections.reverse(copy);
            for(PDeclVar e : copy)
            {
                e.apply(this);
            }
        }
        outAPrograma(node);
    }

    public void inATipoDeclFunc(ATipoDeclFunc node)
    {
        defaultIn(node);
    }

    public void outATipoDeclFunc(ATipoDeclFunc node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATipoDeclFunc(ATipoDeclFunc node)
    {
        inATipoDeclFunc(node);
        if(node.getBlocoFuncao() != null)
        {
            node.getBlocoFuncao().apply(this);
        }
        if(node.getDeclParametros() != null)
        {
            node.getDeclParametros().apply(this);
        }
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        if(node.getTipo() != null)
        {
            node.getTipo().apply(this);
        }
        outATipoDeclFunc(node);
    }

    public void inANoneDeclFunc(ANoneDeclFunc node)
    {
        defaultIn(node);
    }

    public void outANoneDeclFunc(ANoneDeclFunc node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANoneDeclFunc(ANoneDeclFunc node)
    {
        inANoneDeclFunc(node);
        if(node.getBlocoFuncao() != null)
        {
            node.getBlocoFuncao().apply(this);
        }
        if(node.getDeclParametros() != null)
        {
            node.getDeclParametros().apply(this);
        }
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        if(node.getNoneId() != null)
        {
            node.getNoneId().apply(this);
        }
        outANoneDeclFunc(node);
    }

    public void inADeclParametros(ADeclParametros node)
    {
        defaultIn(node);
    }

    public void outADeclParametros(ADeclParametros node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADeclParametros(ADeclParametros node)
    {
        inADeclParametros(node);
        {
            List<PDeclParamAdicional> copy = new ArrayList<PDeclParamAdicional>(node.getDeclParamAdicional());
            Collections.reverse(copy);
            for(PDeclParamAdicional e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        if(node.getTipo() != null)
        {
            node.getTipo().apply(this);
        }
        outADeclParametros(node);
    }

    public void inADeclParamAdicional(ADeclParamAdicional node)
    {
        defaultIn(node);
    }

    public void outADeclParamAdicional(ADeclParamAdicional node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADeclParamAdicional(ADeclParamAdicional node)
    {
        inADeclParamAdicional(node);
        if(node.getDeclParametro() != null)
        {
            node.getDeclParametro().apply(this);
        }
        outADeclParamAdicional(node);
    }

    public void inADeclParametro(ADeclParametro node)
    {
        defaultIn(node);
    }

    public void outADeclParametro(ADeclParametro node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADeclParametro(ADeclParametro node)
    {
        inADeclParametro(node);
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        if(node.getTipo() != null)
        {
            node.getTipo().apply(this);
        }
        outADeclParametro(node);
    }

    public void inAParametros(AParametros node)
    {
        defaultIn(node);
    }

    public void outAParametros(AParametros node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParametros(AParametros node)
    {
        inAParametros(node);
        {
            List<PParamAdicional> copy = new ArrayList<PParamAdicional>(node.getParamAdicional());
            Collections.reverse(copy);
            for(PParamAdicional e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getStmt() != null)
        {
            node.getStmt().apply(this);
        }
        outAParametros(node);
    }

    public void inAParamAdicional(AParamAdicional node)
    {
        defaultIn(node);
    }

    public void outAParamAdicional(AParamAdicional node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParamAdicional(AParamAdicional node)
    {
        inAParamAdicional(node);
        if(node.getStmt() != null)
        {
            node.getStmt().apply(this);
        }
        outAParamAdicional(node);
    }

    public void inADeclVar(ADeclVar node)
    {
        defaultIn(node);
    }

    public void outADeclVar(ADeclVar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADeclVar(ADeclVar node)
    {
        inADeclVar(node);
        {
            List<PIdAdicional> copy = new ArrayList<PIdAdicional>(node.getIdAdicional());
            Collections.reverse(copy);
            for(PIdAdicional e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        if(node.getTipo() != null)
        {
            node.getTipo().apply(this);
        }
        outADeclVar(node);
    }

    public void inAIdAdicional(AIdAdicional node)
    {
        defaultIn(node);
    }

    public void outAIdAdicional(AIdAdicional node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdAdicional(AIdAdicional node)
    {
        inAIdAdicional(node);
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outAIdAdicional(node);
    }

    public void inATipo(ATipo node)
    {
        defaultIn(node);
    }

    public void outATipo(ATipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATipo(ATipo node)
    {
        inATipo(node);
        if(node.getStmt() != null)
        {
            node.getStmt().apply(this);
        }
        if(node.getTipoBase() != null)
        {
            node.getTipoBase().apply(this);
        }
        outATipo(node);
    }

    public void inAIntTipoBase(AIntTipoBase node)
    {
        defaultIn(node);
    }

    public void outAIntTipoBase(AIntTipoBase node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIntTipoBase(AIntTipoBase node)
    {
        inAIntTipoBase(node);
        if(node.getIntId() != null)
        {
            node.getIntId().apply(this);
        }
        outAIntTipoBase(node);
    }

    public void inACharTipoBase(ACharTipoBase node)
    {
        defaultIn(node);
    }

    public void outACharTipoBase(ACharTipoBase node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACharTipoBase(ACharTipoBase node)
    {
        inACharTipoBase(node);
        if(node.getCharId() != null)
        {
            node.getCharId().apply(this);
        }
        outACharTipoBase(node);
    }

    public void inABoolTipoBase(ABoolTipoBase node)
    {
        defaultIn(node);
    }

    public void outABoolTipoBase(ABoolTipoBase node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABoolTipoBase(ABoolTipoBase node)
    {
        inABoolTipoBase(node);
        if(node.getBoolId() != null)
        {
            node.getBoolId().apply(this);
        }
        outABoolTipoBase(node);
    }

    public void inAVectorComandoAtrib(AVectorComandoAtrib node)
    {
        defaultIn(node);
    }

    public void outAVectorComandoAtrib(AVectorComandoAtrib node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVectorComandoAtrib(AVectorComandoAtrib node)
    {
        inAVectorComandoAtrib(node);
        if(node.getStmt() != null)
        {
            node.getStmt().apply(this);
        }
        if(node.getIndex() != null)
        {
            node.getIndex().apply(this);
        }
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outAVectorComandoAtrib(node);
    }

    public void inAIdComandoAtrib(AIdComandoAtrib node)
    {
        defaultIn(node);
    }

    public void outAIdComandoAtrib(AIdComandoAtrib node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdComandoAtrib(AIdComandoAtrib node)
    {
        inAIdComandoAtrib(node);
        if(node.getStmt() != null)
        {
            node.getStmt().apply(this);
        }
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outAIdComandoAtrib(node);
    }

    public void inAIntValor(AIntValor node)
    {
        defaultIn(node);
    }

    public void outAIntValor(AIntValor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIntValor(AIntValor node)
    {
        inAIntValor(node);
        if(node.getIntType() != null)
        {
            node.getIntType().apply(this);
        }
        outAIntValor(node);
    }

    public void inARealValor(ARealValor node)
    {
        defaultIn(node);
    }

    public void outARealValor(ARealValor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARealValor(ARealValor node)
    {
        inARealValor(node);
        if(node.getRealType() != null)
        {
            node.getRealType().apply(this);
        }
        outARealValor(node);
    }

    public void inABoolValor(ABoolValor node)
    {
        defaultIn(node);
    }

    public void outABoolValor(ABoolValor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABoolValor(ABoolValor node)
    {
        inABoolValor(node);
        if(node.getBoolType() != null)
        {
            node.getBoolType().apply(this);
        }
        outABoolValor(node);
    }

    public void inAIdValor(AIdValor node)
    {
        defaultIn(node);
    }

    public void outAIdValor(AIdValor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdValor(AIdValor node)
    {
        inAIdValor(node);
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outAIdValor(node);
    }

    public void inAOperacaoStmt(AOperacaoStmt node)
    {
        defaultIn(node);
    }

    public void outAOperacaoStmt(AOperacaoStmt node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAOperacaoStmt(AOperacaoStmt node)
    {
        inAOperacaoStmt(node);
        if(node.getOperacao() != null)
        {
            node.getOperacao().apply(this);
        }
        outAOperacaoStmt(node);
    }

    public void inAChamadaStmt(AChamadaStmt node)
    {
        defaultIn(node);
    }

    public void outAChamadaStmt(AChamadaStmt node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAChamadaStmt(AChamadaStmt node)
    {
        inAChamadaStmt(node);
        if(node.getChamada() != null)
        {
            node.getChamada().apply(this);
        }
        outAChamadaStmt(node);
    }

    public void inAIdStmt(AIdStmt node)
    {
        defaultIn(node);
    }

    public void outAIdStmt(AIdStmt node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdStmt(AIdStmt node)
    {
        inAIdStmt(node);
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outAIdStmt(node);
    }

    public void inAConstStmt(AConstStmt node)
    {
        defaultIn(node);
    }

    public void outAConstStmt(AConstStmt node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAConstStmt(AConstStmt node)
    {
        inAConstStmt(node);
        if(node.getConstante() != null)
        {
            node.getConstante().apply(this);
        }
        outAConstStmt(node);
    }

    public void inAVectorStmt(AVectorStmt node)
    {
        defaultIn(node);
    }

    public void outAVectorStmt(AVectorStmt node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVectorStmt(AVectorStmt node)
    {
        inAVectorStmt(node);
        if(node.getStmt() != null)
        {
            node.getStmt().apply(this);
        }
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outAVectorStmt(node);
    }

    public void inASomaOperacao(ASomaOperacao node)
    {
        defaultIn(node);
    }

    public void outASomaOperacao(ASomaOperacao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASomaOperacao(ASomaOperacao node)
    {
        inASomaOperacao(node);
        if(node.getStmtR() != null)
        {
            node.getStmtR().apply(this);
        }
        if(node.getStmt() != null)
        {
            node.getStmt().apply(this);
        }
        outASomaOperacao(node);
    }

    public void inAMenosOperacao(AMenosOperacao node)
    {
        defaultIn(node);
    }

    public void outAMenosOperacao(AMenosOperacao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMenosOperacao(AMenosOperacao node)
    {
        inAMenosOperacao(node);
        if(node.getStmtR() != null)
        {
            node.getStmtR().apply(this);
        }
        if(node.getStmt() != null)
        {
            node.getStmt().apply(this);
        }
        outAMenosOperacao(node);
    }

    public void inAMultOperacao(AMultOperacao node)
    {
        defaultIn(node);
    }

    public void outAMultOperacao(AMultOperacao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultOperacao(AMultOperacao node)
    {
        inAMultOperacao(node);
        if(node.getStmtR() != null)
        {
            node.getStmtR().apply(this);
        }
        if(node.getStmt() != null)
        {
            node.getStmt().apply(this);
        }
        outAMultOperacao(node);
    }

    public void inADivOperacao(ADivOperacao node)
    {
        defaultIn(node);
    }

    public void outADivOperacao(ADivOperacao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADivOperacao(ADivOperacao node)
    {
        inADivOperacao(node);
        if(node.getStmtR() != null)
        {
            node.getStmtR().apply(this);
        }
        if(node.getStmt() != null)
        {
            node.getStmt().apply(this);
        }
        outADivOperacao(node);
    }

    public void inAIgualQueOperacao(AIgualQueOperacao node)
    {
        defaultIn(node);
    }

    public void outAIgualQueOperacao(AIgualQueOperacao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIgualQueOperacao(AIgualQueOperacao node)
    {
        inAIgualQueOperacao(node);
        if(node.getStmtR() != null)
        {
            node.getStmtR().apply(this);
        }
        if(node.getStmt() != null)
        {
            node.getStmt().apply(this);
        }
        outAIgualQueOperacao(node);
    }

    public void inAMenorIgualQueOperacao(AMenorIgualQueOperacao node)
    {
        defaultIn(node);
    }

    public void outAMenorIgualQueOperacao(AMenorIgualQueOperacao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMenorIgualQueOperacao(AMenorIgualQueOperacao node)
    {
        inAMenorIgualQueOperacao(node);
        if(node.getStmtR() != null)
        {
            node.getStmtR().apply(this);
        }
        if(node.getStmt() != null)
        {
            node.getStmt().apply(this);
        }
        outAMenorIgualQueOperacao(node);
    }

    public void inAMaiorIgualQueOperacao(AMaiorIgualQueOperacao node)
    {
        defaultIn(node);
    }

    public void outAMaiorIgualQueOperacao(AMaiorIgualQueOperacao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMaiorIgualQueOperacao(AMaiorIgualQueOperacao node)
    {
        inAMaiorIgualQueOperacao(node);
        if(node.getStmtR() != null)
        {
            node.getStmtR().apply(this);
        }
        if(node.getStmt() != null)
        {
            node.getStmt().apply(this);
        }
        outAMaiorIgualQueOperacao(node);
    }

    public void inAMenorQueOperacao(AMenorQueOperacao node)
    {
        defaultIn(node);
    }

    public void outAMenorQueOperacao(AMenorQueOperacao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMenorQueOperacao(AMenorQueOperacao node)
    {
        inAMenorQueOperacao(node);
        if(node.getStmtR() != null)
        {
            node.getStmtR().apply(this);
        }
        if(node.getStmt() != null)
        {
            node.getStmt().apply(this);
        }
        outAMenorQueOperacao(node);
    }

    public void inAMaiorQueOperacao(AMaiorQueOperacao node)
    {
        defaultIn(node);
    }

    public void outAMaiorQueOperacao(AMaiorQueOperacao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMaiorQueOperacao(AMaiorQueOperacao node)
    {
        inAMaiorQueOperacao(node);
        if(node.getStmtR() != null)
        {
            node.getStmtR().apply(this);
        }
        if(node.getStmt() != null)
        {
            node.getStmt().apply(this);
        }
        outAMaiorQueOperacao(node);
    }

    public void inAAndIdOperacao(AAndIdOperacao node)
    {
        defaultIn(node);
    }

    public void outAAndIdOperacao(AAndIdOperacao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAndIdOperacao(AAndIdOperacao node)
    {
        inAAndIdOperacao(node);
        if(node.getStmtR() != null)
        {
            node.getStmtR().apply(this);
        }
        if(node.getStmt() != null)
        {
            node.getStmt().apply(this);
        }
        outAAndIdOperacao(node);
    }

    public void inAOrIdOperacao(AOrIdOperacao node)
    {
        defaultIn(node);
    }

    public void outAOrIdOperacao(AOrIdOperacao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAOrIdOperacao(AOrIdOperacao node)
    {
        inAOrIdOperacao(node);
        if(node.getStmtR() != null)
        {
            node.getStmtR().apply(this);
        }
        if(node.getStmt() != null)
        {
            node.getStmt().apply(this);
        }
        outAOrIdOperacao(node);
    }

    public void inANotIdOperacao(ANotIdOperacao node)
    {
        defaultIn(node);
    }

    public void outANotIdOperacao(ANotIdOperacao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANotIdOperacao(ANotIdOperacao node)
    {
        inANotIdOperacao(node);
        if(node.getStmt() != null)
        {
            node.getStmt().apply(this);
        }
        outANotIdOperacao(node);
    }

    public void inAChamada(AChamada node)
    {
        defaultIn(node);
    }

    public void outAChamada(AChamada node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAChamada(AChamada node)
    {
        inAChamada(node);
        if(node.getParametros() != null)
        {
            node.getParametros().apply(this);
        }
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        outAChamada(node);
    }

    public void inAIfComando(AIfComando node)
    {
        defaultIn(node);
    }

    public void outAIfComando(AIfComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIfComando(AIfComando node)
    {
        inAIfComando(node);
        if(node.getElseTree() != null)
        {
            node.getElseTree().apply(this);
        }
        if(node.getComando() != null)
        {
            node.getComando().apply(this);
        }
        if(node.getStmt() != null)
        {
            node.getStmt().apply(this);
        }
        outAIfComando(node);
    }

    public void inAWhileComando(AWhileComando node)
    {
        defaultIn(node);
    }

    public void outAWhileComando(AWhileComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAWhileComando(AWhileComando node)
    {
        inAWhileComando(node);
        if(node.getComando() != null)
        {
            node.getComando().apply(this);
        }
        if(node.getStmt() != null)
        {
            node.getStmt().apply(this);
        }
        outAWhileComando(node);
    }

    public void inAForeachComando(AForeachComando node)
    {
        defaultIn(node);
    }

    public void outAForeachComando(AForeachComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAForeachComando(AForeachComando node)
    {
        inAForeachComando(node);
        if(node.getComando() != null)
        {
            node.getComando().apply(this);
        }
        if(node.getVectorid() != null)
        {
            node.getVectorid().apply(this);
        }
        if(node.getIdentifier() != null)
        {
            node.getIdentifier().apply(this);
        }
        if(node.getTipo() != null)
        {
            node.getTipo().apply(this);
        }
        outAForeachComando(node);
    }

    public void inABlocoComando(ABlocoComando node)
    {
        defaultIn(node);
    }

    public void outABlocoComando(ABlocoComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABlocoComando(ABlocoComando node)
    {
        inABlocoComando(node);
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            Collections.reverse(copy);
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PDeclVar> copy = new ArrayList<PDeclVar>(node.getDeclVar());
            Collections.reverse(copy);
            for(PDeclVar e : copy)
            {
                e.apply(this);
            }
        }
        outABlocoComando(node);
    }

    public void inAExpReturnComando(AExpReturnComando node)
    {
        defaultIn(node);
    }

    public void outAExpReturnComando(AExpReturnComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpReturnComando(AExpReturnComando node)
    {
        inAExpReturnComando(node);
        if(node.getExpReturn() != null)
        {
            node.getExpReturn().apply(this);
        }
        outAExpReturnComando(node);
    }

    public void inAComandoAtribComando(AComandoAtribComando node)
    {
        defaultIn(node);
    }

    public void outAComandoAtribComando(AComandoAtribComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAComandoAtribComando(AComandoAtribComando node)
    {
        inAComandoAtribComando(node);
        if(node.getComandoAtrib() != null)
        {
            node.getComandoAtrib().apply(this);
        }
        outAComandoAtribComando(node);
    }

    public void inAChamadaComando(AChamadaComando node)
    {
        defaultIn(node);
    }

    public void outAChamadaComando(AChamadaComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAChamadaComando(AChamadaComando node)
    {
        inAChamadaComando(node);
        if(node.getChamada() != null)
        {
            node.getChamada().apply(this);
        }
        outAChamadaComando(node);
    }

    public void inABlocoFuncao(ABlocoFuncao node)
    {
        defaultIn(node);
    }

    public void outABlocoFuncao(ABlocoFuncao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABlocoFuncao(ABlocoFuncao node)
    {
        inABlocoFuncao(node);
        if(node.getExpReturn() != null)
        {
            node.getExpReturn().apply(this);
        }
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            Collections.reverse(copy);
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PDeclVar> copy = new ArrayList<PDeclVar>(node.getDeclVar());
            Collections.reverse(copy);
            for(PDeclVar e : copy)
            {
                e.apply(this);
            }
        }
        outABlocoFuncao(node);
    }

    public void inAExpReturn(AExpReturn node)
    {
        defaultIn(node);
    }

    public void outAExpReturn(AExpReturn node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpReturn(AExpReturn node)
    {
        inAExpReturn(node);
        if(node.getStmt() != null)
        {
            node.getStmt().apply(this);
        }
        outAExpReturn(node);
    }

    public void inAIntdecConstante(AIntdecConstante node)
    {
        defaultIn(node);
    }

    public void outAIntdecConstante(AIntdecConstante node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIntdecConstante(AIntdecConstante node)
    {
        inAIntdecConstante(node);
        if(node.getNumber() != null)
        {
            node.getNumber().apply(this);
        }
        outAIntdecConstante(node);
    }

    public void inAIntbinConstante(AIntbinConstante node)
    {
        defaultIn(node);
    }

    public void outAIntbinConstante(AIntbinConstante node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIntbinConstante(AIntbinConstante node)
    {
        inAIntbinConstante(node);
        if(node.getNumeroBin() != null)
        {
            node.getNumeroBin().apply(this);
        }
        outAIntbinConstante(node);
    }

    public void inAInthexConstante(AInthexConstante node)
    {
        defaultIn(node);
    }

    public void outAInthexConstante(AInthexConstante node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAInthexConstante(AInthexConstante node)
    {
        inAInthexConstante(node);
        if(node.getHexNumber() != null)
        {
            node.getHexNumber().apply(this);
        }
        outAInthexConstante(node);
    }

    public void inACharConstante(ACharConstante node)
    {
        defaultIn(node);
    }

    public void outACharConstante(ACharConstante node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACharConstante(ACharConstante node)
    {
        inACharConstante(node);
        if(node.getCharVar() != null)
        {
            node.getCharVar().apply(this);
        }
        outACharConstante(node);
    }

    public void inAStringConstante(AStringConstante node)
    {
        defaultIn(node);
    }

    public void outAStringConstante(AStringConstante node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStringConstante(AStringConstante node)
    {
        inAStringConstante(node);
        if(node.getString() != null)
        {
            node.getString().apply(this);
        }
        outAStringConstante(node);
    }

    public void inABooltrueConstante(ABooltrueConstante node)
    {
        defaultIn(node);
    }

    public void outABooltrueConstante(ABooltrueConstante node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABooltrueConstante(ABooltrueConstante node)
    {
        inABooltrueConstante(node);
        if(node.getTrueId() != null)
        {
            node.getTrueId().apply(this);
        }
        outABooltrueConstante(node);
    }

    public void inABoolfalseConstante(ABoolfalseConstante node)
    {
        defaultIn(node);
    }

    public void outABoolfalseConstante(ABoolfalseConstante node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABoolfalseConstante(ABoolfalseConstante node)
    {
        inABoolfalseConstante(node);
        if(node.getFalseId() != null)
        {
            node.getFalseId().apply(this);
        }
        outABoolfalseConstante(node);
    }
}
