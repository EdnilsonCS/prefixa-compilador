/* This file was generated by SableCC (http://www.sablecc.org/). */

package prefixa.node;

import prefixa.analysis.*;

@SuppressWarnings("nls")
public final class AExpReturnComando extends PComando
{
    private PExpReturn _expReturn_;

    public AExpReturnComando()
    {
        // Constructor
    }

    public AExpReturnComando(
        @SuppressWarnings("hiding") PExpReturn _expReturn_)
    {
        // Constructor
        setExpReturn(_expReturn_);

    }

    @Override
    public Object clone()
    {
        return new AExpReturnComando(
            cloneNode(this._expReturn_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExpReturnComando(this);
    }

    public PExpReturn getExpReturn()
    {
        return this._expReturn_;
    }

    public void setExpReturn(PExpReturn node)
    {
        if(this._expReturn_ != null)
        {
            this._expReturn_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expReturn_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expReturn_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expReturn_ == child)
        {
            this._expReturn_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expReturn_ == oldChild)
        {
            setExpReturn((PExpReturn) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
