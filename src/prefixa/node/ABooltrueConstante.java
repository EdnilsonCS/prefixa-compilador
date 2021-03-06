/* This file was generated by SableCC (http://www.sablecc.org/). */

package prefixa.node;

import prefixa.analysis.*;

@SuppressWarnings("nls")
public final class ABooltrueConstante extends PConstante
{
    private TTrueId _trueId_;

    public ABooltrueConstante()
    {
        // Constructor
    }

    public ABooltrueConstante(
        @SuppressWarnings("hiding") TTrueId _trueId_)
    {
        // Constructor
        setTrueId(_trueId_);

    }

    @Override
    public Object clone()
    {
        return new ABooltrueConstante(
            cloneNode(this._trueId_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABooltrueConstante(this);
    }

    public TTrueId getTrueId()
    {
        return this._trueId_;
    }

    public void setTrueId(TTrueId node)
    {
        if(this._trueId_ != null)
        {
            this._trueId_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._trueId_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._trueId_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._trueId_ == child)
        {
            this._trueId_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._trueId_ == oldChild)
        {
            setTrueId((TTrueId) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
