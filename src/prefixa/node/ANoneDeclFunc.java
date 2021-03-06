/* This file was generated by SableCC (http://www.sablecc.org/). */

package prefixa.node;

import prefixa.analysis.*;

@SuppressWarnings("nls")
public final class ANoneDeclFunc extends PDeclFunc
{
    private TNoneId _noneId_;
    private TIdentifier _identifier_;
    private PDeclParametros _declParametros_;
    private PBlocoFuncao _blocoFuncao_;

    public ANoneDeclFunc()
    {
        // Constructor
    }

    public ANoneDeclFunc(
        @SuppressWarnings("hiding") TNoneId _noneId_,
        @SuppressWarnings("hiding") TIdentifier _identifier_,
        @SuppressWarnings("hiding") PDeclParametros _declParametros_,
        @SuppressWarnings("hiding") PBlocoFuncao _blocoFuncao_)
    {
        // Constructor
        setNoneId(_noneId_);

        setIdentifier(_identifier_);

        setDeclParametros(_declParametros_);

        setBlocoFuncao(_blocoFuncao_);

    }

    @Override
    public Object clone()
    {
        return new ANoneDeclFunc(
            cloneNode(this._noneId_),
            cloneNode(this._identifier_),
            cloneNode(this._declParametros_),
            cloneNode(this._blocoFuncao_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANoneDeclFunc(this);
    }

    public TNoneId getNoneId()
    {
        return this._noneId_;
    }

    public void setNoneId(TNoneId node)
    {
        if(this._noneId_ != null)
        {
            this._noneId_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._noneId_ = node;
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
            + toString(this._noneId_)
            + toString(this._identifier_)
            + toString(this._declParametros_)
            + toString(this._blocoFuncao_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._noneId_ == child)
        {
            this._noneId_ = null;
            return;
        }

        if(this._identifier_ == child)
        {
            this._identifier_ = null;
            return;
        }

        if(this._declParametros_ == child)
        {
            this._declParametros_ = null;
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
        if(this._noneId_ == oldChild)
        {
            setNoneId((TNoneId) newChild);
            return;
        }

        if(this._identifier_ == oldChild)
        {
            setIdentifier((TIdentifier) newChild);
            return;
        }

        if(this._declParametros_ == oldChild)
        {
            setDeclParametros((PDeclParametros) newChild);
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
