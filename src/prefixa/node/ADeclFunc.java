/* This file was generated by SableCC (http://www.sablecc.org/). */

package prefixa.node;

import prefixa.analysis.*;

@SuppressWarnings("nls")
public final class ADeclFunc extends PDeclFunc
{
    private PTipoRetornoFunc _tipoRetornoFunc_;
    private TIdentifier _identifier_;
    private TLPar _lPar_;
    private PDeclParametros _declParametros_;
    private TRPar _rPar_;
    private PBlocoFuncao _blocoFuncao_;

    public ADeclFunc()
    {
        // Constructor
    }

    public ADeclFunc(
        @SuppressWarnings("hiding") PTipoRetornoFunc _tipoRetornoFunc_,
        @SuppressWarnings("hiding") TIdentifier _identifier_,
        @SuppressWarnings("hiding") TLPar _lPar_,
        @SuppressWarnings("hiding") PDeclParametros _declParametros_,
        @SuppressWarnings("hiding") TRPar _rPar_,
        @SuppressWarnings("hiding") PBlocoFuncao _blocoFuncao_)
    {
        // Constructor
        setTipoRetornoFunc(_tipoRetornoFunc_);

        setIdentifier(_identifier_);

        setLPar(_lPar_);

        setDeclParametros(_declParametros_);

        setRPar(_rPar_);

        setBlocoFuncao(_blocoFuncao_);

    }

    @Override
    public Object clone()
    {
        return new ADeclFunc(
            cloneNode(this._tipoRetornoFunc_),
            cloneNode(this._identifier_),
            cloneNode(this._lPar_),
            cloneNode(this._declParametros_),
            cloneNode(this._rPar_),
            cloneNode(this._blocoFuncao_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADeclFunc(this);
    }

    public PTipoRetornoFunc getTipoRetornoFunc()
    {
        return this._tipoRetornoFunc_;
    }

    public void setTipoRetornoFunc(PTipoRetornoFunc node)
    {
        if(this._tipoRetornoFunc_ != null)
        {
            this._tipoRetornoFunc_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tipoRetornoFunc_ = node;
    }

    public TIdentifier getIdentifier()
    {
        return this._identifier_;
    }

    public void setIdentifier(TIdentifier node)
    {
        if(this._identifier_ != null)
        {
            this._identifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._identifier_ = node;
    }

    public TLPar getLPar()
    {
        return this._lPar_;
    }

    public void setLPar(TLPar node)
    {
        if(this._lPar_ != null)
        {
            this._lPar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lPar_ = node;
    }

    public PDeclParametros getDeclParametros()
    {
        return this._declParametros_;
    }

    public void setDeclParametros(PDeclParametros node)
    {
        if(this._declParametros_ != null)
        {
            this._declParametros_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._declParametros_ = node;
    }

    public TRPar getRPar()
    {
        return this._rPar_;
    }

    public void setRPar(TRPar node)
    {
        if(this._rPar_ != null)
        {
            this._rPar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rPar_ = node;
    }

    public PBlocoFuncao getBlocoFuncao()
    {
        return this._blocoFuncao_;
    }

    public void setBlocoFuncao(PBlocoFuncao node)
    {
        if(this._blocoFuncao_ != null)
        {
            this._blocoFuncao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._blocoFuncao_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._tipoRetornoFunc_)
            + toString(this._identifier_)
            + toString(this._lPar_)
            + toString(this._declParametros_)
            + toString(this._rPar_)
            + toString(this._blocoFuncao_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tipoRetornoFunc_ == child)
        {
            this._tipoRetornoFunc_ = null;
            return;
        }

        if(this._identifier_ == child)
        {
            this._identifier_ = null;
            return;
        }

        if(this._lPar_ == child)
        {
            this._lPar_ = null;
            return;
        }

        if(this._declParametros_ == child)
        {
            this._declParametros_ = null;
            return;
        }

        if(this._rPar_ == child)
        {
            this._rPar_ = null;
            return;
        }

        if(this._blocoFuncao_ == child)
        {
            this._blocoFuncao_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._tipoRetornoFunc_ == oldChild)
        {
            setTipoRetornoFunc((PTipoRetornoFunc) newChild);
            return;
        }

        if(this._identifier_ == oldChild)
        {
            setIdentifier((TIdentifier) newChild);
            return;
        }

        if(this._lPar_ == oldChild)
        {
            setLPar((TLPar) newChild);
            return;
        }

        if(this._declParametros_ == oldChild)
        {
            setDeclParametros((PDeclParametros) newChild);
            return;
        }

        if(this._rPar_ == oldChild)
        {
            setRPar((TRPar) newChild);
            return;
        }

        if(this._blocoFuncao_ == oldChild)
        {
            setBlocoFuncao((PBlocoFuncao) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}