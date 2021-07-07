/* This file was generated by SableCC (http://www.sablecc.org/). */

package prefixa.node;

import prefixa.analysis.*;

@SuppressWarnings("nls")
public final class AMaiorIgualQueOperacao extends POperacao
{
    private PStmt _stmt_;
    private PStmt _stmtR_;

    public AMaiorIgualQueOperacao()
    {
        // Constructor
    }

    public AMaiorIgualQueOperacao(
        @SuppressWarnings("hiding") PStmt _stmt_,
        @SuppressWarnings("hiding") PStmt _stmtR_)
    {
        // Constructor
        setStmt(_stmt_);

        setStmtR(_stmtR_);

    }

    @Override
    public Object clone()
    {
        return new AMaiorIgualQueOperacao(
            cloneNode(this._stmt_),
            cloneNode(this._stmtR_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMaiorIgualQueOperacao(this);
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

    public PStmt getStmtR()
    {
        return this._stmtR_;
    }

    public void setStmtR(PStmt node)
    {
        if(this._stmtR_ != null)
        {
            this._stmtR_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._stmtR_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._stmt_)
            + toString(this._stmtR_);
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

        if(this._stmtR_ == child)
        {
            this._stmtR_ = null;
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

        if(this._stmtR_ == oldChild)
        {
            setStmtR((PStmt) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
