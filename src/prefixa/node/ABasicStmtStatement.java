/* This file was generated by SableCC (http://www.sablecc.org/). */

package prefixa.node;

import prefixa.analysis.*;

@SuppressWarnings("nls")
public final class ABasicStmtStatement extends PStatement
{
    private PBasicStatement _basicStatement_;
    private TSemicolon _semicolon_;

    public ABasicStmtStatement()
    {
        // Constructor
    }

    public ABasicStmtStatement(
        @SuppressWarnings("hiding") PBasicStatement _basicStatement_,
        @SuppressWarnings("hiding") TSemicolon _semicolon_)
    {
        // Constructor
        setBasicStatement(_basicStatement_);

        setSemicolon(_semicolon_);

    }

    @Override
    public Object clone()
    {
        return new ABasicStmtStatement(
            cloneNode(this._basicStatement_),
            cloneNode(this._semicolon_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABasicStmtStatement(this);
    }

    public PBasicStatement getBasicStatement()
    {
        return this._basicStatement_;
    }

    public void setBasicStatement(PBasicStatement node)
    {
        if(this._basicStatement_ != null)
        {
            this._basicStatement_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._basicStatement_ = node;
    }

    public TSemicolon getSemicolon()
    {
        return this._semicolon_;
    }

    public void setSemicolon(TSemicolon node)
    {
        if(this._semicolon_ != null)
        {
            this._semicolon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._semicolon_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._basicStatement_)
            + toString(this._semicolon_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._basicStatement_ == child)
        {
            this._basicStatement_ = null;
            return;
        }

        if(this._semicolon_ == child)
        {
            this._semicolon_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._basicStatement_ == oldChild)
        {
            setBasicStatement((PBasicStatement) newChild);
            return;
        }

        if(this._semicolon_ == oldChild)
        {
            setSemicolon((TSemicolon) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}