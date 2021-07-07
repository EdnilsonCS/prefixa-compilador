/* This file was generated by SableCC (http://www.sablecc.org/). */

package prefixa.node;

import prefixa.analysis.*;

@SuppressWarnings("nls")
public final class AWhileComando extends PComando
{
    private PStmt _stmt_;
    private PComando _comando_;

    public AWhileComando()
    {
        // Constructor
    }

    public AWhileComando(
        @SuppressWarnings("hiding") PStmt _stmt_,
        @SuppressWarnings("hiding") PComando _comando_)
    {
        // Constructor
        setStmt(_stmt_);

        setComando(_comando_);

    }

    @Override
    public Object clone()
    {
        return new AWhileComando(
            cloneNode(this._stmt_),
            cloneNode(this._comando_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAWhileComando(this);
    }

    public PStmt getStmt()
    {
        return this._stmt_;
    }

    public void setStmt(PStmt node)
    {
        if(this._stmt_ != null)
        {
            this._stmt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._stmt_ = node;
    }

    public PComando getComando()
    {
        return this._comando_;
    }

    public void setComando(PComando node)
    {
        if(this._comando_ != null)
        {
            this._comando_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comando_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._stmt_)
            + toString(this._comando_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._stmt_ == child)
        {
            this._stmt_ = null;
            return;
        }

        if(this._comando_ == child)
        {
            this._comando_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._stmt_ == oldChild)
        {
            setStmt((PStmt) newChild);
            return;
        }

        if(this._comando_ == oldChild)
        {
            setComando((PComando) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}